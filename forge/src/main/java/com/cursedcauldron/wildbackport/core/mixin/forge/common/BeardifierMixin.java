package com.cursedcauldron.wildbackport.core.mixin.forge.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.cursedcauldron.wildbackport.common.worldgen.features.AncientCityFeature;
import com.cursedcauldron.wildbackport.core.mixinhelper.BeardifierLocals;

import net.minecraft.util.Mth;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.Beardifier;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.StructureStart;

/**
 * This mixin is responsible for reimplementing 1.19's BEARD_BOX which causes terrain
 * to be removed around ancient city structures.
 */
@Mixin(Beardifier.class)
public class BeardifierMixin {
    private static ThreadLocal<BeardifierLocals> currentLocals = new ThreadLocal<>();
    @Unique
    private Map<Object, StructureFeature<?>> featureMap = new HashMap<>();

    // This is different than the fabric implementation where this is @ModifyArgs, but
    // that's borked on Forge (as per usual).
    @Inject(
        // for this nonsense to work in the devenv, replace this with method_38319
        // for prod, use m_208194_
        // very elegant!
        method = "m_208194_",
        at = @At(
            value = "INVOKE",
            target = "Lit/unimi/dsi/fastutil/objects/ObjectList;add(Ljava/lang/Object;)Z"
        ),
        remap = false,
        locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void
    addStructurePieceToMap(
        ChunkPos alec1,
        int alec2,
        int alec3,
        StructureStart ss,
        CallbackInfo ci,
        Iterator<?> alec4,
        StructurePiece sp
    ) {
        featureMap.put(sp, ss.getFeature().feature);
    }

    @Inject(
        method = "compute",
        at = @At(
            value = "INVOKE",
            target
            = "Lnet/minecraft/world/level/levelgen/structure/StructurePiece;getNoiseEffect()Lnet/minecraft/world/level/levelgen/feature/NoiseEffect;"
        ),
        locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void
    collectVariables(
        DensityFunction.FunctionContext alec1,
        CallbackInfoReturnable<Double> ci,
        int i,
        int j,
        int k,
        double alec2,
        StructurePiece structurePiece,
        BoundingBox boundingBox,
        int l,
        int m
    ) {
        currentLocals.set(new BeardifierLocals(i, j, k, structurePiece, boundingBox, l, m)
        );
    }

    @Shadow
    protected static double getBeardContribution(int l, int m, int n) {
        throw new AssertionError();
    }

    @Redirect(
        method = "compute",
        at = @At(
            value = "INVOKE",
            target
            = "Lnet/minecraft/world/level/levelgen/Beardifier;getBeardContribution(III)D"
        )
    )
    private double
    beardContribution(int l, int m, int n) {
        BeardifierLocals locals = currentLocals.get();
        if (locals == null)
            return getBeardContribution(l, m, n);
        currentLocals.remove();

        StructureFeature<?> sf = this.featureMap.get(locals.structurePiece());
        if (sf == null /* WTF */ || !(sf instanceof AncientCityFeature))
            return getBeardContribution(l, m, n);

        int q = Math.max(0, Math.max(-m, locals.y() - locals.boundingBox().maxY()));

        return getAncientCityBeardContribution(l, q, n, m);
    }

    private static double getAncientCityBeardContribution(int i, int j, int k, int l) {
        int m = i + 12;
        int n = j + 12;
        int o = k + 12;
        if (!(m >= 0 && m < 24 && n >= 0 && n < 24 && o >= 0 && o < 24)) {
            return 0.0;
        }
        double d = (double) l + 0.5;
        double e = Mth.lengthSquared(i, d, k);
        double f = -d * Mth.fastInvSqrt(e / 2.0) / 2.0;
        return f * (double) computeBeardContribution(o - 12, m - 12, n - 12);
    }

    private static double computeBeardContribution(int i, double d, int j) {
        double e = Mth.lengthSquared(i, d, j);
        double f = Math.pow(Math.E, -e / 16.0);
        return f;
    }
}

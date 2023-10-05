package com.cursedcauldron.wildbackport.core.mixin.forge.common;

import com.cursedcauldron.wildbackport.common.worldgen.AdvancedJigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.pools.JigsawPlacement;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

// this is an exact duplicate of this mixin for fabric, but with the target changed to
// SRG mappings. you have failed me, refmap.
@Mixin(JigsawPlacement.class)
public class JigsawPlacementMixin {
    // for this nonsense to work in the devenv, replace this with method_39824
    // for prod, use m_210268_
    // very elegant!
    @ModifyVariable(
        method = "m_210268_", at = @At(value = "STORE", ordinal = 0), remap = false
    )
    private static AABB
    adjustAncientCityBoundingBox(
        AABB aabb, PoolElementStructurePiece alec, JigsawConfiguration conf
    ) {
        if (conf instanceof AdvancedJigsawConfiguration aconf) {
            return new AABB(
                aabb.minX + 80 - aconf.maxDistanceFromCenter,
                aabb.minY + 80 - aconf.maxDistanceFromCenter,
                aabb.minZ + 80 - aconf.maxDistanceFromCenter,
                aabb.maxX - 80 + aconf.maxDistanceFromCenter,
                aabb.maxY - 80 + aconf.maxDistanceFromCenter,
                aabb.maxZ - 80 + aconf.maxDistanceFromCenter
            );
        }
        return aabb;
    }
}

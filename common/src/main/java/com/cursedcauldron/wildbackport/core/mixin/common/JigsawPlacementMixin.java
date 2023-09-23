package com.cursedcauldron.wildbackport.core.mixin.common;

import com.cursedcauldron.wildbackport.common.worldgen.AdvancedJigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.pools.JigsawPlacement;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(JigsawPlacement.class)
public class JigsawPlacementMixin {
    // this is a lambda
    @ModifyVariable(method = "method_39824", at = @At(value = "STORE", ordinal = 0))
    private static AABB adjustAncientCityBoundingBox(
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

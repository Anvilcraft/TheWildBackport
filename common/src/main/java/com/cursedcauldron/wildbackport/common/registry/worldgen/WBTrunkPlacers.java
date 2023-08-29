package com.cursedcauldron.wildbackport.common.registry.worldgen;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.worldgen.placers.UpwardBranchingTrunk;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import com.cursedcauldron.wildbackport.core.mixin.access.TrunkPlacerTypeAccessor;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

//<>

public class WBTrunkPlacers {
    public static final CoreRegistry<TrunkPlacerType<?>> PLACERS
        = CoreRegistry.create(Registry.TRUNK_PLACER_TYPES, "minecraft");

    public static final Supplier<TrunkPlacerType<UpwardBranchingTrunk>>
        UPWARDS_BRANCHING_TRUNK = PLACERS.register(
            "upward_branching_trunk",
            (
            ) -> TrunkPlacerTypeAccessor.createTrunkPlacerType(UpwardBranchingTrunk.CODEC)
        );
}
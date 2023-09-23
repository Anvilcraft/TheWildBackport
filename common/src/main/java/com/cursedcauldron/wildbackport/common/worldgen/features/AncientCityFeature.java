package com.cursedcauldron.wildbackport.common.worldgen.features;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.JigsawFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;

public class AncientCityFeature extends JigsawFeature {
    public AncientCityFeature(Codec<JigsawConfiguration> codec) {
        super(
            codec,
            // Y level
            -27,
            // disable placement hack (?)
            false,
            // don't generate on surface
            false,
            // placable predicate
            (alec) -> true
        );
    }
}

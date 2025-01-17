package com.cursedcauldron.wildbackport.common.blocks;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import com.cursedcauldron.wildbackport.common.registry.worldgen.WBWorldGeneration;

import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class MangroveTreeGrower extends AbstractTreeGrower {
    private final float tallChance;

    public MangroveTreeGrower(float tallChance) {
        this.tallChance = tallChance;
    }

    @Override
    @Nullable
    protected Holder<? extends ConfiguredFeature<?, ?>>
    getConfiguredFeature(Random random, boolean bees) {
        return random.nextFloat() < this.tallChance ? WBWorldGeneration.TALL_MANGROVE
                                                    : WBWorldGeneration.MANGROVE;
    }
}

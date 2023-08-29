package com.cursedcauldron.wildbackport.common.registry.worldgen;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.worldgen.features.GrassDiskConfiguration;
import com.cursedcauldron.wildbackport.common.worldgen.features.GrassDiskFeature;
import com.cursedcauldron.wildbackport.common.worldgen.features.RootedTreeConfig;
import com.cursedcauldron.wildbackport.common.worldgen.features.RootedTreeFeature;
import com.cursedcauldron.wildbackport.common.worldgen.features.SculkGrowthFeature;
import com.cursedcauldron.wildbackport.common.worldgen.features.SculkPatchConfiguration;
import com.cursedcauldron.wildbackport.common.worldgen.features.SculkPatchFeature;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GlowLichenConfiguration;

//<>

public class WBFeatures {
    public static final CoreRegistry<Feature<?>> FEATURES
        = CoreRegistry.create(Registry.FEATURE, "minecraft");

    public static final Supplier<Feature<RootedTreeConfig>> TREE = FEATURES.register(
        "rooted_tree", () -> new RootedTreeFeature(RootedTreeConfig.CODEC)
    );
    public static final Supplier<Feature<GrassDiskConfiguration>> DISK
        = FEATURES.register(
            "grass_disk", () -> new GrassDiskFeature(GrassDiskConfiguration.CODEC)
        );
    public static final Supplier<Feature<SculkPatchConfiguration>> SCULK_PATCH
        = FEATURES.register(
            "sculk_patch", () -> new SculkPatchFeature(SculkPatchConfiguration.CODEC)
        );
    public static final Supplier<Feature<GlowLichenConfiguration>> SCULK_GROWTH
        = FEATURES.register(
            "sculk_growth", () -> new SculkGrowthFeature(GlowLichenConfiguration.CODEC)
        );
}
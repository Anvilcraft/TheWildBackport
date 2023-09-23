package com.cursedcauldron.wildbackport.common.registry.worldgen;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cursedcauldron.wildbackport.common.tag.WBBiomeTags;
import com.cursedcauldron.wildbackport.common.worldgen.AdvancedJigsawConfiguration;
import com.cursedcauldron.wildbackport.common.worldgen.structure.AncientCityStructurePieces;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedRandomList;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureSpawnOverride;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;

public class WBStructures {
    public static final Holder<ConfiguredStructureFeature<?, ?>> ANCIENT_CITY = create(
        "ancient_city",
        WBFeatures.ANCIENT_CITY.configured(
            new AdvancedJigsawConfiguration(
                AncientCityStructurePieces.START,
                7,
                116,
                Optional.of(new ResourceLocation("city_anchor"))
            ),
            WBBiomeTags.HAS_ANCIENT_CITY,
            true,
            Arrays.stream(MobCategory.values())
                .collect(Collectors.toMap(
                    mobCategory
                    -> mobCategory,
                    mobCategory
                    -> new StructureSpawnOverride(
                        StructureSpawnOverride.BoundingBoxType.STRUCTURE,
                        WeightedRandomList.create()
                    )
                ))
        )
    );

    public static final Holder<StructureSet> ANCIENT_CITIES = BuiltinRegistries.register(
        BuiltinRegistries.STRUCTURE_SETS,
        ResourceKey.create(
            Registry.STRUCTURE_SET_REGISTRY, new ResourceLocation("ancient_cities")
        ),
        new StructureSet(
            ANCIENT_CITY,
            new RandomSpreadStructurePlacement(24, 8, RandomSpreadType.LINEAR, 20083232)
        )
    );

    public static void setup() {
        AncientCityStructurePieces.bootstrap();
    }

    private static <FC extends FeatureConfiguration, F extends StructureFeature<FC>>
        Holder<ConfiguredStructureFeature<?, ?>>
        create(String key, ConfiguredStructureFeature<FC, F> feature) {
        return BuiltinRegistries.register(
            BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE,
            ResourceKey.create(
                Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(key)
            ),
            feature
        );
    }
}

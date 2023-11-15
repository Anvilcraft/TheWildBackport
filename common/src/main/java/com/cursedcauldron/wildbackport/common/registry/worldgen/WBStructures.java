package com.cursedcauldron.wildbackport.common.registry.worldgen;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cursedcauldron.wildbackport.common.tag.WBBiomeTags;
import com.cursedcauldron.wildbackport.common.utils.SupplierHolder;
import com.cursedcauldron.wildbackport.common.worldgen.features.AncientCityFeature;
import com.cursedcauldron.wildbackport.common.worldgen.structure.AncientCityStructurePieces;
import com.cursedcauldron.wildbackport.common.worldgen.structure.processors.BlockTagRotProcessor;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;

import net.anvilcraft.anvillib.worldgen.AdvancedStructurePoolFeatureConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedRandomList;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.StructureSpawnOverride;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

public class WBStructures {
    public static final CoreRegistry<ConfiguredStructureFeature<?, ?>>
        CONFIGURED_STRUCTURE_FEATURES = CoreRegistry.create(
            BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, "minecraft"
        );

    public static final CoreRegistry<StructureSet> STRUCTURE_SETS
        = CoreRegistry.create(BuiltinRegistries.STRUCTURE_SETS, "minecraft");

    public static final CoreRegistry<StructureProcessorType<?>> STRUCTURE_PROCESSORS
        = CoreRegistry.create(Registry.STRUCTURE_PROCESSOR, "minecraft");

    public static final Holder<StructureProcessorType<BlockTagRotProcessor>> BLOCK_TAG_ROT
        = SupplierHolder.createAndRegister(
            STRUCTURE_PROCESSORS, "block_rot_alec", () -> () -> BlockTagRotProcessor.CODEC
        );

    public static final Holder<ConfiguredStructureFeature<?, ?>> ANCIENT_CITY
        = SupplierHolder.createAndRegister(
            CONFIGURED_STRUCTURE_FEATURES,
            "ancient_city",
            ()
                -> ((AncientCityFeature) WBStructureFeatures.ANCIENT_CITY.value())
                       .configured(
                           new AdvancedStructurePoolFeatureConfig(
                               AncientCityStructurePieces.START,
                               7,
                               116
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

    public static final Holder<StructureSet> ANCIENT_CITIES
        = SupplierHolder.createAndRegister(
            STRUCTURE_SETS,
            "ancient_cities",
            ()
                -> new StructureSet(
                    ANCIENT_CITY,
                    new RandomSpreadStructurePlacement(
                        24, 8, RandomSpreadType.LINEAR, 20083232
                    )
                )
        );

    public static void setup() {
        AncientCityStructurePieces.bootstrap();
    }
}

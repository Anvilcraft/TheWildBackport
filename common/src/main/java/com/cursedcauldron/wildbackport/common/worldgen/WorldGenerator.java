package com.cursedcauldron.wildbackport.common.worldgen;

import com.cursedcauldron.wildbackport.common.registry.WBBiomes;
import com.cursedcauldron.wildbackport.common.registry.entity.WBEntityTypes;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBWorldGeneration;
import com.cursedcauldron.wildbackport.core.api.worldgen.BiomeModifier;
import com.cursedcauldron.wildbackport.core.api.worldgen.BiomeWriter;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;

//<>

public class WorldGenerator {
    public static void setup() {
        BiomeModifier.add(WorldGenerator::mangroveSwamp, WBBiomes.MANGROVE_SWAMP);
        BiomeModifier.add(WorldGenerator::deepDark, WBBiomes.DEEP_DARK);

        BiomeModifier.add(WorldGenerator::addFrogs, Biome.BiomeCategory.SWAMP);
    }

    public static void mangroveSwamp(BiomeWriter writer) {
        writer.addFeature(
            GenerationStep.Decoration.UNDERGROUND_ORES,
            WBWorldGeneration.DISK_GRASS_PLACED
        );
        writer.addFeature(
            GenerationStep.Decoration.VEGETAL_DECORATION,
            WBWorldGeneration.TREES_MANGROVE_PLACED
        );

        writer.addSpawn(MobCategory.MONSTER, EntityType.SLIME, 1, 1, 1);
        writer.addSpawn(MobCategory.WATER_AMBIENT, EntityType.TROPICAL_FISH, 25, 8, 8);
    }

    public static void deepDark(BiomeWriter writer) {
        writer.addFeature(
            GenerationStep.Decoration.UNDERGROUND_DECORATION,
            WBWorldGeneration.SCULK_VEIN_PLACED
        );
        writer.addFeature(
            GenerationStep.Decoration.UNDERGROUND_DECORATION,
            WBWorldGeneration.SCULK_PATCH_DEEP_DARK_PLACED
        );
    }

    public static void addFrogs(BiomeWriter writer) {
        writer.addSpawn(MobCategory.CREATURE, WBEntityTypes.FROG.get(), 10, 2, 5);
    }
}

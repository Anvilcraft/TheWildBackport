package com.cursedcauldron.wildbackport.common.tag;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.core.api.TagBuilder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class WBBiomeTags {
    public static final TagBuilder<Biome> TAGS
        = TagBuilder.create(BuiltinRegistries.BIOME, "minecraft");

    public static final TagKey<Biome> SPAWNS_WARM_VARIANT_FROGS
        = TAGS.create("spawns_warm_variant_frogs");
    public static final TagKey<Biome> SPAWNS_COLD_VARIANT_FROGS
        = TAGS.create("spawns_cold_variant_frogs");
    public static final TagKey<Biome> ALLOWS_SURFACE_SLIME_SPAWNS
        = TAGS.create("allows_surface_slime_spawns");
    public static final TagKey<Biome> HAS_ANCIENT_CITY
        = TAGS.create("has_structure/ancient_city");
}
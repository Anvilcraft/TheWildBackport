package com.cursedcauldron.wildbackport;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.slf4j.Logger;

import com.cursedcauldron.wildbackport.client.registry.WBParticleTypes;
import com.cursedcauldron.wildbackport.client.registry.WBSoundEvents;
import com.cursedcauldron.wildbackport.common.entities.access.Recovery;
import com.cursedcauldron.wildbackport.common.items.CompassItemPropertyFunction;
import com.cursedcauldron.wildbackport.common.items.RecoveryCompassTarget;
import com.cursedcauldron.wildbackport.common.registry.Instruments;
import com.cursedcauldron.wildbackport.common.registry.WBBiomes;
import com.cursedcauldron.wildbackport.common.registry.WBBlockEntities;
import com.cursedcauldron.wildbackport.common.registry.WBBlocks;
import com.cursedcauldron.wildbackport.common.registry.WBEnchantments;
import com.cursedcauldron.wildbackport.common.registry.WBGameEvents;
import com.cursedcauldron.wildbackport.common.registry.WBGameRules;
import com.cursedcauldron.wildbackport.common.registry.WBItems;
import com.cursedcauldron.wildbackport.common.registry.WBMobEffects;
import com.cursedcauldron.wildbackport.common.registry.WBPositionSources;
import com.cursedcauldron.wildbackport.common.registry.entity.WBActivities;
import com.cursedcauldron.wildbackport.common.registry.entity.WBEntityTypes;
import com.cursedcauldron.wildbackport.common.registry.entity.WBMemoryModules;
import com.cursedcauldron.wildbackport.common.registry.entity.WBSensorTypes;
import com.cursedcauldron.wildbackport.common.registry.worldgen.RootPlacerType;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBFeatures;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBStructureFeatures;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBStructures;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBTreeDecorators;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBTrunkPlacers;
import com.cursedcauldron.wildbackport.common.registry.worldgen.WBWorldGeneration;
import com.cursedcauldron.wildbackport.common.tag.InstrumentTags;
import com.cursedcauldron.wildbackport.common.tag.WBBiomeTags;
import com.cursedcauldron.wildbackport.common.tag.WBBlockTags;
import com.cursedcauldron.wildbackport.common.tag.WBEntityTypeTags;
import com.cursedcauldron.wildbackport.common.tag.WBGameEventTags;
import com.cursedcauldron.wildbackport.common.tag.WBItemTags;
import com.mojang.logging.LogUtils;

import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ItemPropertyFunction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

//<>

public class WildBackport {
    public static final String MOD_ID = "wildbackport";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void bootstrap() {
        // Registries
        WBActivities.ACTIVITIES.register();
        WBBiomes.BIOMES.register();
        WBBlockEntities.BLOCKS.register();
        WBBlocks.BLOCKS.register();
        WBEnchantments.ENCHANTMENTS.register();
        WBEntityTypes.ENTITIES.register();
        WBGameEvents.EVENTS.register();
        WBFeatures.FEATURES.register();
        Instruments.INSTRUMENTS.register();
        WBItems.ITEMS.register();
        WBMemoryModules.MEMORIES.register();
        WBMobEffects.EFFECTS.register();
        WBParticleTypes.PARTICLES.register();
        WBPositionSources.SOURCES.register();
        RootPlacerType.PLACERS.register();
        WBSensorTypes.SENSORS.register();
        WBSoundEvents.SOUNDS.register();
        WBTreeDecorators.DECORATORS.register();
        WBTrunkPlacers.PLACERS.register();
        WBWorldGeneration.CONFIGURED_FEATURES.register();
        WBWorldGeneration.PLACED_FEATURES.register();
        WBStructureFeatures.STRUCTURE_FEATURES.register();
        WBStructures.CONFIGURED_STRUCTURE_FEATURES.register();
        WBStructures.STRUCTURE_SETS.register();
        WBStructures.STRUCTURE_PROCESSORS.register();

        WBGameRules.setup();

        WBStructures.setup();

        // Tags
        WBBiomeTags.TAGS.bootstrap();
        WBBlockTags.BUILDER.bootstrap();
        WBEntityTypeTags.TAGS.bootstrap();
        WBGameEventTags.TAGS.bootstrap();
        WBItemTags.TAGS.bootstrap();
        InstrumentTags.TAGS.bootstrap();
    }
}

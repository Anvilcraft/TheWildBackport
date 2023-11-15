package com.cursedcauldron.wildbackport.common.registry.worldgen;

import com.cursedcauldron.wildbackport.common.utils.SupplierHolder;
import com.cursedcauldron.wildbackport.common.worldgen.features.AncientCityFeature;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import com.cursedcauldron.wildbackport.core.mixin.access.StructureFeatureAccessor;

import net.anvilcraft.anvillib.worldgen.AdvancedStructurePoolFeatureConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.StructureFeature;

public class WBStructureFeatures {
    public static final CoreRegistry<StructureFeature<?>> STRUCTURE_FEATURES
        = CoreRegistry.create(Registry.STRUCTURE_FEATURE, "minecraft");

    public static final Holder<StructureFeature<?>> ANCIENT_CITY
        = SupplierHolder.createAndRegister(STRUCTURE_FEATURES, "ancient_city", () -> {
              var acf = new AncientCityFeature(AdvancedStructurePoolFeatureConfig.CODEC);
              StructureFeatureAccessor.getStep().put(
                  acf, Decoration.UNDERGROUND_STRUCTURES
              );
              return acf;
          });
}

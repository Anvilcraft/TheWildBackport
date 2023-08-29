package com.cursedcauldron.wildbackport.core.api.worldgen.fabric;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.core.api.worldgen.BiomeModifier;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.resources.ResourceLocation;

public class BiomeModifierImpl {
    public static void setup() {
        BiomeModifications.create(new ResourceLocation("biome_modifier"))
            .add(ModificationPhase.ADDITIONS, ctx -> true, (selector, modifier) -> {
                BiomeModifier.INSTANCE.register(
                    new FabricBiomeWriter().build(selector, modifier)
                );
            });
    }
}
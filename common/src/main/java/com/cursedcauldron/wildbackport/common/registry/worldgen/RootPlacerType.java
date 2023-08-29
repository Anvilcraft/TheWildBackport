package com.cursedcauldron.wildbackport.common.registry.worldgen;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.registry.WBRegistries;
import com.cursedcauldron.wildbackport.common.worldgen.placers.MangroveRootPlacer;
import com.cursedcauldron.wildbackport.common.worldgen.placers.RootPlacer;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import com.mojang.serialization.Codec;

public class RootPlacerType<P extends RootPlacer> {
    public static final CoreRegistry<RootPlacerType<?>> PLACERS
        = CoreRegistry.create(WBRegistries.ROOT_PLACER_TYPES.registry(), "minecraft");

    public static final Supplier<RootPlacerType<MangroveRootPlacer>> MANGROVE_ROOT_PLACER
        = PLACERS.register(
            "mangrove_root_placer", () -> new RootPlacerType<>(MangroveRootPlacer.CODEC)
        );

    private final Codec<P> codec;

    private RootPlacerType(Codec<P> codec) {
        this.codec = codec;
    }

    public Codec<P> codec() {
        return this.codec;
    }
}
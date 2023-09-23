package com.cursedcauldron.wildbackport.common.worldgen;

import java.util.Optional;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

public class AdvancedJigsawConfiguration extends JigsawConfiguration {
    public static final Codec<JigsawConfiguration> CODEC = RecordCodecBuilder.create(
        (instance) -> {
            return instance
                .group(
                    StructureTemplatePool.CODEC.fieldOf("start_pool")
                        .forGetter(
                            (self) -> ((AdvancedJigsawConfiguration) self).startPool()
                        ),
                    Codec.intRange(0, 7).fieldOf("size").forGetter(
                        (self) -> ((AdvancedJigsawConfiguration) self).maxDepth()
                    ),
                    Codec.INT.fieldOf("max_distance_from_center")
                        .forGetter(
                            (self)
                                -> ((AdvancedJigsawConfiguration) self)
                                       .maxDistanceFromCenter
                        ),
                    ResourceLocation.CODEC.optionalFieldOf("start_jigsaw_name")
                        .forGetter(
                            (self) -> ((AdvancedJigsawConfiguration) self).startJigsawName
                        )
                )
                .apply(instance, AdvancedJigsawConfiguration::new);
        }
    );

    public int maxDistanceFromCenter;
    public Optional<ResourceLocation> startJigsawName;

    public AdvancedJigsawConfiguration(
        Holder<StructureTemplatePool> holder,
        int i,
        int maxDistanceFromCenter,
        Optional<ResourceLocation> startJigsawName
    ) {
        super(holder, i);
        this.maxDistanceFromCenter = maxDistanceFromCenter;
        this.startJigsawName = startJigsawName;
    }
}

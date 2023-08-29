package com.cursedcauldron.wildbackport.core.mixin.access;

import java.util.List;

import com.mojang.datafixers.util.Pair;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(StructureTemplatePool.class)
public interface StructureTemplatePoolAccessor {
    @Accessor
    List<Pair<StructurePoolElement, Integer>> getRawTemplates();

    @Mutable
    @Accessor
    void setRawTemplates(List<Pair<StructurePoolElement, Integer>> rawTemplates);

    @Accessor
    List<StructurePoolElement> getTemplates();

    @Mutable
    @Accessor
    void setTemplates(List<StructurePoolElement> templates);
}

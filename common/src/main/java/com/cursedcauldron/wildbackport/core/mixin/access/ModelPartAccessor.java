package com.cursedcauldron.wildbackport.core.mixin.access;

import java.util.Map;

import net.minecraft.client.model.geom.ModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ModelPart.class)
public interface ModelPartAccessor {
    @Accessor
    Map<String, ModelPart> getChildren();
}

package com.cursedcauldron.wildbackport.core.api.fabric;

import java.util.function.Supplier;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public class MobRegistryImpl {
    @SuppressWarnings("ConstantConditions")
    public static void registerAttributes(
        Supplier<? extends EntityType<? extends LivingEntity>> type,
        Supplier<AttributeSupplier.Builder> builder
    ) {
        FabricDefaultAttributeRegistry.register(type.get(), builder.get());
    }
}

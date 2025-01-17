package com.cursedcauldron.wildbackport.core.api;

import java.util.function.Supplier;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

public class MobRegistry {
    @ExpectPlatform
    public static void registerAttributes(
        Supplier<? extends EntityType<? extends LivingEntity>> type,
        Supplier<AttributeSupplier.Builder> builder
    ) {
        throw new AssertionError();
    }
}
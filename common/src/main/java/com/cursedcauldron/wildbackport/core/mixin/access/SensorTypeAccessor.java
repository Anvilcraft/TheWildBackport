package com.cursedcauldron.wildbackport.core.mixin.access;

import java.util.function.Supplier;

import net.minecraft.world.entity.ai.sensing.Sensor;
import net.minecraft.world.entity.ai.sensing.SensorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(SensorType.class)
public interface SensorTypeAccessor {
    @Invoker("<init>")
    static <U extends Sensor<?>> SensorType<U> createSensorType(Supplier<U> supplier) {
        throw new UnsupportedOperationException();
    }
}

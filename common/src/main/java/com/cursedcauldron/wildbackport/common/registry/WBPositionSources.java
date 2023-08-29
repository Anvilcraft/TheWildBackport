package com.cursedcauldron.wildbackport.common.registry;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.entities.warden.MobPositionSource;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.level.gameevent.PositionSourceType;

public class WBPositionSources {
    public static final CoreRegistry<PositionSourceType<?>> SOURCES
        = CoreRegistry.create(Registry.POSITION_SOURCE_TYPE, "minecraft");

    public static final Supplier<PositionSourceType<MobPositionSource>> MOB
        = SOURCES.register("mob", MobPositionSource.Type::new);
}
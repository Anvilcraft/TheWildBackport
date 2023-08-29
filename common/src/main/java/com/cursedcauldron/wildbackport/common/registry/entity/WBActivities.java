package com.cursedcauldron.wildbackport.common.registry.entity;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import com.cursedcauldron.wildbackport.core.mixin.access.ActivityAccessor;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.schedule.Activity;

//<>

public class WBActivities {
    public static final CoreRegistry<Activity> ACTIVITIES
        = CoreRegistry.create(Registry.ACTIVITY, "minecraft");

    public static final Supplier<Activity> SNIFF = create("sniff");
    public static final Supplier<Activity> INVESTIGATE = create("investigate");
    public static final Supplier<Activity> ROAR = create("roar");
    public static final Supplier<Activity> EMERGE = create("emerge");
    public static final Supplier<Activity> TONGUE = create("tongue");
    public static final Supplier<Activity> DIG = create("dig");
    public static final Supplier<Activity> SWIM = create("swim");
    public static final Supplier<Activity> LAY_SPAWN = create("lay_spawn");

    public static Supplier<Activity> create(String key) {
        return ACTIVITIES.register(key, () -> ActivityAccessor.createActivity(key));
    }
}
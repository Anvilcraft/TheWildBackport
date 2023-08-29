package com.cursedcauldron.wildbackport.common.entities.brain.warden;

import java.util.Optional;
import java.util.function.Function;

import com.cursedcauldron.wildbackport.common.entities.Warden;
import com.cursedcauldron.wildbackport.common.registry.entity.WBMemoryModules;
import com.google.common.collect.ImmutableMap;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.Behavior;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.memory.MemoryStatus;

public class FindRoarTarget<E extends Warden> extends Behavior<E> {
    private final Function<E, Optional<? extends LivingEntity>> targetFinder;

    public FindRoarTarget(Function<E, Optional<? extends LivingEntity>> targetFinder) {
        super(ImmutableMap.of(
            WBMemoryModules.ROAR_TARGET.get(),
            MemoryStatus.VALUE_ABSENT,
            MemoryModuleType.ATTACK_TARGET,
            MemoryStatus.VALUE_ABSENT,
            MemoryModuleType.CANT_REACH_WALK_TARGET_SINCE,
            MemoryStatus.REGISTERED
        ));
        this.targetFinder = targetFinder;
    }

    @Override
    protected boolean checkExtraStartConditions(ServerLevel level, E warden) {
        return this.targetFinder.apply(warden).filter(warden::isValidTarget).isPresent();
    }

    @Override
    protected void start(ServerLevel level, E warden, long time) {
        this.targetFinder.apply(warden).ifPresent(target -> {
            warden.getBrain().setMemory(WBMemoryModules.ROAR_TARGET.get(), target);
            warden.getBrain().eraseMemory(MemoryModuleType.CANT_REACH_WALK_TARGET_SINCE);
        });
    }
}
package com.cursedcauldron.wildbackport.core.mixin.common;

import java.util.Optional;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.entities.Warden;
import com.cursedcauldron.wildbackport.common.entities.access.Recovery;
import com.cursedcauldron.wildbackport.common.entities.access.WardenTracker;
import com.cursedcauldron.wildbackport.common.entities.warden.WardenSpawnTracker;
import com.cursedcauldron.wildbackport.common.utils.GlobalPosEntityDataSerializer;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Dynamic;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

//<>

@Mixin(Player.class)
public abstract class PlayerMixin
    extends LivingEntity implements WardenTracker, Recovery {
    private static final EntityDataAccessor<Optional<GlobalPos>>
        DATA_LAST_DEATH_LOCATION_ID = SynchedEntityData.defineId(
            Player.class, GlobalPosEntityDataSerializer.OPTIONAL_INSTANCE
        );

    protected PlayerMixin(EntityType<? extends LivingEntity> entityType, Level level) {
        super(entityType, level);
        throw new AssertionError();
    }

    @Unique
    private WardenSpawnTracker spawnTracker;

    @Unique
    private Optional<GlobalPos> lastDeathLocation = Optional.empty();

    @Inject(method = "<init>", at = @At("TAIL"))
    private void wb$init(
        Level alec1, BlockPos alec2, float alec3, GameProfile alec4, CallbackInfo ci
    ) {
        this.spawnTracker = new WardenSpawnTracker(0, 0, 0);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void wb$tick(CallbackInfo ci) {
        if (!((Player) (Object) this).level.isClientSide)
            this.spawnTracker.tick();
    }

    @Inject(method = "readAdditionalSaveData", at = @At("TAIL"))
    private void wb$readData(CompoundTag tag, CallbackInfo ci) {
        if (tag.contains("warden_spawn_tracker", 10))
            WardenSpawnTracker.CODEC
                .parse(new Dynamic<>(NbtOps.INSTANCE, tag.get("warden_spawn_tracker")))
                .resultOrPartial(WildBackport.LOGGER::error)
                .ifPresent(tracker -> this.spawnTracker = tracker);

        if (tag.contains("last_death_location", 10))
            GlobalPos.CODEC
                .parse(new Dynamic<>(NbtOps.INSTANCE, tag.get("last_death_location")))
                .resultOrPartial(WildBackport.LOGGER::error)
                .ifPresent(pos -> this.setLastDeathLocation(Optional.of(pos)));
    }

    @Inject(method = "addAdditionalSaveData", at = @At("TAIL"))
    private void wb$writeData(CompoundTag tag, CallbackInfo ci) {
        WardenSpawnTracker.CODEC.encodeStart(NbtOps.INSTANCE, this.spawnTracker)
            .resultOrPartial(WildBackport.LOGGER::error)
            .ifPresent(tracker -> tag.put("warden_spawn_Tracker", tracker));

        this.getLastDeathLocation().ifPresent(
            pos
            -> GlobalPos.CODEC.encodeStart(NbtOps.INSTANCE, pos)
                   .resultOrPartial(WildBackport.LOGGER::error)
                   .ifPresent(serialized -> tag.put("last_death_location", serialized))
        );
    }

    @Inject(method = "defineSynchedData", at = @At("TAIL"))
    private void wb$defineSynchedData(CallbackInfo ci) {
        this.entityData.define(DATA_LAST_DEATH_LOCATION_ID, Optional.empty());
    }

    @Inject(method = "blockUsingShield", at = @At("HEAD"))
    private void wb$blockShield(LivingEntity entity, CallbackInfo ci) {
        if (entity instanceof Warden)
            ((Player) (Object) this).disableShield(true);
    }

    @Override
    public WardenSpawnTracker getWardenSpawnTracker() {
        return this.spawnTracker;
    }

    @Override
    public Optional<GlobalPos> getLastDeathLocation() {
        return this.entityData.get(DATA_LAST_DEATH_LOCATION_ID);
    }

    @Override
    public void setLastDeathLocation(Optional<GlobalPos> location) {
        this.entityData.set(DATA_LAST_DEATH_LOCATION_ID, location);
    }
}

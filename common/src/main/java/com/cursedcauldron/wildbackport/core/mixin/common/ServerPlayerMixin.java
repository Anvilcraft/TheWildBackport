package com.cursedcauldron.wildbackport.core.mixin.common;

import java.util.Optional;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.cursedcauldron.wildbackport.common.entities.access.Recovery;

import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {
    @Inject(method = "die", at = @At("HEAD"))
    private void wb$die(DamageSource ds, CallbackInfo ci) {
        var self = (Player) (Object) this;
        Recovery.of(self).setLastDeathLocation(
            Optional.of(GlobalPos.of(self.level.dimension(), self.blockPosition()))
        );
    }

    @Inject(method = "restoreFrom", at = @At("HEAD"))
    private void wb$restoreFrom(ServerPlayer sp, boolean bl, CallbackInfo ci) {
        Recovery.of((Player) (Object) this)
            .setLastDeathLocation(Recovery.of(sp).getLastDeathLocation());
    }
}

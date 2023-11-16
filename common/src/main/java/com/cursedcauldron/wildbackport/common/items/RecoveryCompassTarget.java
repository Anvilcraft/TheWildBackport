package com.cursedcauldron.wildbackport.common.items;

import com.cursedcauldron.wildbackport.common.entities.access.Recovery;
import com.cursedcauldron.wildbackport.common.items.CompassItemPropertyFunction.CompassTarget;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.GlobalPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class RecoveryCompassTarget implements CompassTarget {
    public static final RecoveryCompassTarget INSTANCE = new RecoveryCompassTarget();

    @Override
    public GlobalPos getPos(ClientLevel level, ItemStack stack, Entity entity) {
        return entity instanceof Player player
            ? Recovery.of(player).getLastDeathLocation().orElse(null)
            : null;
    }
}

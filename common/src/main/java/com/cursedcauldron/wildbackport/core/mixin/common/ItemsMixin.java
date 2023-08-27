package com.cursedcauldron.wildbackport.core.mixin.common;

import java.util.Optional;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

@Mixin(Items.class)
public class ItemsMixin {

    @Overwrite
    private static <T> Optional<T> ifPart2(T object) {
        return Optional.of(object);
    }

    @Invoker("registerBlock")
    public static Item registerBlock(Block block, Item item) {
        throw new UnsupportedOperationException();
    }

    @Invoker("registerItem")
    public static Item registerItem(String string, Item item) {
        throw new UnsupportedOperationException();
    }
    
}

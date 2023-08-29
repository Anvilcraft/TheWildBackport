package com.cursedcauldron.wildbackport.common.registry;

import java.util.function.Supplier;

import com.cursedcauldron.wildbackport.WildBackport;
import com.cursedcauldron.wildbackport.common.enchantments.SwiftSneakEnchantment;
import com.cursedcauldron.wildbackport.core.api.CoreRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;

public class WBEnchantments {
    public static final CoreRegistry<Enchantment> ENCHANTMENTS
        = CoreRegistry.create(Registry.ENCHANTMENT, "minecraft");

    public static final Supplier<Enchantment> SWIFT_SNEAK = ENCHANTMENTS.register(
        "swift_sneak",
        ()
            -> new SwiftSneakEnchantment(
                Enchantment.Rarity.VERY_RARE, new EquipmentSlot[] { EquipmentSlot.LEGS }
            )
    );
}
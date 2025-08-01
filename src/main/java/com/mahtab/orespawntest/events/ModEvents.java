package com.mahtab.orespawntest.events;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents {

    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        ItemStack stack = event.getCrafting();

        // Check if the crafted item is your custom sword
        if (stack.getItem() == ModItems.ULTIMATESWORD.get()) {
            // Get the player entity
            var player = event.getEntity();

            HolderLookup.Provider registryAccess = player.level().registryAccess();
            HolderLookup.RegistryLookup<net.minecraft.world.item.enchantment.Enchantment> enchantmentLookup = registryAccess.lookupOrThrow(Registries.ENCHANTMENT);

            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.SHARPNESS), 5);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.SMITE), 5);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.BANE_OF_ARTHROPODS), 5);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.LOOTING), 3);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.KNOCKBACK), 3);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.UNBREAKING), 3);
            stack.enchant(enchantmentLookup.getOrThrow(Enchantments.FIRE_ASPECT), 2);
        }
    }
}


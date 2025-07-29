package com.mahtab.orespawntest.customitems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class UltimatePickaxe extends PickaxeItem {

    public UltimatePickaxe(Tier tier, Item.Properties properties) {
        super(tier,  properties);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return net.minecraftforge.common.ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction);
    }

    @Override
    public void onCraftedPostProcess(ItemStack stack, Level level) {
        super.onCraftedPostProcess(stack, level);

        HolderLookup.Provider registryAccess = level.registryAccess();
        HolderLookup.RegistryLookup<Enchantment> enchantmentLookup = registryAccess.lookupOrThrow(Registries.ENCHANTMENT);

        // Apply enchantments using the registry lookup:
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.EFFICIENCY), 5);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.FORTUNE), 5);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.UNBREAKING), 3);

    }}

package com.mahtab.orespawntest.item;

import com.mahtab.orespawntest.util.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import java.util.Optional;


public class ModToolTiers {
    public static final Tier ULTIMATE = new ForgeTier(2500, 10.0F, 4.0f, 30,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get(), ModItems.URANIUM_INGOT.get()),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL);


}
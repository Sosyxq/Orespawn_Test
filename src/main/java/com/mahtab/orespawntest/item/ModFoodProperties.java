package com.mahtab.orespawntest.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodProperties BLT = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).saturationModifier(0.15f).build();
    public static final FoodProperties BUTTERCANDY = new FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 3000, 1), 1.0f)
            .alwaysEdible()
            .build();
}

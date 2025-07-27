package com.mahtab.orespawntest.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.75f).build();
    public static final FoodProperties BLT = new FoodProperties.Builder().nutrition(12).saturationModifier(0.95f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).saturationModifier(0.55f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.45f).build();
    public static final FoodProperties BUTTERCANDY = new FoodProperties.Builder()
            .nutrition(7).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000, 1), 1.0f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 3000, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(8).saturationModifier(1.0f).build();
    public static final FoodProperties BACON = new FoodProperties.Builder()
            .nutrition(14).saturationModifier(1.5f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2000, 1),1.0f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION,2000,1),1.0f)
            .alwaysEdible()
            .build();
}

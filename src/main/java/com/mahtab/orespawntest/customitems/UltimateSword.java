package com.mahtab.orespawntest.customitems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UltimateSword extends SwordItem {

    public UltimateSword(Tier tier,  Properties properties) {
        super(tier, properties);
    }

    private static Tool createToolProperties() {
        return new Tool(List.of(Tool.Rule.minesAndDrops(List.of(Blocks.COBWEB), 15.0F), Tool.Rule.overrideSpeed(BlockTags.SWORD_EFFICIENT, 1.5F)), 1.0F, 2);
    }

    public static ItemAttributeModifiers createAttributes(Tier pTier, int pAttackDamage, float pAttackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(BASE_ATTACK_DAMAGE_ID, (double)((float)pAttackDamage + pTier.getAttackDamageBonus()), AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND
                )
                .add(
                        Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)pAttackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND
                )
                .build();
    }


    @Override
    public void onCraftedPostProcess(ItemStack stack, Level level) {
        super.onCraftedPostProcess(stack, level);

        HolderLookup.Provider registryAccess = level.registryAccess();
        HolderLookup.RegistryLookup<Enchantment> enchantmentLookup = registryAccess.lookupOrThrow(Registries.ENCHANTMENT);

        // Apply enchantments using the registry lookup:
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.SHARPNESS), 5);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.SMITE), 5);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.BANE_OF_ARTHROPODS), 5);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.LOOTING), 3);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.KNOCKBACK), 3);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.UNBREAKING), 3);
        stack.enchant(enchantmentLookup.getOrThrow(Enchantments.FIRE_ASPECT), 2);
    }}



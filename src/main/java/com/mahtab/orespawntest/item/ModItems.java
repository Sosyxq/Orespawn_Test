package com.mahtab.orespawntest.item;

import ca.weblite.objc.Proxy;
import com.mahtab.orespawntest.OrespawnTest;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, OrespawnTest.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)));
    public static final RegistryObject<Item> BLT = ITEMS.register("blt",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLT)) {
             @Override
             public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
              pTooltipComponents.add(Component.translatable("tooltip.orespawntest.blt"));
              super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
             }
            });
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final RegistryObject<Item> BUTTERCANDY = ITEMS.register("buttercandy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BUTTERCANDY)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LETTUCE)));
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACON)));
 public static final RegistryObject<Item> BACON = ITEMS.register("bacon",
         () -> new Item(new Item.Properties().food(ModFoodProperties.BACON)));


 public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }


}

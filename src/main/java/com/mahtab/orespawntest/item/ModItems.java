package com.mahtab.orespawntest.item;

import ca.weblite.objc.Proxy;
import com.mahtab.orespawntest.OrespawnTest;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLT)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final RegistryObject<Item> BUTTERCANDY = ITEMS.register("buttercandy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BUTTERCANDY)));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }


}

package com.mahtab.orespawntest;

import com.mahtab.orespawntest.block.ModBlocks;
import com.mahtab.orespawntest.item.ModCreativeModeTabs;
import com.mahtab.orespawntest.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OrespawnTest.MOD_ID)
public class OrespawnTest
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "orespawntest";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    public OrespawnTest(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS || event.getTabKey() == CreativeModeTabs.SEARCH) {
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.TITANIUM_NUGGET);
            event.accept(ModItems.URANIUM_INGOT);
            event.accept(ModItems.URANIUM_NUGGET);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.AMETHYST);
            event.accept(ModItems.SALT);
            event.accept(ModItems.MOBZILLASCALE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.TITANIUM_BLOCK);
            event.accept(ModBlocks.URANIUM_BLOCK);
            event.accept(ModBlocks.BLOCKAMETHYST);
            event.accept(ModBlocks.BLOCKRUBY);
            event.accept(ModBlocks.ENDERPEARLBLOCK);
            event.accept(ModBlocks.BLOCKMOBZILLASCALE);

        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.CORN);
            event.accept(ModItems.BLT);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.BUTTERCANDY);
            event.accept(ModItems.BUTTER);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.RAW_BACON);
            event.accept(ModItems.BACON);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.ORESALT);
            event.accept(ModBlocks.ORERUBY);
            event.accept(ModBlocks.TITANIUM_ORE);
            event.accept(ModBlocks.URANIUM_ORE);
            event.accept(ModBlocks.OREAMETHYST);
        }
        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.ULTIMATESWORD);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.ULTIMATEPICKAXE);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

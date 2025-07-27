package com.mahtab.orespawntest.item;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OrespawnTest.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORESPAWN_ORES = CREATIVE_MODE_TABS.register("orespawn_ores",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST.get()))
            .title(Component.translatable("creativetab.orespawntest.orespawn_ores"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.AMETHYST.get());
                output.accept(ModItems.RUBY.get());
                output.accept(ModItems.TITANIUM_INGOT.get());
                output.accept(ModItems.URANIUM_INGOT.get());
                output.accept(ModBlocks.TITANIUM_ORE.get());
                output.accept(ModBlocks.URANIUM_ORE.get());
                output.accept(ModBlocks.OREAMETHYST.get());
                output.accept(ModBlocks.ORERUBY.get());
            })
            .build());

    public static final RegistryObject<CreativeModeTab> ORESPAWN_ORE_BLOCKS = CREATIVE_MODE_TABS.register("orespawn_ore_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCKAMETHYST.get()))
                    .withTabsBefore(ORESPAWN_ORES.getId())
                    .title(Component.translatable("creativetab.orespawntest.orespawn_ore_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.BLOCKAMETHYST.get());
                        output.accept(ModBlocks.BLOCKRUBY.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.URANIUM_BLOCK.get());



                    })
                    .build());





    public static void register (IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}

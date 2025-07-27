package com.mahtab.orespawntest.block;


import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OrespawnTest.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8f,5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(8f,5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 6),BlockBehaviour.Properties.of()
                    .strength(6.5f,4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 6),BlockBehaviour.Properties.of()
                    .strength(6.5f,4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORERUBY = registerBlock("oreruby",
            () -> new DropExperienceBlock(UniformInt.of(3, 4),BlockBehaviour.Properties.of()
                    .strength(5.5f,3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLOCKRUBY = registerBlock("blockruby",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f,5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> OREAMETHYST = registerBlock("oreamethyst",
            () -> new DropExperienceBlock(UniformInt.of(3, 4),BlockBehaviour.Properties.of()
                    .strength(5.5f,3f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLOCKAMETHYST = registerBlock("blockamethyst",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f,5f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final RegistryObject<Block> ORESALT = registerBlock("oresalt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f,3f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T>  registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlocksItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlocksItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

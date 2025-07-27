package com.mahtab.orespawntest.datagen;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, OrespawnTest.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.URANIUM_BLOCK);
        blockWithItem(ModBlocks.URANIUM_ORE);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.BLOCKAMETHYST);
        blockWithItem(ModBlocks.BLOCKRUBY);
        blockWithItem(ModBlocks.OREAMETHYST);
        blockWithItem(ModBlocks.ORERUBY);
        blockWithItem(ModBlocks.ORESALT);


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

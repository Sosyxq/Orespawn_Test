package com.mahtab.orespawntest.datagen;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OrespawnTest.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.URANIUM_BLOCK.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.BLOCKAMETHYST.get())
                .add(ModBlocks.BLOCKRUBY.get())
                .add(ModBlocks.ORESALT.get())
                .add(ModBlocks.OREAMETHYST.get())
                .add(ModBlocks.ORERUBY.get())
                .add(ModBlocks.ENDERPEARLBLOCK.get())
                .add(ModBlocks.BLOCKMOBZILLASCALE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ORESALT.get())
                .add(ModBlocks.ENDERPEARLBLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.URANIUM_BLOCK.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.OREAMETHYST.get())
                .add(ModBlocks.ORERUBY.get())
                .add(ModBlocks.BLOCKAMETHYST.get())
                .add(ModBlocks.BLOCKRUBY.get())
                .add(ModBlocks.BLOCKMOBZILLASCALE.get());




    }
}

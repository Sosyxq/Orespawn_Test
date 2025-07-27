package com.mahtab.orespawntest.datagen;

import com.mahtab.orespawntest.block.ModBlocks;
import com.mahtab.orespawntest.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;


import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCKAMETHYST.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMETHYST.get())
                .unlockedBy(getHasName(ModItems.AMETHYST.get()), has(ModItems.AMETHYST.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCKRUBY.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.URANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TITANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_NUGGET.get()), has(ModItems.TITANIUM_NUGGET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.URANIUM_NUGGET.get())
                .unlockedBy(getHasName(ModItems.URANIUM_NUGGET.get()), has(ModItems.URANIUM_NUGGET.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST.get(),9)
                .requires(ModBlocks.BLOCKAMETHYST.get())
                .unlockedBy(getHasName(ModBlocks.BLOCKAMETHYST.get()), has(ModBlocks.BLOCKAMETHYST.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(),9)
                .requires(ModBlocks.BLOCKRUBY.get())
                .unlockedBy(getHasName(ModBlocks.BLOCKRUBY.get()), has(ModBlocks.BLOCKRUBY.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(),9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(),9)
                .requires(ModBlocks.URANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_BLOCK.get()), has(ModBlocks.URANIUM_BLOCK.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BLT.get())
                .requires(ModItems.BUTTER.get())
                .requires(ModItems.LETTUCE.get())
                .requires(ModItems.BACON.get())
                .requires(ModItems.TOMATO.get())
                .requires(Items.BREAD)
                .unlockedBy(getHasName(ModItems.BUTTER.get()), has(ModItems.BUTTER.get())).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BUTTER.get())
                .requires(Items.MILK_BUCKET)
                .requires(Items.MILK_BUCKET)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET)).save(pRecipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.RAW_BACON.get())
                .requires(Items.PORKCHOP)
                .requires(ModItems.SALT.get())
                .unlockedBy(getHasName(ModItems.SALT.get()), has(ModItems.SALT.get())).save(pRecipeOutput);





    }
}

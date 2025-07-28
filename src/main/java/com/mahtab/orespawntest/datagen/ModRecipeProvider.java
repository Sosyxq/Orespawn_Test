package com.mahtab.orespawntest.datagen;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.block.ModBlocks;
import com.mahtab.orespawntest.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;


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


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST.get(), 9)
                .requires(ModBlocks.BLOCKAMETHYST.get())
                .unlockedBy(getHasName(ModBlocks.BLOCKAMETHYST.get()), has(ModBlocks.BLOCKAMETHYST.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.BLOCKRUBY.get())
                .unlockedBy(getHasName(ModBlocks.BLOCKRUBY.get()), has(ModBlocks.BLOCKRUBY.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 9)
                .requires(ModBlocks.TITANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TITANIUM_BLOCK.get()), has(ModBlocks.TITANIUM_BLOCK.get())).save(pRecipeOutput, OrespawnTest.MOD_ID + ":titanium_ingot_fromblock");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 9)
                .requires(ModBlocks.URANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_BLOCK.get()), has(ModBlocks.URANIUM_BLOCK.get())).save(pRecipeOutput, OrespawnTest.MOD_ID + ":uranium_ingot_fromblock");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_NUGGET.get(), 9)
                .requires(ModItems.URANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get())).save(pRecipeOutput, OrespawnTest.MOD_ID + ":uranium_nugget_fromingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET.get(), 9)
                .requires(ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).save(pRecipeOutput, OrespawnTest.MOD_ID + ":titanium_nugget_fromingot");


        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BLT.get())
                .requires(ModItems.BUTTER.get())
                .requires(ModItems.LETTUCE.get())
                .requires(ModItems.BACON.get())
                .requires(ModItems.TOMATO.get())
                .requires(Items.BREAD)
                .unlockedBy(getHasName(ModItems.BUTTER.get()), has(ModItems.BUTTER.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BUTTER.get(), 4)
                .requires(Items.MILK_BUCKET)
                .requires(Items.MILK_BUCKET)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET)).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.RAW_BACON.get())
                .requires(Items.PORKCHOP)
                .requires(ModItems.SALT.get())
                .unlockedBy(getHasName(ModItems.SALT.get()), has(ModItems.SALT.get())).save(pRecipeOutput);

        foodCookingAll(pRecipeOutput, ModItems.RAW_BACON.get(), RecipeCategory.FOOD, ModItems.BACON.get(), 0.35f, 200, 100,600,"bacon");



        oreCookingBoth(pRecipeOutput, ModBlocks.TITANIUM_ORE.get(), RecipeCategory.MISC, ModItems.TITANIUM_NUGGET.get(), 0.35f, 200, 100, "titanium_nugget");
        oreCookingBoth(pRecipeOutput, ModBlocks.URANIUM_ORE.get(), RecipeCategory.MISC, ModItems.URANIUM_NUGGET.get(), 0.35f, 200, 100, "uranium_nugget");
        oreCookingBoth(pRecipeOutput, ModBlocks.OREAMETHYST.get(), RecipeCategory.MISC, ModItems.AMETHYST.get(), 0.35f, 200, 100, "amethyst");
        oreCookingBoth(pRecipeOutput, ModBlocks.ORERUBY.get(), RecipeCategory.MISC, ModItems.RUBY.get(), 0.35f, 200, 100, "ruby");
        oreCookingBoth(pRecipeOutput, ModBlocks.ORESALT.get(), RecipeCategory.MISC, ModItems.SALT.get(), 0.35f, 200, 100, "salt");







    }


    private void oreCooking(RecipeOutput output, Block input, RecipeCategory category, Item result, float xp, int cookTime, String name, boolean blasting) {
        SimpleCookingRecipeBuilder builder = blasting
                ? SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), category, result, xp, cookTime)
                : SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), category, result, xp, cookTime);

        builder.unlockedBy(getHasName(input), has(input))
                .save(output, OrespawnTest.MOD_ID + ":" + name);
    }
    private void oreCookingBoth(RecipeOutput output, Block input, RecipeCategory category, Item result, float xp, int smeltTime, int blastTime, String baseName) {
        oreCooking(output, input, category, result, xp, smeltTime, baseName + "_smelting", false);
        oreCooking(output, input, category, result, xp, blastTime, baseName + "_blasting", true);


    }
    private void foodCookingAll(RecipeOutput output, Item input, RecipeCategory category, Item result, float xp, int smeltTime, int smokeTime, int campfireTime, String baseName) {
        // Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), category, result, xp, smeltTime)
                .unlockedBy(getHasName(input), has(input))
                .save(output, OrespawnTest.MOD_ID + ":" + baseName + "_smelting");

        // Smoking
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), category, result, xp, smokeTime)
                .unlockedBy(getHasName(input), has(input))
                .save(output, OrespawnTest.MOD_ID + ":" + baseName + "_smoking");

        // Campfire Cooking
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), category, result, xp, campfireTime)
                .unlockedBy(getHasName(input), has(input))
                .save(output, OrespawnTest.MOD_ID + ":" + baseName + "_campfire");
    }



}






















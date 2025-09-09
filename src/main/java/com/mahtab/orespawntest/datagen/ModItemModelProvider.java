package com.mahtab.orespawntest.datagen;

import com.mahtab.orespawntest.OrespawnTest;
import com.mahtab.orespawntest.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OrespawnTest.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BLT.get());
        basicItem(ModItems.AMETHYST.get());
        basicItem(ModItems.BACON.get());
        basicItem(ModItems.CORN.get());
        basicItem(ModItems.BUTTER.get());
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.BUTTERCANDY.get());
        basicItem(ModItems.LETTUCE.get());
        basicItem(ModItems.SALT.get());
        basicItem(ModItems.TITANIUM_INGOT.get());
        basicItem(ModItems.TITANIUM_NUGGET.get());
        basicItem(ModItems.URANIUM_INGOT.get());
        basicItem(ModItems.URANIUM_NUGGET.get());
        basicItem(ModItems.TOMATO.get());
        basicItem(ModItems.RAW_BACON.get());
        basicItem(ModItems.MOBZILLASCALE.get());
        handheldItem(ModItems.ULTIMATESWORD);
        handheldItem(ModItems.ULTIMATEPICKAXE);
        handheldItem(ModItems.ULTIMATESHOVEL);
        handheldItem(ModItems.ULTIMATEAXE);
        handheldItem(ModItems.EMERALDPICKAXE);
        handheldItem(ModItems.EMERALDSWORD);
        handheldItem(ModItems.EMERALDSHOVEL);
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OrespawnTest.MOD_ID,"item/" + item.getId().getPath()));
    }










    }





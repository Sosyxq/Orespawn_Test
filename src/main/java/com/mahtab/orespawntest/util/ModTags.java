package com.mahtab.orespawntest.util;


import com.mahtab.orespawntest.OrespawnTest;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ULTIMATE_TOOL = createTag("needs_ultimate_tool");
        public static final TagKey<Block> INCORRECT_FOR_ULTIMATE_TOOL = createTag("incorrect_for_ultimate_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OrespawnTest.MOD_ID, name));
        }
    }
}
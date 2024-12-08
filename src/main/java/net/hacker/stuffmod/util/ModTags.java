package net.hacker.stuffmod.util;

import net.hacker.stuffmod.StuffMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKST1 =
                createTag("metal_detector_detectable_blocks_t1");
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKST2 =
                createTag("metal_detector_detectable_blocks_t2");
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKST3 =
                createTag("metal_detector_detectable_blocks_t3");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(StuffMod.MOD_ID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(StuffMod.MOD_ID, name));
        }
    }
}
package net.diligentelzee.hoav.util;

import net.diligentelzee.hoav.HOaV;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> HYPERDENSE_ORES = createTag("hyperdense_ores");
        public static final TagKey<Block> BACKUP_EOV_ORES = createTag("backup_eov_ores");
        public static final TagKey<Block> BACKUP_EOV_QUARTZ_ORES = createTag("backup_eov_quartz_ores");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(HOaV.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> HYPERDENSE_ORE_ITEMS = createTag("hyperdense_ore_items");
        public static final TagKey<Item> BACKUP_EOV_ORE_ITEMS = createTag("backup_eov_ore_items");
        public static final TagKey<Item> BACKUP_EOV_QUARTZ_ORES = createTag("backup_eov_quartz_ores");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HOaV.MOD_ID, name));
        }
    }
}

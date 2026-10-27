package net.diligentelzee.datagen;

import net.diligentelzee.hoav.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(ModBlocks.HYPERDENSE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_COAL_ORE.get(), Items.COAL, 4, 15));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get(), Items.COAL, 5, 16));
        add(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get(), Items.COAL, 4, 15));
        add(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get(), Items.COAL, 4, 15));
        add(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get(), Items.COAL, 4, 15));
        add(ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get(), Items.COAL, 4, 15));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get(), Items.COAL, 4, 16));

        add(ModBlocks.HYPERDENSE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_COPPER_ORE.get(), Items.RAW_COPPER, 5, 20));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(), Items.RAW_COPPER, 6, 22));
        add(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(), Items.RAW_COPPER, 5, 20));
        add(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(), Items.RAW_COPPER, 5, 20));
        add(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(), Items.RAW_COPPER, 5, 20));
        add(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(), Items.RAW_COPPER, 5, 20));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get(), Items.RAW_COPPER, 6, 22));

        add(ModBlocks.HYPERDENSE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 4));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(), Items.DIAMOND, 3, 5));
        add(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 4));
        add(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 4));
        add(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(), Items.DIAMOND, 2, 4));
        add(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(), Items.DIAMOND, 2, 4));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get(), Items.DIAMOND, 3, 5));

        add(ModBlocks.HYPERDENSE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_EMERALD_ORE.get(), Items.EMERALD, 2, 5));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(), Items.EMERALD, 3, 6));
        add(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(), Items.EMERALD, 2, 5));
        add(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(), Items.EMERALD, 2, 5));
        add(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(), Items.EMERALD, 2, 5));
        add(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(), Items.EMERALD, 2, 5));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get(), Items.EMERALD, 3, 6));

        add(ModBlocks.HYPERDENSE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GOLD_ORE.get(), Items.RAW_GOLD, 4, 10));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(), Items.RAW_GOLD, 5, 11));
        add(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(), Items.RAW_GOLD, 4, 10));
        add(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(), Items.RAW_GOLD, 4, 10));
        add(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(), Items.RAW_GOLD, 4, 10));
        add(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(), Items.RAW_GOLD, 5, 11));

        add(ModBlocks.HYPERDENSE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_IRON_ORE.get(), Items.RAW_IRON, 4, 14));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(), Items.RAW_IRON, 5, 15));
        add(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(), Items.RAW_IRON, 4, 14));
        add(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(), Items.RAW_IRON, 4, 14));
        add(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(), Items.RAW_IRON, 4, 14));
        add(ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(), Items.RAW_IRON, 4, 14));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get(), Items.RAW_IRON, 5, 15));

        add(ModBlocks.HYPERDENSE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 9, 18));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 10, 18));
        add(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 9, 18));
        add(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 9, 18));
        add(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 9, 18));
        add(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 9, 18));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get(), Items.LAPIS_LAZULI, 10, 20));

        add(ModBlocks.HYPERDENSE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_REDSTONE_ORE.get(), Items.REDSTONE, 5, 8));
        add(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 10));
        add(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(), Items.REDSTONE, 5, 8));
        add(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(), Items.REDSTONE, 5, 8));
        add(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(), Items.REDSTONE, 5, 8));
        add(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(), Items.REDSTONE, 5, 8));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get(), Items.REDSTONE, 6, 10));

        add(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get(), Items.GOLD_NUGGET, 5, 12));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(), Items.GOLD_NUGGET, 5, 13));

        add(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get(), Items.QUARTZ, 6, 10));
        add(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get(), Items.QUARTZ, 6, 11));


        add(ModBlocks.ANDESITE_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_COAL_ORE.get(), Items.COAL));
        add(ModBlocks.DIORITE_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_COAL_ORE.get(), Items.COAL));
        add(ModBlocks.GRANITE_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_COAL_ORE.get(), Items.COAL));
        add(ModBlocks.TUFF_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_COAL_ORE.get(), Items.COAL));
        add(ModBlocks.BLACKSTONE_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_COAL_ORE.get(), Items.COAL));

        add(ModBlocks.ANDESITE_COPPER_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.ANDESITE_COPPER_ORE.get()));
        add(ModBlocks.DIORITE_COPPER_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.DIORITE_COPPER_ORE.get()));
        add(ModBlocks.GRANITE_COPPER_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.GRANITE_COPPER_ORE.get()));
        add(ModBlocks.TUFF_COPPER_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.TUFF_COPPER_ORE.get()));
        add(ModBlocks.BLACKSTONE_COPPER_ORE.get(),
                block -> createCopperOreDrops(ModBlocks.BLACKSTONE_COPPER_ORE.get()));

        add(ModBlocks.ANDESITE_DIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_DIAMOND_ORE.get(), Items.DIAMOND));
        add(ModBlocks.DIORITE_DIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_DIAMOND_ORE.get(), Items.DIAMOND));
        add(ModBlocks.GRANITE_DIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_DIAMOND_ORE.get(), Items.DIAMOND));
        add(ModBlocks.TUFF_DIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_DIAMOND_ORE.get(), Items.DIAMOND));
        add(ModBlocks.BLACKSTONE_DIAMOND_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_DIAMOND_ORE.get(), Items.DIAMOND));

        add(ModBlocks.ANDESITE_EMERALD_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_EMERALD_ORE.get(), Items.EMERALD));
        add(ModBlocks.DIORITE_EMERALD_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_EMERALD_ORE.get(), Items.EMERALD));
        add(ModBlocks.GRANITE_EMERALD_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_EMERALD_ORE.get(), Items.EMERALD));
        add(ModBlocks.TUFF_EMERALD_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_EMERALD_ORE.get(), Items.EMERALD));
        add(ModBlocks.BLACKSTONE_EMERALD_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_EMERALD_ORE.get(), Items.EMERALD));

        add(ModBlocks.ANDESITE_GOLD_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_GOLD_ORE.get(), Items.RAW_GOLD));
        add(ModBlocks.DIORITE_GOLD_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_GOLD_ORE.get(), Items.RAW_GOLD));
        add(ModBlocks.GRANITE_GOLD_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_GOLD_ORE.get(), Items.RAW_GOLD));
        add(ModBlocks.TUFF_GOLD_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_GOLD_ORE.get(), Items.RAW_GOLD));

        add(ModBlocks.ANDESITE_IRON_ORE.get(),
                block -> createOreDrop(ModBlocks.ANDESITE_IRON_ORE.get(), Items.RAW_IRON));
        add(ModBlocks.DIORITE_IRON_ORE.get(),
                block -> createOreDrop(ModBlocks.DIORITE_IRON_ORE.get(), Items.RAW_IRON));
        add(ModBlocks.GRANITE_IRON_ORE.get(),
                block -> createOreDrop(ModBlocks.GRANITE_IRON_ORE.get(), Items.RAW_IRON));
        add(ModBlocks.TUFF_IRON_ORE.get(),
                block -> createOreDrop(ModBlocks.TUFF_IRON_ORE.get(), Items.RAW_IRON));
        add(ModBlocks.BLACKSTONE_IRON_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_IRON_ORE.get(), Items.RAW_IRON));

        add(ModBlocks.ANDESITE_LAPIS_ORE.get(),
                block -> createLapisOreDrops(ModBlocks.ANDESITE_LAPIS_ORE.get()));
        add(ModBlocks.DIORITE_LAPIS_ORE.get(),
                block -> createLapisOreDrops(ModBlocks.DIORITE_LAPIS_ORE.get()));
        add(ModBlocks.GRANITE_LAPIS_ORE.get(),
                block -> createLapisOreDrops(ModBlocks.GRANITE_LAPIS_ORE.get()));
        add(ModBlocks.TUFF_LAPIS_ORE.get(),
                block -> createLapisOreDrops(ModBlocks.TUFF_LAPIS_ORE.get()));
        add(ModBlocks.BLACKSTONE_LAPIS_ORE.get(),
                block -> createLapisOreDrops(ModBlocks.BLACKSTONE_LAPIS_ORE.get()));

        add(ModBlocks.ANDESITE_REDSTONE_ORE.get(),
                block -> createRedstoneOreDrops(ModBlocks.ANDESITE_REDSTONE_ORE.get()));
        add(ModBlocks.DIORITE_REDSTONE_ORE.get(),
                block -> createRedstoneOreDrops(ModBlocks.DIORITE_REDSTONE_ORE.get()));
        add(ModBlocks.GRANITE_REDSTONE_ORE.get(),
                block -> createRedstoneOreDrops(ModBlocks.GRANITE_REDSTONE_ORE.get()));
        add(ModBlocks.TUFF_REDSTONE_ORE.get(),
                block -> createRedstoneOreDrops(ModBlocks.TUFF_REDSTONE_ORE.get()));
        add(ModBlocks.BLACKSTONE_REDSTONE_ORE.get(),
                block -> createRedstoneOreDrops(ModBlocks.BLACKSTONE_REDSTONE_ORE.get()));

        add(ModBlocks.BLACKSTONE_GOLD_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_GOLD_ORE.get(), Items.GOLD_NUGGET));

        add(ModBlocks.BLACKSTONE_QUARTZ_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACKSTONE_QUARTZ_ORE.get(), Items.QUARTZ));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}

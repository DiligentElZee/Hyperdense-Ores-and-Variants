package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.diligentelzee.create_fillers.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, CreateFillers.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModel, ItemModelGenerators itemModel) {
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_COAL_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_COAL_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_COAL_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_COAL_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_COAL_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_COPPER_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_COPPER_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_COPPER_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_COPPER_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_COPPER_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_DIAMOND_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_DIAMOND_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_DIAMOND_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_DIAMOND_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_DIAMOND_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_EMERALD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_EMERALD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_EMERALD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_EMERALD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_EMERALD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_GOLD_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_IRON_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_IRON_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_IRON_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_IRON_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_IRON_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_LAPIS_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_LAPIS_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_LAPIS_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_LAPIS_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_LAPIS_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get());


        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.ANDESITE_REDSTONE_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_REDSTONE_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.DIORITE_REDSTONE_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.GRANITE_REDSTONE_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get());

        blockModel.createTrivialCube(ModBlocks.TUFF_REDSTONE_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get());


        blockModel.createTrivialCube(ModBlocks.BLACKSTONE_QUARTZ_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get());
        blockModel.createTrivialCube(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get());
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream();
    }
}

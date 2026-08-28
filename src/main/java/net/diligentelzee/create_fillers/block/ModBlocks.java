package net.diligentelzee.create_fillers.block;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateFillers.MOD_ID);


    // COAL //
    public static final DeferredBlock<Block> HYPERDENSE_COAL_ORE = registerBlock("hyperdense_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_coal_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_COAL_ORE = registerBlock("hyperdense_deepslate_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 4), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_coal_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_COAL_ORE = registerBlock("hyperdense_andesite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_coal_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_COAL_ORE = registerBlock("hyperdense_diorite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_coal_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_COAL_ORE = registerBlock("hyperdense_granite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_coal_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_COAL_ORE = registerBlock("hyperdense_tuff_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_coal_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_COAL_ORE = registerBlock("hyperdense_blackstone_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 4), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_coal_ore")))));


    // COPPER //
    public static final DeferredBlock<Block> HYPERDENSE_COPPER_ORE = registerBlock("hyperdense_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_copper_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_COPPER_ORE = registerBlock("hyperdense_deepslate_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_copper_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_COPPER_ORE = registerBlock("hyperdense_andesite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_copper_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_COPPER_ORE = registerBlock("hyperdense_diorite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_copper_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_COPPER_ORE = registerBlock("hyperdense_granite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_copper_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_COPPER_ORE = registerBlock("hyperdense_tuff_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_copper_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_COPPER_ORE = registerBlock("hyperdense_blackstone_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_copper_ore")))));


    // DIAMOND //
    public static final DeferredBlock<Block> HYPERDENSE_DIAMOND_ORE = registerBlock("hyperdense_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diamond_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_DIAMOND_ORE = registerBlock("hyperdense_deepslate_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_diamond_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_DIAMOND_ORE = registerBlock("hyperdense_andesite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_diamond_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_DIAMOND_ORE = registerBlock("hyperdense_diorite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_diamond_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_DIAMOND_ORE = registerBlock("hyperdense_granite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_diamond_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_DIAMOND_ORE = registerBlock("hyperdense_tuff_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_diamond_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_DIAMOND_ORE = registerBlock("hyperdense_blackstone_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_diamond_ore")))));


    // EMERALD //
    public static final DeferredBlock<Block> HYPERDENSE_EMERALD_ORE = registerBlock("hyperdense_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_emerald_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_EMERALD_ORE = registerBlock("hyperdense_deepslate_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_diamond_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_EMERALD_ORE = registerBlock("hyperdense_andesite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_emerald_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_EMERALD_ORE = registerBlock("hyperdense_diorite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_emerald_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_EMERALD_ORE = registerBlock("hyperdense_granite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_emerald_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_EMERALD_ORE = registerBlock("hyperdense_tuff_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_emerlad_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_EMERALD_ORE = registerBlock("hyperdense_blackstone_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_emerald_ore")))));


    // GOLD //
    public static final DeferredBlock<Block> HYPERDENSE_GOLD_ORE = registerBlock("hyperdense_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_gold_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_GOLD_ORE = registerBlock("hyperdense_deepslate_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_gold_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_NETHER_GOLD_ORE = registerBlock("hyperdense_nether_gold_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_nether_gold_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_GOLD_ORE = registerBlock("hyperdense_andesite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_gold_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_GOLD_ORE = registerBlock("hyperdense_diorite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_gold_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_GOLD_ORE = registerBlock("hyperdense_granite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_gold_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_GOLD_ORE = registerBlock("hyperdense_tuff_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_gold_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_GOLD_ORE = registerBlock("hyperdense_blackstone_gold_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_gold_ore")))
                    .sound(SoundType.STONE)));


    // IRON //
    public static final DeferredBlock<Block> HYPERDENSE_IRON_ORE = registerBlock("hyperdense_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_iron_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_IRON_ORE = registerBlock("hyperdense_deepslate_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_iron_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_IRON_ORE = registerBlock("hyperdense_andesite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_iron_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_IRON_ORE = registerBlock("hyperdense_diorite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_iron_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_IRON_ORE = registerBlock("hyperdense_granite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_iron_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_IRON_ORE = registerBlock("hyperdense_tuff_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_iron_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_IRON_ORE = registerBlock("hyperdense_blackstone_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_iron_ore")))));


    // LAPIS //
    public static final DeferredBlock<Block> HYPERDENSE_LAPIS_ORE = registerBlock("hyperdense_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_lapis_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_LAPIS_ORE = registerBlock("hyperdense_deepslate_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 8), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_iron_ore")))
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_LAPIS_ORE = registerBlock("hyperdense_andesite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_lapis_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_LAPIS_ORE = registerBlock("hyperdense_diorite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_lapis_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_LAPIS_ORE = registerBlock("hyperdense_granite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_lapis_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_LAPIS_ORE = registerBlock("hyperdense_tuff_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_lapis_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_LAPIS_ORE = registerBlock("hyperdense_blackstone_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_lapis_ore")))));


    // REDSTONE //
    public static final DeferredBlock<Block> HYPERDENSE_REDSTONE_ORE = registerBlock("hyperdense_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_redstone_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .randomTicks().lightLevel(litBlockEmission(10))));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_REDSTONE_ORE = registerBlock("hyperdense_deepslate_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_deepslate_redstone_ore")))
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .randomTicks().lightLevel(litBlockEmission(11))));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_REDSTONE_ORE = registerBlock("hyperdense_andesite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_andesite_redstone_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_REDSTONE_ORE = registerBlock("hyperdense_diorite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_diorite_redstone_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_REDSTONE_ORE = registerBlock("hyperdense_granite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_granite_redstone_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_REDSTONE_ORE = registerBlock("hyperdense_tuff_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_tuff_redstone_ore")))));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_REDSTONE_ORE = registerBlock("hyperdense_blackstone_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_redstone_ore")))));


    // QUARTZ //
    public static final DeferredBlock<Block> HYPERDENSE_NETHER_QUARTZ_ORE = registerBlock("hyperdense_nether_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_nether_quartz_ore")))
                    .strength(4.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_QUARTZ_ORE = registerBlock("hyperdense_blackstone_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "hyperdense_blackstone_quartz_ore")))
                    .sound(SoundType.STONE)));

    // For 1.21.3 ONLY - since there's no MarMar's EOV //
    public static final DeferredBlock<Block> ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_coal_ore")))
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> ANDESITE_COPPER_ORE = registerBlock("andesite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_copper_ore")))));
    public static final DeferredBlock<Block> ANDESITE_DIAMOND_ORE = registerBlock("andesite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_diamond_ore")))));
    public static final DeferredBlock<Block> ANDESITE_EMERALD_ORE = registerBlock("andesite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_emerald_ore")))));
    public static final DeferredBlock<Block> ANDESITE_GOLD_ORE = registerBlock("andesite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_gold_ore")))));
    public static final DeferredBlock<Block> ANDESITE_IRON_ORE = registerBlock("andesite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_iron_ore")))));
    public static final DeferredBlock<Block> ANDESITE_LAPIS_ORE = registerBlock("andesite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(ModBlocks.ANDESITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_lapis_ore")))));
    public static final DeferredBlock<Block> ANDESITE_REDSTONE_ORE = registerBlock("andesite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "andesite_redstone_ore")))
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .randomTicks().lightLevel(litBlockEmission(9)).strength(3.0F, 3.0F)));

    public static final DeferredBlock<Block> BLACKSTONE_COAL_ORE = registerBlock("blackstone_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_coal_ore")))
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> BLACKSTONE_COPPER_ORE = registerBlock("blackstone_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_copper_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_DIAMOND_ORE = registerBlock("blackstone_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_diamond_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_EMERALD_ORE = registerBlock("blackstone_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_emerald_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_GOLD_ORE = registerBlock("blackstone_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_gold_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_IRON_ORE = registerBlock("blackstone_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(1), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_iron_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_LAPIS_ORE = registerBlock("blackstone_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_lapis_ore")))));
    public static final DeferredBlock<Block> BLACKSTONE_REDSTONE_ORE = registerBlock("blackstone_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_redstone_ore")))
                    .mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .randomTicks().lightLevel(litBlockEmission(10)).strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> BLACKSTONE_QUARTZ_ORE = registerBlock("blackstone_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.BLACKSTONE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "blackstone_quartz_ore")))));

    public static final DeferredBlock<Block> DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_coal_ore")))
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> DIORITE_COPPER_ORE = registerBlock("diorite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_copper_ore")))));
    public static final DeferredBlock<Block> DIORITE_DIAMOND_ORE = registerBlock("diorite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_diamond_ore")))));
    public static final DeferredBlock<Block> DIORITE_EMERALD_ORE = registerBlock("diorite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_emerald_ore")))));
    public static final DeferredBlock<Block> DIORITE_GOLD_ORE = registerBlock("diorite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_gold_ore")))));
    public static final DeferredBlock<Block> DIORITE_IRON_ORE = registerBlock("diorite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_iron_ore")))));
    public static final DeferredBlock<Block> DIORITE_LAPIS_ORE = registerBlock("diorite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(ModBlocks.DIORITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_lapis_ore")))));
    public static final DeferredBlock<Block> DIORITE_REDSTONE_ORE = registerBlock("diorite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "diorite_redstone_ore")))
                    .mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
                    .randomTicks().lightLevel(litBlockEmission(9))));

    public static final DeferredBlock<Block> GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_coal_ore")))
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_copper_ore")))));
    public static final DeferredBlock<Block> GRANITE_DIAMOND_ORE = registerBlock("granite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_diamond_ore")))));
    public static final DeferredBlock<Block> GRANITE_EMERALD_ORE = registerBlock("granite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_emerald_ore")))));
    public static final DeferredBlock<Block> GRANITE_GOLD_ORE = registerBlock("granite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_gold_ore")))));
    public static final DeferredBlock<Block> GRANITE_IRON_ORE = registerBlock("granite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_iron_ore")))));
    public static final DeferredBlock<Block> GRANITE_LAPIS_ORE = registerBlock("granite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(ModBlocks.GRANITE_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_lapis_ore")))));
    public static final DeferredBlock<Block> GRANITE_REDSTONE_ORE = registerBlock("granite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "granite_redstone_ore")))
                    .mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
                    .randomTicks().lightLevel(litBlockEmission(9))));

    public static final DeferredBlock<Block> TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_coal_ore")))
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF)
                    .requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final DeferredBlock<Block> TUFF_COPPER_ORE = registerBlock("tuff_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_copper_ore")))));
    public static final DeferredBlock<Block> TUFF_DIAMOND_ORE = registerBlock("tuff_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_diamond_ore")))));
    public static final DeferredBlock<Block> TUFF_EMERALD_ORE = registerBlock("tuff_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_emerald_ore")))));
    public static final DeferredBlock<Block> TUFF_GOLD_ORE = registerBlock("tuff_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_gold_ore")))));
    public static final DeferredBlock<Block> TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_iron_ore")))));
    public static final DeferredBlock<Block> TUFF_LAPIS_ORE = registerBlock("tuff_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(ModBlocks.TUFF_COAL_ORE.get())
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_lapis_ore")))));
    public static final DeferredBlock<Block> TUFF_REDSTONE_ORE = registerBlock("tuff_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, "tuff_redstone_ore")))
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F)
                    .randomTicks().lightLevel(litBlockEmission(9))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return p_50763_ -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

        CreateFillers.LOGGER.info("[Module] BLOCKS Registered!");
    }
}

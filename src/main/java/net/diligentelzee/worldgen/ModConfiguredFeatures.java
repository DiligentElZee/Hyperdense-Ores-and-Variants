package net.diligentelzee.worldgen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?,?>> COAL_ORES_FEATURE = registerKey("coal_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> COAL_ORES_BURIED_FEATURE = registerKey("coal_ores_buried_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> COPPER_ORE_LARGE_FEATURE = registerKey("copper_ore_large_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> COPPER_ORE_SMALL_FEATURE = registerKey("copper_ore_small_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> IRON_ORES_FEATURE = registerKey("iron_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> IRON_ORES_SMALL_FEATURE = registerKey("iron_ores_small_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ORES_FEATURE = registerKey("gold_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ORES_BURIED_FEATURE = registerKey("gold_ores_buried_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> NETHER_GOLD_ORES_FEATURE = registerKey("nether_gold_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> QUARTZ_ORES_FEATURE = registerKey("quartz_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> LAPIS_ORES_FEATURE = registerKey("lapis_ores_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> LAPIS_ORES_BURIED_FEATURE = registerKey("lapis_ores_buried_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> REDSTONE_ORES_FEATURE = registerKey("redstone_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> EMERALD_ORES_FEATURE = registerKey("emerald_ores_feature");

    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_SMALL_FEATURE = registerKey("diamond_ores_small_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_LARGE_FEATURE = registerKey("diamond_ores_large_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_BURIED_FEATURE = registerKey("diamond_ores_buried_feature");
    public static final ResourceKey<ConfiguredFeature<?,?>> DIAMOND_ORES_MEDIUM_FEATURE = registerKey("diamond_ores_medium_feature");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest s_g_d_a_Replaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest d_t_Replaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest blackstoneReplaceable = new BlockMatchTest(Blocks.BLACKSTONE);

        // Coal
        List<OreConfiguration.TargetBlockState> coalOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.COAL_ORE.defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_COAL_ORE.get().defaultBlockState()),
                
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get().defaultBlockState()),

                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_COAL_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get().defaultBlockState()),
                
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_COAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get().defaultBlockState())
        );
        register(context, COAL_ORES_FEATURE, Feature.ORE, new OreConfiguration(coalOres, 17, 0.01f));
        register(context, COAL_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(coalOres, 17, 0.5f));


        // Copper
        List<OreConfiguration.TargetBlockState> copperOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get().defaultBlockState()),

                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_COPPER_ORE.get().defaultBlockState())
        );
        FeatureUtils.register(context, COPPER_ORE_SMALL_FEATURE, Feature.ORE, new OreConfiguration(copperOres, 10, 0.01f));
        FeatureUtils.register(context, COPPER_ORE_LARGE_FEATURE, Feature.ORE, new OreConfiguration(copperOres, 20, 0.05f));


        // Iron
        List<OreConfiguration.TargetBlockState> ironOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.IRON_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_IRON_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_IRON_ORE.get().defaultBlockState())
        );
        register(context, IRON_ORES_FEATURE, Feature.ORE, new OreConfiguration(ironOres, 9, 0.01f));
        register(context, IRON_ORES_SMALL_FEATURE, Feature.ORE, new OreConfiguration(ironOres, 4, 0.01f));


        // Gold
        List<OreConfiguration.TargetBlockState> goldOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.GOLD_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_GOLD_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> netherGoldOres = List.of(
                OreConfiguration.target(netherrackReplaceable, Blocks.NETHER_GOLD_ORE.defaultBlockState()),

                OreConfiguration.target(netherrackReplaceable, ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_GOLD_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get().defaultBlockState())
        );
        register(context, GOLD_ORES_FEATURE, Feature.ORE, new OreConfiguration(goldOres, 9, 0.01f));
        register(context, GOLD_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(goldOres, 9, 0.5f));
        register(context, NETHER_GOLD_ORES_FEATURE, Feature.ORE, new OreConfiguration(netherGoldOres, 10, 0.01f));


        // Quartz
        List<OreConfiguration.TargetBlockState> quartzOres = List.of(
                OreConfiguration.target(netherrackReplaceable, Blocks.NETHER_QUARTZ_ORE.defaultBlockState()),

                OreConfiguration.target(netherrackReplaceable, ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_QUARTZ_ORE.get().defaultBlockState()),

                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get().defaultBlockState())
        );
        register(context, QUARTZ_ORES_FEATURE, Feature.ORE, new OreConfiguration(quartzOres, 14, 0.01f));


        // Lapis Lazuli
        List<OreConfiguration.TargetBlockState> lapisOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.LAPIS_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_LAPIS_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_LAPIS_ORE.get().defaultBlockState())
        );
        register(context, LAPIS_ORES_FEATURE, Feature.ORE, new OreConfiguration(lapisOres, 7, 0.01f));
        register(context, LAPIS_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(lapisOres, 7, 1.0f));


        // Redstone
        List<OreConfiguration.TargetBlockState> redstoneOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.REDSTONE_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_REDSTONE_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_REDSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_REDSTONE_ORE.get().defaultBlockState())
        );
        register(context, REDSTONE_ORES_FEATURE, Feature.ORE, new OreConfiguration(redstoneOres, 8, 0.01f));


        // Emerald
        List<OreConfiguration.TargetBlockState> emeraldOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.EMERALD_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_EMERALD_ORE.get().defaultBlockState())
        );
        register(context, EMERALD_ORES_FEATURE, Feature.ORE, new OreConfiguration(emeraldOres, 3));


        // Diamond
        List<OreConfiguration.TargetBlockState> diamondOres = List.of(
                OreConfiguration.target(s_g_d_a_Replaceable, Blocks.DIAMOND_ORE.defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get().defaultBlockState()),

                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.DIORITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.ANDESITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(s_g_d_a_Replaceable, ModBlocks.GRANITE_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()),
                OreConfiguration.target(d_t_Replaceable, ModBlocks.TUFF_DIAMOND_ORE.get().defaultBlockState()),
                OreConfiguration.target(blackstoneReplaceable, ModBlocks.BLACKSTONE_DIAMOND_ORE.get().defaultBlockState())
        );
        FeatureUtils.register(context, DIAMOND_ORES_SMALL_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 4, 0.5F));
        FeatureUtils.register(context, DIAMOND_ORES_LARGE_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 12, 0.7F));
        FeatureUtils.register(context, DIAMOND_ORES_BURIED_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 8, 1.0F));
        FeatureUtils.register(context, DIAMOND_ORES_MEDIUM_FEATURE, Feature.ORE, new OreConfiguration(diamondOres, 8, 0.5F));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(CreateFillers.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register (BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                          F feature,
                                                                                          FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

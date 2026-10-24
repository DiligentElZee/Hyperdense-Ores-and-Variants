package net.diligentelzee.datagen;

import net.diligentelzee.hoav.HOaV;
import net.diligentelzee.hoav.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    protected ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    protected void smeltOres(List<ItemLike> pIngredients, ItemLike pResult, float pExperience){
        for (ItemLike ingredient : pIngredients) {
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), RecipeCategory.MISC, CookingBookCategory.BLOCKS, pResult, pExperience, 200)
                    .unlockedBy(pIngredients.toString(), has(ingredient))
                    .save(this.output, HOaV.MOD_ID + ":" + getItemName(pResult) + "_from_smelting_" + getItemName(ingredient));
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(ingredient), RecipeCategory.MISC, CookingBookCategory.BLOCKS, pResult, pExperience, 100)
                    .unlockedBy(pIngredients.toString(), has(ingredient))
                    .save(this.output, HOaV.MOD_ID + ":" + getItemName(pResult) + "_from_blasting_" + getItemName(ingredient));
        }
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> COAL_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_COAL_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE,
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE,
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE,
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE
        );

        List<ItemLike> COPPER_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_COPPER_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE,
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE
        );

        List<ItemLike> DIAMOND_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE
        );

        List<ItemLike> EMERALD_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE,
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE
        );

        List<ItemLike> GOLD_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE
        );

        List<ItemLike> NETHER_GOLD_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE
        );

        List<ItemLike> IRON_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_IRON_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE,
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE,
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE,
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE
        );

        List<ItemLike> LAPIS_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE,
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE
        );

        List<ItemLike> REDSTONE_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE
        );

        List<ItemLike> NETHER_QUARTZ_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE
        );

        smeltOres(COAL_SMELTABLES, Items.COAL, 0.5f);

        smeltOres(COPPER_SMELTABLES, Items.COPPER_INGOT, 0.5f);

        smeltOres(DIAMOND_SMELTABLES, Items.DIAMOND, 0.5f);

        smeltOres(EMERALD_SMELTABLES, Items.EMERALD, 0.5f);

        smeltOres(GOLD_SMELTABLES, Items.GOLD_INGOT, 0.5f);

        smeltOres(IRON_SMELTABLES, Items.IRON_INGOT, 0.5f);

        smeltOres(LAPIS_SMELTABLES, Items.LAPIS_LAZULI, 1.0f);

        smeltOres(REDSTONE_SMELTABLES, Items.REDSTONE, 0.5f);

        smeltOres(NETHER_GOLD_SMELTABLE, Items.GOLD_NUGGET, 0.5f);

        smeltOres(NETHER_QUARTZ_SMELTABLE, Items.QUARTZ, 0.5f);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public @NotNull String getName() {
            return "CreateFiller Recipes";
        }
    }
}

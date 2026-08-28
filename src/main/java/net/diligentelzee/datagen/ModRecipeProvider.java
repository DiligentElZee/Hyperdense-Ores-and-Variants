package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
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
        List<ItemLike> EOV_COAL_SMELTABLES = List.of(
                ModBlocks.ANDESITE_COAL_ORE,
                ModBlocks.DIORITE_COAL_ORE,
                ModBlocks.GRANITE_COAL_ORE,
                ModBlocks.TUFF_COAL_ORE,
                ModBlocks.BLACKSTONE_COAL_ORE
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
        List<ItemLike> EOV_COPPER_SMELTABLES = List.of(
                ModBlocks.ANDESITE_COPPER_ORE,
                ModBlocks.DIORITE_COPPER_ORE,
                ModBlocks.GRANITE_COPPER_ORE,
                ModBlocks.TUFF_COPPER_ORE,
                ModBlocks.BLACKSTONE_COPPER_ORE
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
        List<ItemLike> EOV_DIAMOND_SMELTABLES = List.of(
                ModBlocks.ANDESITE_DIAMOND_ORE,
                ModBlocks.DIORITE_DIAMOND_ORE,
                ModBlocks.GRANITE_DIAMOND_ORE,
                ModBlocks.TUFF_DIAMOND_ORE,
                ModBlocks.BLACKSTONE_DIAMOND_ORE
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
        List<ItemLike> EOV_EMERALD_SMELTABLES = List.of(
                ModBlocks.ANDESITE_EMERALD_ORE,
                ModBlocks.DIORITE_EMERALD_ORE,
                ModBlocks.GRANITE_EMERALD_ORE,
                ModBlocks.TUFF_EMERALD_ORE,
                ModBlocks.BLACKSTONE_EMERALD_ORE
        );
        
        List<ItemLike> GOLD_SMELTABLES = List.of(
                ModBlocks.HYPERDENSE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE,
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE,
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE
        );
        List<ItemLike> EOV_GOLD_SMELTABLES = List.of(
                ModBlocks.ANDESITE_GOLD_ORE,
                ModBlocks.DIORITE_GOLD_ORE,
                ModBlocks.GRANITE_GOLD_ORE,
                ModBlocks.TUFF_GOLD_ORE
        );
        
        List<ItemLike> NETHER_GOLD_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE
        );
        List<ItemLike> EOV_NETHER_GOLD_SMELTABLES = List.of(
                ModBlocks.BLACKSTONE_GOLD_ORE
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
        List<ItemLike> EOV_IRON_SMELTABLES = List.of(
                ModBlocks.ANDESITE_IRON_ORE,
                ModBlocks.DIORITE_IRON_ORE,
                ModBlocks.GRANITE_IRON_ORE,
                ModBlocks.TUFF_IRON_ORE,
                ModBlocks.BLACKSTONE_IRON_ORE
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
        List<ItemLike> EOV_LAPIS_SMELTABLES = List.of(
                ModBlocks.ANDESITE_LAPIS_ORE,
                ModBlocks.DIORITE_LAPIS_ORE,
                ModBlocks.GRANITE_LAPIS_ORE,
                ModBlocks.TUFF_LAPIS_ORE,
                ModBlocks.BLACKSTONE_LAPIS_ORE
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
        List<ItemLike> EOV_REDSTONE_SMELTABLES = List.of(
                ModBlocks.ANDESITE_REDSTONE_ORE,
                ModBlocks.DIORITE_REDSTONE_ORE,
                ModBlocks.GRANITE_REDSTONE_ORE,
                ModBlocks.TUFF_REDSTONE_ORE,
                ModBlocks.BLACKSTONE_REDSTONE_ORE
        );
        
        List<ItemLike> NETHER_QUARTZ_SMELTABLE = List.of(
                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE,
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE
                );
        List<ItemLike> EOV_QUARTZ_SMELTABLES = List.of(
                ModBlocks.BLACKSTONE_QUARTZ_ORE
        );

        oreSmelting(this.output, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 250, "coal");
        oreBlasting(this.output, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.6f, 125, "coal");
        oreSmelting(this.output, EOV_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.5f, 120, "coal");
        oreBlasting(this.output, EOV_COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.6f, 60, "coal");

        oreSmelting(this.output, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.5f, 250, "copper");
        oreBlasting(this.output, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.6f, 125, "copper");
        oreSmelting(this.output, EOV_COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.5f, 120, "copper");
        oreBlasting(this.output, EOV_COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.6f, 60, "copper");

        oreSmelting(this.output, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.5f, 250, "diamond");
        oreBlasting(this.output, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.6f, 125, "diamond");
        oreSmelting(this.output, EOV_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.5f, 120, "diamond");
        oreBlasting(this.output, EOV_DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 0.6f, 60, "diamond");

        oreSmelting(this.output, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.5f, 250, "emerald");
        oreBlasting(this.output, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.6f, 125, "emerald");
        oreSmelting(this.output, EOV_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.5f, 120, "emerald");
        oreBlasting(this.output, EOV_EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 0.6f, 60, "emerald");

        oreSmelting(this.output, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.5f, 250, "gold");
        oreBlasting(this.output, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.6f, 125, "gold");
        oreSmelting(this.output, EOV_GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.5f, 120, "gold");
        oreBlasting(this.output, EOV_GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 0.6f, 60, "gold");

        oreSmelting(this.output, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.5f, 250, "iron");
        oreBlasting(this.output, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.6f, 125, "iron");
        oreSmelting(this.output, EOV_IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.5f, 120, "iron");
        oreBlasting(this.output, EOV_IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.6f, 60, "iron");

        oreSmelting(this.output, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.0f, 250, "lapis");
        oreBlasting(this.output, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.2f, 125, "lapis");
        oreSmelting(this.output, EOV_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.0f, 120, "lapis");
        oreBlasting(this.output, EOV_LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 1.2f, 60, "lapis");

        oreSmelting(this.output, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.5f, 250, "redstone");
        oreBlasting(this.output, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.6f, 125, "redstone");
        oreSmelting(this.output, EOV_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.5f, 120, "redstone");
        oreBlasting(this.output, EOV_REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.6f, 60, "redstone");

        oreSmelting(this.output, NETHER_GOLD_SMELTABLE, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.5f, 250, "gold_nugget");
        oreBlasting(this.output, NETHER_GOLD_SMELTABLE, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.6f, 125, "gold_nugget");
        oreSmelting(this.output, EOV_NETHER_GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.5f, 120, "gold_nugget");
        oreBlasting(this.output, EOV_NETHER_GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_NUGGET, 0.6f, 60, "gold_nugget");

        oreSmelting(this.output, NETHER_QUARTZ_SMELTABLE, RecipeCategory.MISC, Items.QUARTZ, 0.5f, 250, "quartz");
        oreBlasting(this.output, NETHER_QUARTZ_SMELTABLE, RecipeCategory.MISC, Items.QUARTZ, 0.6f, 125, "quartz");
        oreSmelting(this.output, EOV_QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.5f, 120, "quartz");
        oreBlasting(this.output, EOV_QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.6f, 60, "quartz");
    }

    protected void oreSmelting(@NotNull RecipeOutput recipeOutput, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTIme, @NotNull String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected void oreBlasting(@NotNull RecipeOutput recipeOutput, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTime, @NotNull String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(@NotNull RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer,
                                                                       AbstractCookingRecipe.@NotNull Factory<T> factory,
                                                                       List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory,
                                                                       @NotNull ItemLike pResult, float pExperience, int pCookingTime,
                                                                       @NotNull String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CreateFillers.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

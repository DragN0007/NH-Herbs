package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.NHItems;
import com.dragn0007.nomadic_herbs.util.NHTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class NHRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public NHRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.CREOSOTE_CLUSTER.get())
                .requires(NHBlocks.CREOSOTE_BUSH.get())
                .unlockedBy("has_creosote", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.CREOSOTE_BUSH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.PRICKLY_PEAR_PASTE.get())
                .requires(NHItems.PRICKLY_PEAR.get())
                .requires(NHItems.PRICKLY_PEAR.get())
                .requires(NHItems.GRINDER.get())
                .unlockedBy("has_grinder", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.GRINDER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SHREDDED_BITTER_LETTUCE.get(), 1)
                .requires(NHBlocks.BITTER_LETTUCE.get())
                .unlockedBy("has_bitter_lettuce", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.BITTER_LETTUCE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.DEVILS_CLAW_SEEDS.get(), 1)
                .requires(NHBlocks.DEVILS_CLAW.get())
                .unlockedBy("has_devils_claw", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.DEVILS_CLAW.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SUNDEW_MUCILAGE.get(), 2)
                .requires(NHBlocks.SUNDEW.get())
                .unlockedBy("has_sundew", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.SUNDEW.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SQUIRRELTAIL_CLUSTER.get())
                .requires(NHBlocks.SQUIRRELTAIL.get())
                .unlockedBy("has_squirreltail", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.SQUIRRELTAIL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.WATER_HYSSOP_CLUSTER.get())
                .requires(NHBlocks.WATER_HYSSOP.get())
                .unlockedBy("has_water_hyssop", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.WATER_HYSSOP.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NHItems.POUCH.get())
                .define('A', NHTags.Items.LILY_PADS)
                .define('B', NHItems.PLANT_FIBER.get())
                .pattern(" B")
                .pattern("AA")
                .unlockedBy("has_lily_pad", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.LILY_PADS).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.PEYOTE_PASTE.get())
                .requires(NHItems.PEYOTE.get())
                .requires(NHItems.PEYOTE.get())
                .requires(NHItems.GRINDER.get())
                .unlockedBy("has_grinder", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.GRINDER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NHItems.GRINDER.get())
                .define('A', ItemTags.PLANKS)
                .define('B', Items.STICK)
                .pattern("ABA")
                .pattern(" A ")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ItemTags.PLANKS).build()))
                .save(pFinishedRecipeConsumer);
    }
}
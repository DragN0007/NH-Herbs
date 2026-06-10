package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.items.NHItems;
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
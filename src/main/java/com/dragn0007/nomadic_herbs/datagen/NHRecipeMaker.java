package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.NHItems;
import com.dragn0007.nomadic_herbs.util.NHTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class NHRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public NHRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        buildCommonRecipes(pFinishedRecipeConsumer);
        buildWoodRecipes(pFinishedRecipeConsumer, NHBlocks.MULGA);
    }

    public void buildCommonRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.COCONUT_HUSK.get(), 2)
                .requires(NHItems.COCONUT.get())
                .unlockedBy("has_coconut", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.COCONUT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.NUMBING_POWDER.get())
                .requires(NHItems.DEVILS_CLAW_SEEDS.get())
                .requires(NHItems.BRITTLEBUSH_CLUSTER.get())
                .requires(NHItems.GRINDER.get())
                .unlockedBy("has_grinder", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.GRINDER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.POISON_PASTE.get())
                .requires(NHItems.ARTEMISIA.get())
                .requires(NHItems.SNAKES_BLOOD_SAP.get())
                .requires(NHItems.JEWELWEED_STEMS.get())
                .requires(NHBlocks.WATERSHIELD.get())
                .unlockedBy("has_artemisia", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.ARTEMISIA.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.ACHIOTE_PASTE.get())
                .requires(NHItems.ACHIOTE.get())
                .requires(NHItems.SNAKES_BLOOD_SAP.get())
                .requires(NHItems.PEYOTE.get())
                .requires(NHItems.SQUIRRELTAIL_CLUSTER.get())
                .unlockedBy("has_achiote", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.ACHIOTE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.PEYOTE_PASTE.get())
                .requires(NHItems.PEYOTE.get())
                .requires(NHItems.SNAKES_BLOOD_SAP.get())
                .requires(NHItems.ALOE.get())
                .unlockedBy("has_peyote", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.PEYOTE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.ROSEHIP_PASTE.get())
                .requires(NHItems.ROSEHIPS.get())
                .requires(NHTags.Items.HONEY)
                .requires(NHItems.GINGER.get())
                .requires(NHItems.WATER_COCONUT_HUSK.get())
                .unlockedBy("has_rosehips", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.ROSEHIPS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.BANANA_PASTE.get())
                .requires(NHItems.BANANA_LEAF.get())
                .requires(NHItems.PRICKLY_PEAR.get())
                .requires(NHItems.BRITTLEBUSH_CLUSTER.get())
                .unlockedBy("has_banana_leaf", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.BANANA_LEAF.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SUN_PASTE.get())
                .requires(NHItems.COCONUT.get())
                .requires(NHItems.ALOE.get())
                .requires(NHItems.SPEARMINT.get())
                .unlockedBy("has_aloe", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.ALOE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.RITUAL_INCENSE.get())
                .requires(NHItems.HONEYPOT_ANT.get())
                .requires(NHItems.CURARE.get())
                .requires(NHTags.Items.STRING)
                .unlockedBy("has_string", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.STRING).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.HERBAL_INCENSE.get())
                .requires(NHItems.DRIED_ROSEMARY.get())
                .requires(NHItems.DRIED_MILKWEED_PETALS.get())
                .requires(NHItems.DRIED_ROSEHIPS.get())
                .requires(NHItems.DRIED_HIBISCUS_CLUSTER.get())
                .requires(NHItems.SHREDDED_CURARE.get())
                .requires(NHTags.Items.STRING)
                .unlockedBy("has_string", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.STRING).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SLUMBER_INCENSE.get())
                .requires(NHItems.DRIED_THYME.get())
                .requires(NHItems.DRIED_LAVENDER.get())
                .requires(NHItems.DRIED_ALOYSIA.get())
                .requires(NHItems.DRIED_MILKWEED_PETALS.get())
                .requires(NHItems.SHREDDED_CURARE.get())
                .requires(NHTags.Items.STRING)
                .unlockedBy("has_string", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.STRING).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.HIBISCUS_WATER_POUCH.get())
                .requires(NHItems.HIBISCUS_CLUSTER.get())
                .requires(NHItems.HIBISCUS_CLUSTER.get())
                .requires(NHItems.WATER_POUCH.get())
                .unlockedBy("has_water_pouch", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.WATER_POUCH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.HAWTHORN_WATER_POUCH.get())
                .requires(NHItems.HAWTHORN_BERRY.get())
                .requires(NHItems.HAWTHORN_BERRY.get())
                .requires(NHItems.WATER_POUCH.get())
                .unlockedBy("has_water_pouch", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.WATER_POUCH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.FEVER_TEA_POUCH.get())
                .requires(NHItems.CARDINAL_FLOWER_PETALS.get())
                .requires(NHItems.FEVERFEW_CLUSTER.get())
                .requires(NHItems.SWEET_FLAG_CLUSTER.get())
                .requires(NHItems.WATER_POUCH.get())
                .unlockedBy("has_water_pouch", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.WATER_POUCH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.CACTUS_WATER_POUCH.get())
                .requires(NHTags.Items.CACTI)
                .requires(NHItems.WATER_POUCH.get())
                .unlockedBy("has_water_pouch", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.WATER_POUCH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.HERBAL_WATER_POUCH.get())
                .requires(NHTags.Items.HERBAL_WATER_ITEMS)
                .requires(NHItems.WATER_POUCH.get())
                .unlockedBy("has_water_pouch", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.WATER_POUCH.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.CLAY_PASTE.get())
                .requires(Items.CLAY_BALL)
                .requires(NHItems.SALT_WATER_COCONUT_HUSK.get())
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.SALT).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SALT_WATER_COCONUT_HUSK.get())
                .requires(NHTags.Items.SALT)
                .requires(NHItems.WATER_COCONUT_HUSK.get())
                .unlockedBy("has_salt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.SALT).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.ROSEHIPS.get(), 3)
                .requires(Items.ROSE_BUSH)
                .unlockedBy("has_rose", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.ROSE_BUSH).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.CHARCOAL_CHUNKS.get(), 3)
                .requires(Items.CHARCOAL)
                .requires(NHItems.GRINDER.get())
                .unlockedBy("has_grinder", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHItems.GRINDER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.CARDINAL_FLOWER_PETALS.get(), 2)
                .requires(NHBlocks.CARDINAL_FLOWER.get())
                .unlockedBy("has_cardinal_flower", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.CARDINAL_FLOWER.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.SHREDDED_CURARE.get(), 1)
                .requires(NHBlocks.CURARE.get())
                .unlockedBy("has_curare", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.CURARE.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.BRITTLEBUSH_CLUSTER.get())
                .requires(NHBlocks.BRITTLEBUSH.get())
                .unlockedBy("has_brittlebush", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHBlocks.BRITTLEBUSH.get()).build()))
                .save(pFinishedRecipeConsumer);

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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NHItems.PLANT_FIBER.get(), 2)
                .requires(NHTags.Items.MAKES_PLANT_FIBER)
                .unlockedBy("has_fibrous_plants", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(NHTags.Items.MAKES_PLANT_FIBER).build()))
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

    private static void buildWoodRecipes(Consumer<FinishedRecipe> consumer, NHBlocks.WoodType wood) {
        Block planks = wood.planks().get();
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4)
                .requires(Ingredient.of(wood.log().get()))
                .unlockedBy("has_log", has(wood.log().get()))
                .save(consumer, getConversionRecipeName(planks, wood.log().get()));

        stairBuilder(wood.stairs().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, wood.slab().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        fenceBuilder(wood.fence().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);

        fenceGateBuilder(wood.fenceGate().get(), Ingredient.of(planks))
                .unlockedBy("has_planks", has(planks))
                .save(consumer);
    }
}
package com.dragn0007.nomadic_herbs.compat.jei.recipe;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

//Originally Authored by Savendro
public class DryingStonesCategory implements IRecipeCategory<JeiDryingStonesRecipe> {

    public static final ResourceLocation UID = new ResourceLocation("nomadic_herbs", "drying_stones");
    public static final ResourceLocation TEXTURE = new ResourceLocation(NomadicHerbs.MODID, "textures/gui/jei/drying_stones.png");

    public static final RecipeType<JeiDryingStonesRecipe> DRYING_STONES_TYPE = new RecipeType<>(UID, JeiDryingStonesRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableAnimated arrow;
    private final IDrawableAnimated bubbles;

    public DryingStonesCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 90, 60);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(NHBlocks.DRYING_STONES.get()));
        this.arrow = helper.drawableBuilder(TEXTURE, 90, 0, 9, 28)
                .buildAnimated(200, IDrawableAnimated.StartDirection.TOP, false);
        this.bubbles = helper.drawableBuilder(TEXTURE, 99, 0, 12, 29)
                .buildAnimated(200, IDrawableAnimated.StartDirection.BOTTOM, false);
    }

    @Override
    public RecipeType<JeiDryingStonesRecipe> getRecipeType() {
        return DRYING_STONES_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("blockentities.nomadic_herbs.drying_stones");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        // TODO Auto-generated method stub
        return this.icon;
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, JeiDryingStonesRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 64, 2).addIngredients(recipe.getIngredients().get(0));
        if(recipe.getIngredients().size() > 1) {
            builder.addSlot(RecipeIngredientRole.INPUT, 2, 2).addIngredients(recipe.getIngredients().get(1));
        }
        builder.addSlot(RecipeIngredientRole.OUTPUT, 64, 43).addItemStack(recipe.getResultItem(null));

    }
}
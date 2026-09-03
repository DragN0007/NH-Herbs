package com.dragn0007.nomadic_herbs.compat.jei;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.client.gui.DryingStonesScreen;
import com.dragn0007.nomadic_herbs.compat.jei.recipe.DryingStonesCategory;
import com.dragn0007.nomadic_herbs.compat.jei.recipe.JeiDryingStonesRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

//Originally Authored by Savendro
@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(NomadicHerbs.MODID, "nomadic_herbs_jei");
    }
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new DryingStonesCategory(registration.getJeiHelpers().getGuiHelper()));
    }
    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<JeiDryingStonesRecipe> dryingStonesRecipes = recipeManager.getAllRecipesFor(JeiDryingStonesRecipe.Type.INSTANCE);

        registration.addRecipes(DryingStonesCategory.DRYING_STONES_TYPE, dryingStonesRecipes);
    }
    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(DryingStonesScreen.class, 15, 43, 20, 18, DryingStonesCategory.DRYING_STONES_TYPE);
    }
}
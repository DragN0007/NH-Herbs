
package com.dragn0007.nomadic_herbs.compat.jei;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.compat.jei.recipe.JeiDryingStonesRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//Originally Authored by Savendro
/* 
This code is here to serialize the teapot recipe for JEI. It is registered in the CropOverhaul class. 
this is a separate class from CORecipes because it is only used for JEI and not for the actual recipe registration. It is registered in the EventBuss */
public class JEIRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, NomadicHerbs.MODID);

    public static final RegistryObject<RecipeSerializer<JeiDryingStonesRecipe>> DRYING_STONES_SERIALIZER =
            SERIALIZERS.register("drying_stones_jei", () -> JeiDryingStonesRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
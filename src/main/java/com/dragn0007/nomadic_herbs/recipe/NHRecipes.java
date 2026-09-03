package com.dragn0007.nomadic_herbs.recipe;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class NHRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, NomadicHerbs.MODID);

    public static final RegistryObject<RecipeSerializer<DryingStonesRecipe>> DRYING_STONES_SERIALIZER =
            SERIALIZERS.register("drying_stones", () -> DryingStonesRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
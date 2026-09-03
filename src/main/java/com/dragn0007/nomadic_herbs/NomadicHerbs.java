package com.dragn0007.nomadic_herbs;

import com.dragn0007.nomadic_herbs.blocks.NHBlockEntities;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.common.gui.NHMenuTypes;
import com.dragn0007.nomadic_herbs.compat.jei.JEIRecipes;
import com.dragn0007.nomadic_herbs.items.NHItemGroupModifier;
import com.dragn0007.nomadic_herbs.items.NHItems;
import com.dragn0007.nomadic_herbs.recipe.NHRecipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(NomadicHerbs.MODID)
public class NomadicHerbs
{
    public static final String MODID = "nomadic_herbs";

    public NomadicHerbs() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        NHBlocks.register(eventBus);
        NHBlockEntities.register(eventBus);
        NHItems.register(eventBus);
        NHItemGroupModifier.register(eventBus);
        NHBlocks.TILE_ENTITIES.register(eventBus);
        NHMenuTypes.register(eventBus);
        NHRecipes.register(eventBus);
        JEIRecipes.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
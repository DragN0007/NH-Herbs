package com.dragn0007.nomadic_herbs;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.NHItemGroupModifier;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(NomadicHerbs.MODID)
public class NomadicHerbs
{
    public static final String MODID = "nomadic_herbs";

    public NomadicHerbs()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        NHBlocks.register(eventBus);
        NHItems.register(eventBus);
        NHItemGroupModifier.register(eventBus);
        NHBlocks.TILE_ENTITIES.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
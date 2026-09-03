package com.dragn0007.nomadic_herbs.client.event;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.client.gui.DryingStonesScreen;
import com.dragn0007.nomadic_herbs.common.gui.NHMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = NomadicHerbs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class NHClientEvent {

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        MenuScreens.register(NHMenuTypes.DRYING_STONES_MENU.get(), DryingStonesScreen::new);
    }

}
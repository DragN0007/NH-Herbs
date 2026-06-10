package com.dragn0007.nomadic_herbs.items;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NHItemGroupModifier {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NomadicHerbs.MODID);

    public static final RegistryObject<CreativeModeTab> REPTILES_OVERHAUL_GROUP = CREATIVE_MODE_TABS.register("nomadic_herbs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NHItems.LOGO_ITEM.get())).title(Component.translatable("itemGroup.nomadic_herbs"))
                    .displayItems((displayParameters, output) -> {

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}



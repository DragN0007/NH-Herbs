package com.dragn0007.nomadic_herbs.items;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
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

    public static final RegistryObject<CreativeModeTab> NH_GROUP = CREATIVE_MODE_TABS.register("nomadic_herbs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NHItems.PEYOTE.get())).title(Component.translatable("itemGroup.nomadic_herbs"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(NHItems.GRINDER.get());
                        output.accept(NHItems.POUCH.get());
                        output.accept(NHItems.WATER_POUCH.get());
                        output.accept(NHItems.PEYOTE.get());
                        output.accept(NHItems.ROSEMARY.get());
                        output.accept(NHItems.CILANTRO.get());
                        output.accept(NHBlocks.WATER_HYSSOP.get());
                        output.accept(NHItems.WATER_HYSSOP_CLUSTER.get());
                        output.accept(NHBlocks.SQUIRRELTAIL.get());
                        output.accept(NHItems.SQUIRRELTAIL_CLUSTER.get());
                        output.accept(NHBlocks.WATERSHIELD.get());
                        output.accept(NHItems.ARTEMISIA.get());
                        output.accept(NHItems.THYME.get());
                        output.accept(NHItems.BASIL.get());
                        output.accept(NHBlocks.SUNDEW.get());
                        output.accept(NHBlocks.CATS_CLAW.get());
                        output.accept(NHBlocks.DEVILS_CLAW.get());
                        output.accept(NHItems.DEVILS_CLAW_SEEDS.get());
                        output.accept(NHBlocks.BITTER_LETTUCE.get());
                        output.accept(NHItems.PRICKLY_PEAR.get());
                        output.accept(NHBlocks.CREOSOTE_BUSH.get());
                        output.accept(NHItems.CREOSOTE_CLUSTER.get());
                        output.accept(NHBlocks.BRITTLEBUSH.get());
                        output.accept(NHItems.BRITTLEBUSH_CLUSTER.get());
                        output.accept(NHItems.CURARE.get());
                        output.accept(NHItems.SHREDDED_CURARE.get());
                        output.accept(NHItems.PRICKLY_PEAR_PASTE.get());
                        output.accept(NHItems.SHREDDED_BITTER_LETTUCE.get());
                        output.accept(NHItems.SUNDEW_MUCILAGE.get());
                        output.accept(NHItems.PEYOTE_PASTE.get());
                        output.accept(NHItems.WATERSHIELD_PASTE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}



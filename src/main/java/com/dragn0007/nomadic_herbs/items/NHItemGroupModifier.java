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
                        output.accept(NHBlocks.MULGA_LOG.get());
                        output.accept(NHBlocks.MULGA_PLANKS.get());
                        output.accept(NHBlocks.MULGA_LEAVES.get());
                        output.accept(NHBlocks.MULGA_SAPLING.get().asItem().getDefaultInstance());
                        output.accept(NHBlocks.MULGA_STAIRS.get());
                        output.accept(NHBlocks.MULGA_SLAB.get());
                        output.accept(NHBlocks.MULGA_FENCE.get());
                        output.accept(NHBlocks.MULGA_FENCE_GATE.get());

                        output.accept(NHBlocks.DRYING_STONES.get());
                        output.accept(NHItems.GRINDER.get());
                        output.accept(NHItems.POUCH.get());
                        output.accept(NHItems.WATER_POUCH.get());
                        output.accept(NHItems.HIBISCUS_WATER_POUCH.get());
                        output.accept(NHItems.HERBAL_WATER_POUCH.get());
                        output.accept(NHItems.CACTUS_WATER_POUCH.get());
                        output.accept(NHItems.HAWTHORN_WATER_POUCH.get());
                        output.accept(NHItems.FEVER_TEA_POUCH.get());
                        output.accept(NHItems.WATER_COCONUT_HUSK.get());
                        output.accept(NHItems.SALT_WATER_COCONUT_HUSK.get());
                        output.accept(NHItems.COCONUT.get());
                        output.accept(NHItems.HONEYPOT_ANT.get());
                        output.accept(NHItems.HONEY_STICK.get());
                        output.accept(NHItems.ROSEHIPS.get());
                        output.accept(NHItems.SNAKES_BLOOD_SAP.get());
                        output.accept(NHItems.CHARCOAL_CHUNKS.get());
                        output.accept(NHItems.COCONUT_HUSK.get());
                        output.accept(NHItems.BANANA_LEAF.get());
                        output.accept(NHItems.PLANT_FIBER.get());
                        output.accept(NHBlocks.DEEP_FUNGUS.get());
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
                        output.accept(NHItems.SUNDEW_MUCILAGE.get());
                        output.accept(NHBlocks.CATS_CLAW.get());
                        output.accept(NHBlocks.DEVILS_CLAW.get());
                        output.accept(NHItems.DEVILS_CLAW_SEEDS.get());
                        output.accept(NHBlocks.BITTER_LETTUCE.get());
                        output.accept(NHItems.SHREDDED_BITTER_LETTUCE.get());
                        output.accept(NHItems.PRICKLY_PEAR.get());
                        output.accept(NHBlocks.CREOSOTE_BUSH.get());
                        output.accept(NHItems.CREOSOTE_CLUSTER.get());
                        output.accept(NHBlocks.BRITTLEBUSH.get());
                        output.accept(NHItems.BRITTLEBUSH_CLUSTER.get());
                        output.accept(NHItems.CURARE.get());
                        output.accept(NHItems.SHREDDED_CURARE.get());
                        output.accept(NHItems.JABORANDI.get());
                        output.accept(NHItems.ACHIOTE.get());
                        output.accept(NHItems.WATERCRESS_CLUSTER.get());
                        output.accept(NHItems.SWEET_FLAG_CLUSTER.get());
                        output.accept(NHItems.JEWELWEED_CLUSTER.get());
                        output.accept(NHItems.JEWELWEED_STEMS.get());
                        output.accept(NHItems.JEWELWEED_PETALS.get());
                        output.accept(NHItems.MILKWEED_CLUSTER.get());
                        output.accept(NHItems.MILKWEED_STEMS.get());
                        output.accept(NHItems.MILKWEED_PETALS.get());
                        output.accept(NHItems.CARDINAL_FLOWER.get());
                        output.accept(NHItems.CARDINAL_FLOWER_PETALS.get());
                        output.accept(NHItems.HIBISCUS_CLUSTER.get());
                        output.accept(NHItems.EPHERDRA_CLUSTER.get());
                        output.accept(NHItems.ALOE.get());
                        output.accept(NHItems.SPEARMINT.get());
                        output.accept(NHItems.LAVENDER.get());
                        output.accept(NHItems.ALOYSIA.get());
                        output.accept(NHItems.GREEN_TEA_LEAF.get());
                        output.accept(NHItems.GINGER.get());
                        output.accept(NHItems.FEVERFEW_CLUSTER.get());
                        output.accept(NHItems.HAWTHORN_BERRY.get());
                        output.accept(NHItems.ACHIOTE_PASTE.get());
                        output.accept(NHItems.PRICKLY_PEAR_PASTE.get());
                        output.accept(NHItems.PEYOTE_PASTE.get());
                        output.accept(NHItems.WATERSHIELD_PASTE.get());
                        output.accept(NHItems.POISON_PASTE.get());
                        output.accept(NHItems.SUN_PASTE.get());
                        output.accept(NHItems.BANANA_PASTE.get());
                        output.accept(NHItems.ROSEHIP_PASTE.get());
                        output.accept(NHItems.CLAY_PASTE.get());
                        output.accept(NHItems.NUMBING_POWDER.get());
                        output.accept(NHItems.RITUAL_INCENSE.get());
                        output.accept(NHItems.SLUMBER_INCENSE.get());
                        output.accept(NHItems.HERBAL_INCENSE.get());
                        output.accept(NHItems.DRIED_ALOYSIA.get());
                        output.accept(NHItems.DRIED_HIBISCUS_CLUSTER.get());
                        output.accept(NHItems.DRIED_LAVENDER.get());
                        output.accept(NHItems.DRIED_MILKWEED_PETALS.get());
                        output.accept(NHItems.DRIED_ROSEHIPS.get());
                        output.accept(NHItems.DRIED_ROSEMARY.get());
                        output.accept(NHItems.DRIED_THYME.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}



package com.dragn0007.nomadic_herbs.items;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.custom.GrinderItem;
import com.dragn0007.nomadic_herbs.items.custom.PeyotePasteItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NHItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NomadicHerbs.MODID);

    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder", GrinderItem::new);

    public static final RegistryObject<Item> PEYOTE = ITEMS.register("peyote",
            () -> new ItemNameBlockItem(NHBlocks.PEYOTE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build()))));
    public static final RegistryObject<Item> PEYOTE_PASTE = ITEMS.register("peyote_paste",
            () -> new PeyotePasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
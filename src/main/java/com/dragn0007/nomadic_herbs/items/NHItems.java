package com.dragn0007.nomadic_herbs.items;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NHItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NomadicHerbs.MODID);

    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder", GrinderItem::new);
    public static final RegistryObject<Item> POUCH = ITEMS.register("pouch", PouchItem::new);
    public static final RegistryObject<Item> WATER_POUCH = ITEMS.register("water_pouch", WaterPouchItem::new);

    public static final RegistryObject<Item> PEYOTE = ITEMS.register("peyote",
            () -> new PeyoteItem(NHBlocks.PEYOTE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(0)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F).build()))));
    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new RosemaryItem(NHBlocks.ROSEMARY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> CILANTRO = ITEMS.register("cilantro",
            () -> new CilantroItem(NHBlocks.CILANTRO.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> WATER_HYSSOP_CLUSTER = ITEMS.register("water_hyssop_cluster",
            () -> new WaterHyssopItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F).build())));
    public static final RegistryObject<Item> SQUIRRELTAIL_CLUSTER = ITEMS.register("squirreltail_cluster",
            () -> new SquirreltailItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F).build())));
    public static final RegistryObject<Item> ARTEMISIA = ITEMS.register("artemisia",
            () -> new ArtemisiaItem(NHBlocks.ARTEMISIA.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> THYME = ITEMS.register("thyme",
            () -> new ThymeItem(NHBlocks.THYME.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> BASIL = ITEMS.register("basil",
            () -> new BasilItem(NHBlocks.BASIL.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> CATS_CLAW = ITEMS.register("cats_claw",
            () -> new CatsClawItem(NHBlocks.CATS_CLAW.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> DEVILS_CLAW_SEEDS = ITEMS.register("devils_claw_seeds",
            () -> new DevilsClawSeedsItem(NHBlocks.DEVILS_CLAW.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));
    public static final RegistryObject<Item> BITTER_LETTUCE = ITEMS.register("bitter_lettuce",
            () -> new BitterLettuceItem(NHBlocks.BITTER_LETTUCE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));
    public static final RegistryObject<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear",
            () -> new PricklyPearItem(NHBlocks.PRICKLY_PEAR.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).build()))));
    public static final RegistryObject<Item> CREOSOTE_CLUSTER = ITEMS.register("creosote_cluster",
            () -> new CreosoteClusterItem(NHBlocks.CREOSOTE_BUSH.get(),(new Item.Properties().food(new FoodProperties.Builder().nutrition(1)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F).build()))));
    public static final RegistryObject<Item> BRITTLEBUSH_CLUSTER = ITEMS.register("brittlebush_cluster",
            () -> new BrittlebushClusterItem(NHBlocks.BRITTLEBUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build()))));

    public static final RegistryObject<Item> PRICKLY_PEAR_PASTE = ITEMS.register("prickly_pear_paste",
            () -> new PricklyPearPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build())));
    public static final RegistryObject<Item> SHREDDED_BITTER_LETTUCE = ITEMS.register("shredded_bitter_lettuce",
            () -> new ShreddedBitterLettuceItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build())));
    public static final RegistryObject<Item> SUNDEW_MUCILAGE = ITEMS.register("sundew_mucilage",
            () -> new SundewMucilageItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).build())));
    public static final RegistryObject<Item> PEYOTE_PASTE = ITEMS.register("peyote_paste",
            () -> new PeyotePasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).build())));
    public static final RegistryObject<Item> WATERSHIELD_PASTE = ITEMS.register("watershield_paste",
            () -> new WatershieldPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F).build())));

    public static final RegistryObject<Item> PLANT_FIBER = ITEMS.register("plant_fiber",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
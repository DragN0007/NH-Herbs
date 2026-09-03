package com.dragn0007.nomadic_herbs.items;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NHItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NomadicHerbs.MODID);

    // MAIN PLANTS
    public static final RegistryObject<Item> PEYOTE = ITEMS.register("peyote",
            () -> new PeyoteItem(NHBlocks.PEYOTE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 1.0F).build()))));

    public static final RegistryObject<Item> ROSEMARY = ITEMS.register("rosemary",
            () -> new RosemaryItem(NHBlocks.ROSEMARY.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> CILANTRO = ITEMS.register("cilantro",
            () -> new CilantroItem(NHBlocks.CILANTRO.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> WATER_HYSSOP_CLUSTER = ITEMS.register("water_hyssop_cluster",
            () -> new WaterHyssopItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F).build())));

    public static final RegistryObject<Item> SQUIRRELTAIL_CLUSTER = ITEMS.register("squirreltail_cluster",
            () -> new SquirreltailItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 0), 1.0F).build())));

    public static final RegistryObject<Item> ARTEMISIA = ITEMS.register("artemisia",
            () -> new ArtemisiaItem(NHBlocks.ARTEMISIA.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> THYME = ITEMS.register("thyme",
            () -> new ThymeItem(NHBlocks.THYME.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> BASIL = ITEMS.register("basil",
            () -> new BasilItem(NHBlocks.BASIL.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> CATS_CLAW = ITEMS.register("cats_claw",
            () -> new CatsClawItem(NHBlocks.CATS_CLAW.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> DEVILS_CLAW_SEEDS = ITEMS.register("devils_claw_seeds",
            () -> new DevilsClawSeedsItem(NHBlocks.DEVILS_CLAW.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> BITTER_LETTUCE = ITEMS.register("bitter_lettuce",
            () -> new BitterLettuceItem(NHBlocks.BITTER_LETTUCE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).alwaysEat().build()))));

    public static final RegistryObject<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear",
            () -> new PricklyPearItem(NHBlocks.PRICKLY_PEAR.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(3).build()))));

    public static final RegistryObject<Item> CREOSOTE_CLUSTER = ITEMS.register("creosote_cluster",
            () -> new CreosoteClusterItem(NHBlocks.CREOSOTE_BUSH.get(),(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F).build()))));

    public static final RegistryObject<Item> BRITTLEBUSH_CLUSTER = ITEMS.register("brittlebush_cluster",
            () -> new BrittlebushClusterItem(NHBlocks.BRITTLEBUSH.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> CURARE = ITEMS.register("curare",
            () -> new CurareItem(NHBlocks.CURARE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 3), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.WITHER, 1200, 0), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1), 1.0F)
                    .build()))));

    public static final RegistryObject<Item> JABORANDI = ITEMS.register("jaborandi",
            () -> new JaborandiItem(NHBlocks.JABORANDI.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build()))));

    public static final RegistryObject<Item> ACHIOTE = ITEMS.register("achiote",
            () -> new AchioteItem(NHBlocks.ACHIOTE.get(), (new Item.Properties())));

    public static final RegistryObject<Item> JEWELWEED_CLUSTER = ITEMS.register("jewelweed_cluster",
            () -> new JewelweedItem(NHBlocks.JEWELWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> JEWELWEED_STEMS = ITEMS.register("jewelweed_stems",
            () -> new JewelweedStemsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> JEWELWEED_PETALS = ITEMS.register("jewelweed_petals",
            () -> new JewelweedStemsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> MILKWEED_CLUSTER = ITEMS.register("milkweed_cluster",
            () -> new MilkweedItem(NHBlocks.MILKWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> MILKWEED_STEMS = ITEMS.register("milkweed_stems",
            () -> new MilkweedStemsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> MILKWEED_PETALS = ITEMS.register("milkweed_petals",
            () -> new MilkweedStemsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> WATERCRESS_CLUSTER = ITEMS.register("watercress_cluster",
            () -> new WatercressItem(NHBlocks.WATERCRESS.get(), (new Item.Properties())));

    public static final RegistryObject<Item> SWEET_FLAG_CLUSTER = ITEMS.register("sweet_flag_cluster",
            () -> new SweetFlagItem(NHBlocks.SWEET_FLAG.get(), (new Item.Properties())));

    public static final RegistryObject<Item> CARDINAL_FLOWER = ITEMS.register("cardinal_flower",
            () -> new CardinalFlowerItem(NHBlocks.CARDINAL_FLOWER.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.WITHER, 600, 1), 1.0F)
                    .build()))));

    public static final RegistryObject<Item> CARDINAL_FLOWER_PETALS = ITEMS.register("cardinal_flower_petals",
            () -> new CardinalFlowerPetalsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> HIBISCUS_CLUSTER = ITEMS.register("hibiscus_cluster",
            () -> new HibiscusItem(NHBlocks.HIBISCUS.get(), (new Item.Properties())));

    public static final RegistryObject<Item> EPHERDRA_CLUSTER = ITEMS.register("epherdra_cluster",
            () -> new EpherdraItem(NHBlocks.EPHERDRA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ALOE = ITEMS.register("aloe",
            () -> new AloeItem(NHBlocks.ALOE.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 1), 1.0F)
                    .build()))));

    public static final RegistryObject<Item> SPEARMINT = ITEMS.register("spearmint",
            () -> new SpearmintItem(NHBlocks.SPEARMINT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> LAVENDER = ITEMS.register("lavender",
            () -> new LavenderItem(NHBlocks.LAVENDER.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ALOYSIA = ITEMS.register("aloysia",
            () -> new AloysiaItem(NHBlocks.ALOYSIA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> GREEN_TEA_LEAF = ITEMS.register("green_tea_leaf",
            () -> new GreenTeaItem(NHBlocks.GREEN_TEA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> GINGER = ITEMS.register("ginger",
            () -> new GingerItem(NHBlocks.GINGER.get(), (new Item.Properties())));

    public static final RegistryObject<Item> FEVERFEW_CLUSTER = ITEMS.register("feverfew_cluster",
            () -> new FeverfewItem(NHBlocks.FEVERFEW.get(), (new Item.Properties())));

    public static final RegistryObject<Item> HAWTHORN_BERRY = ITEMS.register("hawthorn_berry",
            () -> new HawthornItem(NHBlocks.HAWTHORN.get(), (new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build()))));

    // PASTES
    public static final RegistryObject<Item> PRICKLY_PEAR_PASTE = ITEMS.register("prickly_pear_paste",
            () -> new PricklyPearPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> ACHIOTE_PASTE = ITEMS.register("achiote_paste",
            () -> new AchiotePasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> PEYOTE_PASTE = ITEMS.register("peyote_paste",
            () -> new PeyotePasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> WATERSHIELD_PASTE = ITEMS.register("watershield_paste",
            () -> new WatershieldPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> POISON_PASTE = ITEMS.register("poison_paste",
            () -> new PoisonPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> SUN_PASTE = ITEMS.register("sun_paste",
            () -> new SunPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> BANANA_PASTE = ITEMS.register("banana_paste",
            () -> new BananaPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> ROSEHIP_PASTE = ITEMS.register("rosehip_paste",
            () -> new RosehipPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));


    // INCENSE
    public static final RegistryObject<Item> RITUAL_INCENSE = ITEMS.register("ritual_incense",
            () -> new RitualIncenseItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 6000, 2), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 6000, 2), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.WEAKNESS, 6000, 2), 1.0F)
                    .build())));

    public static final RegistryObject<Item> SLUMBER_INCENSE = ITEMS.register("slumber_incense",
            () -> new SlumberIncenseItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 3000, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3000, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.WEAKNESS, 3000, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> HERBAL_INCENSE = ITEMS.register("herbal_incense",
            () -> new HerbalIncenseItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    // MATERIALS
    public static final RegistryObject<Item> ROSEHIPS = ITEMS.register("rosehips",
            () -> new RosehipsItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build())));

    public static final RegistryObject<Item> SNAKES_BLOOD_SAP = ITEMS.register("snakes_blood_sap",
            () -> new SnakesBloodItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> CHARCOAL_CHUNKS = ITEMS.register("charcoal_chunks",
            () -> new CharcoalChunksItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> COCONUT_HUSK = ITEMS.register("coconut_husk",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BANANA_LEAF = ITEMS.register("banana_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PLANT_FIBER = ITEMS.register("plant_fiber",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CLAY_PASTE = ITEMS.register("clay_paste",
            () -> new ClayPasteItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F)
                    .build())));

    public static final RegistryObject<Item> GRINDER = ITEMS.register("grinder", GrinderItem::new);
    public static final RegistryObject<Item> POUCH = ITEMS.register("pouch", PouchItem::new);

    public static final RegistryObject<Item> SHREDDED_BITTER_LETTUCE = ITEMS.register("shredded_bitter_lettuce",
            () -> new ShreddedBitterLettuceItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build())));

    public static final RegistryObject<Item> SHREDDED_CURARE = ITEMS.register("shredded_curare",
            () -> new ShreddedCurareItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1200, 3), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 1200, 1), 1.0F)
                    .build())));

    public static final RegistryObject<Item> SUNDEW_MUCILAGE = ITEMS.register("sundew_mucilage",
            () -> new SundewMucilageItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).alwaysEat().build())));

    // DRIED
    public static final RegistryObject<Item> DRIED_ALOYSIA = ITEMS.register("dried_aloysia",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_HIBISCUS_CLUSTER = ITEMS.register("dried_hibiscus_cluster",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_LAVENDER = ITEMS.register("dried_lavender",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_MILKWEED_PETALS = ITEMS.register("dried_milkweed_petals",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_ROSEHIPS = ITEMS.register("dried_rosehips",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_ROSEMARY = ITEMS.register("dried_rosemary",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DRIED_THYME = ITEMS.register("dried_thyme",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // MISCELLANEOUS
    public static final RegistryObject<Item> WATER_POUCH = ITEMS.register("water_pouch", WaterPouchItem::new);
    public static final RegistryObject<Item> HERBAL_WATER_POUCH = ITEMS.register("herbal_water_pouch", HerbalWaterPouchItem::new);
    public static final RegistryObject<Item> HIBISCUS_WATER_POUCH = ITEMS.register("hibiscus_water_pouch", HibiscusWaterPouchItem::new);
    public static final RegistryObject<Item> CACTUS_WATER_POUCH = ITEMS.register("cactus_water_pouch", CactusWaterPouchItem::new);
    public static final RegistryObject<Item> HAWTHORN_WATER_POUCH = ITEMS.register("hawthorn_water_pouch", HawthornWaterPouchItem::new);
    public static final RegistryObject<Item> FEVER_TEA_POUCH = ITEMS.register("fever_tea_pouch", FeverTeaPouchItem::new);
    public static final RegistryObject<Item> WATER_COCONUT_HUSK = ITEMS.register("water_coconut_husk", WaterCoconutItem::new);
    public static final RegistryObject<Item> SALT_WATER_COCONUT_HUSK = ITEMS.register("salt_water_coconut_husk", SaltWaterCoconutItem::new);

    public static final RegistryObject<Item> NUMBING_POWDER = ITEMS.register("numbing_powder",
            () -> new NumbingPowderItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(0).alwaysEat().build())));

    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build())));

    public static final RegistryObject<Item> HONEYPOT_ANT = ITEMS.register("honeypot_ant",
            () -> new HoneypotAntItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).build())));

    public static final RegistryObject<Item> HONEY_STICK = ITEMS.register("honey_stick", HoneyStickItem::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
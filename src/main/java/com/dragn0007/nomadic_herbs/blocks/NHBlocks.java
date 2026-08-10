package com.dragn0007.nomadic_herbs.blocks;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.base_plant.AquaticPlant;
import com.dragn0007.nomadic_herbs.blocks.base_plant.DesertHybridPlant;
import com.dragn0007.nomadic_herbs.blocks.crop.*;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WaterlilyBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class NHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NomadicHerbs.MODID);
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NomadicHerbs.MODID);

    public static final RegistryObject<Block> PEYOTE = registerBlockWithoutItem("peyote",
            () -> new PeyoteBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_PEYOTE = registerBlockWithoutItem("wild_peyote",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ROSEMARY = registerBlockWithoutItem("rosemary",
            () -> new RosemaryBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ROSEMARY = registerBlockWithoutItem("wild_rosemary",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CILANTRO = registerBlockWithoutItem("cilantro",
            () -> new CilantroBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CILANTRO = registerBlockWithoutItem("wild_cilantro",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WATER_HYSSOP = registerWaterBlock("water_hyssop",
            () -> new WaterlilyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().sound(SoundType.LILY_PAD).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SQUIRRELTAIL = registerBlock("squirreltail",
            () -> new AquaticPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WATERSHIELD = registerWaterBlock("watershield",
            () -> new WaterlilyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().sound(SoundType.LILY_PAD).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ARTEMISIA = registerBlockWithoutItem("artemisia",
            () -> new ArtemisiaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ARTEMISIA = registerBlockWithoutItem("wild_artemisia",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> THYME = registerBlockWithoutItem("thyme",
            () -> new ThymeBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_THYME = registerBlockWithoutItem("wild_thyme",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BASIL = registerBlockWithoutItem("basil",
            () -> new BasilBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BASIL = registerBlockWithoutItem("wild_basil",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SUNDEW = registerBlock("sundew",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CATS_CLAW = registerBlockWithoutItem("cats_claw",
            () -> new CatsClawBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CATS_CLAW = registerBlockWithoutItem("wild_cats_claw",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEVILS_CLAW = registerBlockWithoutItem("devils_claw",
            () -> new DevilsClawBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_DEVILS_CLAW = registerBlock("wild_devils_claw",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BITTER_LETTUCE = registerBlockWithoutItem("bitter_lettuce",
            () -> new BitterLettuceBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BITTER_LETTUCE = registerBlockWithoutItem("wild_bitter_lettuce",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> PRICKLY_PEAR = registerBlockWithoutItem("prickly_pear",
            () -> new PricklyPearBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_PRICKLY_PEAR = registerBlockWithoutItem("wild_prickly_pear",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CREOSOTE_BUSH = registerBlock("creosote_bush",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BRITTLEBUSH = registerBlock("brittlebush",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CURARE = registerBlockWithoutItem("curare",
            () -> new CurareBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CURARE = registerBlockWithoutItem("wild_curare",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JABORANDI = registerBlockWithoutItem("jaborandi",
            () -> new JaborandiBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JABORANDI = registerBlockWithoutItem("wild_jaborandi",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ACHIOTE = registerBlockWithoutItem("achiote",
            () -> new AchioteBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ACHIOTE = registerBlockWithoutItem("wild_achiote",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JEWELWEED = registerBlockWithoutItem("jewelweed",
            () -> new JewelweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JEWELWEED = registerBlockWithoutItem("wild_jewelweed",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MILKWEED = registerBlockWithoutItem("milkweed",
            () -> new MilkweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_MILKWEED = registerBlockWithoutItem("wild_milkweed",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WATERCRESS = registerBlockWithoutItem("watercress",
            () -> new WatercressBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_WATERCRESS = registerBlockWithoutItem("wild_watercress",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SWEET_FLAG = registerBlockWithoutItem("sweet_flag",
            () -> new SweetFlagBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SWEET_FLAG = registerBlockWithoutItem("wild_sweet_flag",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CARDINAL_FLOWER = registerBlockWithoutItem("cardinal_flower",
            () -> new CardinalFlowerBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CARDINAL_FLOWER = registerBlockWithoutItem("wild_cardinal_flower",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HIBISCUS = registerBlockWithoutItem("hibiscus",
            () -> new HibiscusBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_HIBISCUS = registerBlockWithoutItem("wild_hibiscus",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> EPHERDRA = registerBlockWithoutItem("epherdra",
            () -> new EpherdraBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_EPHERDRA = registerBlockWithoutItem("wild_epherdra",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ALOE = registerBlockWithoutItem("aloe",
            () -> new AloeBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ALOE = registerBlockWithoutItem("wild_aloe",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SPEARMINT = registerBlockWithoutItem("spearmint",
            () -> new SpearmintBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SPEARMINT = registerBlockWithoutItem("wild_spearmint",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LAVENDER = registerBlockWithoutItem("lavender",
            () -> new LavenderBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_LAVENDER = registerBlockWithoutItem("wild_lavender",
            () -> new DesertHybridPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));


    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        NHItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static <T extends Block>RegistryObject<T> registerWaterBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerWaterBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerWaterBlockItem(String name, RegistryObject<T> block) {
        NHItems.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

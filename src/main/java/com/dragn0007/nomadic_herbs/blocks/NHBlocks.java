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

package com.dragn0007.nomadic_herbs.blocks;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.base_plant.AquaticPlant;
import com.dragn0007.nomadic_herbs.blocks.base_plant.WetlandPlant;
import com.dragn0007.nomadic_herbs.blocks.base_plant.DesertHybridPlant;
import com.dragn0007.nomadic_herbs.blocks.crop.CilantroBlock;
import com.dragn0007.nomadic_herbs.blocks.crop.PeyoteBlock;
import com.dragn0007.nomadic_herbs.blocks.crop.RosemaryBlock;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
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

    public static final RegistryObject<Block> WATER_HYSSOP = registerBlockWithoutItem("water_hyssop",
            () -> new WetlandPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SQUIRRELTAIL = registerBlockWithoutItem("squirreltail",
            () -> new AquaticPlant(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

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

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

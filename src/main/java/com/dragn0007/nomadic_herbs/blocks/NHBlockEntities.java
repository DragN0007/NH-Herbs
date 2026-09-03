package com.dragn0007.nomadic_herbs.blocks;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.custom.DryingStonesBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NHBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NomadicHerbs.MODID);

    public static final RegistryObject<BlockEntityType<DryingStonesBlockEntity>> DRYING_STONES =
            BLOCK_ENTITIES.register("drying_stones_entity", () ->
                    BlockEntityType.Builder.of(DryingStonesBlockEntity::new, NHBlocks.DRYING_STONES.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
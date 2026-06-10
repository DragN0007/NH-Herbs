package com.dragn0007.nomadic_herbs.blocks.base_plant;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class DesertPlant extends FlowerBlock {
    public DesertPlant(MobEffect p_53512_, int p_53513_, BlockBehaviour.Properties p_53514_) {
        super(p_53512_, p_53513_, p_53514_);
    }

    public boolean mayPlaceOn(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.is(BlockTags.SAND);
    }
}

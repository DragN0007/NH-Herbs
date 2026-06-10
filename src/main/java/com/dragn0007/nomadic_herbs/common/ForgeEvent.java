package com.dragn0007.nomadic_herbs.common;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    //Right-Click Harvest Crops
    @SubscribeEvent
    public static void onBlockUse(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        Property<Integer> property = getCropProperty(state, "age");

        if (property != null && level instanceof ServerLevel serverLevel) {
            int maxAge = getMaxAge(state.getBlock());

            InteractionHand hand = event.getHand();
            Player player = event.getEntity();
            ItemStack itemStack = player.getItemInHand(hand);

            if (itemStack.isEmpty() && state.getValue(property) == maxAge) {
                level.setBlockAndUpdate(pos, state.setValue(property, 0));

                state.getBlock().getDrops(state, serverLevel, pos, null).forEach(stack -> {
                    serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                });
            }
        }
    }

    private static Property<Integer> getCropProperty(BlockState state, String propertyName) {
        Block block = state.getBlock();
        if (block instanceof CropBlock) {
            for (Property<?> prop : state.getProperties()) {
                if (prop instanceof IntegerProperty && prop.getName().equals(propertyName)) {
                    return (Property<Integer>) prop;
                }
            }
        }
        return null;
    }

    private static int getMaxAge(Block block) {
        if (block instanceof CropBlock cropBlock) {
            return cropBlock.getMaxAge();
        }
        return 7;
    }
}
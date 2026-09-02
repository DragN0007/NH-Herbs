package com.dragn0007.nomadic_herbs.common;


import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.blocks.base_plant.AquaticPlant;
import com.dragn0007.nomadic_herbs.blocks.base_plant.DesertHybridPlant;
import com.dragn0007.nomadic_herbs.blocks.base_plant.DesertPlant;
import com.dragn0007.nomadic_herbs.items.NHItems;
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
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ForgeEvent {

    @SubscribeEvent
    public static void onBlockBroken(BlockEvent.BreakEvent event) {
        Random random = new Random();
        BlockState state = event.getState();
        BlockPos pos = event.getPos();
        Level level = event.getPlayer().level();

        if (!event.getPlayer().isCreative()) {
            if (state.is(NHBlocks.MULGA_LOG.get())) {
                if (random.nextDouble() <= 0.75 && random.nextDouble() > 0.25) {
                    ItemStack entity = new ItemStack(NHItems.SNAKES_BLOOD_SAP.get());
                    ItemEntity item = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), entity);
                    level.addFreshEntity(item);
                } else if (random.nextDouble() <= 0.25) {
                    ItemStack entity = new ItemStack(NHItems.HONEYPOT_ANT.get());
                    ItemEntity item = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), entity);
                    level.addFreshEntity(item);
                }
            }
        }
    }

    //Right-Click Harvest Crops
    @SubscribeEvent
    public static void onBlockUse(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        Property<Integer> property = getCropProperty(state, "age");

        InteractionHand hand = event.getHand();
        Player player = event.getEntity();
        ItemStack itemStack = player.getItemInHand(hand);

        if (level instanceof ServerLevel serverLevel) {
            if (property != null) {
                int maxAge = getMaxAge(state.getBlock());
                if (itemStack.isEmpty() && state.getValue(property) == maxAge) {
                    level.setBlockAndUpdate(pos, state.setValue(property, 0));
                    state.getBlock().getDrops(state, serverLevel, pos, null).forEach(stack -> {
                        serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                    });
                }
            }

            if (state.getBlock() instanceof DesertHybridPlant || state.getBlock() instanceof DesertPlant || state.getBlock() instanceof AquaticPlant) {
                if (itemStack.isEmpty()) {
                    state.getBlock().getDrops(state, serverLevel, pos, null).forEach(stack -> {
                        serverLevel.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, stack));
                    });
                    level.removeBlock(pos, false);
                }
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
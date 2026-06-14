package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sfiomn.legendarysurvivaloverhaul.common.items.drink.DrinkItem;

import java.util.List;

public class WaterPouchItem extends DrinkItem {
    private final Fluid content = Fluids.WATER;

    public WaterPouchItem() {
        super(new Properties().stacksTo(1).durability(3));
    }

    public int getUseDuration(@NotNull ItemStack stack) {
        return 24;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        return super.use(level, player, hand);
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        if (entity instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
            itemStack.hurt(1, RandomSource.create(1), serverplayer);
        }

        System.out.println(itemStack.getDamageValue());

        ItemStack pouchStack = new ItemStack(NHItems.POUCH.get());
        if (itemStack.getDamageValue() >= itemStack.getMaxDamage() && entity instanceof Player player) {
            itemStack.shrink(1);
            if (player.getUsedItemHand() == InteractionHand.OFF_HAND) {
                player.setItemInHand(InteractionHand.OFF_HAND, pouchStack);
            } else {
                player.setItemInHand(InteractionHand.MAIN_HAND, pouchStack);
            }
        }
//        return super.finishUsingItem(itemStack, level, entity);
        return itemStack;
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.RARE;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.water_pouch.tooltip").withStyle(ChatFormatting.GRAY));
    }
}
package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
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
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HoneyStickItem extends HerbalItem {

    public HoneyStickItem() {
        super(new Properties().stacksTo(1).food(new FoodProperties.Builder().nutrition(2).build()));
    }

    public int getUseDuration(@NotNull ItemStack stack) {
        return 48;
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.EAT;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        RandomSource random = RandomSource.create();
        if (random.nextDouble() < 0.40) if (!level.isClientSide) entity.heal(2F);
        else entity.heal(1F);
        ItemStack stick = new ItemStack(Items.STICK);
        if (entity instanceof Player player) {
            itemStack.shrink(1);
            if (player.getUsedItemHand() == InteractionHand.OFF_HAND) {
                player.setItemInHand(InteractionHand.OFF_HAND, stick);
            } else {
                player.setItemInHand(InteractionHand.MAIN_HAND, stick);
            }
        }
        return itemStack;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.honey.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.light_healing.tooltip").withStyle(ChatFormatting.GOLD));
    }
}
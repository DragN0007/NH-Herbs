package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RitualIncenseItem extends HerbalItem {

    public RitualIncenseItem(Properties properties) {
        super(properties);
    }

    public int getUseDuration(@NotNull ItemStack stack) {
        return 48;
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BOW;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.FIRECHARGE_USE;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.FIRECHARGE_USE;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.ritual_incense.tooltip").withStyle(ChatFormatting.GRAY));
        appendEffectText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
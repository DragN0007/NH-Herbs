package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PoisonPasteItem extends HerbalItem {

    public PoisonPasteItem(Properties properties) {
        super(properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BRUSH;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        if (!level.isClientSide) entity.removeEffect(MobEffects.POISON);
        if (!level.isClientSide) entity.removeEffect(MobEffects.WITHER);
        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.poison_paste.tooltip").withStyle(ChatFormatting.GRAY));
    }
}

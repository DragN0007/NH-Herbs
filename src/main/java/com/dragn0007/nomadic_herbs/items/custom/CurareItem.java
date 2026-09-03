package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CurareItem extends HerbalNameBlockItem {

    public CurareItem(Block block, Properties properties) {
        super(block, properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.EAT;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.curare.tooltip").withStyle(ChatFormatting.GRAY));
        appendEffectText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.curare_plants.tooltip").withStyle(ChatFormatting.GRAY));
    }
}
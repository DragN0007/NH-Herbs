package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AloeItem extends HerbalNameBlockItem {

    public AloeItem(Block block, Properties properties) {
        super(block, properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.EAT;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        RandomSource random = RandomSource.create();
        if (random.nextDouble() < 0.40) if (!level.isClientSide) entity.heal(2F);
        else entity.heal(1F);
        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.aloe.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.aloe_plants.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.light_healing.tooltip").withStyle(ChatFormatting.GOLD));
    }
}

package com.dragn0007.nomadic_herbs.items.custom;

import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
import com.dragn0007.nomadic_herbs.items.custom.base.HerbalNameBlockItem;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShreddedBitterLettuceItem extends HerbalItem {

    public ShreddedBitterLettuceItem(Properties properties) {
        super(properties);
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.BRUSH;
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        RandomSource random = RandomSource.create();

        if (random.nextDouble() < 0.40) {
            if (!level.isClientSide) entity.heal(2F);
        } else if (random.nextDouble() > 0.40) {
            if (!level.isClientSide) entity.heal(1F);
        }

        if (entity instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (entity instanceof Player && !((Player)entity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return super.finishUsingItem(itemStack, level, entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.shredded_bitter_lettuce.tooltip").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.nomadic_herbs.light_healing.tooltip").withStyle(ChatFormatting.GOLD));
    }
}

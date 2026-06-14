package com.dragn0007.nomadic_herbs.items.custom.base;

import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HerbalItem extends Item {

    public HerbalItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        if (livingEntity instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (livingEntity instanceof Player && !((Player) livingEntity).getAbilities().instabuild) {
            stack.shrink(1);
        }

        return super.finishUsingItem(stack, level, livingEntity);
    }

    public int getUseDuration(ItemStack p_42933_) {
        return 32;
    }

    public UseAnim getUseAnimation(ItemStack p_42931_) {
        return UseAnim.NONE;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemUtils.startUsingInstantly(level, player, hand);
        return super.use(level, player, hand);
    }

    public void appendEffectText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if (pStack.getItem().isEdible()) {
            FoodProperties foodProperties = pStack.getItem().getFoodProperties();

            if (foodProperties != null) {
                for (Pair<MobEffectInstance, Float> pair : foodProperties.getEffects()) {
                    MobEffectInstance effectInstance = pair.getFirst();

                    if (effectInstance != null) {
                        String effectName = effectInstance.getDescriptionId();
                        int amplifier = effectInstance.getAmplifier();
                        int duration = effectInstance.getDuration();

                        Component text = Component.translatable(effectName)
                                .append(Component.translatable("potion.potency." + amplifier))
                                .append(String.format(" (%ds)", duration / 20))
                                .withStyle(ChatFormatting.GOLD);

                        pTooltipComponents.add(text);
                    }
                }
            }
        }
    }
}
package com.dragn0007.nomadic_herbs.mixin;

import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BeehiveBlock.class)
public abstract class BeehiveBlockMixin {
    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    private void onUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit, CallbackInfoReturnable<InteractionResult> cir) {
        ItemStack itemInHand = player.getItemInHand(hand);
        if (!level.isClientSide && itemInHand.getItem() == Items.STICK) {
            int honeyLevel = state.getValue(BeehiveBlock.HONEY_LEVEL);
            if (honeyLevel >= 5) {
                if (!player.isCreative()) {
                    itemInHand.shrink(1);
                }
                player.addItem(new ItemStack(NHItems.HONEY_STICK.get()));
                level.playSound(null, pos, SoundEvents.SLIME_BLOCK_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.setBlock(pos, state.setValue(BeehiveBlock.HONEY_LEVEL, 0), 3);
                cir.setReturnValue(InteractionResult.SUCCESS);
            }
        }
    }
}
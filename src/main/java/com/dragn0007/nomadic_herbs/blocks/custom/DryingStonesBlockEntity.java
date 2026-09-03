package com.dragn0007.nomadic_herbs.blocks.custom;

import com.dragn0007.nomadic_herbs.blocks.NHBlockEntities;
import com.dragn0007.nomadic_herbs.common.gui.DryingStonesMenu;
import com.dragn0007.nomadic_herbs.items.NHItems;
import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
import com.dragn0007.nomadic_herbs.util.NHTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class DryingStonesBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer {
   public NonNullList<ItemStack> items = NonNullList.withSize(3, ItemStack.EMPTY);
   int dryTime;
   public static final int HERB_SLOT = 0;
   public static final int OUTPUT_SLOT = 1;
   public ItemStack dryingCurrently = null;

   protected final ContainerData dataAccess = new ContainerData() {
      public int get(int slot) {
          if (slot == HERB_SLOT) {
              return DryingStonesBlockEntity.this.dryTime;
          }
          return 0;
      }

      public void set(int i, int value) {
          if (i == HERB_SLOT) {
              DryingStonesBlockEntity.this.dryTime = value;
          }

      }

      public int getCount() {
         return 1;
      }
   };

   public DryingStonesBlockEntity(BlockPos pos, BlockState state) {
      super(NHBlockEntities.DRYING_STONES.get(), pos, state);
   }

   protected Component getDefaultName() {
      return Component.translatable("blockentities.nomadic_herbs.drying_stones");
   }

   public int getContainerSize() {
      return this.items.size();
   }

   public boolean isEmpty() {
      for(ItemStack itemstack : this.items) {
         if (!itemstack.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   public static void serverTick(Level level, BlockPos pos, BlockState state, DryingStonesBlockEntity entity) {
//      if (entity.level != null && entity.level.isRaining()) {
//         if (entity.dryTime < 800 && entity.dryTime > 0) {
//            ++entity.dryTime;
//         }
//         return;
//      }

      ItemStack leafSlotItem = entity.getItem(HERB_SLOT);
      ItemStack outputSlotItem = entity.getItem(OUTPUT_SLOT);
      ItemStack potentialOutput = null;

      if (entity.dryingCurrently != null && entity.dryTime > 0) {
         --entity.dryTime;
         if (entity.dryTime == 0) {
            if (outputSlotItem.isEmpty()) {
               entity.setItem(OUTPUT_SLOT, entity.dryingCurrently);
            } else {
               outputSlotItem.grow(1);
            }
            entity.dryingCurrently = null;
            setChanged(level, pos, state);
         }
      } else if (entity.dryTime <= 0) {
         if (!leafSlotItem.isEmpty()) {
            if (leafSlotItem.is(NHItems.THYME.get())) {
               potentialOutput = NHItems.DRIED_THYME.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.ALOYSIA.get())) {
               potentialOutput = NHItems.DRIED_ALOYSIA.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.HIBISCUS_CLUSTER.get())) {
               potentialOutput = NHItems.DRIED_HIBISCUS_CLUSTER.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.LAVENDER.get())) {
               potentialOutput = NHItems.DRIED_LAVENDER.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.MILKWEED_PETALS.get())) {
               potentialOutput = NHItems.DRIED_MILKWEED_PETALS.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.ROSEHIPS.get())) {
               potentialOutput = NHItems.DRIED_ROSEHIPS.get().getDefaultInstance();
            } else if (leafSlotItem.is(NHItems.ROSEMARY.get())) {
               potentialOutput = NHItems.DRIED_ROSEMARY.get().getDefaultInstance();
            }
         }

         if ((potentialOutput == null) || (!outputSlotItem.isEmpty() && !potentialOutput.is(outputSlotItem.getItem())) || (outputSlotItem.getCount() == outputSlotItem.getMaxStackSize())) {
            return;
         }

         entity.dryingCurrently = potentialOutput;
         leafSlotItem.shrink(1);
         entity.dryTime = 800;
         setChanged(level, pos, state);
      }
   }

   public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
      @Override
      protected void onContentsChanged(int slot) {
         setChanged();
         if(!level.isClientSide()) {
            level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 2);
         }
      }

      @Override
      public boolean isItemValid(int slot, @NotNull ItemStack stack) {
         return switch (slot) {
            case HERB_SLOT -> stack.is(NHTags.Items.CAN_DRY);
            case OUTPUT_SLOT -> false;
            default -> super.isItemValid(slot, stack);
         };
      }
   };

   @Nullable
   @Override
   public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
      return new DryingStonesMenu(pContainerId, pPlayerInventory, this, dataAccess);
   }

   public void load(CompoundTag tag) {
      super.load(tag);
      this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
      ContainerHelper.loadAllItems(tag, this.items);
      this.dryTime = tag.getShort("BrewTime");
      if (tag.contains("BrewingCurrently")) {
         CompoundTag compoundTag = (CompoundTag) tag.get("BrewingCurrently");
         this.dryingCurrently = ItemStack.of(compoundTag);
      }
   }

   protected void saveAdditional(CompoundTag tag) {
      super.saveAdditional(tag);
      tag.putShort("BrewTime", (short) this.dryTime);
      if (dryingCurrently != null) {
         CompoundTag compoundTag = new CompoundTag();
         this.dryingCurrently.save(compoundTag);
         tag.put("BrewingCurrently", compoundTag);
      }
      ContainerHelper.saveAllItems(tag, this.items);
   }

   public ItemStack getItem(int i) {
      return i >= 0 && i < this.items.size() ? this.items.get(i) : ItemStack.EMPTY;
   }

   public ItemStack removeItem(int i, int dunno) {
      return ContainerHelper.removeItem(this.items, i, dunno);
   }

   public ItemStack removeItemNoUpdate(int i) {
      return ContainerHelper.takeItem(this.items, i);
   }

   public void setItem(int p_58993_, ItemStack p_58994_) {
      if (p_58993_ >= 0 && p_58993_ < this.items.size()) {
         this.items.set(p_58993_, p_58994_);
      }

   }

   public boolean stillValid(Player player) {
      return Container.stillValidBlockEntity(this, player);
   }

   public void clearContent() {
      this.items.clear();
   }

   protected AbstractContainerMenu createMenu(int p_58990_, Inventory p_58991_) {
      return new DryingStonesMenu(p_58990_, p_58991_, this, this.dataAccess);
   }

   net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
           net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);

   @Override
   public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable Direction facing) {
      if (capability == net.minecraftforge.common.capabilities.ForgeCapabilities.ITEM_HANDLER && facing != null && !this.remove) {
          return switch (facing) {
              case UP -> handlers[0].cast();
              case DOWN -> handlers[1].cast();
              default -> handlers[2].cast();
          };
      }
      return super.getCapability(capability, facing);
   }

   @Override
   public void invalidateCaps() {
      super.invalidateCaps();
      for (int x = 0; x < handlers.length; x++)
        handlers[x].invalidate();
   }

   @Override
   public void reviveCaps() {
      super.reviveCaps();
      this.handlers = net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
   }

   @Override
   public int[] getSlotsForFace(Direction p_19238_) {
      return new int[0];
   }

   @Override
   public boolean canPlaceItemThroughFace(int p_19235_, ItemStack p_19236_, @org.jetbrains.annotations.Nullable Direction p_19237_) {
      return false;
   }

   @Override
   public boolean canTakeItemThroughFace(int p_19239_, ItemStack p_19240_, Direction p_19241_) {
      return false;
   }
}
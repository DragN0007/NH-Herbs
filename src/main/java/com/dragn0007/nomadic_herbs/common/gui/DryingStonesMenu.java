package com.dragn0007.nomadic_herbs.common.gui;

import com.dragn0007.nomadic_herbs.blocks.custom.DryingStonesBlockEntity;
import com.dragn0007.nomadic_herbs.items.custom.base.HerbalItem;
import com.dragn0007.nomadic_herbs.util.NHTags;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class DryingStonesMenu extends AbstractContainerMenu {

    private final Container container;
    private final ContainerData data;

    public DryingStonesMenu(int i, Inventory inventory, FriendlyByteBuf friendlyByteBuf) {
        this(i, inventory, new SimpleContainer(3), new SimpleContainerData(1));
    }

    public DryingStonesMenu(int i, Inventory inventory, Container container, ContainerData data) {
        super(NHMenuTypes.DRYING_STONES_MENU.get(), i);
        checkContainerSize(inventory, 3);
        this.container = container;
        this.data = data;
        this.addDataSlots(data);

        this.addSlot(new Slot(this.container, DryingStonesBlockEntity.HERB_SLOT, 79, 17) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return itemStack.is(NHTags.Items.CAN_DRY);
            }
        });
        this.addSlot(new Slot(this.container, DryingStonesBlockEntity.OUTPUT_SLOT, 79, 58) {
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return false;
            }
        });

        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                this.addSlot(new Slot(inventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
            }
        }
        for(int x = 0; x < 9; x++) {
            this.addSlot(new Slot(inventory, x, 8 + x * 18, 142));
        }
    }

    public int getBrewingTicks() {
        return this.data.get(0);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slotId) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(slotId);
        if(slot.hasItem()) {
            itemStack = slot.getItem().copy();
            int containerSize = this.container.getContainerSize();

            if(slotId < containerSize) {
                if(!this.moveItemStackTo(itemStack, containerSize, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if(!this.moveItemStackTo(itemStack, 0, containerSize, false)) {
                return ItemStack.EMPTY;
            }

            if(itemStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return itemStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return this.container.stillValid(player);
    }
}

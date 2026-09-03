package com.dragn0007.nomadic_herbs.client.gui;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.common.gui.DryingStonesMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DryingStonesScreen extends AbstractContainerScreen<DryingStonesMenu> {
   private static final ResourceLocation LOCATION = new ResourceLocation(NomadicHerbs.MODID,"textures/gui/drying_stones.png");

   public DryingStonesScreen(DryingStonesMenu menu, Inventory inventory, Component component) {
      super(menu, inventory, component);
   }

   protected void init() {
      super.init();
      this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
   }

   public void render(GuiGraphics graphics, int x, int y, float partialTick) {
      this.renderBackground(graphics);
      super.render(graphics, x, y, partialTick);
      this.renderTooltip(graphics, x, y);
   }

   protected void renderBg(GuiGraphics graphics, float partialTick, int mouseY, int mouseX) {
      int i = (this.width - this.imageWidth) / 2;
      int j = (this.height - this.imageHeight) / 2;
      graphics.blit(LOCATION, i, j, 0, 0, this.imageWidth, this.imageHeight);

      int i1 = this.menu.getBrewingTicks();
      if (i1 > 0) {
         int j1 = (int)(28.0F * (1.0F - (float)i1 / 800.0F));
         if (j1 > 0) {
            graphics.blit(LOCATION, i + 97, j + 16, 176, 0, 9, j1);
         }
      }

   }
}
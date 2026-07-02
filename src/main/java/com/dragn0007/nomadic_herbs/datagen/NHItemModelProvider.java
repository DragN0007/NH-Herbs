package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class NHItemModelProvider extends ItemModelProvider {
    public NHItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NomadicHerbs.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(NHItems.GRINDER);
        simpleItem(NHItems.POUCH);
        advancedItem(NHItems.WATER_POUCH, "pouch");
        simpleItem(NHItems.PEYOTE);
        simpleItem(NHItems.PEYOTE_PASTE);
        simpleItem(NHItems.ROSEMARY);
        simpleItem(NHItems.CILANTRO);
        simpleBlockItem(NHBlocks.WATER_HYSSOP);
        simpleItem(NHItems.WATER_HYSSOP_CLUSTER);
        simpleBlockItem(NHBlocks.SQUIRRELTAIL);
        simpleItem(NHItems.SQUIRRELTAIL_CLUSTER);
        simpleBlockItem(NHBlocks.WATERSHIELD);
        simpleItem(NHItems.WATERSHIELD_PASTE);
        simpleItem(NHItems.ARTEMISIA);
        simpleItem(NHItems.THYME);
        simpleItem(NHItems.BASIL);
        simpleBlockItem(NHBlocks.SUNDEW);
        simpleItem(NHItems.SUNDEW_MUCILAGE);
        simpleItem(NHItems.CATS_CLAW);
        advancedBlockItem(NHBlocks.WILD_DEVILS_CLAW, "devils_claw_stage3");
        simpleItem(NHItems.DEVILS_CLAW_SEEDS);
        simpleItem(NHItems.BITTER_LETTUCE);
        simpleItem(NHItems.SHREDDED_BITTER_LETTUCE);
        simpleItem(NHItems.PRICKLY_PEAR);
        simpleItem(NHItems.PRICKLY_PEAR_PASTE);
        simpleBlockItem(NHBlocks.CREOSOTE_BUSH);
        simpleItem(NHItems.CREOSOTE_CLUSTER);
        simpleBlockItem(NHBlocks.BRITTLEBUSH);
        simpleItem(NHItems.BRITTLEBUSH_CLUSTER);
        simpleItem(NHItems.CURARE);
        simpleItem(NHItems.SHREDDED_CURARE);
        simpleItem(NHItems.JABORANDI);
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NomadicHerbs.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NomadicHerbs.MODID,"item/" + getTextureName));
    }
    public ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NomadicHerbs.MODID,"block/" + item.getId().getPath()));
    }
    public ItemModelBuilder advancedBlockItem(RegistryObject<Block> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NomadicHerbs.MODID,"block/" + getTextureName));
    }
}
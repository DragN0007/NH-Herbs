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
        advancedItem(NHItems.HIBISCUS_WATER_POUCH, "pouch");
        advancedItem(NHItems.HERBAL_WATER_POUCH, "pouch");
        advancedItem(NHItems.CACTUS_WATER_POUCH, "pouch");
        advancedItem(NHItems.HAWTHORN_WATER_POUCH, "pouch");
        advancedItem(NHItems.FEVER_TEA_POUCH, "pouch");
        simpleItem(NHItems.WATER_COCONUT_HUSK);
        advancedItem(NHItems.SALT_WATER_COCONUT_HUSK, "water_coconut_husk");
        simpleItem(NHItems.POISON_PASTE);
        simpleItem(NHItems.SUN_PASTE);
        simpleItem(NHItems.BANANA_PASTE);
        simpleItem(NHItems.ROSEHIP_PASTE);
        simpleItem(NHItems.RITUAL_INCENSE);
        simpleItem(NHItems.SLUMBER_INCENSE);
        simpleItem(NHItems.HERBAL_INCENSE);
        simpleItem(NHItems.NUMBING_POWDER);
        simpleItem(NHItems.COCONUT);
        simpleItem(NHItems.HONEYPOT_ANT);
        simpleItem(NHItems.HONEY_STICK);
        simpleItem(NHItems.ROSEHIPS);
        simpleItem(NHItems.SNAKES_BLOOD_SAP);
        simpleItem(NHItems.CLAY_PASTE);
        simpleItem(NHItems.CHARCOAL_CHUNKS);
        simpleItem(NHItems.COCONUT_HUSK);
        simpleItem(NHItems.BANANA_LEAF);
        simpleItem(NHItems.PLANT_FIBER);
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
        simpleItem(NHItems.ACHIOTE);
        simpleItem(NHItems.ACHIOTE_PASTE);
        simpleItem(NHItems.JEWELWEED_CLUSTER);
        simpleItem(NHItems.JEWELWEED_STEMS);
        simpleItem(NHItems.JEWELWEED_PETALS);
        simpleItem(NHItems.MILKWEED_CLUSTER);
        simpleItem(NHItems.MILKWEED_STEMS);
        simpleItem(NHItems.MILKWEED_PETALS);
        simpleItem(NHItems.WATERCRESS_CLUSTER);
        simpleItem(NHItems.SWEET_FLAG_CLUSTER);
        simpleItem(NHItems.CARDINAL_FLOWER);
        simpleItem(NHItems.CARDINAL_FLOWER_PETALS);
        simpleItem(NHItems.HIBISCUS_CLUSTER);
        simpleItem(NHItems.EPHERDRA_CLUSTER);
        simpleItem(NHItems.ALOE);
        simpleItem(NHItems.SPEARMINT);
        simpleItem(NHItems.LAVENDER);
        simpleItem(NHItems.ALOYSIA);
        simpleItem(NHItems.GREEN_TEA_LEAF);
        simpleItem(NHItems.GINGER);
        simpleItem(NHItems.FEVERFEW_CLUSTER);
        simpleItem(NHItems.HAWTHORN_BERRY);
        simpleItem(NHItems.DRIED_ALOYSIA);
        simpleItem(NHItems.DRIED_HIBISCUS_CLUSTER);
        simpleItem(NHItems.DRIED_LAVENDER);
        simpleItem(NHItems.DRIED_THYME);
        simpleItem(NHItems.DRIED_ROSEHIPS);
        simpleItem(NHItems.DRIED_ROSEMARY);
        simpleItem(NHItems.DRIED_MILKWEED_PETALS);

        simpleSpriteBlock(NHBlocks.DEEP_FUNGUS);
        simpleSpriteBlock(NHBlocks.DRYING_STONES);
        simpleSpriteBlock(NHBlocks.MULGA_SAPLING);
        withExistingParent("mulga_log", modLoc("block/mulga_log"));
        withExistingParent("mulga_leaves", modLoc("block/mulga_leaves"));
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
    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NomadicHerbs.MODID,"block/" + block.getId().getPath()));
    }
}
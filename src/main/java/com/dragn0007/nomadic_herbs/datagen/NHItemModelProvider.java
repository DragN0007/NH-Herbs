package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
        simpleItem(NHItems.WATER_HYSSOP);
        simpleItem(NHItems.SQUIRRELTAIL);
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
}
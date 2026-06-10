package com.dragn0007.nomadic_herbs.datagen.compat;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import sfiomn.legendarysurvivaloverhaul.api.data.providers.ThirstDataProvider;

import java.util.concurrent.CompletableFuture;

/*
ModThirstProvider (renamed to NHThirstProvider) originally by legendary_workshop, used in Legendary Survival Overhaul
Distributed under MIT

This class is used for Legendary Survival Overhaul compat with NH foods & drinks
 */

public class NHThirstProvider extends ThirstDataProvider {

    public NHThirstProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper fileHelper) {
        super(NomadicHerbs.MODID, output, lookupProvider, fileHelper);
    }

    @Override
    public void generate(HolderLookup.Provider provider, ExistingFileHelper existingFileHelper) {
    }
}
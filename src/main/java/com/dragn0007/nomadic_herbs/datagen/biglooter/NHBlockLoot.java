package com.dragn0007.nomadic_herbs.datagen.biglooter;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NHBlockLoot extends BlockLootSubProvider {
    public NHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return NHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

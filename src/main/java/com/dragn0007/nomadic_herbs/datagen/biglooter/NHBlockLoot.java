package com.dragn0007.nomadic_herbs.datagen.biglooter;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.blocks.base_plant.HerbCropBlock;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NHBlockLoot extends BlockLootSubProvider {
    public NHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        LootItemCondition.Builder cropBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.PEYOTE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.PEYOTE.get(),
                this.applyExplosionDecay(NHBlocks.PEYOTE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.PEYOTE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder).add(LootItem.lootTableItem(NHItems.PEYOTE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_PEYOTE.get(), NHItems.PEYOTE.get());

        LootItemCondition.Builder cropBuilder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.ROSEMARY.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.ROSEMARY.get(),
                this.applyExplosionDecay(NHBlocks.ROSEMARY.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.ROSEMARY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder1).add(LootItem.lootTableItem(NHItems.ROSEMARY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_ROSEMARY.get(), NHItems.ROSEMARY.get());

        LootItemCondition.Builder cropBuilder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.CILANTRO.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.CILANTRO.get(),
                this.applyExplosionDecay(NHBlocks.CILANTRO.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.CILANTRO.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder2).add(LootItem.lootTableItem(NHItems.CILANTRO.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_CILANTRO.get(), NHItems.CILANTRO.get());

        dropSelf(NHBlocks.WATER_HYSSOP.get());
        dropSelf(NHBlocks.SQUIRRELTAIL.get());
        dropSelf(NHBlocks.WATERSHIELD.get());

        LootItemCondition.Builder cropBuilder3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.ARTEMISIA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.ARTEMISIA.get(),
                this.applyExplosionDecay(NHBlocks.ARTEMISIA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.ARTEMISIA.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder3).add(LootItem.lootTableItem(NHItems.ARTEMISIA.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_ARTEMISIA.get(), NHItems.ARTEMISIA.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return NHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

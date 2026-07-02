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

        LootItemCondition.Builder cropBuilder4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.THYME.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.THYME.get(),
                this.applyExplosionDecay(NHBlocks.THYME.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.THYME.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder4).add(LootItem.lootTableItem(NHItems.THYME.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_THYME.get(), NHItems.THYME.get());

        LootItemCondition.Builder cropBuilder5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.BASIL.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.BASIL.get(),
                this.applyExplosionDecay(NHBlocks.BASIL.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.BASIL.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder5).add(LootItem.lootTableItem(NHItems.BASIL.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_BASIL.get(), NHItems.BASIL.get());

        dropSelf(NHBlocks.SUNDEW.get());

        LootItemCondition.Builder cropBuilder6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.CATS_CLAW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.CATS_CLAW.get(),
                this.applyExplosionDecay(NHBlocks.CATS_CLAW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.CATS_CLAW.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder6).add(LootItem.lootTableItem(NHItems.CATS_CLAW.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_CATS_CLAW.get(), NHItems.CATS_CLAW.get());

        LootItemCondition.Builder cropBuilder7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.DEVILS_CLAW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.DEVILS_CLAW.get(),
                this.applyExplosionDecay(NHBlocks.DEVILS_CLAW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHBlocks.DEVILS_CLAW.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder7).add(LootItem.lootTableItem(NHBlocks.DEVILS_CLAW.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_DEVILS_CLAW.get(), NHBlocks.DEVILS_CLAW.get());

        LootItemCondition.Builder cropBuilder8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.BITTER_LETTUCE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.BITTER_LETTUCE.get(),
                this.applyExplosionDecay(NHBlocks.BITTER_LETTUCE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.BITTER_LETTUCE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder8).add(LootItem.lootTableItem(NHItems.BITTER_LETTUCE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_BITTER_LETTUCE.get(), NHItems.BITTER_LETTUCE.get());

        LootItemCondition.Builder cropBuilder9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.PRICKLY_PEAR.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.PRICKLY_PEAR.get(),
                this.applyExplosionDecay(NHBlocks.PRICKLY_PEAR.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.PRICKLY_PEAR.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder9).add(LootItem.lootTableItem(NHItems.PRICKLY_PEAR.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_PRICKLY_PEAR.get(), NHItems.PRICKLY_PEAR.get());

        dropSelf(NHBlocks.CREOSOTE_BUSH.get());
        dropSelf(NHBlocks.BRITTLEBUSH.get());

        LootItemCondition.Builder cropBuilder10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.CURARE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.CURARE.get(),
                this.applyExplosionDecay(NHBlocks.CURARE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.CURARE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder10).add(LootItem.lootTableItem(NHItems.CURARE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_CURARE.get(), NHItems.CURARE.get());

        LootItemCondition.Builder cropBuilder11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.JABORANDI.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.JABORANDI.get(),
                this.applyExplosionDecay(NHBlocks.JABORANDI.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.JABORANDI.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder11).add(LootItem.lootTableItem(NHItems.JABORANDI.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_JABORANDI.get(), NHItems.JABORANDI.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return NHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

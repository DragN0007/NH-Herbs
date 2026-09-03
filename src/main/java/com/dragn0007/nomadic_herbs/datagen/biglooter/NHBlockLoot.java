package com.dragn0007.nomadic_herbs.datagen.biglooter;

import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.blocks.base_plant.HerbCropBlock;
import com.dragn0007.nomadic_herbs.items.NHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class NHBlockLoot extends BlockLootSubProvider {
    public NHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.dropSelf(NHBlocks.DEEP_FUNGUS.get());

        this.dropSelf(NHBlocks.MULGA_LOG.get());
        this.dropSelf(NHBlocks.MULGA_PLANKS.get());
        this.dropSelf(NHBlocks.MULGA_SLAB.get());
        this.dropSelf(NHBlocks.MULGA_STAIRS.get());
        this.dropSelf(NHBlocks.MULGA_SAPLING.get());
        this.dropSelf(NHBlocks.MULGA_FENCE.get());
        this.dropSelf(NHBlocks.MULGA_FENCE_GATE.get());
        this.add(NHBlocks.MULGA_LEAVES.get(), (block) -> this.createLeavesDrops(block, NHBlocks.MULGA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

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

        LootItemCondition.Builder cropBuilder12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.ACHIOTE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.ACHIOTE.get(),
                this.applyExplosionDecay(NHBlocks.ACHIOTE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.ACHIOTE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder12).add(LootItem.lootTableItem(NHItems.ACHIOTE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_ACHIOTE.get(), NHItems.ACHIOTE.get());

        LootItemCondition.Builder cropBuilder13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.JEWELWEED.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.JEWELWEED.get(),
                this.applyExplosionDecay(NHBlocks.JEWELWEED.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.JEWELWEED_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder13).add(LootItem.lootTableItem(NHItems.JEWELWEED_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_JEWELWEED.get(), NHItems.JEWELWEED_CLUSTER.get());

        LootItemCondition.Builder cropBuilder14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.MILKWEED.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.MILKWEED.get(),
                this.applyExplosionDecay(NHBlocks.MILKWEED.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.MILKWEED_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder14).add(LootItem.lootTableItem(NHItems.MILKWEED_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_MILKWEED.get(), NHItems.MILKWEED_CLUSTER.get());

        LootItemCondition.Builder cropBuilder15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.WATERCRESS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.WATERCRESS.get(),
                this.applyExplosionDecay(NHBlocks.WATERCRESS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.WATERCRESS_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder15).add(LootItem.lootTableItem(NHItems.WATERCRESS_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_WATERCRESS.get(), NHItems.WATERCRESS_CLUSTER.get());

        LootItemCondition.Builder cropBuilder16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.SWEET_FLAG.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.SWEET_FLAG.get(),
                this.applyExplosionDecay(NHBlocks.SWEET_FLAG.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.SWEET_FLAG_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder16).add(LootItem.lootTableItem(NHItems.SWEET_FLAG_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_SWEET_FLAG.get(), NHItems.SWEET_FLAG_CLUSTER.get());

        LootItemCondition.Builder cropBuilder17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.CARDINAL_FLOWER.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.CARDINAL_FLOWER.get(),
                this.applyExplosionDecay(NHBlocks.CARDINAL_FLOWER.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.CARDINAL_FLOWER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder17).add(LootItem.lootTableItem(NHItems.CARDINAL_FLOWER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_CARDINAL_FLOWER.get(), NHItems.CARDINAL_FLOWER.get());

        LootItemCondition.Builder cropBuilder18 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.HIBISCUS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.HIBISCUS.get(),
                this.applyExplosionDecay(NHBlocks.HIBISCUS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.HIBISCUS_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder18).add(LootItem.lootTableItem(NHItems.HIBISCUS_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_HIBISCUS.get(), NHItems.HIBISCUS_CLUSTER.get());

        LootItemCondition.Builder cropBuilder19 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.EPHERDRA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.EPHERDRA.get(),
                this.applyExplosionDecay(NHBlocks.EPHERDRA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.EPHERDRA_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder19).add(LootItem.lootTableItem(NHItems.EPHERDRA_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_EPHERDRA.get(), NHItems.EPHERDRA_CLUSTER.get());

        LootItemCondition.Builder cropBuilder20 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.ALOE.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.ALOE.get(),
                this.applyExplosionDecay(NHBlocks.ALOE.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.ALOE.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder20).add(LootItem.lootTableItem(NHItems.ALOE.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_ALOE.get(), NHItems.ALOE.get());

        LootItemCondition.Builder cropBuilder21 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.SPEARMINT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.SPEARMINT.get(),
                this.applyExplosionDecay(NHBlocks.SPEARMINT.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.SPEARMINT.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder21).add(LootItem.lootTableItem(NHItems.SPEARMINT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_SPEARMINT.get(), NHItems.SPEARMINT.get());

        LootItemCondition.Builder cropBuilder22 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.LAVENDER.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.LAVENDER.get(),
                this.applyExplosionDecay(NHBlocks.LAVENDER.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.LAVENDER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder22).add(LootItem.lootTableItem(NHItems.LAVENDER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_LAVENDER.get(), NHItems.LAVENDER.get());

        LootItemCondition.Builder cropBuilder23 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.ALOYSIA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.ALOYSIA.get(),
                this.applyExplosionDecay(NHBlocks.ALOYSIA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.ALOYSIA.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder23).add(LootItem.lootTableItem(NHItems.ALOYSIA.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_ALOYSIA.get(), NHItems.ALOYSIA.get());

        LootItemCondition.Builder cropBuilder24 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.GREEN_TEA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.GREEN_TEA.get(),
                this.applyExplosionDecay(NHBlocks.GREEN_TEA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.GREEN_TEA_LEAF.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder24).add(LootItem.lootTableItem(NHItems.GREEN_TEA_LEAF.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_GREEN_TEA.get(), NHItems.GREEN_TEA_LEAF.get());

        LootItemCondition.Builder cropBuilder25 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.GINGER.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.GINGER.get(),
                this.applyExplosionDecay(NHBlocks.GINGER.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.GINGER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder25).add(LootItem.lootTableItem(NHItems.GINGER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_GINGER.get(), NHItems.GINGER.get());

        LootItemCondition.Builder cropBuilder26 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.FEVERFEW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.FEVERFEW.get(),
                this.applyExplosionDecay(NHBlocks.FEVERFEW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.FEVERFEW_CLUSTER.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder26).add(LootItem.lootTableItem(NHItems.FEVERFEW_CLUSTER.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_FEVERFEW.get(), NHItems.FEVERFEW_CLUSTER.get());

        LootItemCondition.Builder cropBuilder27 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(NHBlocks.HAWTHORN.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(NHBlocks.HAWTHORN.get(),
                this.applyExplosionDecay(NHBlocks.HAWTHORN.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(NHItems.HAWTHORN_BERRY.get())))
                                .withPool(LootPool.lootPool().when(cropBuilder27).add(LootItem.lootTableItem(NHItems.HAWTHORN_BERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(NHBlocks.WILD_HAWTHORN.get(), NHItems.HAWTHORN_BERRY.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return NHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

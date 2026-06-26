package com.dragn0007.nomadic_herbs.spawn;


import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;

public class NHConfigFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEYOTE = registerKey("peyote");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CILANTRO = registerKey("cilantro");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATER_HYSSOP = registerKey("water_hyssop");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SQUIRRELTAIL = registerKey("squirreltail");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATERSHIELD = registerKey("watershield");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ARTEMISIA = registerKey("artemisia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THYME = registerKey("thyme");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASIL = registerKey("basil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUNDEW = registerKey("sundew");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CATS_CLAW = registerKey("cats_claw");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEVILS_CLAW = registerKey("devils_claw");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BITTER_LETTUCE = registerKey("bitter_lettuce");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PRICKLY_PEAR = registerKey("prickly_pear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CREOSOTE_BUSH = registerKey("creosote_bush");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, PEYOTE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_PEYOTE.get())))));
        register(context, ROSEMARY, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_ROSEMARY.get())))));
        register(context, CILANTRO, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_CILANTRO.get())))));
        register(context, WATER_HYSSOP, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WATER_HYSSOP.get())))));
        register(context, SQUIRRELTAIL, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(10, 3, 4, PlacementUtils.inlinePlaced(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.SQUIRRELTAIL.get())),
                        BlockPredicateFilter.forPredicate(
                                BlockPredicate.allOf(
                                        BlockPredicate.matchesBlocks(Blocks.WATER),
                                        BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.SAND, Blocks.GRAVEL, Blocks.DIRT, Blocks.CLAY))))));
        register(context, WATERSHIELD, Feature.RANDOM_PATCH,
                new RandomPatchConfiguration(10, 3, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WATERSHIELD.get())))));
        register(context, ARTEMISIA, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_ARTEMISIA.get())))));
        register(context, THYME, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_THYME.get())))));
        register(context, BASIL, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_BASIL.get())))));
        register(context, SUNDEW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.SUNDEW.get())))));
        register(context, CATS_CLAW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_CATS_CLAW.get())))));
        register(context, DEVILS_CLAW, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_DEVILS_CLAW.get())))));
        register(context, BITTER_LETTUCE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_BITTER_LETTUCE.get())))));
        register(context, PRICKLY_PEAR, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_PRICKLY_PEAR.get())))));
        register(context, CREOSOTE_BUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.CREOSOTE_BUSH.get())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NomadicHerbs.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}



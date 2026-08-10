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
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRITTLEBUSH = registerKey("brittlebush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CURARE = registerKey("curare");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JABORANDI = registerKey("jaborandi");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ACHIOTE = registerKey("achiote");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JEWELWEED = registerKey("jewelweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MILKWEED = registerKey("milkweed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATERCRESS = registerKey("watercress");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEET_FLAG = registerKey("sweet_flag");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARDINAL_FLOWER = registerKey("cardinal_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HIBISCUS = registerKey("hibiscus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EPHERDRA = registerKey("epherdra");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALOE = registerKey("aloe");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPEARMINT = registerKey("spearmint");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER = registerKey("lavender");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, LAVENDER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_LAVENDER.get())))));
        register(context, SPEARMINT, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_SPEARMINT.get())))));
        register(context, ALOE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_ALOE.get())))));
        register(context, EPHERDRA, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_EPHERDRA.get())))));
        register(context, HIBISCUS, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_HIBISCUS.get())))));
        register(context, CARDINAL_FLOWER, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_CARDINAL_FLOWER.get())))));
        register(context, SWEET_FLAG, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_SWEET_FLAG.get())))));
        register(context, WATERCRESS, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_WATERCRESS.get())))));
        register(context, MILKWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_MILKWEED.get())))));
        register(context, JEWELWEED, Feature.FLOWER,
                new RandomPatchConfiguration(10, 1, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_JEWELWEED.get())))));
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
                new RandomPatchConfiguration(10, 6, 6, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.CREOSOTE_BUSH.get())))));
        register(context, BRITTLEBUSH, Feature.FLOWER,
                new RandomPatchConfiguration(10, 6, 6, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.BRITTLEBUSH.get())))));
        register(context, CURARE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_CURARE.get())))));
        register(context, JABORANDI, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_JABORANDI.get())))));
        register(context, ACHIOTE, Feature.FLOWER,
                new RandomPatchConfiguration(10, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(NHBlocks.WILD_ACHIOTE.get())))));
    }
    
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NomadicHerbs.MODID, name));
    }
    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}



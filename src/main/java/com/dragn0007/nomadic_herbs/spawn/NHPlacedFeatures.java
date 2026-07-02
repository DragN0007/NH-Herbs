package com.dragn0007.nomadic_herbs.spawn;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class NHPlacedFeatures {
    public static final ResourceKey<PlacedFeature> PEYOTE = registerKey("peyote");
    public static final ResourceKey<PlacedFeature> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<PlacedFeature> CILANTRO = registerKey("cilantro");
    public static final ResourceKey<PlacedFeature> WATER_HYSSOP = registerKey("water_hyssop");
    public static final ResourceKey<PlacedFeature> SQUIRRELTAIL = registerKey("squirreltail");
    public static final ResourceKey<PlacedFeature> WATERSHIELD = registerKey("watershield");
    public static final ResourceKey<PlacedFeature> ARTEMISIA = registerKey("artemisia");
    public static final ResourceKey<PlacedFeature> THYME = registerKey("thyme");
    public static final ResourceKey<PlacedFeature> BASIL = registerKey("basil");
    public static final ResourceKey<PlacedFeature> SUNDEW = registerKey("sundew");
    public static final ResourceKey<PlacedFeature> CATS_CLAW = registerKey("cats_claw");
    public static final ResourceKey<PlacedFeature> DEVILS_CLAW = registerKey("devils_claw");
    public static final ResourceKey<PlacedFeature> BITTER_LETTUCE = registerKey("bitter_lettuce");
    public static final ResourceKey<PlacedFeature> PRICKLY_PEAR = registerKey("prickly_pear");
    public static final ResourceKey<PlacedFeature> CREOSOTE_BUSH = registerKey("creosote_bush");
    public static final ResourceKey<PlacedFeature> BRITTLEBUSH = registerKey("brittlebush");
    public static final ResourceKey<PlacedFeature> CURARE = registerKey("curare");
    public static final ResourceKey<PlacedFeature> JABORANDI = registerKey("jaborandi");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, PEYOTE, configuredFeatures.getOrThrow(NHConfigFeatures.PEYOTE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ROSEMARY, configuredFeatures.getOrThrow(NHConfigFeatures.ROSEMARY),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CILANTRO, configuredFeatures.getOrThrow(NHConfigFeatures.CILANTRO),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WATER_HYSSOP, configuredFeatures.getOrThrow(NHConfigFeatures.WATER_HYSSOP),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, SQUIRRELTAIL, configuredFeatures.getOrThrow(NHConfigFeatures.SQUIRRELTAIL),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BiomeFilter.biome()));
        register(context, WATERSHIELD, configuredFeatures.getOrThrow(NHConfigFeatures.WATERSHIELD),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ARTEMISIA, configuredFeatures.getOrThrow(NHConfigFeatures.ARTEMISIA),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, THYME, configuredFeatures.getOrThrow(NHConfigFeatures.THYME),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BASIL, configuredFeatures.getOrThrow(NHConfigFeatures.BASIL),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, SUNDEW, configuredFeatures.getOrThrow(NHConfigFeatures.SUNDEW),
                List.of(RarityFilter.onAverageOnceEvery(96),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CATS_CLAW, configuredFeatures.getOrThrow(NHConfigFeatures.CATS_CLAW),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, DEVILS_CLAW, configuredFeatures.getOrThrow(NHConfigFeatures.DEVILS_CLAW),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BITTER_LETTUCE, configuredFeatures.getOrThrow(NHConfigFeatures.BITTER_LETTUCE),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, PRICKLY_PEAR, configuredFeatures.getOrThrow(NHConfigFeatures.PRICKLY_PEAR),
                List.of(RarityFilter.onAverageOnceEvery(48),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CREOSOTE_BUSH, configuredFeatures.getOrThrow(NHConfigFeatures.CREOSOTE_BUSH),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BRITTLEBUSH, configuredFeatures.getOrThrow(NHConfigFeatures.BRITTLEBUSH),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CURARE, configuredFeatures.getOrThrow(NHConfigFeatures.CURARE),
                List.of(RarityFilter.onAverageOnceEvery(96),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, JABORANDI, configuredFeatures.getOrThrow(NHConfigFeatures.JABORANDI),
                List.of(RarityFilter.onAverageOnceEvery(64),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }

    public static ResourceKey<PlacedFeature> registerKey (String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NomadicHerbs.MODID, name));
    }
    public static void register
    (BootstapContext < PlacedFeature > context, ResourceKey < PlacedFeature > key, Holder < ConfiguredFeature < ?, ?>>
    configuration,
            List < PlacementModifier > modifiers){
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

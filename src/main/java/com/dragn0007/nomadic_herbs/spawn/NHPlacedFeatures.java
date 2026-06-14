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

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, PEYOTE, configuredFeatures.getOrThrow(NHConfigFeatures.PEYOTE),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ROSEMARY, configuredFeatures.getOrThrow(NHConfigFeatures.ROSEMARY),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, CILANTRO, configuredFeatures.getOrThrow(NHConfigFeatures.CILANTRO),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WATER_HYSSOP, configuredFeatures.getOrThrow(NHConfigFeatures.WATER_HYSSOP),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, SQUIRRELTAIL, configuredFeatures.getOrThrow(NHConfigFeatures.SQUIRRELTAIL),
                List.of(RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WATERSHIELD, configuredFeatures.getOrThrow(NHConfigFeatures.WATERSHIELD),
                List.of(RarityFilter.onAverageOnceEvery(32),
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

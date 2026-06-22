package com.dragn0007.nomadic_herbs.spawn;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeHitter {
    public static final ResourceKey<BiomeModifier> PEYOTE = registerKey("peyote");
    public static final ResourceKey<BiomeModifier> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<BiomeModifier> CILANTRO = registerKey("cilantro");
    public static final ResourceKey<BiomeModifier> WATER_HYSSOP = registerKey("water_hyssop");
    public static final ResourceKey<BiomeModifier> SQUIRRELTAIL = registerKey("squirreltail");
    public static final ResourceKey<BiomeModifier> WATERSHIELD = registerKey("watershield");
    public static final ResourceKey<BiomeModifier> ARTEMISIA = registerKey("artemisia");
    public static final ResourceKey<BiomeModifier> THYME = registerKey("thyme");
    public static final ResourceKey<BiomeModifier> BASIL = registerKey("basil");
    public static final ResourceKey<BiomeModifier> SUNDEW = registerKey("sundew");
    public static final ResourceKey<BiomeModifier> CATS_CLAW = registerKey("cats_claw");
    public static final ResourceKey<BiomeModifier> DEVILS_CLAW = registerKey("devils_claw");
    public static final ResourceKey<BiomeModifier> BITTER_LETTUCE = registerKey("bitter_lettuce");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        context.register(PEYOTE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.PEYOTE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ROSEMARY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.ROSEMARY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CILANTRO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.CILANTRO)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WATER_HYSSOP, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.WATER_HYSSOP)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SQUIRRELTAIL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.SQUIRRELTAIL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WATERSHIELD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.WATERSHIELD)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ARTEMISIA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.ARTEMISIA)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(THYME, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.THYME)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BASIL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.BASIL)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SUNDEW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.SUNDEW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CATS_CLAW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.CATS_CLAW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(DEVILS_CLAW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.DEVILS_CLAW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BITTER_LETTUCE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.BITTER_LETTUCE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NomadicHerbs.MODID, name));
    }
}
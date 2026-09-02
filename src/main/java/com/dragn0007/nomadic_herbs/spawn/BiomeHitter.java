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
    public static final ResourceKey<BiomeModifier> MULGA = registerKey("mulga");
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
    public static final ResourceKey<BiomeModifier> PRICKLY_PEAR = registerKey("prickly_pear");
    public static final ResourceKey<BiomeModifier> CREOSOTE_BUSH = registerKey("creosote_bush");
    public static final ResourceKey<BiomeModifier> BRITTLEBUSH = registerKey("brittlebush");
    public static final ResourceKey<BiomeModifier> CURARE = registerKey("curare");
    public static final ResourceKey<BiomeModifier> JABORANDI = registerKey("jaborandi");
    public static final ResourceKey<BiomeModifier> ACHIOTE = registerKey("achiote");
    public static final ResourceKey<BiomeModifier> JEWELWEED = registerKey("jewelweed");
    public static final ResourceKey<BiomeModifier> MILKWEED = registerKey("milkweed");
    public static final ResourceKey<BiomeModifier> WATERCRESS = registerKey("watercress");
    public static final ResourceKey<BiomeModifier> SWEET_FLAG = registerKey("sweet_flag");
    public static final ResourceKey<BiomeModifier> CARDINAL_FLOWER = registerKey("cardinal_flower");
    public static final ResourceKey<BiomeModifier> HIBISCUS = registerKey("hibiscus");
    public static final ResourceKey<BiomeModifier> EPHERDRA = registerKey("epherdra");
    public static final ResourceKey<BiomeModifier> ALOE = registerKey("aloe");
    public static final ResourceKey<BiomeModifier> SPEARMINT = registerKey("spearmint");
    public static final ResourceKey<BiomeModifier> LAVENDER = registerKey("lavender");
    public static final ResourceKey<BiomeModifier> ALOYSIA = registerKey("aloysia");
    public static final ResourceKey<BiomeModifier> GREEN_TEA = registerKey("green_tea");
    public static final ResourceKey<BiomeModifier> GINGER = registerKey("ginger");
    public static final ResourceKey<BiomeModifier> FEVERFEW = registerKey("feverfew");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        context.register(MULGA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.MULGA)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(FEVERFEW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.FEVERFEW)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GINGER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.GINGER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(GREEN_TEA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.GREEN_TEA)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ALOYSIA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.ALOYSIA)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(LAVENDER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.LAVENDER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SPEARMINT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.SPEARMINT)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ALOE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.ALOE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(EPHERDRA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.EPHERDRA)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(HIBISCUS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.HIBISCUS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CARDINAL_FLOWER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.CARDINAL_FLOWER)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(SWEET_FLAG, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.SWEET_FLAG)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(WATERCRESS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.WATERCRESS)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(MILKWEED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.MILKWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(JEWELWEED, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.JEWELWEED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

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

        context.register(PRICKLY_PEAR, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.PRICKLY_PEAR)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CREOSOTE_BUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.CREOSOTE_BUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(BRITTLEBUSH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.BRITTLEBUSH)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(CURARE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.CURARE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(JABORANDI, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.JABORANDI)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ACHIOTE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(NHPlacedFeatures.ACHIOTE)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NomadicHerbs.MODID, name));
    }
}
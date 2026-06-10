package com.dragn0007.nomadic_herbs.spawn;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeHitter {
    public static final ResourceKey<BiomeModifier> PEYOTE = registerKey("peyote");
    public static final ResourceKey<BiomeModifier> ROSEMARY = registerKey("rosemary");
    public static final ResourceKey<BiomeModifier> CILANTRO = registerKey("cilantro");


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
    }

    public static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NomadicHerbs.MODID, name));
    }
}
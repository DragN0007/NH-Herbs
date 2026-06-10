package com.dragn0007.nomadic_herbs.datagen;

import com.dragn0007.nomadic_herbs.NomadicHerbs;
import com.dragn0007.nomadic_herbs.blocks.NHBlocks;
import com.dragn0007.nomadic_herbs.blocks.base_plant.HerbCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;

public class NHBlockstateProvider extends BlockStateProvider {
    public NHBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NomadicHerbs.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        createCrossCrop((HerbCropBlock) NHBlocks.PEYOTE.get(), "peyote", "peyote",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(NHBlocks.WILD_PEYOTE.get(), models().cross(NHBlocks.WILD_PEYOTE.getId().getPath(),
                wildPlantTexture("peyote_stage3")).renderType("cutout"));
    }


    public void createCrossCrop(HerbCropBlock block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().cross(modelName, new ResourceLocation(NomadicHerbs.MODID, "block/" + texturePath))
                            .renderType("cutout"))
                    .build();
        });
    }

    public ResourceLocation wildPlantTexture(String getTextureName) {
        return new ResourceLocation(NomadicHerbs.MODID,"block/" + getTextureName);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(NomadicHerbs.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

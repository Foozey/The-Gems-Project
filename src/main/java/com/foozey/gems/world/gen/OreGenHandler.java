package com.foozey.gems.world.gen;

import com.foozey.gems.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenHandler {

    // Ore Generation
    public static void generateOre(final BiomeLoadingEvent event) {

        // Nether Generation
        if(event.getCategory() ==  Biome.Category.NETHER) {
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_EXPERIENCE_ORE.get().getBlock().defaultBlockState(), 8, 1, 128, 6);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_BONE_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_RIB_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_SKULL_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_FISH_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_SHELL_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);

        // End Generation
        } else if(event.getCategory() == Biome.Category.THEEND) {
            oreGen(event.getGeneration(), new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ONYX_ORE.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_EXPERIENCE_ORE.get().getBlock().defaultBlockState(), 8, 1, 128, 3);

        // Overworld Generation
        } else {
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TOPAZ_ORE.get().getBlock().defaultBlockState(), 4, 1, 16, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SAPPHIRE_ORE.get().getBlock().defaultBlockState(), 4, 1, 16, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RUBY_ORE.get().getBlock().defaultBlockState(), 4, 1, 16, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.GEMSPARK_ORE.get().getBlock().defaultBlockState(), 6, 1, 32, 2);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.EXPERIENCE_ORE.get().getBlock().defaultBlockState(), 8, 1, 128, 6);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BONE_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RIB_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SKULL_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.FISH_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
            oreGen(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SHELL_FOSSIL.get().getBlock().defaultBlockState(), 4, 1, 128, 1);
        }

    }

    // Ore Generation Builder
    public static void oreGen(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)).squared().count(amount)));
    }

}
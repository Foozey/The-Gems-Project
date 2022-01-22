package com.foozey.gems.world.gen;

import com.foozey.gems.init.ModBlocks;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenHandler {

    // Topaz Ore
    public static final int TOPAZ_ORE_VEINSIZE = 4;
    public static final int TOPAZ_ORE_AMOUNT = 1;
    public static PlacedFeature TOPAZ_ORE_GEN;
    
    // Deepslate Topaz Ore
    public static final int DEEPSLATE_TOPAZ_ORE_VEINSIZE = 4;
    public static final int DEEPSLATE_TOPAZ_ORE_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_TOPAZ_ORE_GEN;

    // Sapphire Ore
    public static final int SAPPHIRE_ORE_VEINSIZE = 4;
    public static final int SAPPHIRE_ORE_AMOUNT = 1;
    public static PlacedFeature SAPPHIRE_ORE_GEN;
    
    // Deepslate Sapphire Ore
    public static final int DEEPSLATE_SAPPHIRE_ORE_VEINSIZE = 4;
    public static final int DEEPSLATE_SAPPHIRE_ORE_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_SAPPHIRE_ORE_GEN;

    // Ruby Ore
    public static final int RUBY_ORE_VEINSIZE = 4;
    public static final int RUBY_ORE_AMOUNT = 1;
    public static PlacedFeature RUBY_ORE_GEN;
    
    // Deepslate Ruby Ore
    public static final int DEEPSLATE_RUBY_ORE_VEINSIZE = 4;
    public static final int DEEPSLATE_RUBY_ORE_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_RUBY_ORE_GEN;

    // Gemspark Ore
    public static final int GEMSPARK_ORE_VEINSIZE = 6;
    public static final int GEMSPARK_ORE_AMOUNT = 2;
    public static PlacedFeature GEMSPARK_ORE_GEN;
    
    // Deepslate Gemspark Ore
    public static final int DEEPSLATE_GEMSPARK_ORE_VEINSIZE = 6;
    public static final int DEEPSLATE_GEMSPARK_ORE_AMOUNT = 2;
    public static PlacedFeature DEEPSLATE_GEMSPARK_ORE_GEN;

    // Onyx Ore
    public static final int ONYX_ORE_VEINSIZE = 4;
    public static final int ONYX_ORE_AMOUNT = 1;
    public static PlacedFeature ONYX_ORE_GEN;

    // Experience Ore
    public static final int EXPERIENCE_ORE_VEINSIZE = 8;
    public static final int EXPERIENCE_ORE_AMOUNT = 6;
    public static PlacedFeature EXPERIENCE_ORE_GEN;
    
    // Deepslate Experience Ore
    public static final int DEEPSLATE_EXPERIENCE_ORE_VEINSIZE = 8;
    public static final int DEEPSLATE_EXPERIENCE_ORE_AMOUNT = 6;
    public static PlacedFeature DEEPSLATE_EXPERIENCE_ORE_GEN;
    
    // Nether Experience Ore
    public static final int NETHER_EXPERIENCE_ORE_VEINSIZE = 8;
    public static final int NETHER_EXPERIENCE_ORE_AMOUNT = 6;
    public static PlacedFeature NETHER_EXPERIENCE_ORE_GEN;
    
    // End Experience Ore
    public static final int END_EXPERIENCE_ORE_VEINSIZE = 8;
    public static final int END_EXPERIENCE_ORE_AMOUNT = 3;
    public static PlacedFeature END_EXPERIENCE_ORE_GEN;

    // Bone Fossil
    public static final int BONE_FOSSIL_VEINSIZE = 4;
    public static final int BONE_FOSSIL_AMOUNT = 1;
    public static PlacedFeature BONE_FOSSIL_GEN;
    
    // Deepslate Bone Fossil
    public static final int DEEPSLATE_BONE_FOSSIL_VEINSIZE = 4;
    public static final int DEEPSLATE_BONE_FOSSIL_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_BONE_FOSSIL_GEN;
    
    // Nether Bone Fossil
    public static final int NETHER_BONE_FOSSIL_VEINSIZE = 4;
    public static final int NETHER_BONE_FOSSIL_AMOUNT = 1;
    public static PlacedFeature NETHER_BONE_FOSSIL_GEN;
    
    // End Bone Fossil
    public static final int END_BONE_FOSSIL_VEINSIZE = 4;
    public static final int END_BONE_FOSSIL_AMOUNT = 1;
    public static PlacedFeature END_BONE_FOSSIL_GEN;
    
    // Rib Fossil
    public static final int RIB_FOSSIL_VEINSIZE = 4;
    public static final int RIB_FOSSIL_AMOUNT = 1;
    public static PlacedFeature RIB_FOSSIL_GEN;
    
    // Deepslate Rib Fossil
    public static final int DEEPSLATE_RIB_FOSSIL_VEINSIZE = 4;
    public static final int DEEPSLATE_RIB_FOSSIL_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_RIB_FOSSIL_GEN;
    
    // Nether Rib Fossil
    public static final int NETHER_RIB_FOSSIL_VEINSIZE = 4;
    public static final int NETHER_RIB_FOSSIL_AMOUNT = 1;
    public static PlacedFeature NETHER_RIB_FOSSIL_GEN;
    
    // End Rib Fossil
    public static final int END_RIB_FOSSIL_VEINSIZE = 4;
    public static final int END_RIB_FOSSIL_AMOUNT = 1;
    public static PlacedFeature END_RIB_FOSSIL_GEN;
    
    // Skull Fossil
    public static final int SKULL_FOSSIL_VEINSIZE = 4;
    public static final int SKULL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature SKULL_FOSSIL_GEN;
    
    // Deepslate Skull Fossil
    public static final int DEEPSLATE_SKULL_FOSSIL_VEINSIZE = 4;
    public static final int DEEPSLATE_SKULL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_SKULL_FOSSIL_GEN;
    
    // Nether Skull Fossil
    public static final int NETHER_SKULL_FOSSIL_VEINSIZE = 4;
    public static final int NETHER_SKULL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature NETHER_SKULL_FOSSIL_GEN;
    
    // End Skull Fossil
    public static final int END_SKULL_FOSSIL_VEINSIZE = 4;
    public static final int END_SKULL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature END_SKULL_FOSSIL_GEN;
    
    // Fish Fossil
    public static final int FISH_FOSSIL_VEINSIZE = 4;
    public static final int FISH_FOSSIL_AMOUNT = 1;
    public static PlacedFeature FISH_FOSSIL_GEN;
    
    // Deepslate Fish Fossil
    public static final int DEEPSLATE_FISH_FOSSIL_VEINSIZE = 4;
    public static final int DEEPSLATE_FISH_FOSSIL_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_FISH_FOSSIL_GEN;
    
    // Nether Fish Fossil
    public static final int NETHER_FISH_FOSSIL_VEINSIZE = 4;
    public static final int NETHER_FISH_FOSSIL_AMOUNT = 1;
    public static PlacedFeature NETHER_FISH_FOSSIL_GEN;
    
    // End Fish Fossil
    public static final int END_FISH_FOSSIL_VEINSIZE = 4;
    public static final int END_FISH_FOSSIL_AMOUNT = 1;
    public static PlacedFeature END_FISH_FOSSIL_GEN;
    
    // Shell Fossil
    public static final int SHELL_FOSSIL_VEINSIZE = 4;
    public static final int SHELL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature SHELL_FOSSIL_GEN;
    
    // Deepslate Shell Fossil
    public static final int DEEPSLATE_SHELL_FOSSIL_VEINSIZE = 4;
    public static final int DEEPSLATE_SHELL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature DEEPSLATE_SHELL_FOSSIL_GEN;
    
    // Nether Shell Fossil
    public static final int NETHER_SHELL_FOSSIL_VEINSIZE = 4;
    public static final int NETHER_SHELL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature NETHER_SHELL_FOSSIL_GEN;
    
    // End Shell Fossil
    public static final int END_SHELL_FOSSIL_VEINSIZE = 4;
    public static final int END_SHELL_FOSSIL_AMOUNT = 1;
    public static PlacedFeature END_SHELL_FOSSIL_GEN;

    public static final RuleTest IN_ENDSTONE = new TagMatchTest(Tags.Blocks.END_STONES);

    public static void registerConfiguredFeatures() {
        
        // Topaz Ore
        OreConfiguration topazOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState(), TOPAZ_ORE_VEINSIZE);
        TOPAZ_ORE_GEN = registerPlacedFeature("topaz_ore", Feature.ORE.configured(topazOreConfig),
                CountPlacement.of(TOPAZ_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16)));
        
        // Deepslate Topaz Ore
        OreConfiguration deepslateTopazOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState(), DEEPSLATE_TOPAZ_ORE_VEINSIZE);
        DEEPSLATE_TOPAZ_ORE_GEN = registerPlacedFeature("deepslate_topaz_ore", Feature.ORE.configured(deepslateTopazOreConfig),
                CountPlacement.of(DEEPSLATE_TOPAZ_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));
        
        // Sapphire Ore
        OreConfiguration sapphireOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), SAPPHIRE_ORE_VEINSIZE);
        SAPPHIRE_ORE_GEN = registerPlacedFeature("sapphire_ore", Feature.ORE.configured(sapphireOreConfig),
                CountPlacement.of(SAPPHIRE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16)));
        
        // Sapphire Ore
        OreConfiguration deepslateSapphireOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState(), DEEPSLATE_SAPPHIRE_ORE_VEINSIZE);
        DEEPSLATE_SAPPHIRE_ORE_GEN = registerPlacedFeature("deepslate_sapphire_ore", Feature.ORE.configured(deepslateSapphireOreConfig),
                CountPlacement.of(DEEPSLATE_SAPPHIRE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));
        
        // Ruby Ore
        OreConfiguration rubyOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState(), RUBY_ORE_VEINSIZE);
        RUBY_ORE_GEN = registerPlacedFeature("ruby_ore", Feature.ORE.configured(rubyOreConfig),
                CountPlacement.of(RUBY_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(16)));
        
        // Deepslate Ruby Ore
        OreConfiguration deepslateRubyOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState(), DEEPSLATE_RUBY_ORE_VEINSIZE);
        DEEPSLATE_RUBY_ORE_GEN = registerPlacedFeature("deepslate_ruby_ore", Feature.ORE.configured(deepslateRubyOreConfig),
                CountPlacement.of(DEEPSLATE_RUBY_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Gemspark Ore
        OreConfiguration gemsparkOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GEMSPARK_ORE.get().defaultBlockState(), GEMSPARK_ORE_VEINSIZE);
        GEMSPARK_ORE_GEN = registerPlacedFeature("gemspark_ore", Feature.ORE.configured(gemsparkOreConfig),
                CountPlacement.of(GEMSPARK_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(32)));

        // Deepslate Gemspark Ore
        OreConfiguration deepslateGemsparkOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_GEMSPARK_ORE.get().defaultBlockState(), DEEPSLATE_GEMSPARK_ORE_VEINSIZE);
        DEEPSLATE_GEMSPARK_ORE_GEN = registerPlacedFeature("deepslate_gemspark_ore", Feature.ORE.configured(deepslateGemsparkOreConfig),
                CountPlacement.of(DEEPSLATE_GEMSPARK_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Onyx Ore
        OreConfiguration onyxOreConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.ONYX_ORE.get().defaultBlockState(), ONYX_ORE_VEINSIZE);
        ONYX_ORE_GEN = registerPlacedFeature("onyx_ore", Feature.ORE.configured(onyxOreConfig),
                CountPlacement.of(ONYX_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Experience Ore
        OreConfiguration experienceOreConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EXPERIENCE_ORE.get().defaultBlockState(), EXPERIENCE_ORE_VEINSIZE);
        EXPERIENCE_ORE_GEN = registerPlacedFeature("experience_ore", Feature.ORE.configured(experienceOreConfig),
                CountPlacement.of(EXPERIENCE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Experience Ore
        OreConfiguration deepslateExperienceOreConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState(), DEEPSLATE_EXPERIENCE_ORE_VEINSIZE);
        DEEPSLATE_EXPERIENCE_ORE_GEN = registerPlacedFeature("deepslate_experience_ore", Feature.ORE.configured(deepslateExperienceOreConfig),
                CountPlacement.of(DEEPSLATE_EXPERIENCE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Experience Ore
        OreConfiguration netherExperienceOreConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_EXPERIENCE_ORE.get().defaultBlockState(), NETHER_EXPERIENCE_ORE_VEINSIZE);
        NETHER_EXPERIENCE_ORE_GEN = registerPlacedFeature("nether_experience_ore", Feature.ORE.configured(netherExperienceOreConfig),
                CountPlacement.of(NETHER_EXPERIENCE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Experience Ore
        OreConfiguration endExperienceOreConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_EXPERIENCE_ORE.get().defaultBlockState(), END_EXPERIENCE_ORE_VEINSIZE);
        END_EXPERIENCE_ORE_GEN = registerPlacedFeature("end_experience_ore", Feature.ORE.configured(endExperienceOreConfig),
                CountPlacement.of(END_EXPERIENCE_ORE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Bone Fossil
        OreConfiguration boneFossilConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BONE_FOSSIL.get().defaultBlockState(), BONE_FOSSIL_VEINSIZE);
        BONE_FOSSIL_GEN = registerPlacedFeature("bone_fossil", Feature.ORE.configured(boneFossilConfig),
                CountPlacement.of(BONE_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Bone Fossil
        OreConfiguration deepslateBoneFossilConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BONE_FOSSIL.get().defaultBlockState(), DEEPSLATE_BONE_FOSSIL_VEINSIZE);
        DEEPSLATE_BONE_FOSSIL_GEN = registerPlacedFeature("deepslate_bone_fossil", Feature.ORE.configured(deepslateBoneFossilConfig),
                CountPlacement.of(DEEPSLATE_BONE_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Bone Fossil
        OreConfiguration netherBoneFossilConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_BONE_FOSSIL.get().defaultBlockState(), NETHER_BONE_FOSSIL_VEINSIZE);
        NETHER_BONE_FOSSIL_GEN = registerPlacedFeature("nether_bone_fossil", Feature.ORE.configured(netherBoneFossilConfig),
                CountPlacement.of(NETHER_BONE_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Bone Fossil
        OreConfiguration endBoneFossilConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_BONE_FOSSIL.get().defaultBlockState(), END_BONE_FOSSIL_VEINSIZE);
        END_BONE_FOSSIL_GEN = registerPlacedFeature("end_bone_fossil", Feature.ORE.configured(endBoneFossilConfig),
                CountPlacement.of(END_BONE_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Rib Fossil
        OreConfiguration ribFossilConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RIB_FOSSIL.get().defaultBlockState(), RIB_FOSSIL_VEINSIZE);
        RIB_FOSSIL_GEN = registerPlacedFeature("rib_fossil", Feature.ORE.configured(ribFossilConfig),
                CountPlacement.of(RIB_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Rib Fossil
        OreConfiguration deepslateRibFossilConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RIB_FOSSIL.get().defaultBlockState(), DEEPSLATE_RIB_FOSSIL_VEINSIZE);
        DEEPSLATE_RIB_FOSSIL_GEN = registerPlacedFeature("deepslate_rib_fossil", Feature.ORE.configured(deepslateRibFossilConfig),
                CountPlacement.of(DEEPSLATE_RIB_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Rib Fossil
        OreConfiguration netherRibFossilConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_RIB_FOSSIL.get().defaultBlockState(), NETHER_RIB_FOSSIL_VEINSIZE);
        NETHER_RIB_FOSSIL_GEN = registerPlacedFeature("nether_rib_fossil", Feature.ORE.configured(netherRibFossilConfig),
                CountPlacement.of(NETHER_RIB_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Rib Fossil
        OreConfiguration endRibFossilConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_RIB_FOSSIL.get().defaultBlockState(), END_RIB_FOSSIL_VEINSIZE);
        END_RIB_FOSSIL_GEN = registerPlacedFeature("end_rib_fossil", Feature.ORE.configured(endRibFossilConfig),
                CountPlacement.of(END_RIB_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Skull Fossil
        OreConfiguration skullFossilConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SKULL_FOSSIL.get().defaultBlockState(), SKULL_FOSSIL_VEINSIZE);
        SKULL_FOSSIL_GEN = registerPlacedFeature("skull_fossil", Feature.ORE.configured(skullFossilConfig),
                CountPlacement.of(SKULL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Skull Fossil
        OreConfiguration deepslateSkullFossilConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get().defaultBlockState(), DEEPSLATE_SKULL_FOSSIL_VEINSIZE);
        DEEPSLATE_SKULL_FOSSIL_GEN = registerPlacedFeature("deepslate_skull_fossil", Feature.ORE.configured(deepslateSkullFossilConfig),
                CountPlacement.of(DEEPSLATE_SKULL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Skull Fossil
        OreConfiguration netherSkullFossilConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SKULL_FOSSIL.get().defaultBlockState(), NETHER_SKULL_FOSSIL_VEINSIZE);
        NETHER_SKULL_FOSSIL_GEN = registerPlacedFeature("nether_skull_fossil", Feature.ORE.configured(netherSkullFossilConfig),
                CountPlacement.of(NETHER_SKULL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Skull Fossil
        OreConfiguration endSkullFossilConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_SKULL_FOSSIL.get().defaultBlockState(), END_SKULL_FOSSIL_VEINSIZE);
        END_SKULL_FOSSIL_GEN = registerPlacedFeature("end_skull_fossil", Feature.ORE.configured(endSkullFossilConfig),
                CountPlacement.of(END_SKULL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Fish Fossil
        OreConfiguration fishFossilConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FISH_FOSSIL.get().defaultBlockState(), FISH_FOSSIL_VEINSIZE);
        FISH_FOSSIL_GEN = registerPlacedFeature("fish_fossil", Feature.ORE.configured(fishFossilConfig),
                CountPlacement.of(FISH_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Fish Fossil
        OreConfiguration deepslateFishFossilConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_FISH_FOSSIL.get().defaultBlockState(), DEEPSLATE_FISH_FOSSIL_VEINSIZE);
        DEEPSLATE_FISH_FOSSIL_GEN = registerPlacedFeature("deepslate_fish_fossil", Feature.ORE.configured(deepslateFishFossilConfig),
                CountPlacement.of(DEEPSLATE_FISH_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Fish Fossil
        OreConfiguration netherFishFossilConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_FISH_FOSSIL.get().defaultBlockState(), NETHER_FISH_FOSSIL_VEINSIZE);
        NETHER_FISH_FOSSIL_GEN = registerPlacedFeature("nether_fish_fossil", Feature.ORE.configured(netherFishFossilConfig),
                CountPlacement.of(NETHER_FISH_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Fish Fossil
        OreConfiguration endFishFossilConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_FISH_FOSSIL.get().defaultBlockState(), END_FISH_FOSSIL_VEINSIZE);
        END_FISH_FOSSIL_GEN = registerPlacedFeature("end_fish_fossil", Feature.ORE.configured(endFishFossilConfig),
                CountPlacement.of(END_FISH_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // Shell Fossil
        OreConfiguration shellFossilConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SHELL_FOSSIL.get().defaultBlockState(), SHELL_FOSSIL_VEINSIZE);
        SHELL_FOSSIL_GEN = registerPlacedFeature("shell_fossil", Feature.ORE.configured(shellFossilConfig),
                CountPlacement.of(SHELL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256)));

        // Deepslate Shell Fossil
        OreConfiguration deepslateShellFossilConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get().defaultBlockState(), DEEPSLATE_SHELL_FOSSIL_VEINSIZE);
        DEEPSLATE_SHELL_FOSSIL_GEN = registerPlacedFeature("deepslate_shell_fossil", Feature.ORE.configured(deepslateShellFossilConfig),
                CountPlacement.of(DEEPSLATE_SHELL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(64)));

        // Nether Shell Fossil
        OreConfiguration netherShellFossilConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SHELL_FOSSIL.get().defaultBlockState(), NETHER_SHELL_FOSSIL_VEINSIZE);
        NETHER_SHELL_FOSSIL_GEN = registerPlacedFeature("nether_shell_fossil", Feature.ORE.configured(netherShellFossilConfig),
                CountPlacement.of(NETHER_SHELL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));

        // End Shell Fossil
        OreConfiguration endShellFossilConfig = new OreConfiguration(IN_ENDSTONE, ModBlocks.END_SHELL_FOSSIL.get().defaultBlockState(), END_SHELL_FOSSIL_VEINSIZE);
        END_SHELL_FOSSIL_GEN = registerPlacedFeature("end_shell_fossil", Feature.ORE.configured(endShellFossilConfig),
                CountPlacement.of(END_SHELL_FOSSIL_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName), feature).placed(placementModifiers);
        return PlacementUtils.register(registryName, placed);
    }

    public static void generateOre(BiomeLoadingEvent event) {
        
        // Nether Ores
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_EXPERIENCE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_BONE_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_RIB_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_SKULL_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_FISH_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_SHELL_FOSSIL_GEN);
        
        // End Ores
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ONYX_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_EXPERIENCE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_BONE_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_RIB_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_SKULL_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_FISH_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, END_SHELL_FOSSIL_GEN);
        
        // Overworld Ores
        } else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TOPAZ_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_TOPAZ_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SAPPHIRE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_SAPPHIRE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, RUBY_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_RUBY_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, GEMSPARK_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_GEMSPARK_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, EXPERIENCE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_EXPERIENCE_ORE_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, BONE_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_BONE_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, RIB_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_RIB_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SKULL_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_SKULL_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, FISH_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_FISH_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SHELL_FOSSIL_GEN);
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_SHELL_FOSSIL_GEN);
        }
    }

}
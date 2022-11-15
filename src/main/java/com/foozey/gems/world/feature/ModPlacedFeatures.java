package com.foozey.gems.world.feature;

import com.foozey.gems.Gems;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    // Registers
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Gems.MOD_ID);


    // Ore placement (veins per chunk, minimum y-value, maximum y-value)
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Ore
    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_PLACED = PLACED_FEATURES.register("topaz_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-96), VerticalAnchor.absolute(0)))));

    // Sapphire Ore
    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("sapphire_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-96), VerticalAnchor.absolute(0)))));

    // Ruby Ore
    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.RUBY_ORE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.absolute(-96), VerticalAnchor.absolute(0)))));

    // Onyx Ore
    public static final RegistryObject<PlacedFeature> ONYX_ORE_PLACED = PLACED_FEATURES.register("onyx_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.ONYX_ORE.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Experience Ore
    public static final RegistryObject<PlacedFeature> EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("experience_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.EXPERIENCE_ORE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Experience Ore
    public static final RegistryObject<PlacedFeature> NETHER_EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("nether_experience_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_EXPERIENCE_ORE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Experience Ore
    public static final RegistryObject<PlacedFeature> END_EXPERIENCE_ORE_PLACED = PLACED_FEATURES.register("end_experience_ore_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_EXPERIENCE_ORE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Bone Fossil
    public static final RegistryObject<PlacedFeature> BONE_FOSSIL_PLACED = PLACED_FEATURES.register("bone_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.BONE_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Bone Fossil
    public static final RegistryObject<PlacedFeature> NETHER_BONE_FOSSIL_PLACED = PLACED_FEATURES.register("nether_bone_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_BONE_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Bone Fossil
    public static final RegistryObject<PlacedFeature> END_BONE_FOSSIL_PLACED = PLACED_FEATURES.register("end_bone_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_BONE_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Rib Fossil
    public static final RegistryObject<PlacedFeature> RIB_FOSSIL_PLACED = PLACED_FEATURES.register("rib_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.RIB_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Rib Fossil
    public static final RegistryObject<PlacedFeature> NETHER_RIB_FOSSIL_PLACED = PLACED_FEATURES.register("nether_rib_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_RIB_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Rib Fossil
    public static final RegistryObject<PlacedFeature> END_RIB_FOSSIL_PLACED = PLACED_FEATURES.register("end_rib_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_RIB_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Skull Fossil
    public static final RegistryObject<PlacedFeature> SKULL_FOSSIL_PLACED = PLACED_FEATURES.register("skull_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.SKULL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Skull Fossil
    public static final RegistryObject<PlacedFeature> NETHER_SKULL_FOSSIL_PLACED = PLACED_FEATURES.register("nether_skull_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_SKULL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Skull Fossil
    public static final RegistryObject<PlacedFeature> END_SKULL_FOSSIL_PLACED = PLACED_FEATURES.register("end_skull_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_SKULL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Fish Fossil
    public static final RegistryObject<PlacedFeature> FISH_FOSSIL_PLACED = PLACED_FEATURES.register("fish_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.FISH_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Fish Fossil
    public static final RegistryObject<PlacedFeature> NETHER_FISH_FOSSIL_PLACED = PLACED_FEATURES.register("nether_fish_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_FISH_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Fish Fossil
    public static final RegistryObject<PlacedFeature> END_FISH_FOSSIL_PLACED = PLACED_FEATURES.register("end_fish_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_FISH_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Shell Fossil
    public static final RegistryObject<PlacedFeature> SHELL_FOSSIL_PLACED = PLACED_FEATURES.register("shell_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.SHELL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // Nether Shell Fossil
    public static final RegistryObject<PlacedFeature> NETHER_SHELL_FOSSIL_PLACED = PLACED_FEATURES.register("nether_shell_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.NETHER_SHELL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));

    // End Shell Fossil
    public static final RegistryObject<PlacedFeature> END_SHELL_FOSSIL_PLACED = PLACED_FEATURES.register("end_shell_fossil_placed", () ->
            new PlacedFeature(ModConfiguredFeatures.END_SHELL_FOSSIL.getHolder().get(), commonOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320)))));


    // Placement types
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Base
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    // Common
    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    // Rare
    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }

}

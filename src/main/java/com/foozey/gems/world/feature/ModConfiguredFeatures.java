package com.foozey.gems.world.feature;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    // Registers
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Gems.MOD_ID);


    // Ore configurations
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> TOPAZ_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())));

    // Sapphire Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> SAPPHIRE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())));

    // Ruby Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

    // Onyx Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ONYX_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ONYX_ORE.get().defaultBlockState())));

    // Experience Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EXPERIENCE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState())));

    // Nether Experience Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.EXPERIENCE_ORE.get().defaultBlockState())));

    // End Experience Ore
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_EXPERIENCE_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_EXPERIENCE_ORE.get().defaultBlockState())));

    // Bone Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> BONE_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BONE_FOSSIL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BONE_FOSSIL.get().defaultBlockState())));

    // Nether Bone Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_BONE_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_BONE_FOSSIL.get().defaultBlockState())));

    // End Bone Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_BONE_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_BONE_FOSSIL.get().defaultBlockState())));

    // Rib Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> RIB_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RIB_FOSSIL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RIB_FOSSIL.get().defaultBlockState())));

    // Nether Rib Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RIB_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_RIB_FOSSIL.get().defaultBlockState())));

    // End Rib Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_RIB_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_RIB_FOSSIL.get().defaultBlockState())));

    // Skull Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> SKULL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SKULL_FOSSIL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get().defaultBlockState())));

    // Nether Skull Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SKULL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SKULL_FOSSIL.get().defaultBlockState())));

    // End Skull Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_SKULL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_SKULL_FOSSIL.get().defaultBlockState())));

    // Fish Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> FISH_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FISH_FOSSIL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_FISH_FOSSIL.get().defaultBlockState())));

    // Nether Fish Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_FISH_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_FISH_FOSSIL.get().defaultBlockState())));

    // End Fish Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_FISH_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_FISH_FOSSIL.get().defaultBlockState())));

    // Shell Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> SHELL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SHELL_FOSSIL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get().defaultBlockState())));

    // Nether Shell Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_SHELL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHER_SHELL_FOSSIL.get().defaultBlockState())));

    // End Shell Fossil
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_SHELL_FOSSILS = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.END_SHELL_FOSSIL.get().defaultBlockState())));


    // Ore registry (vein size)
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_ORE = CONFIGURED_FEATURES.register("topaz_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TOPAZ_ORES.get(), 4)));

    // Sapphire Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = CONFIGURED_FEATURES.register("sapphire_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SAPPHIRE_ORES.get(), 4)));

    // Ruby Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORE = CONFIGURED_FEATURES.register("ruby_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_ORES.get(), 4)));

    // Onyx Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> ONYX_ORE = CONFIGURED_FEATURES.register("onyx_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ONYX_ORES.get(), 4)));

    // Experience Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> EXPERIENCE_ORE = CONFIGURED_FEATURES.register("experience_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(EXPERIENCE_ORES.get(), 8)));

    // Nether Experience Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_EXPERIENCE_ORE = CONFIGURED_FEATURES.register("nether_experience_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_EXPERIENCE_ORES.get(), 8)));

    // End Experience Ore
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_EXPERIENCE_ORE = CONFIGURED_FEATURES.register("end_experience_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_EXPERIENCE_ORES.get(), 8)));

    // Bone Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> BONE_FOSSIL = CONFIGURED_FEATURES.register("bone_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(BONE_FOSSILS.get(), 4)));

    // Nether Bone Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_BONE_FOSSIL = CONFIGURED_FEATURES.register("nether_bone_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_BONE_FOSSILS.get(), 4)));

    // End Bone Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_BONE_FOSSIL = CONFIGURED_FEATURES.register("end_bone_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_BONE_FOSSILS.get(), 4)));

    // Rib Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> RIB_FOSSIL = CONFIGURED_FEATURES.register("rib_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RIB_FOSSILS.get(), 4)));

    // Nether Rib Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_RIB_FOSSIL = CONFIGURED_FEATURES.register("nether_rib_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_RIB_FOSSILS.get(), 4)));

    // End Rib Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_RIB_FOSSIL = CONFIGURED_FEATURES.register("end_rib_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_RIB_FOSSILS.get(), 4)));

    // Skull Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> SKULL_FOSSIL = CONFIGURED_FEATURES.register("skull_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SKULL_FOSSILS.get(), 4)));

    // Nether Skull Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_SKULL_FOSSIL = CONFIGURED_FEATURES.register("nether_skull_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_SKULL_FOSSILS.get(), 4)));

    // End Skull Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_SKULL_FOSSIL = CONFIGURED_FEATURES.register("end_skull_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_SKULL_FOSSILS.get(), 4)));

    // Fish Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> FISH_FOSSIL = CONFIGURED_FEATURES.register("fish_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(FISH_FOSSILS.get(), 4)));

    // Nether Fish Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_FISH_FOSSIL = CONFIGURED_FEATURES.register("nether_fish_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_FISH_FOSSILS.get(), 4)));

    // End Fish Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_FISH_FOSSIL = CONFIGURED_FEATURES.register("end_fish_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_FISH_FOSSILS.get(), 4)));

    // Shell Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> SHELL_FOSSIL = CONFIGURED_FEATURES.register("shell_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SHELL_FOSSILS.get(), 4)));

    // Nether Shell Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_SHELL_FOSSIL = CONFIGURED_FEATURES.register("nether_shell_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_SHELL_FOSSILS.get(), 4)));

    // End Shell Fossil
    public static final RegistryObject<ConfiguredFeature<?, ?>> END_SHELL_FOSSIL = CONFIGURED_FEATURES.register("end_shell_fossil", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_SHELL_FOSSILS.get(), 4)));

}

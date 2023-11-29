package com.foozey.gems.data.registries;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_ORE = registerKey("topaz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ONYX_ORE = registerKey("onyx_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EXPERIENCE_ORE = registerKey("experience_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EXPERIENCE_ORE = registerKey("nether_experience_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_EXPERIENCE_ORE = registerKey("end_experience_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BONE_FOSSIL = registerKey("bone_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_BONE_FOSSIL = registerKey("nether_bone_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_BONE_FOSSIL = registerKey("end_bone_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RIB_FOSSIL = registerKey("rib_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RIB_FOSSIL = registerKey("nether_rib_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RIB_FOSSIL = registerKey("end_rib_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SKULL_FOSSIL = registerKey("skull_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SKULL_FOSSIL = registerKey("nether_skull_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SKULL_FOSSIL = registerKey("end_skull_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FISH_FOSSIL = registerKey("fish_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FISH_FOSSIL = registerKey("nether_fish_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_FISH_FOSSIL = registerKey("end_fish_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHELL_FOSSIL = registerKey("shell_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SHELL_FOSSIL = registerKey("nether_shell_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SHELL_FOSSIL = registerKey("end_shell_fossil");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);
        register(context, TOPAZ_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.TOPAZ_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())), 4));
        register(context, SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState())), 4));
        register(context, RUBY_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.RUBY_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())), 4));
        register(context, ONYX_ORE, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.ONYX_ORE.get().defaultBlockState(), 4));
        register(context, EXPERIENCE_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.EXPERIENCE_ORE.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get().defaultBlockState())), 8));
        register(context, NETHER_EXPERIENCE_ORE, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_EXPERIENCE_ORE.get().defaultBlockState(), 8));
        register(context, END_EXPERIENCE_ORE, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_EXPERIENCE_ORE.get().defaultBlockState(), 8));
        register(context, BONE_FOSSIL, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.BONE_FOSSIL.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_BONE_FOSSIL.get().defaultBlockState())), 4));
        register(context, NETHER_BONE_FOSSIL, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_BONE_FOSSIL.get().defaultBlockState(), 4));
        register(context, END_BONE_FOSSIL, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_BONE_FOSSIL.get().defaultBlockState(), 4));
        register(context, RIB_FOSSIL, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.RIB_FOSSIL.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RIB_FOSSIL.get().defaultBlockState())), 4));
        register(context, NETHER_RIB_FOSSIL, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_RIB_FOSSIL.get().defaultBlockState(), 4));
        register(context, END_RIB_FOSSIL, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_RIB_FOSSIL.get().defaultBlockState(), 4));
        register(context, SKULL_FOSSIL, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SKULL_FOSSIL.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get().defaultBlockState())), 4));
        register(context, NETHER_SKULL_FOSSIL, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_SKULL_FOSSIL.get().defaultBlockState(), 4));
        register(context, END_SKULL_FOSSIL, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_SKULL_FOSSIL.get().defaultBlockState(), 4));
        register(context, FISH_FOSSIL, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.FISH_FOSSIL.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_FISH_FOSSIL.get().defaultBlockState())), 4));
        register(context, NETHER_FISH_FOSSIL, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_FISH_FOSSIL.get().defaultBlockState(), 4));
        register(context, END_FISH_FOSSIL, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_FISH_FOSSIL.get().defaultBlockState(), 4));
        register(context, SHELL_FOSSIL, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SHELL_FOSSIL.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get().defaultBlockState())), 4));
        register(context, NETHER_SHELL_FOSSIL, Feature.ORE, new OreConfiguration(netherReplaceables, ModBlocks.NETHER_SHELL_FOSSIL.get().defaultBlockState(), 4));
        register(context, END_SHELL_FOSSIL, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_SHELL_FOSSIL.get().defaultBlockState(), 4));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Gems.rl(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}

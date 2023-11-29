package com.foozey.gems.data.registries;

import com.foozey.gems.Gems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> TOPAZ_ORE = registerKey("topaz_ore");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE = registerKey("sapphire_ore");
    public static final ResourceKey<PlacedFeature> RUBY_ORE = registerKey("ruby_ore");
    public static final ResourceKey<PlacedFeature> ONYX_ORE = registerKey("onyx_ore");
    public static final ResourceKey<PlacedFeature> EXPERIENCE_ORE = registerKey("experience_ore");
    public static final ResourceKey<PlacedFeature> NETHER_EXPERIENCE_ORE = registerKey("nether_experience_ore");
    public static final ResourceKey<PlacedFeature> END_EXPERIENCE_ORE = registerKey("end_experience_ore");
    public static final ResourceKey<PlacedFeature> BONE_FOSSIL = registerKey("bone_fossil");
    public static final ResourceKey<PlacedFeature> NETHER_BONE_FOSSIL = registerKey("nether_bone_fossil");
    public static final ResourceKey<PlacedFeature> END_BONE_FOSSIL = registerKey("end_bone_fossil");
    public static final ResourceKey<PlacedFeature> RIB_FOSSIL = registerKey("rib_fossil");
    public static final ResourceKey<PlacedFeature> NETHER_RIB_FOSSIL = registerKey("nether_rib_fossil");
    public static final ResourceKey<PlacedFeature> END_RIB_FOSSIL = registerKey("end_rib_fossil");
    public static final ResourceKey<PlacedFeature> SKULL_FOSSIL = registerKey("skull_fossil");
    public static final ResourceKey<PlacedFeature> NETHER_SKULL_FOSSIL = registerKey("nether_skull_fossil");
    public static final ResourceKey<PlacedFeature> END_SKULL_FOSSIL = registerKey("end_skull_fossil");
    public static final ResourceKey<PlacedFeature> FISH_FOSSIL = registerKey("fish_fossil");
    public static final ResourceKey<PlacedFeature> NETHER_FISH_FOSSIL = registerKey("nether_fish_fossil");
    public static final ResourceKey<PlacedFeature> END_FISH_FOSSIL = registerKey("end_fish_fossil");
    public static final ResourceKey<PlacedFeature> SHELL_FOSSIL = registerKey("shell_fossil");
    public static final ResourceKey<PlacedFeature> NETHER_SHELL_FOSSIL = registerKey("nether_shell_fossil");
    public static final ResourceKey<PlacedFeature> END_SHELL_FOSSIL = registerKey("end_shell_fossil");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, TOPAZ_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE), orePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, SAPPHIRE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE), orePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, RUBY_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE), orePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, ONYX_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.ONYX_ORE), orePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, EXPERIENCE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.EXPERIENCE_ORE), orePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_EXPERIENCE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_EXPERIENCE_ORE), orePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_EXPERIENCE_ORE, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_EXPERIENCE_ORE), orePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, BONE_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.BONE_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_BONE_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_BONE_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_BONE_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BONE_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, RIB_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.RIB_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_RIB_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RIB_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_RIB_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_RIB_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, SKULL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.SKULL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_SKULL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SKULL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_SKULL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SKULL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, FISH_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.FISH_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_FISH_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_FISH_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_FISH_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_FISH_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, SHELL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.SHELL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NETHER_SHELL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SHELL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, END_SHELL_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SHELL_FOSSIL), orePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Gems.rl(name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static List<PlacementModifier> orePlacement(int count, PlacementModifier heightRange) {
        return List.of(CountPlacement.of(count), InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

}

package com.foozey.gems.data.registries;

import com.foozey.gems.Gems;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> TOPAZ_ORE = registerKey("topaz_ore");
    public static final ResourceKey<BiomeModifier> SAPPHIRE_ORE = registerKey("sapphire_ore");
    public static final ResourceKey<BiomeModifier> RUBY_ORE = registerKey("ruby_ore");
    public static final ResourceKey<BiomeModifier> ONYX_ORE = registerKey("onyx_ore");
    public static final ResourceKey<BiomeModifier> EXPERIENCE_ORE = registerKey("experience_ore");
    public static final ResourceKey<BiomeModifier> NETHER_EXPERIENCE_ORE = registerKey("nether_experience_ore");
    public static final ResourceKey<BiomeModifier> END_EXPERIENCE_ORE = registerKey("end_experience_ore");
    public static final ResourceKey<BiomeModifier> BONE_FOSSIL = registerKey("bone_fossil");
    public static final ResourceKey<BiomeModifier> NETHER_BONE_FOSSIL = registerKey("nether_bone_fossil");
    public static final ResourceKey<BiomeModifier> END_BONE_FOSSIL = registerKey("end_bone_fossil");
    public static final ResourceKey<BiomeModifier> RIB_FOSSIL = registerKey("rib_fossil");
    public static final ResourceKey<BiomeModifier> NETHER_RIB_FOSSIL = registerKey("nether_rib_fossil");
    public static final ResourceKey<BiomeModifier> END_RIB_FOSSIL = registerKey("end_rib_fossil");
    public static final ResourceKey<BiomeModifier> SKULL_FOSSIL = registerKey("skull_fossil");
    public static final ResourceKey<BiomeModifier> NETHER_SKULL_FOSSIL = registerKey("nether_skull_fossil");
    public static final ResourceKey<BiomeModifier> END_SKULL_FOSSIL = registerKey("end_skull_fossil");
    public static final ResourceKey<BiomeModifier> FISH_FOSSIL = registerKey("fish_fossil");
    public static final ResourceKey<BiomeModifier> NETHER_FISH_FOSSIL = registerKey("nether_fish_fossil");
    public static final ResourceKey<BiomeModifier> END_FISH_FOSSIL = registerKey("end_fish_fossil");
    public static final ResourceKey<BiomeModifier> SHELL_FOSSIL = registerKey("shell_fossil");
    public static final ResourceKey<BiomeModifier> NETHER_SHELL_FOSSIL = registerKey("nether_shell_fossil");
    public static final ResourceKey<BiomeModifier> END_SHELL_FOSSIL = registerKey("end_shell_fossil");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        register(context, TOPAZ_ORE, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TOPAZ_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, SAPPHIRE_ORE, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SAPPHIRE_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, RUBY_ORE, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, ONYX_ORE, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ONYX_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, EXPERIENCE_ORE, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EXPERIENCE_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_EXPERIENCE_ORE, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_EXPERIENCE_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_EXPERIENCE_ORE, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_EXPERIENCE_ORE)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, BONE_FOSSIL, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BONE_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_BONE_FOSSIL, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_BONE_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_BONE_FOSSIL, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_BONE_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, RIB_FOSSIL, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RIB_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_RIB_FOSSIL, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RIB_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_RIB_FOSSIL, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RIB_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, SKULL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SKULL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_SKULL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SKULL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_SKULL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SKULL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, FISH_FOSSIL, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.FISH_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_FISH_FOSSIL, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_FISH_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_FISH_FOSSIL, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_FISH_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, SHELL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SHELL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, NETHER_SHELL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SHELL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
        register(context, END_SHELL_FOSSIL, biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SHELL_FOSSIL)), GenerationStep.Decoration.UNDERGROUND_ORES);
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, Gems.rl(name));
    }

    private static void register(BootstapContext<BiomeModifier> context, ResourceKey<BiomeModifier> key, HolderSet<Biome> biome, HolderSet<PlacedFeature> placedFeature, GenerationStep.Decoration generationStep) {
        context.register(key, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biome, placedFeature, generationStep));
    }
    
}

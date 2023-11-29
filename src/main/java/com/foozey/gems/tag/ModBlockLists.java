package com.foozey.gems.tag;

import com.foozey.gems.registry.ModBlocks;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ModBlockLists {

    public static final List<Block> GEM_BLOCKS = List.of(
            ModBlocks.TOPAZ_BLOCK.get(),
            ModBlocks.SAPPHIRE_BLOCK.get(),
            ModBlocks.RUBY_BLOCK.get(),
            ModBlocks.ONYX_BLOCK.get()
    );

    public static final List<Block> TOPAZ_ORES = List.of(
            ModBlocks.TOPAZ_ORE.get(),
            ModBlocks.DEEPSLATE_TOPAZ_ORE.get()
    );

    public static final List<Block> SAPPHIRE_ORES = List.of(
            ModBlocks.SAPPHIRE_ORE.get(),
            ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()
    );

    public static final List<Block> RUBY_ORES = List.of(
            ModBlocks.RUBY_ORE.get(),
            ModBlocks.DEEPSLATE_RUBY_ORE.get()
    );

    public static final List<Block> ONYX_ORES = List.of(
            ModBlocks.ONYX_ORE.get()
    );

    public static final List<Block> EXPERIENCE_ORES = List.of(
            ModBlocks.EXPERIENCE_ORE.get(),
            ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get(),
            ModBlocks.NETHER_EXPERIENCE_ORE.get(),
            ModBlocks.END_EXPERIENCE_ORE.get()
    );

    public static final List<Block> FOSSILS = List.of(
            ModBlocks.BONE_FOSSIL.get(),
            ModBlocks.DEEPSLATE_BONE_FOSSIL.get(),
            ModBlocks.NETHER_BONE_FOSSIL.get(),
            ModBlocks.END_BONE_FOSSIL.get(),
            ModBlocks.RIB_FOSSIL.get(),
            ModBlocks.DEEPSLATE_RIB_FOSSIL.get(),
            ModBlocks.NETHER_RIB_FOSSIL.get(),
            ModBlocks.END_RIB_FOSSIL.get(),
            ModBlocks.SKULL_FOSSIL.get(),
            ModBlocks.DEEPSLATE_SKULL_FOSSIL.get(),
            ModBlocks.NETHER_SKULL_FOSSIL.get(),
            ModBlocks.END_SKULL_FOSSIL.get(),
            ModBlocks.FISH_FOSSIL.get(),
            ModBlocks.DEEPSLATE_FISH_FOSSIL.get(),
            ModBlocks.NETHER_FISH_FOSSIL.get(),
            ModBlocks.END_FISH_FOSSIL.get(),
            ModBlocks.SHELL_FOSSIL.get(),
            ModBlocks.DEEPSLATE_SHELL_FOSSIL.get(),
            ModBlocks.NETHER_SHELL_FOSSIL.get(),
            ModBlocks.END_SHELL_FOSSIL.get()
    );

    public static final List<Block> EMISSIVE_BLOCKS = List.of(
            ModBlocks.EXPERIENCE_ORE.get(),
            ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get(),
            ModBlocks.NETHER_EXPERIENCE_ORE.get(),
            ModBlocks.END_EXPERIENCE_ORE.get(),
            ModBlocks.END_BONE_FOSSIL.get(),
            ModBlocks.END_RIB_FOSSIL.get(),
            ModBlocks.END_SKULL_FOSSIL.get(),
            ModBlocks.END_FISH_FOSSIL.get(),
            ModBlocks.END_SHELL_FOSSIL.get()
    );

}

package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModBlocks;
import com.foozey.gems.tag.ModBlockLists;
import com.foozey.gems.tag.ModBlockTagLists;
import com.foozey.gems.tag.ModBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // minecraft/tags/blocks/mineable/pickaxe.json
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.TOPAZ_BLOCK.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.TOPAZ_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.SAPPHIRE_BLOCK.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.SAPPHIRE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.RUBY_BLOCK.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.RUBY_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.ONYX_BLOCK.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.ONYX_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.EXPERIENCE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_EXPERIENCE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_EXPERIENCE_ORE.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.BONE_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_BONE_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_BONE_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.RIB_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_RIB_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_RIB_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.SKULL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_SKULL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.FISH_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_FISH_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_FISH_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.SHELL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.NETHER_SHELL_FOSSIL.get());
        blockTag(BlockTags.MINEABLE_WITH_PICKAXE, ModBlocks.END_SHELL_FOSSIL.get());

        // minecraft/tags/blocks/needs_stone_tool.json
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.EXPERIENCE_ORE.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_EXPERIENCE_ORE.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_EXPERIENCE_ORE.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.BONE_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_BONE_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_BONE_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.RIB_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_RIB_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_RIB_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.SKULL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_SKULL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.FISH_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_FISH_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_FISH_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.SHELL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.NETHER_SHELL_FOSSIL.get());
        blockTag(BlockTags.NEEDS_STONE_TOOL, ModBlocks.END_SHELL_FOSSIL.get());

        // minecraft/tags/blocks/needs_iron_tool.json
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.TOPAZ_BLOCK.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.TOPAZ_ORE.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.SAPPHIRE_BLOCK.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.SAPPHIRE_ORE.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.RUBY_BLOCK.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.RUBY_ORE.get());
        blockTag(BlockTags.NEEDS_IRON_TOOL, ModBlocks.DEEPSLATE_RUBY_ORE.get());

        // forge/tags/blocks/storage_blocks/topaz.json
        blockTag(ModBlockTags.STORAGE_BLOCKS_TOPAZ, ModBlocks.TOPAZ_BLOCK.get());

        // forge/tags/blocks/storage_blocks/sapphire.json
        blockTag(ModBlockTags.STORAGE_BLOCKS_SAPPHIRE, ModBlocks.SAPPHIRE_BLOCK.get());

        // forge/tags/blocks/storage_blocks/ruby.json
        blockTag(ModBlockTags.STORAGE_BLOCKS_RUBY, ModBlocks.RUBY_BLOCK.get());

        // forge/tags/blocks/storage_blocks/onyx.json
        blockTag(ModBlockTags.STORAGE_BLOCKS_ONYX, ModBlocks.ONYX_BLOCK.get());

        // forge/tags/blocks/ores/topaz.json
        blockTag(ModBlockTags.ORES_TOPAZ, ModBlocks.TOPAZ_ORE.get());
        blockTag(ModBlockTags.ORES_TOPAZ, ModBlocks.DEEPSLATE_TOPAZ_ORE.get());

        // forge/tags/blocks/ores/sapphire.json
        blockTag(ModBlockTags.ORES_SAPPHIRE, ModBlocks.SAPPHIRE_ORE.get());
        blockTag(ModBlockTags.ORES_SAPPHIRE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        // forge/tags/blocks/ores/ruby.json
        blockTag(ModBlockTags.ORES_RUBY, ModBlocks.RUBY_ORE.get());
        blockTag(ModBlockTags.ORES_RUBY, ModBlocks.DEEPSLATE_RUBY_ORE.get());

        // forge/tags/blocks/ores/onyx.json
        blockTag(ModBlockTags.ORES_ONYX, ModBlocks.ONYX_ORE.get());

        // forge/tags/blocks/ores/experience.json
        blockTag(ModBlockTags.ORES_EXPERIENCE, ModBlocks.EXPERIENCE_ORE.get());
        blockTag(ModBlockTags.ORES_EXPERIENCE, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        blockTag(ModBlockTags.ORES_EXPERIENCE, ModBlocks.NETHER_EXPERIENCE_ORE.get());
        blockTag(ModBlockTags.ORES_EXPERIENCE, ModBlocks.END_EXPERIENCE_ORE.get());

        // forge/tags/blocks/ores/fossil.json
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.BONE_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.NETHER_BONE_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.END_BONE_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.RIB_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.NETHER_RIB_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.END_RIB_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.SKULL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.END_SKULL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.FISH_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.NETHER_FISH_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.END_FISH_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.SHELL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.NETHER_SHELL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_FOSSIL, ModBlocks.END_SHELL_FOSSIL.get());

        // forge/tags/blocks/ore_bearing_ground/end_stone.json
        blockTag(ModBlockTags.ORE_BEARING_GROUND_END_STONE, Blocks.END_STONE);

        // forge/tags/blocks/ores_in_ground/stone.json
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.TOPAZ_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.SAPPHIRE_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.RUBY_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_STONE, ModBlocks.SHELL_FOSSIL.get());

        // forge/tags/blocks/ores_in_ground/deepslate.json
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());

        // forge/tags/blocks/ores_in_ground/netherrack.json
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, ModBlocks.NETHER_SHELL_FOSSIL.get());

        // forge/tags/blocks/ores_in_ground/end_stone.json
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.ONYX_ORE.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_EXPERIENCE_ORE.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_BONE_FOSSIL.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_RIB_FOSSIL.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_SKULL_FOSSIL.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_FISH_FOSSIL.get());
        blockTag(ModBlockTags.ORES_IN_GROUND_END_STONE, ModBlocks.END_SHELL_FOSSIL.get());

        // forge/tags/blocks/ore_rates/dense.json
        blockTag(Tags.Blocks.ORE_RATES_DENSE, ModBlocks.EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_DENSE, ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_DENSE, ModBlocks.NETHER_EXPERIENCE_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_DENSE, ModBlocks.END_EXPERIENCE_ORE.get());

        // forge/tags/blocks/ore_rates/singular.json
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.TOPAZ_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.SAPPHIRE_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.RUBY_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.ONYX_ORE.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.NETHER_BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.END_BONE_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.NETHER_RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.END_RIB_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.END_SKULL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.NETHER_FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.END_FISH_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.SHELL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.NETHER_SHELL_FOSSIL.get());
        blockTag(Tags.Blocks.ORE_RATES_SINGULAR, ModBlocks.END_SHELL_FOSSIL.get());

        // forge/tags/blocks/needs_netherite_tool.json
        blockTag(Tags.Blocks.NEEDS_NETHERITE_TOOL, ModBlocks.ONYX_BLOCK.get());
        blockTag(Tags.Blocks.NEEDS_NETHERITE_TOOL, ModBlocks.ONYX_ORE.get());

        // forge/tags/blocks/storage_blocks.json
        blockTagFromTag(Tags.Blocks.STORAGE_BLOCKS, ModBlockTags.STORAGE_BLOCKS_TOPAZ);
        blockTagFromTag(Tags.Blocks.STORAGE_BLOCKS, ModBlockTags.STORAGE_BLOCKS_SAPPHIRE);
        blockTagFromTag(Tags.Blocks.STORAGE_BLOCKS, ModBlockTags.STORAGE_BLOCKS_RUBY);
        blockTagFromTag(Tags.Blocks.STORAGE_BLOCKS, ModBlockTags.STORAGE_BLOCKS_ONYX);

        // forge/tags/blocks/ores.json
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_TOPAZ);
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_SAPPHIRE);
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_RUBY);
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_ONYX);
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_EXPERIENCE);
        blockTagFromTag(Tags.Blocks.ORES, ModBlockTags.ORES_FOSSIL);

        // gems/tags/blocks/storage_blocks/gem_blocks.json
        ModBlockLists.GEM_BLOCKS.forEach(block -> blockTag(ModBlockTags.GEM_BLOCKS, block));

        // gems/tags/blocks/ores/topaz_ores.json
        ModBlockLists.TOPAZ_ORES.forEach(block -> blockTag(ModBlockTags.TOPAZ_ORES, block));

        // gems/tags/blocks/ores/sapphire_ores.json
        ModBlockLists.SAPPHIRE_ORES.forEach(block -> blockTag(ModBlockTags.SAPPHIRE_ORES, block));

        // gems/tags/blocks/ores/ruby_ores.json
        ModBlockLists.RUBY_ORES.forEach(block -> blockTag(ModBlockTags.RUBY_ORES, block));

        // gems/tags/blocks/ores/onyx_ores.json
        ModBlockLists.ONYX_ORES.forEach(block -> blockTag(ModBlockTags.ONYX_ORES, block));

        // gems/tags/blocks/ores/experience_ores.json
        ModBlockLists.EXPERIENCE_ORES.forEach(block -> blockTag(ModBlockTags.EXPERIENCE_ORES, block));

        // gems/tags/blocks/ores/fossils.json
        ModBlockLists.FOSSILS.forEach(block -> blockTag(ModBlockTags.FOSSILS, block));

        // gems/tags/blocks/emissive/emissive_blocks.json
        ModBlockLists.EMISSIVE_BLOCKS.forEach(block -> blockTag(ModBlockTags.EMISSIVE_BLOCKS, block));

        // gems/tags/blocks/storage_blocks.json
        ModBlockTagLists.STORAGE_BLOCKS.forEach(tagKey -> blockTagFromTag(ModBlockTags.STORAGE_BLOCKS, tagKey));

        // gems/tags/blocks/ores.json
        ModBlockTagLists.ORES.forEach(tagKey -> blockTagFromTag(ModBlockTags.ORES, tagKey));

    }

    private void blockTag(TagKey<Block> tagKey, Block block) {
        tag(tagKey).add(block);
    }

    private void blockTagFromTag(TagKey<Block> tagKey, TagKey<Block> block) {
        tag(tagKey).addTag(block);
    }

}

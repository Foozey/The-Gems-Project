package com.foozey.gems.data.loot;

import com.foozey.gems.registry.ModBlocks;
import com.foozey.gems.registry.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootSubProvider extends BlockLootSubProvider {

    public ModBlockLootSubProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        // Blocks
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.ONYX_BLOCK.get());
        dropSelf(ModBlocks.BONE_FOSSIL.get());
        dropSelf(ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        dropSelf(ModBlocks.NETHER_BONE_FOSSIL.get());
        dropSelf(ModBlocks.END_BONE_FOSSIL.get());
        dropSelf(ModBlocks.RIB_FOSSIL.get());
        dropSelf(ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        dropSelf(ModBlocks.NETHER_RIB_FOSSIL.get());
        dropSelf(ModBlocks.END_RIB_FOSSIL.get());
        dropSelf(ModBlocks.SKULL_FOSSIL.get());
        dropSelf(ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        dropSelf(ModBlocks.NETHER_SKULL_FOSSIL.get());
        dropSelf(ModBlocks.END_SKULL_FOSSIL.get());
        dropSelf(ModBlocks.FISH_FOSSIL.get());
        dropSelf(ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        dropSelf(ModBlocks.NETHER_FISH_FOSSIL.get());
        dropSelf(ModBlocks.END_FISH_FOSSIL.get());
        dropSelf(ModBlocks.SHELL_FOSSIL.get());
        dropSelf(ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        dropSelf(ModBlocks.NETHER_SHELL_FOSSIL.get());
        dropSelf(ModBlocks.END_SHELL_FOSSIL.get());

        // Gem Ore
        dropOre(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ_SHARDS.get());
        dropOre(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), ModItems.TOPAZ_SHARDS.get());
        dropOre(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_SHARDS.get());
        dropOre(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.SAPPHIRE_SHARDS.get());
        dropOre(ModBlocks.RUBY_ORE.get(), ModItems.RUBY_SHARDS.get());
        dropOre(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY_SHARDS.get());
        dropOre(ModBlocks.ONYX_ORE.get(), ModItems.ONYX_SHARDS.get());

        // Experience Ore
        dropWhenSilkTouch(ModBlocks.EXPERIENCE_ORE.get());
        dropWhenSilkTouch(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        dropWhenSilkTouch(ModBlocks.NETHER_EXPERIENCE_ORE.get());
        dropWhenSilkTouch(ModBlocks.END_EXPERIENCE_ORE.get());

    }

    private void dropOre(Block oreBlock, Item itemDrop) {
        add(oreBlock, block -> createOreDrop(oreBlock, itemDrop));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}

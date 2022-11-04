package com.foozey.gems.util.tiers;

import com.foozey.gems.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModItemTier {

    // Tool types
    public static final TagKey<Block> NEEDS_TOPAZ_TOOL = BlockTags.create(new ResourceLocation("tag_based_tool_types:needs_topaz_tool"));
    public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = BlockTags.create(new ResourceLocation("tag_based_tool_types:needs_sapphire_tool"));
    public static final TagKey<Block> NEEDS_RUBY_TOOL = BlockTags.create(new ResourceLocation("tag_based_tool_types:needs_ruby_tool"));
    public static final TagKey<Block> NEEDS_DRAGONYX_TOOL = BlockTags.create(new ResourceLocation("tag_based_tool_types:needs_dragonyx_tool"));
    public static final TagKey<Block> NEEDS_EMERALD_TOOL = BlockTags.create(new ResourceLocation("tag_based_tool_types:needs_emerald_tool"));

    // Topaz
    public static final Tier TOPAZ = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 0.0F, 15, NEEDS_TOPAZ_TOOL, () ->
            Ingredient.of(ModItems.TOPAZ.get())), new ResourceLocation("tag_based_tool_types:topaz"), List.of(Tiers.NETHERITE), List.of());

    // Sapphire
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 0.0F, 15, NEEDS_SAPPHIRE_TOOL, () ->
            Ingredient.of(ModItems.SAPPHIRE.get())), new ResourceLocation("tag_based_tool_types:sapphire"), List.of(Tiers.NETHERITE), List.of());

    // Ruby
    public static final Tier RUBY = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 0.0F, 15, NEEDS_RUBY_TOOL, () ->
            Ingredient.of(ModItems.RUBY.get())), new ResourceLocation("tag_based_tool_types:ruby"), List.of(Tiers.NETHERITE), List.of());

    // Dragonyx
    public static final Tier DRAGONYX = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 0.0F, 15, NEEDS_DRAGONYX_TOOL, () ->
            Ingredient.of(ModItems.DRAGONYX_INGOT.get())), new ResourceLocation("tag_based_tool_types:dragonyx"), List.of(Tiers.NETHERITE), List.of());

    // Emerald
    public static final Tier EMERALD = TierSortingRegistry.registerTier(new ForgeTier(2, 250, 6.0F, 0.0F, 30, NEEDS_EMERALD_TOOL, () ->
            Ingredient.of(Items.EMERALD.asItem())), new ResourceLocation("tag_based_tool_types:emerald"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

}

package com.foozey.gems.tag;

import com.foozey.gems.Gems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    // Tags
    public static final TagKey<Block> GEM_BLOCKS = tag("storage_blocks/gem_blocks");
    public static final TagKey<Block> TOPAZ_ORES = tag("ores/topaz_ores");
    public static final TagKey<Block> SAPPHIRE_ORES = tag("ores/sapphire_ores");
    public static final TagKey<Block> RUBY_ORES = tag("ores/ruby_ores");
    public static final TagKey<Block> ONYX_ORES = tag("ores/onyx_ores");
    public static final TagKey<Block> EXPERIENCE_ORES = tag("ores/experience_ores");
    public static final TagKey<Block> FOSSILS = tag("ores/fossils");
    public static final TagKey<Block> EMISSIVE_BLOCKS = tag("emissive/emissive_blocks");
    public static final TagKey<Block> STORAGE_BLOCKS = tag("storage_blocks");
    public static final TagKey<Block> ORES = tag("ores");
    public static final TagKey<Block> NEEDS_TOPAZ_TOOL = tag("needs_topaz_tool");
    public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = tag("needs_sapphire_tool");
    public static final TagKey<Block> NEEDS_RUBY_TOOL = tag("needs_ruby_tool");
    public static final TagKey<Block> NEEDS_DRAGONYX_TOOL = tag("needs_dragonyx_tool");
    public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_emerald_tool");

    // Tags (Forge)
    public static final TagKey<Block> ORE_BEARING_GROUND_END_STONE = forgeTag("ore_bearing_ground/end_stone");
    public static final TagKey<Block> ORES_EXPERIENCE = forgeTag("ores/experience");
    public static final TagKey<Block> ORES_FOSSIL = forgeTag("ores/fossil");
    public static final TagKey<Block> ORES_ONYX = forgeTag("ores/onyx");
    public static final TagKey<Block> ORES_RUBY = forgeTag("ores/ruby");
    public static final TagKey<Block> ORES_SAPPHIRE = forgeTag("ores/sapphire");
    public static final TagKey<Block> ORES_TOPAZ = forgeTag("ores/topaz");
    public static final TagKey<Block> ORES_IN_GROUND_END_STONE = forgeTag("ores_in_ground/end_stone");
    public static final TagKey<Block> STORAGE_BLOCKS_ONYX = forgeTag("storage_blocks/onyx");
    public static final TagKey<Block> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");
    public static final TagKey<Block> STORAGE_BLOCKS_SAPPHIRE = forgeTag("storage_blocks/sapphire");
    public static final TagKey<Block> STORAGE_BLOCKS_TOPAZ = forgeTag("storage_blocks/topaz");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(Gems.rl(name));
    }

    private static TagKey<Block> forgeTag(String name) {
        return BlockTags.create(new ResourceLocation("forge", name));
    }

}

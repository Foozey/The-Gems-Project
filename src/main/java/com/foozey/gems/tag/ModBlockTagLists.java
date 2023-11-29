package com.foozey.gems.tag;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class ModBlockTagLists {

    public static final List<TagKey<Block>> STORAGE_BLOCKS = List.of(
            ModBlockTags.GEM_BLOCKS
    );

    public static final List<TagKey<Block>> ORES = List.of(
            ModBlockTags.TOPAZ_ORES,
            ModBlockTags.SAPPHIRE_ORES,
            ModBlockTags.RUBY_ORES,
            ModBlockTags.ONYX_ORES,
            ModBlockTags.EXPERIENCE_ORES,
            ModBlockTags.FOSSILS
    );

}

package com.foozey.gems.tag;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.List;

public class ModItemTagLists {

    public static final List<TagKey<Item>> MATERIALS = List.of(
            ModItemTags.GEMS,
            ModItemTags.SHARDS,
            ModItemTags.INGOTS
    );

    public static final List<TagKey<Item>> STORAGE_BLOCKS = List.of(
            ModItemTags.GEM_BLOCKS
    );

    public static final List<TagKey<Item>> ORES = List.of(
            ModItemTags.TOPAZ_ORES,
            ModItemTags.SAPPHIRE_ORES,
            ModItemTags.RUBY_ORES,
            ModItemTags.ONYX_ORES,
            ModItemTags.EXPERIENCE_ORES,
            ModItemTags.FOSSILS
    );

    public static final List<TagKey<Item>> TOOLS = List.of(
            ModItemTags.SWORDS,
            ModItemTags.PICKAXES,
            ModItemTags.AXES,
            ModItemTags.SHOVELS,
            ModItemTags.HOES,
            ModItemTags.BOWS,
            ModItemTags.CROSSBOWS,
            ModItemTags.SHIELDS
    );

    public static final List<TagKey<Item>> ARMOR = List.of(
            ModItemTags.HELMETS,
            ModItemTags.CHESTPLATES,
            ModItemTags.LEGGINGS,
            ModItemTags.BOOTS
    );

    public static final List<TagKey<Item>> ARMOR_ENTITIES = List.of(
            ModItemTags.HORSE_ARMOR
    );

    public static final List<TagKey<Item>> CURIOS = List.of(
            ModItemTags.NECKLACES,
            ModItemTags.RINGS
    );

}

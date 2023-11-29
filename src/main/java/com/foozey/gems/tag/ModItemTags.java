package com.foozey.gems.tag;

import com.foozey.gems.Gems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    // Tags
    public static final TagKey<Item> GEMS = tag("materials/gems");
    public static final TagKey<Item> SHARDS = tag("materials/shards");
    public static final TagKey<Item> INGOTS = tag("materials/ingots");
    public static final TagKey<Item> GEM_BLOCKS = tag("storage_blocks/gem_blocks");
    public static final TagKey<Item> TOPAZ_ORES = tag("ores/topaz_ores");
    public static final TagKey<Item> SAPPHIRE_ORES = tag("ores/sapphire_ores");
    public static final TagKey<Item> RUBY_ORES = tag("ores/ruby_ores");
    public static final TagKey<Item> ONYX_ORES = tag("ores/onyx_ores");
    public static final TagKey<Item> EXPERIENCE_ORES = tag("ores/experience_ores");
    public static final TagKey<Item> FOSSILS = tag("ores/fossils");
    public static final TagKey<Item> EMISSIVE_ITEMS = tag("emissive/emissive_items");
    public static final TagKey<Item> EMISSIVE_BLOCKS = tag("emissive/emissive_blocks");
    public static final TagKey<Item> SWORDS = tag("tools/swords");
    public static final TagKey<Item> PICKAXES = tag("tools/pickaxes");
    public static final TagKey<Item> AXES = tag("tools/axes");
    public static final TagKey<Item> SHOVELS = tag("tools/shovels");
    public static final TagKey<Item> HOES = tag("tools/hoes");
    public static final TagKey<Item> HELMETS = tag("armor/helmets");
    public static final TagKey<Item> CHESTPLATES = tag("armor/chestplates");
    public static final TagKey<Item> LEGGINGS = tag("armor/leggings");
    public static final TagKey<Item> BOOTS = tag("armor/boots");
    public static final TagKey<Item> BOWS = tag("tools/bows");
    public static final TagKey<Item> CROSSBOWS = tag("tools/crossbows");
    public static final TagKey<Item> SHIELDS = tag("tools/shields");
    public static final TagKey<Item> HORSE_ARMOR = tag("armor/entities/horse_armor");
    public static final TagKey<Item> SMITHING_TEMPLATES = tag("smithing_templates");
    public static final TagKey<Item> NECKLACES = tag("curios/necklaces");
    public static final TagKey<Item> RINGS = tag("curios/rings");
    public static final TagKey<Item> MATERIALS = tag("materials");
    public static final TagKey<Item> STORAGE_BLOCKS = tag("storage_blocks");
    public static final TagKey<Item> ORES = tag("ores");
    public static final TagKey<Item> TOOLS = tag("tools");
    public static final TagKey<Item> ARMOR = tag("armor");
    public static final TagKey<Item> ARMOR_ENTITIES = tag("armor_entities");
    public static final TagKey<Item> CURIOS = tag("curios");

    // Tags (Forge)
    public static final TagKey<Item> GEMS_ONYX = forgeTag("gems/onyx");
    public static final TagKey<Item> GEMS_RUBY = forgeTag("gems/ruby");
    public static final TagKey<Item> GEMS_SAPPHIRE = forgeTag("gems/sapphire");
    public static final TagKey<Item> GEMS_TOPAZ = forgeTag("gems/topaz");
    public static final TagKey<Item> INGOTS_DRAGONYX = forgeTag("ingots/dragonyx");
    public static final TagKey<Item> ORE_BEARING_GROUND_END_STONE = forgeTag("ore_bearing_ground/end_stone");
    public static final TagKey<Item> ORES_EXPERIENCE = forgeTag("ores/experience");
    public static final TagKey<Item> ORES_FOSSIL = forgeTag("ores/fossil");
    public static final TagKey<Item> ORES_ONYX = forgeTag("ores/onyx");
    public static final TagKey<Item> ORES_RUBY = forgeTag("ores/ruby");
    public static final TagKey<Item> ORES_SAPPHIRE = forgeTag("ores/sapphire");
    public static final TagKey<Item> ORES_TOPAZ = forgeTag("ores/topaz");
    public static final TagKey<Item> ORES_IN_GROUND_END_STONE = forgeTag("ores_in_ground/end_stone");
    public static final TagKey<Item> STORAGE_BLOCKS_ONYX = forgeTag("storage_blocks/onyx");
    public static final TagKey<Item> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");
    public static final TagKey<Item> STORAGE_BLOCKS_SAPPHIRE = forgeTag("storage_blocks/sapphire");
    public static final TagKey<Item> STORAGE_BLOCKS_TOPAZ = forgeTag("storage_blocks/topaz");

    // Tags (Curios)
    public static final TagKey<Item> NECKLACE = curiosTag("necklace");
    public static final TagKey<Item> RING = curiosTag("ring");

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(Gems.rl(name));
    }

    private static TagKey<Item> forgeTag(String name) {
        return ItemTags.create(new ResourceLocation("forge", name));
    }

    private static TagKey<Item> curiosTag(String name) {
        return ItemTags.create(new ResourceLocation("curios", name));
    }

}

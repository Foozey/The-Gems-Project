package com.foozey.gems.tag;

import com.foozey.gems.registry.ModItems;
import net.minecraft.world.item.Item;

import java.util.List;

public class ModItemLists {

    public static final List<Item> GEMS = List.of(
            ModItems.TOPAZ.get(),
            ModItems.SAPPHIRE.get(),
            ModItems.RUBY.get(),
            ModItems.ONYX.get()
    );

    public static final List<Item> SHARDS = List.of(
            ModItems.TOPAZ_SHARDS.get(),
            ModItems.SAPPHIRE_SHARDS.get(),
            ModItems.RUBY_SHARDS.get(),
            ModItems.ONYX_SHARDS.get()
    );

    public static final List<Item> INGOTS = List.of(
            ModItems.DRAGONYX_INGOT.get()
    );

    public static final List<Item> GEM_BLOCKS = List.of(
            ModItems.TOPAZ_BLOCK.get(),
            ModItems.SAPPHIRE_BLOCK.get(),
            ModItems.RUBY_BLOCK.get(),
            ModItems.ONYX_BLOCK.get()
    );

    public static final List<Item> TOPAZ_ORES = List.of(
            ModItems.TOPAZ_ORE.get(),
            ModItems.DEEPSLATE_TOPAZ_ORE.get()
    );

    public static final List<Item> SAPPHIRE_ORES = List.of(
            ModItems.SAPPHIRE_ORE.get(),
            ModItems.DEEPSLATE_SAPPHIRE_ORE.get()
    );

    public static final List<Item> RUBY_ORES = List.of(
            ModItems.RUBY_ORE.get(),
            ModItems.DEEPSLATE_RUBY_ORE.get()
    );

    public static final List<Item> ONYX_ORES = List.of(
            ModItems.ONYX_ORE.get()
    );

    public static final List<Item> EXPERIENCE_ORES = List.of(
            ModItems.EXPERIENCE_ORE.get(),
            ModItems.DEEPSLATE_EXPERIENCE_ORE.get(),
            ModItems.NETHER_EXPERIENCE_ORE.get(),
            ModItems.END_EXPERIENCE_ORE.get()
    );

    public static final List<Item> FOSSILS = List.of(
            ModItems.BONE_FOSSIL.get(),
            ModItems.DEEPSLATE_BONE_FOSSIL.get(),
            ModItems.NETHER_BONE_FOSSIL.get(),
            ModItems.END_BONE_FOSSIL.get(),
            ModItems.RIB_FOSSIL.get(),
            ModItems.DEEPSLATE_RIB_FOSSIL.get(),
            ModItems.NETHER_RIB_FOSSIL.get(),
            ModItems.END_RIB_FOSSIL.get(),
            ModItems.SKULL_FOSSIL.get(),
            ModItems.DEEPSLATE_SKULL_FOSSIL.get(),
            ModItems.NETHER_SKULL_FOSSIL.get(),
            ModItems.END_SKULL_FOSSIL.get(),
            ModItems.FISH_FOSSIL.get(),
            ModItems.DEEPSLATE_FISH_FOSSIL.get(),
            ModItems.NETHER_FISH_FOSSIL.get(),
            ModItems.END_FISH_FOSSIL.get(),
            ModItems.SHELL_FOSSIL.get(),
            ModItems.DEEPSLATE_SHELL_FOSSIL.get(),
            ModItems.NETHER_SHELL_FOSSIL.get(),
            ModItems.END_SHELL_FOSSIL.get()
    );

    public static final List<Item> EMISSIVE_BLOCKS = List.of(
            ModItems.EXPERIENCE_ORE.get(),
            ModItems.DEEPSLATE_EXPERIENCE_ORE.get(),
            ModItems.NETHER_EXPERIENCE_ORE.get(),
            ModItems.END_EXPERIENCE_ORE.get(),
            ModItems.END_BONE_FOSSIL.get(),
            ModItems.END_RIB_FOSSIL.get(),
            ModItems.END_SKULL_FOSSIL.get(),
            ModItems.END_FISH_FOSSIL.get(),
            ModItems.END_SHELL_FOSSIL.get()
    );

    public static final List<Item> EMISSIVE_ITEMS = List.of(
            ModItems.ENDER_MATTER.get(),
            ModItems.DRAGONYX_INGOT.get(),
            ModItems.DRAGONYX_SWORD.get(),
            ModItems.DRAGONYX_PICKAXE.get(),
            ModItems.DRAGONYX_AXE.get(),
            ModItems.DRAGONYX_SHOVEL.get(),
            ModItems.DRAGONYX_HOE.get(),
            ModItems.DRAGONYX_HELMET.get(),
            ModItems.DRAGONYX_CHESTPLATE.get(),
            ModItems.DRAGONYX_LEGGINGS.get(),
            ModItems.DRAGONYX_BOOTS.get(),
            ModItems.DRAGONYX_BOW.get(),
            ModItems.DRAGONYX_CROSSBOW.get(),
            ModItems.DRAGONYX_SHIELD.get(),
            ModItems.DRAGONYX_HORSE_ARMOR.get(),
            ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get()
    );

    public static final List<Item> SWORDS = List.of(
            ModItems.TOPAZ_SWORD.get(),
            ModItems.SAPPHIRE_SWORD.get(),
            ModItems.RUBY_SWORD.get(),
            ModItems.DRAGONYX_SWORD.get(),
            ModItems.EMERALD_SWORD.get()
    );

    public static final List<Item> PICKAXES = List.of(
            ModItems.TOPAZ_PICKAXE.get(),
            ModItems.SAPPHIRE_PICKAXE.get(),
            ModItems.RUBY_PICKAXE.get(),
            ModItems.DRAGONYX_PICKAXE.get(),
            ModItems.EMERALD_PICKAXE.get()
    );

    public static final List<Item> AXES = List.of(
            ModItems.TOPAZ_AXE.get(),
            ModItems.SAPPHIRE_AXE.get(),
            ModItems.RUBY_AXE.get(),
            ModItems.DRAGONYX_AXE.get(),
            ModItems.EMERALD_AXE.get()
    );

    public static final List<Item> SHOVELS = List.of(
            ModItems.TOPAZ_SHOVEL.get(),
            ModItems.SAPPHIRE_SHOVEL.get(),
            ModItems.RUBY_SHOVEL.get(),
            ModItems.DRAGONYX_SHOVEL.get(),
            ModItems.EMERALD_SHOVEL.get()
    );

    public static final List<Item> HOES = List.of(
            ModItems.TOPAZ_HOE.get(),
            ModItems.SAPPHIRE_HOE.get(),
            ModItems.RUBY_HOE.get(),
            ModItems.DRAGONYX_HOE.get(),
            ModItems.EMERALD_HOE.get()
    );

    public static final List<Item> HELMETS = List.of(
            ModItems.TOPAZ_HELMET.get(),
            ModItems.SAPPHIRE_HELMET.get(),
            ModItems.RUBY_HELMET.get(),
            ModItems.DRAGONYX_HELMET.get(),
            ModItems.EMERALD_HELMET.get()
    );

    public static final List<Item> CHESTPLATES = List.of(
            ModItems.TOPAZ_CHESTPLATE.get(),
            ModItems.SAPPHIRE_CHESTPLATE.get(),
            ModItems.RUBY_CHESTPLATE.get(),
            ModItems.DRAGONYX_CHESTPLATE.get(),
            ModItems.EMERALD_CHESTPLATE.get()
    );

    public static final List<Item> LEGGINGS = List.of(
            ModItems.TOPAZ_LEGGINGS.get(),
            ModItems.SAPPHIRE_LEGGINGS.get(),
            ModItems.RUBY_LEGGINGS.get(),
            ModItems.DRAGONYX_LEGGINGS.get(),
            ModItems.EMERALD_LEGGINGS.get()
    );

    public static final List<Item> BOOTS = List.of(
            ModItems.TOPAZ_BOOTS.get(),
            ModItems.SAPPHIRE_BOOTS.get(),
            ModItems.RUBY_BOOTS.get(),
            ModItems.DRAGONYX_BOOTS.get(),
            ModItems.EMERALD_BOOTS.get()
    );

    public static final List<Item> BOWS = List.of(
            ModItems.IRON_BOW.get(),
            ModItems.GOLDEN_BOW.get(),
            ModItems.DIAMOND_BOW.get(),
            ModItems.NETHERITE_BOW.get(),
            ModItems.TOPAZ_BOW.get(),
            ModItems.SAPPHIRE_BOW.get(),
            ModItems.RUBY_BOW.get(),
            ModItems.DRAGONYX_BOW.get(),
            ModItems.EMERALD_BOW.get()
    );

    public static final List<Item> CROSSBOWS = List.of(
            ModItems.IRON_CROSSBOW.get(),
            ModItems.GOLDEN_CROSSBOW.get(),
            ModItems.DIAMOND_CROSSBOW.get(),
            ModItems.NETHERITE_CROSSBOW.get(),
            ModItems.TOPAZ_CROSSBOW.get(),
            ModItems.SAPPHIRE_CROSSBOW.get(),
            ModItems.RUBY_CROSSBOW.get(),
            ModItems.DRAGONYX_CROSSBOW.get(),
            ModItems.EMERALD_CROSSBOW.get()
    );

    public static final List<Item> SHIELDS = List.of(
            ModItems.IRON_SHIELD.get(),
            ModItems.GOLDEN_SHIELD.get(),
            ModItems.DIAMOND_SHIELD.get(),
            ModItems.NETHERITE_SHIELD.get(),
            ModItems.TOPAZ_SHIELD.get(),
            ModItems.SAPPHIRE_SHIELD.get(),
            ModItems.RUBY_SHIELD.get(),
            ModItems.DRAGONYX_SHIELD.get(),
            ModItems.EMERALD_SHIELD.get()
    );

    public static final List<Item> HORSE_ARMOR = List.of(
            ModItems.CHAINMAIL_HORSE_ARMOR.get(),
            ModItems.NETHERITE_HORSE_ARMOR.get(),
            ModItems.TOPAZ_HORSE_ARMOR.get(),
            ModItems.SAPPHIRE_HORSE_ARMOR.get(),
            ModItems.RUBY_HORSE_ARMOR.get(),
            ModItems.DRAGONYX_HORSE_ARMOR.get(),
            ModItems.EMERALD_HORSE_ARMOR.get()
    );

    public static final List<Item> SMITHING_TEMPLATES = List.of(
            ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(),
            ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(),
            ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(),
            ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get()
    );

    public static final List<Item> NECKLACES = List.of(
            ModItems.GOLDEN_NECKLACE.get(),
            ModItems.TOPAZ_NECKLACE.get(),
            ModItems.SAPPHIRE_NECKLACE.get(),
            ModItems.RUBY_NECKLACE.get(),
            ModItems.GEM_NECKLACE.get()
    );

    public static final List<Item> RINGS = List.of(
            ModItems.GOLDEN_RING.get(),
            ModItems.TOPAZ_RING.get(),
            ModItems.SAPPHIRE_RING.get(),
            ModItems.RUBY_RING.get(),
            ModItems.GEM_RING.get()
    );

}

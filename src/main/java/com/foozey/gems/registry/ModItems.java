package com.foozey.gems.registry;

import com.foozey.gems.Gems;
import com.foozey.gems.item.*;
import com.foozey.gems.item.attributes.AttributeModifiers;
import com.foozey.gems.item.shield.ShieldTextures;
import com.foozey.gems.item.tiers.ModArmorMaterials;
import com.foozey.gems.item.tiers.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

import static com.foozey.gems.registry.ModCreativeTabs.addToTab;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gems.MOD_ID);
    public static final DeferredRegister<Item> REPLACE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    // Items
    public static final RegistryObject<Item> TOPAZ = addToTab(ITEMS.register("topaz", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> TOPAZ_SHARDS = addToTab(ITEMS.register("topaz_shards", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SAPPHIRE = addToTab(ITEMS.register("sapphire", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> SAPPHIRE_SHARDS = addToTab(ITEMS.register("sapphire_shards", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RUBY = addToTab(ITEMS.register("ruby", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> RUBY_SHARDS = addToTab(ITEMS.register("ruby_shards", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ONYX = addToTab(ITEMS.register("onyx", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ONYX_SHARDS = addToTab(ITEMS.register("onyx_shards", () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> ENDER_BONES = addToTab(ITEMS.register("ender_bones", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON))));
    public static final RegistryObject<Item> ENDER_SCALES = addToTab(ITEMS.register("ender_scales", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON))));
    public static final RegistryObject<Item> ENDER_MATTER = addToTab(ITEMS.register("ender_matter", () -> new Item(new Item.Properties().rarity(Rarity.RARE))));
    public static final RegistryObject<Item> DRAGONYX_INGOT = addToTab(ITEMS.register("dragonyx_ingot", () -> new Item(new Item.Properties().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> CHAINMAIL = addToTab(ITEMS.register("chainmail", () -> new Item(new Item.Properties())));

    // Blocks
    public static final RegistryObject<Item> TOPAZ_BLOCK = addToTab(ITEMS.register("topaz_block", () -> new BlockItem(ModBlocks.TOPAZ_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> TOPAZ_ORE = addToTab(ITEMS.register("topaz_ore", () -> new BlockItem(ModBlocks.TOPAZ_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_TOPAZ_ORE = addToTab(ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK = addToTab(ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> SAPPHIRE_ORE = addToTab(ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_SAPPHIRE_ORE = addToTab(ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> RUBY_BLOCK = addToTab(ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> RUBY_ORE = addToTab(ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE = addToTab(ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> ONYX_BLOCK = addToTab(ITEMS.register("onyx_block", () -> new BlockItem(ModBlocks.ONYX_BLOCK.get(), new Item.Properties())));
    public static final RegistryObject<Item> ONYX_ORE = addToTab(ITEMS.register("onyx_ore", () -> new BlockItem(ModBlocks.ONYX_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> EXPERIENCE_ORE = addToTab(ITEMS.register("experience_ore", () -> new BlockItem(ModBlocks.EXPERIENCE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_EXPERIENCE_ORE = addToTab(ITEMS.register("deepslate_experience_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_EXPERIENCE_ORE = addToTab(ITEMS.register("nether_experience_ore", () -> new BlockItem(ModBlocks.NETHER_EXPERIENCE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_EXPERIENCE_ORE = addToTab(ITEMS.register("end_experience_ore", () -> new BlockItem(ModBlocks.END_EXPERIENCE_ORE.get(), new Item.Properties())));
    public static final RegistryObject<Item> BONE_FOSSIL = addToTab(ITEMS.register("bone_fossil", () -> new BlockItem(ModBlocks.BONE_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_BONE_FOSSIL = addToTab(ITEMS.register("deepslate_bone_fossil", () -> new BlockItem(ModBlocks.DEEPSLATE_BONE_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_BONE_FOSSIL = addToTab(ITEMS.register("nether_bone_fossil", () -> new BlockItem(ModBlocks.NETHER_BONE_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_BONE_FOSSIL = addToTab(ITEMS.register("end_bone_fossil", () -> new BlockItem(ModBlocks.END_BONE_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> RIB_FOSSIL = addToTab(ITEMS.register("rib_fossil", () -> new BlockItem(ModBlocks.RIB_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_RIB_FOSSIL = addToTab(ITEMS.register("deepslate_rib_fossil", () -> new BlockItem(ModBlocks.DEEPSLATE_RIB_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_RIB_FOSSIL = addToTab(ITEMS.register("nether_rib_fossil", () -> new BlockItem(ModBlocks.NETHER_RIB_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_RIB_FOSSIL = addToTab(ITEMS.register("end_rib_fossil", () -> new BlockItem(ModBlocks.END_RIB_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> SKULL_FOSSIL = addToTab(ITEMS.register("skull_fossil", () -> new BlockItem(ModBlocks.SKULL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_SKULL_FOSSIL = addToTab(ITEMS.register("deepslate_skull_fossil", () -> new BlockItem(ModBlocks.DEEPSLATE_SKULL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_SKULL_FOSSIL = addToTab(ITEMS.register("nether_skull_fossil", () -> new BlockItem(ModBlocks.NETHER_SKULL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_SKULL_FOSSIL = addToTab(ITEMS.register("end_skull_fossil", () -> new BlockItem(ModBlocks.END_SKULL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> FISH_FOSSIL = addToTab(ITEMS.register("fish_fossil", () -> new BlockItem(ModBlocks.FISH_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_FISH_FOSSIL = addToTab(ITEMS.register("deepslate_fish_fossil", () -> new BlockItem(ModBlocks.DEEPSLATE_FISH_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_FISH_FOSSIL = addToTab(ITEMS.register("nether_fish_fossil", () -> new BlockItem(ModBlocks.NETHER_FISH_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_FISH_FOSSIL = addToTab(ITEMS.register("end_fish_fossil", () -> new BlockItem(ModBlocks.END_FISH_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> SHELL_FOSSIL = addToTab(ITEMS.register("shell_fossil", () -> new BlockItem(ModBlocks.SHELL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> DEEPSLATE_SHELL_FOSSIL = addToTab(ITEMS.register("deepslate_shell_fossil", () -> new BlockItem(ModBlocks.DEEPSLATE_SHELL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> NETHER_SHELL_FOSSIL = addToTab(ITEMS.register("nether_shell_fossil", () -> new BlockItem(ModBlocks.NETHER_SHELL_FOSSIL.get(), new Item.Properties())));
    public static final RegistryObject<Item> END_SHELL_FOSSIL = addToTab(ITEMS.register("end_shell_fossil", () -> new BlockItem(ModBlocks.END_SHELL_FOSSIL.get(), new Item.Properties())));

    // Tools
    public static final RegistryObject<Item> TOPAZ_SWORD = addToTab(ITEMS.register("topaz_sword", () -> new ModSwordItem(ModTiers.TOPAZ, 3, -2.4F, AttributeModifiers.TOPAZ_SWORD, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_PICKAXE = addToTab(ITEMS.register("topaz_pickaxe", () -> new ModPickaxeItem(ModTiers.TOPAZ, 1, -2.8F, AttributeModifiers.TOPAZ_PICKAXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_AXE = addToTab(ITEMS.register("topaz_axe", () -> new ModAxeItem(ModTiers.TOPAZ, 5.0F, -3.0F, AttributeModifiers.TOPAZ_AXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_SHOVEL = addToTab(ITEMS.register("topaz_shovel", () -> new ModShovelItem(ModTiers.TOPAZ, 1.5F, -3.0F, AttributeModifiers.TOPAZ_SHOVEL, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_HOE = addToTab(ITEMS.register("topaz_hoe", () -> new ModHoeItem(ModTiers.TOPAZ, -4, 0.0F, AttributeModifiers.TOPAZ_HOE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = addToTab(ITEMS.register("sapphire_sword", () -> new ModSwordItem(ModTiers.SAPPHIRE, 3, -2.4F, AttributeModifiers.SAPPHIRE_SWORD, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = addToTab(ITEMS.register("sapphire_pickaxe", () -> new ModPickaxeItem(ModTiers.SAPPHIRE, 1, -2.8F, AttributeModifiers.SAPPHIRE_PICKAXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_AXE = addToTab(ITEMS.register("sapphire_axe", () -> new ModAxeItem(ModTiers.SAPPHIRE, 5.0F, -3.0F, AttributeModifiers.SAPPHIRE_AXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = addToTab(ITEMS.register("sapphire_shovel", () -> new ModShovelItem(ModTiers.SAPPHIRE, 1.5F, -3.0F, AttributeModifiers.SAPPHIRE_SHOVEL, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_HOE = addToTab(ITEMS.register("sapphire_hoe", () -> new ModHoeItem(ModTiers.SAPPHIRE, -4, 0.0F, AttributeModifiers.SAPPHIRE_HOE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_SWORD = addToTab(ITEMS.register("ruby_sword", () -> new ModSwordItem(ModTiers.RUBY, 3, -2.4F, AttributeModifiers.RUBY_SWORD, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_PICKAXE = addToTab(ITEMS.register("ruby_pickaxe", () -> new ModPickaxeItem(ModTiers.RUBY, 1, -2.8F, AttributeModifiers.RUBY_PICKAXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_AXE = addToTab(ITEMS.register("ruby_axe", () -> new ModAxeItem(ModTiers.RUBY, 5.0F, -3.0F, AttributeModifiers.RUBY_AXE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_SHOVEL = addToTab(ITEMS.register("ruby_shovel", () -> new ModShovelItem(ModTiers.RUBY, 1.5F, -3.0F, AttributeModifiers.RUBY_SHOVEL, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_HOE = addToTab(ITEMS.register("ruby_hoe", () -> new ModHoeItem(ModTiers.RUBY, -4, 0.0F, AttributeModifiers.RUBY_HOE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_SWORD = addToTab(ITEMS.register("dragonyx_sword", () -> new ModSwordItem(ModTiers.DRAGONYX, 3, -2.4F, AttributeModifiers.DRAGONYX_SWORD, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_PICKAXE = addToTab(ITEMS.register("dragonyx_pickaxe", () -> new ModPickaxeItem(ModTiers.DRAGONYX, 1, -2.8F, AttributeModifiers.DRAGONYX_PICKAXE, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_AXE = addToTab(ITEMS.register("dragonyx_axe", () -> new ModAxeItem(ModTiers.DRAGONYX, 5.0F, -3.0F, AttributeModifiers.DRAGONYX_AXE, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_SHOVEL = addToTab(ITEMS.register("dragonyx_shovel", () -> new ModShovelItem(ModTiers.DRAGONYX, 1.5F, -3.0F, AttributeModifiers.DRAGONYX_SHOVEL, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_HOE = addToTab(ITEMS.register("dragonyx_hoe", () -> new ModHoeItem(ModTiers.DRAGONYX, -4, 0.0F, AttributeModifiers.DRAGONYX_HOE, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_SWORD = addToTab(ITEMS.register("emerald_sword", () -> new ModSwordItem(ModTiers.EMERALD, 3, -2.4F, AttributeModifiers.EMERALD_SWORD, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_PICKAXE = addToTab(ITEMS.register("emerald_pickaxe", () -> new ModPickaxeItem(ModTiers.EMERALD, 1, -2.8F, AttributeModifiers.EMERALD_PICKAXE, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_AXE = addToTab(ITEMS.register("emerald_axe", () -> new ModAxeItem(ModTiers.EMERALD, 6.0F, -3.1F, AttributeModifiers.EMERALD_AXE, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_SHOVEL = addToTab(ITEMS.register("emerald_shovel", () -> new ModShovelItem(ModTiers.EMERALD, 1.5F, -3.0F, AttributeModifiers.EMERALD_SHOVEL, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_HOE = addToTab(ITEMS.register("emerald_hoe", () -> new ModHoeItem(ModTiers.EMERALD, -2, -1.0F, AttributeModifiers.EMERALD_HOE, new Item.Properties())));

    // Armor
    public static final RegistryObject<Item> TOPAZ_HELMET = addToTab(ITEMS.register("topaz_helmet", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, AttributeModifiers.TOPAZ_HELMET, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_CHESTPLATE = addToTab(ITEMS.register("topaz_chestplate", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, AttributeModifiers.TOPAZ_CHESTPLATE, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_LEGGINGS = addToTab(ITEMS.register("topaz_leggings", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, AttributeModifiers.TOPAZ_LEGGINGS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> TOPAZ_BOOTS = addToTab(ITEMS.register("topaz_boots", () -> new ModArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, AttributeModifiers.TOPAZ_BOOTS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = addToTab(ITEMS.register("sapphire_helmet", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, AttributeModifiers.SAPPHIRE_HELMET, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = addToTab(ITEMS.register("sapphire_chestplate", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, AttributeModifiers.SAPPHIRE_CHESTPLATE, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = addToTab(ITEMS.register("sapphire_leggings", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, AttributeModifiers.SAPPHIRE_LEGGINGS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = addToTab(ITEMS.register("sapphire_boots", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, AttributeModifiers.SAPPHIRE_BOOTS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_HELMET = addToTab(ITEMS.register("ruby_helmet", () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, AttributeModifiers.RUBY_HELMET, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = addToTab(ITEMS.register("ruby_chestplate", () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, AttributeModifiers.RUBY_CHESTPLATE, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_LEGGINGS = addToTab(ITEMS.register("ruby_leggings", () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, AttributeModifiers.RUBY_LEGGINGS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> RUBY_BOOTS = addToTab(ITEMS.register("ruby_boots", () -> new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, AttributeModifiers.RUBY_BOOTS, null, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_HELMET = addToTab(ITEMS.register("dragonyx_helmet", () -> new ModArmorItem(ModArmorMaterials.DRAGONYX, ArmorItem.Type.HELMET, AttributeModifiers.DRAGONYX_HELMET, ModTooltips.DRAGONYX_SET_BONUS, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_CHESTPLATE = addToTab(ITEMS.register("dragonyx_chestplate", () -> new ModArmorItem(ModArmorMaterials.DRAGONYX, ArmorItem.Type.CHESTPLATE, AttributeModifiers.DRAGONYX_CHESTPLATE, ModTooltips.DRAGONYX_SET_BONUS, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_LEGGINGS = addToTab(ITEMS.register("dragonyx_leggings", () -> new ModArmorItem(ModArmorMaterials.DRAGONYX, ArmorItem.Type.LEGGINGS, AttributeModifiers.DRAGONYX_LEGGINGS, ModTooltips.DRAGONYX_SET_BONUS, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> DRAGONYX_BOOTS = addToTab(ITEMS.register("dragonyx_boots", () -> new ModArmorItem(ModArmorMaterials.DRAGONYX, ArmorItem.Type.BOOTS, AttributeModifiers.DRAGONYX_BOOTS, ModTooltips.DRAGONYX_SET_BONUS, new Item.Properties().fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_HELMET = addToTab(ITEMS.register("emerald_helmet", () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, AttributeModifiers.EMERALD_HELMET, ModTooltips.EMERALD_SET_BONUS, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = addToTab(ITEMS.register("emerald_chestplate", () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, AttributeModifiers.EMERALD_CHESTPLATE, ModTooltips.EMERALD_SET_BONUS, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = addToTab(ITEMS.register("emerald_leggings", () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, AttributeModifiers.EMERALD_LEGGINGS, ModTooltips.EMERALD_SET_BONUS, new Item.Properties())));
    public static final RegistryObject<Item> EMERALD_BOOTS = addToTab(ITEMS.register("emerald_boots", () -> new ModArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, AttributeModifiers.EMERALD_BOOTS, ModTooltips.EMERALD_SET_BONUS, new Item.Properties())));

    // Bows
    public static final RegistryObject<Item> BOW = REPLACE.register("bow", () -> new BowItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> IRON_BOW = addToTab(ITEMS.register("iron_bow", () -> new ModBowItem(Items.IRON_INGOT, 14, AttributeModifiers.IRON_BOW, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> GOLDEN_BOW = addToTab(ITEMS.register("golden_bow", () -> new ModBowItem(Items.GOLD_INGOT, 22, AttributeModifiers.GOLDEN_BOW, new Item.Properties().durability(32))));
    public static final RegistryObject<Item> DIAMOND_BOW = addToTab(ITEMS.register("diamond_bow", () -> new ModBowItem(Items.DIAMOND, 10, AttributeModifiers.DIAMOND_BOW, new Item.Properties().durability(1561))));
    public static final RegistryObject<Item> NETHERITE_BOW = addToTab(ITEMS.register("netherite_bow", () -> new ModBowItem(Items.NETHERITE_INGOT, 15, AttributeModifiers.NETHERITE_BOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> TOPAZ_BOW = addToTab(ITEMS.register("topaz_bow", () -> new ModBowItem(ModItems.TOPAZ.get(), 15, AttributeModifiers.TOPAZ_BOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_BOW = addToTab(ITEMS.register("sapphire_bow", () -> new ModBowItem(ModItems.SAPPHIRE.get(), 15, AttributeModifiers.SAPPHIRE_BOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> RUBY_BOW = addToTab(ITEMS.register("ruby_bow", () -> new ModBowItem(ModItems.RUBY.get(), 15, AttributeModifiers.RUBY_BOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_BOW = addToTab(ITEMS.register("dragonyx_bow", () -> new ModBowItem(ModItems.DRAGONYX_INGOT.get(), 15, AttributeModifiers.DRAGONYX_BOW, new Item.Properties().durability(2031).fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_BOW = addToTab(ITEMS.register("emerald_bow", () -> new ModBowItem(Items.EMERALD, 30, AttributeModifiers.EMERALD_BOW, new Item.Properties().durability(250))));

    // Crossbows
    public static final RegistryObject<Item> CROSSBOW = REPLACE.register("crossbow", () -> new CrossbowItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> IRON_CROSSBOW = addToTab(ITEMS.register("iron_crossbow", () -> new ModCrossbowItem(Items.IRON_INGOT, 14, AttributeModifiers.IRON_CROSSBOW, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> GOLDEN_CROSSBOW = addToTab(ITEMS.register("golden_crossbow", () -> new ModCrossbowItem(Items.GOLD_INGOT, 22, AttributeModifiers.GOLDEN_CROSSBOW, new Item.Properties().durability(32))));
    public static final RegistryObject<Item> DIAMOND_CROSSBOW = addToTab(ITEMS.register("diamond_crossbow", () -> new ModCrossbowItem(Items.DIAMOND, 10, AttributeModifiers.DIAMOND_CROSSBOW, new Item.Properties().durability(1561))));
    public static final RegistryObject<Item> NETHERITE_CROSSBOW = addToTab(ITEMS.register("netherite_crossbow", () -> new ModCrossbowItem(Items.NETHERITE_INGOT, 15, AttributeModifiers.NETHERITE_CROSSBOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> TOPAZ_CROSSBOW = addToTab(ITEMS.register("topaz_crossbow", () -> new ModCrossbowItem(ModItems.TOPAZ.get(), 15, AttributeModifiers.TOPAZ_CROSSBOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_CROSSBOW = addToTab(ITEMS.register("sapphire_crossbow", () -> new ModCrossbowItem(ModItems.SAPPHIRE.get(), 15, AttributeModifiers.SAPPHIRE_CROSSBOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> RUBY_CROSSBOW = addToTab(ITEMS.register("ruby_crossbow", () -> new ModCrossbowItem(ModItems.RUBY.get(), 15, AttributeModifiers.RUBY_CROSSBOW, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_CROSSBOW = addToTab(ITEMS.register("dragonyx_crossbow", () -> new ModCrossbowItem(ModItems.DRAGONYX_INGOT.get(), 15, AttributeModifiers.DRAGONYX_CROSSBOW, new Item.Properties().durability(2031).fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_CROSSBOW = addToTab(ITEMS.register("emerald_crossbow", () -> new ModCrossbowItem(Items.EMERALD, 30, AttributeModifiers.EMERALD_CROSSBOW, new Item.Properties().durability(250))));

    // Shields
    public static final RegistryObject<Item> SHIELD = REPLACE.register("shield", () -> new ShieldItem(new Item.Properties().durability(59)));
    public static final RegistryObject<Item> IRON_SHIELD = addToTab(ITEMS.register("iron_shield", () -> new ModShieldItem(Items.IRON_INGOT, 14, AttributeModifiers.IRON_SHIELD, ShieldTextures.IRON, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> GOLDEN_SHIELD = addToTab(ITEMS.register("golden_shield", () -> new ModShieldItem(Items.GOLD_INGOT, 22, AttributeModifiers.GOLDEN_SHIELD, ShieldTextures.GOLDEN, new Item.Properties().durability(32))));
    public static final RegistryObject<Item> DIAMOND_SHIELD = addToTab(ITEMS.register("diamond_shield", () -> new ModShieldItem(Items.DIAMOND, 10, AttributeModifiers.DIAMOND_SHIELD, ShieldTextures.DIAMOND, new Item.Properties().durability(1561))));
    public static final RegistryObject<Item> NETHERITE_SHIELD = addToTab(ITEMS.register("netherite_shield", () -> new ModShieldItem(Items.NETHERITE_INGOT, 15, AttributeModifiers.NETHERITE_SHIELD, ShieldTextures.NETHERITE, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> TOPAZ_SHIELD = addToTab(ITEMS.register("topaz_shield", () -> new ModShieldItem(ModItems.TOPAZ.get(), 15, AttributeModifiers.TOPAZ_SHIELD, ShieldTextures.TOPAZ, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_SHIELD = addToTab(ITEMS.register("sapphire_shield", () -> new ModShieldItem(ModItems.SAPPHIRE.get(), 15, AttributeModifiers.SAPPHIRE_SHIELD, ShieldTextures.SAPPHIRE, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> RUBY_SHIELD = addToTab(ITEMS.register("ruby_shield", () -> new ModShieldItem(ModItems.RUBY.get(), 15, AttributeModifiers.RUBY_SHIELD, ShieldTextures.RUBY, new Item.Properties().durability(2031).fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_SHIELD = addToTab(ITEMS.register("dragonyx_shield", () -> new ModShieldItem(ModItems.DRAGONYX_INGOT.get(), 15, AttributeModifiers.DRAGONYX_SHIELD, ShieldTextures.DRAGONYX, new Item.Properties().durability(2031).fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_SHIELD = addToTab(ITEMS.register("emerald_shield", () -> new ModShieldItem(Items.EMERALD, 30, AttributeModifiers.EMERALD_SHIELD, ShieldTextures.EMERALD, new Item.Properties().durability(250))));

    // Horse Armor
    public static final RegistryObject<Item> CHAINMAIL_HORSE_ARMOR = addToTab(ITEMS.register("chainmail_horse_armor", () -> new ModHorseArmorItem(4, "chainmail", new Item.Properties().stacksTo(1))));
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = addToTab(ITEMS.register("netherite_horse_armor", () -> new ModHorseArmorItem(15, "netherite", new Item.Properties().stacksTo(1).fireResistant())));
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = addToTab(ITEMS.register("topaz_horse_armor", () -> new ModHorseArmorItem(15, "topaz", new Item.Properties().stacksTo(1).fireResistant())));
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = addToTab(ITEMS.register("sapphire_horse_armor", () -> new ModHorseArmorItem(15, "sapphire", new Item.Properties().stacksTo(1).fireResistant())));
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = addToTab(ITEMS.register("ruby_horse_armor", () -> new ModHorseArmorItem(15, "ruby", new Item.Properties().stacksTo(1).fireResistant())));
    public static final RegistryObject<Item> DRAGONYX_HORSE_ARMOR = addToTab(ITEMS.register("dragonyx_horse_armor", () -> new ModHorseArmorItem(15, "dragonyx", new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC))));
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = addToTab(ITEMS.register("emerald_horse_armor", () -> new ModHorseArmorItem(5, "emerald", new Item.Properties().stacksTo(1))));

    // Smithing Templates
    public static final RegistryObject<Item> TOPAZ_UPGRADE_SMITHING_TEMPLATE = addToTab(ITEMS.register("topaz_upgrade_smithing_template", () -> new ModSmithingTemplateItem("topaz_upgrade", List.of(ModSmithingTemplateItem.EMPTY_SLOT_TOPAZ))));
    public static final RegistryObject<Item> SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = addToTab(ITEMS.register("sapphire_upgrade_smithing_template", () -> new ModSmithingTemplateItem("sapphire_upgrade", List.of(ModSmithingTemplateItem.EMPTY_SLOT_SAPPHIRE))));
    public static final RegistryObject<Item> RUBY_UPGRADE_SMITHING_TEMPLATE = addToTab(ITEMS.register("ruby_upgrade_smithing_template", () -> new ModSmithingTemplateItem("ruby_upgrade", List.of(ModSmithingTemplateItem.EMPTY_SLOT_RUBY))));
    public static final RegistryObject<Item> DRAGONYX_UPGRADE_SMITHING_TEMPLATE = addToTab(ITEMS.register("dragonyx_upgrade_smithing_template", () -> new ModSmithingTemplateItem("dragonyx_upgrade", List.of(ModSmithingTemplateItem.EMPTY_SLOT_INGOT))));

    // Necklaces
    public static final RegistryObject<Item> GOLDEN_NECKLACE = addToTab(ITEMS.register("golden_necklace", () -> new ModCurioItem(Items.GOLD_INGOT, AttributeModifiers.GOLDEN_NECKLACE, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> TOPAZ_NECKLACE = addToTab(ITEMS.register("topaz_necklace", () -> new ModCurioItem(ModItems.TOPAZ.get(), AttributeModifiers.TOPAZ_NECKLACE, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> SAPPHIRE_NECKLACE = addToTab(ITEMS.register("sapphire_necklace", () -> new ModCurioItem(ModItems.SAPPHIRE.get(), AttributeModifiers.SAPPHIRE_NECKLACE, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> RUBY_NECKLACE = addToTab(ITEMS.register("ruby_necklace", () -> new ModCurioItem(ModItems.RUBY.get(), AttributeModifiers.RUBY_NECKLACE, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> GEM_NECKLACE = addToTab(ITEMS.register("gem_necklace", () -> new ModCurioItem(ModItems.ONYX.get(), AttributeModifiers.GEM_NECKLACE, new Item.Properties().durability(750))));

    // Rings
    public static final RegistryObject<Item> GOLDEN_RING = addToTab(ITEMS.register("golden_ring", () -> new ModCurioItem(Items.GOLD_INGOT, AttributeModifiers.GOLDEN_RING, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> TOPAZ_RING = addToTab(ITEMS.register("topaz_ring", () -> new ModCurioItem(ModItems.TOPAZ.get(), AttributeModifiers.TOPAZ_RING, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> SAPPHIRE_RING = addToTab(ITEMS.register("sapphire_ring", () -> new ModCurioItem(ModItems.SAPPHIRE.get(), AttributeModifiers.SAPPHIRE_RING, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> RUBY_RING = addToTab(ITEMS.register("ruby_ring", () -> new ModCurioItem(ModItems.RUBY.get(), AttributeModifiers.RUBY_RING, new Item.Properties().durability(250))));
    public static final RegistryObject<Item> GEM_RING = addToTab(ITEMS.register("gem_ring", () -> new ModCurioItem(ModItems.ONYX.get(), AttributeModifiers.GEM_RING, new Item.Properties().durability(750))));

}

package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModBlocks;
import com.foozey.gems.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.function.Supplier;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, Gems.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        // Items
        addItem(ModItems.TOPAZ, "Topaz");
        addItem(ModItems.TOPAZ_SHARDS, "Topaz Shards");
        addItem(ModItems.SAPPHIRE, "Sapphire");
        addItem(ModItems.SAPPHIRE_SHARDS, "Sapphire Shards");
        addItem(ModItems.RUBY, "Ruby");
        addItem(ModItems.RUBY_SHARDS, "Ruby Shards");
        addItem(ModItems.ONYX, "Onyx");
        addItem(ModItems.ONYX_SHARDS, "Onyx Shards");
        addItem(ModItems.ENDER_BONES, "Ender Bones");
        addItem(ModItems.ENDER_SCALES, "Ender Scales");
        addItem(ModItems.ENDER_MATTER, "Ender Matter");
        addItem(ModItems.DRAGONYX_INGOT, "Dragonyx Ingot");
        addItem(ModItems.CHAINMAIL, "Chainmail");

        // Blocks
        addBlock(ModBlocks.TOPAZ_BLOCK, "Block of Topaz");
        addBlock(ModBlocks.TOPAZ_ORE, "Topaz Ore");
        addBlock(ModBlocks.DEEPSLATE_TOPAZ_ORE, "Deepslate Topaz Ore");
        addBlock(ModBlocks.SAPPHIRE_BLOCK, "Block of Sapphire");
        addBlock(ModBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        addBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");
        addBlock(ModBlocks.RUBY_BLOCK, "Block of Ruby");
        addBlock(ModBlocks.RUBY_ORE, "Ruby Ore");
        addBlock(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        addBlock(ModBlocks.ONYX_BLOCK, "Block of Onyx");
        addBlock(ModBlocks.ONYX_ORE, "Onyx Ore");
        addBlock(ModBlocks.EXPERIENCE_ORE, "Experience Ore");
        addBlock(ModBlocks.DEEPSLATE_EXPERIENCE_ORE, "Deepslate Experience Ore");
        addBlock(ModBlocks.NETHER_EXPERIENCE_ORE, "Nether Experience Ore");
        addBlock(ModBlocks.END_EXPERIENCE_ORE, "End Experience Ore");
        addBlock(ModBlocks.BONE_FOSSIL, "Bone Fossil");
        addBlock(ModBlocks.DEEPSLATE_BONE_FOSSIL, "Deepslate Bone Fossil");
        addBlock(ModBlocks.NETHER_BONE_FOSSIL, "Nether Bone Fossil");
        addBlock(ModBlocks.END_BONE_FOSSIL, "End Bone Fossil");
        addBlock(ModBlocks.RIB_FOSSIL, "Rib Fossil");
        addBlock(ModBlocks.DEEPSLATE_RIB_FOSSIL, "Deepslate Rib Fossil");
        addBlock(ModBlocks.NETHER_RIB_FOSSIL, "Nether Rib Fossil");
        addBlock(ModBlocks.END_RIB_FOSSIL, "End Rib Fossil");
        addBlock(ModBlocks.SKULL_FOSSIL, "Skull Fossil");
        addBlock(ModBlocks.DEEPSLATE_SKULL_FOSSIL, "Deepslate Skull Fossil");
        addBlock(ModBlocks.NETHER_SKULL_FOSSIL, "Nether Skull Fossil");
        addBlock(ModBlocks.END_SKULL_FOSSIL, "End Skull Fossil");
        addBlock(ModBlocks.FISH_FOSSIL, "Fish Fossil");
        addBlock(ModBlocks.DEEPSLATE_FISH_FOSSIL, "Deepslate Fish Fossil");
        addBlock(ModBlocks.NETHER_FISH_FOSSIL, "Nether Fish Fossil");
        addBlock(ModBlocks.END_FISH_FOSSIL, "End Fish Fossil");
        addBlock(ModBlocks.SHELL_FOSSIL, "Shell Fossil");
        addBlock(ModBlocks.DEEPSLATE_SHELL_FOSSIL, "Deepslate Shell Fossil");
        addBlock(ModBlocks.NETHER_SHELL_FOSSIL, "Nether Shell Fossil");
        addBlock(ModBlocks.END_SHELL_FOSSIL, "End Shell Fossil");

        // Tools
        addItem(ModItems.TOPAZ_SWORD, "Topaz Sword");
        addItem(ModItems.TOPAZ_PICKAXE, "Topaz Pickaxe");
        addItem(ModItems.TOPAZ_AXE, "Topaz Axe");
        addItem(ModItems.TOPAZ_SHOVEL, "Topaz Shovel");
        addItem(ModItems.TOPAZ_HOE, "Topaz Hoe");
        addItem(ModItems.SAPPHIRE_SWORD, "Sapphire Sword");
        addItem(ModItems.SAPPHIRE_PICKAXE, "Sapphire Pickaxe");
        addItem(ModItems.SAPPHIRE_AXE, "Sapphire Axe");
        addItem(ModItems.SAPPHIRE_SHOVEL, "Sapphire Shovel");
        addItem(ModItems.SAPPHIRE_HOE, "Sapphire Hoe");
        addItem(ModItems.RUBY_SWORD, "Ruby Sword");
        addItem(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        addItem(ModItems.RUBY_AXE, "Ruby Axe");
        addItem(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        addItem(ModItems.RUBY_HOE, "Ruby Hoe");
        addItem(ModItems.DRAGONYX_SWORD, "Dragonyx Sword");
        addItem(ModItems.DRAGONYX_PICKAXE, "Dragonyx Pickaxe");
        addItem(ModItems.DRAGONYX_AXE, "Dragonyx Axe");
        addItem(ModItems.DRAGONYX_SHOVEL, "Dragonyx Shovel");
        addItem(ModItems.DRAGONYX_HOE, "Dragonyx Hoe");
        addItem(ModItems.EMERALD_SWORD, "Emerald Sword");
        addItem(ModItems.EMERALD_PICKAXE, "Emerald Pickaxe");
        addItem(ModItems.EMERALD_AXE, "Emerald Axe");
        addItem(ModItems.EMERALD_SHOVEL, "Emerald Shovel");
        addItem(ModItems.EMERALD_HOE, "Emerald Hoe");

        // Armor
        addItem(ModItems.TOPAZ_HELMET, "Topaz Helmet");
        addItem(ModItems.TOPAZ_CHESTPLATE, "Topaz Chestplate");
        addItem(ModItems.TOPAZ_LEGGINGS, "Topaz Leggings");
        addItem(ModItems.TOPAZ_BOOTS, "Topaz Boots");
        addItem(ModItems.SAPPHIRE_HELMET, "Sapphire Helmet");
        addItem(ModItems.SAPPHIRE_CHESTPLATE, "Sapphire Chestplate");
        addItem(ModItems.SAPPHIRE_LEGGINGS, "Sapphire Leggings");
        addItem(ModItems.SAPPHIRE_BOOTS, "Sapphire Boots");
        addItem(ModItems.RUBY_HELMET, "Ruby Helmet");
        addItem(ModItems.RUBY_CHESTPLATE, "Ruby Chestplate");
        addItem(ModItems.RUBY_LEGGINGS, "Ruby Leggings");
        addItem(ModItems.RUBY_BOOTS, "Ruby Boots");
        addItem(ModItems.DRAGONYX_HELMET, "Dragonyx Helmet");
        addItem(ModItems.DRAGONYX_CHESTPLATE, "Dragonyx Chestplate");
        addItem(ModItems.DRAGONYX_LEGGINGS, "Dragonyx Leggings");
        addItem(ModItems.DRAGONYX_BOOTS, "Dragonyx Boots");
        addItem(ModItems.EMERALD_HELMET, "Emerald Helmet");
        addItem(ModItems.EMERALD_CHESTPLATE, "Emerald Chestplate");
        addItem(ModItems.EMERALD_LEGGINGS, "Emerald Leggings");
        addItem(ModItems.EMERALD_BOOTS, "Emerald Boots");

        // Bows
        addItem(ModItems.BOW, "Wooden Bow");
        addItem(ModItems.IRON_BOW, "Iron Bow");
        addItem(ModItems.GOLDEN_BOW, "Golden Bow");
        addItem(ModItems.DIAMOND_BOW, "Diamond Bow");
        addItem(ModItems.NETHERITE_BOW, "Netherite Bow");
        addItem(ModItems.TOPAZ_BOW, "Topaz Bow");
        addItem(ModItems.SAPPHIRE_BOW, "Sapphire Bow");
        addItem(ModItems.RUBY_BOW, "Ruby Bow");
        addItem(ModItems.DRAGONYX_BOW, "Dragonyx Bow");
        addItem(ModItems.EMERALD_BOW, "Emerald Bow");

        // Crossbows
        addItem(ModItems.CROSSBOW, "Wooden Crossbow");
        addItem(ModItems.IRON_CROSSBOW, "Iron Crossbow");
        addItem(ModItems.GOLDEN_CROSSBOW, "Golden Crossbow");
        addItem(ModItems.DIAMOND_CROSSBOW, "Diamond Crossbow");
        addItem(ModItems.NETHERITE_CROSSBOW, "Netherite Crossbow");
        addItem(ModItems.TOPAZ_CROSSBOW, "Topaz Crossbow");
        addItem(ModItems.SAPPHIRE_CROSSBOW, "Sapphire Crossbow");
        addItem(ModItems.RUBY_CROSSBOW, "Ruby Crossbow");
        addItem(ModItems.DRAGONYX_CROSSBOW, "Dragonyx Crossbow");
        addItem(ModItems.EMERALD_CROSSBOW, "Emerald Crossbow");

        // Shields
        addShieldItem(ModItems.SHIELD, "Wooden Shield");
        addShieldItem(ModItems.IRON_SHIELD, "Iron Shield");
        addShieldItem(ModItems.GOLDEN_SHIELD, "Golden Shield");
        addShieldItem(ModItems.DIAMOND_SHIELD, "Diamond Shield");
        addShieldItem(ModItems.NETHERITE_SHIELD, "Netherite Shield");
        addShieldItem(ModItems.TOPAZ_SHIELD, "Topaz Shield");
        addShieldItem(ModItems.SAPPHIRE_SHIELD, "Sapphire Shield");
        addShieldItem(ModItems.RUBY_SHIELD, "Ruby Shield");
        addShieldItem(ModItems.DRAGONYX_SHIELD, "Dragonyx Shield");
        addShieldItem(ModItems.EMERALD_SHIELD, "Emerald Shield");

        // Horse Armor
        addItem(ModItems.CHAINMAIL_HORSE_ARMOR, "Chainmail Horse Armor");
        addItem(ModItems.NETHERITE_HORSE_ARMOR, "Netherite Horse Armor");
        addItem(ModItems.TOPAZ_HORSE_ARMOR, "Topaz Horse Armor");
        addItem(ModItems.SAPPHIRE_HORSE_ARMOR, "Sapphire Horse Armor");
        addItem(ModItems.RUBY_HORSE_ARMOR, "Ruby Horse Armor");
        addItem(ModItems.DRAGONYX_HORSE_ARMOR, "Dragonyx Horse Armor");
        addItem(ModItems.EMERALD_HORSE_ARMOR, "Emerald Horse Armor");

        // Smithing Templates
        addSmithingTemplateItem("topaz_upgrade", "Topaz Upgrade", "Netherite Equipment", "Topaz", "Add netherite armor, weapon or tool", "Add Topaz");
        addSmithingTemplateItem("sapphire_upgrade", "Sapphire Upgrade", "Topaz Equipment", "Sapphire", "Add topaz armor, weapon or tool", "Add Sapphire");
        addSmithingTemplateItem("ruby_upgrade", "Ruby Upgrade", "Sapphire Equipment", "Ruby", "Add sapphire armor, weapon or tool", "Add Ruby");
        addSmithingTemplateItem("dragonyx_upgrade", "Dragonyx Upgrade", "Ruby Equipment", "Dragonyx Ingot", "Add ruby armor, weapon or tool", "Add Dragonyx Ingot");

        // Necklaces
        addItem(ModItems.GOLDEN_NECKLACE, "Golden Necklace");
        addItem(ModItems.TOPAZ_NECKLACE, "Topaz Necklace");
        addItem(ModItems.SAPPHIRE_NECKLACE, "Sapphire Necklace");
        addItem(ModItems.RUBY_NECKLACE, "Ruby Necklace");
        addItem(ModItems.GEM_NECKLACE, "Gem Necklace");

        // Rings
        addItem(ModItems.GOLDEN_RING, "Golden Ring");
        addItem(ModItems.TOPAZ_RING, "Topaz Ring");
        addItem(ModItems.SAPPHIRE_RING, "Sapphire Ring");
        addItem(ModItems.RUBY_RING, "Ruby Ring");
        addItem(ModItems.GEM_RING, "Gem Ring");

        // Trim Materials
        addTrimMaterial("topaz", "Topaz Material");
        addTrimMaterial("sapphire", "Sapphire Material");
        addTrimMaterial("ruby", "Ruby Material");
        addTrimMaterial("onyx", "Onyx Material");

        // Advancements
        addAdvancement("root", "Gems", "An adventure of progress and discovery");
        addAdvancement("gems", "Finally Mine", "Acquire a powerful new resource");
        addAdvancement("dragonyx", "Powers Untold", "Acquire a Dragonyx Ingot");
        addAdvancement("fossils", "Unearthed", "Discover a fossil");
        addAdvancement("dragonyx_armor", "Overcompensation", "Get a full suit of Dragonyx armor");
        addAdvancement("emerald_armor", "Villager Prestige", "Get a full suit of Emerald armor");
        addAdvancement("bows", "Sharpshooter", "Get an improved bow");
        addAdvancement("crossbows", "Pillager's Demise", "Get an improved crossbow");
        addAdvancement("shields", "Block Game", "Get an improved shield");
        addAdvancement("horse_armor", "Warhorse", "Get some improved horse armor");
        addAdvancement("smithing_templates", "Beyond Netherite", "Find a powerful new smithing template");
        addAdvancement("jewelry", "Blinged Out", "Admire some jewelry");

        // Attributes
        addAttribute("arrow_damage", "Arrow Damage");
        addAttribute("block_strength", "Block Strength");
        addAttribute("lifesteal", "Lifesteal");
        addAttribute("harvest_area", "Harvest Area");
        addAttribute("bonus_xp", "Bonus XP");

        // Tooltips
        addTooltip("set_bonus", "Set Bonus: ");
        addTooltip("dragonyx_armor", "Safely fall into the void");
        addTooltip("emerald_armor", "Gain a level of Hero of the Village");

        // Creative Tabs
        addCreativeTab("gems", "The Gems Project");

    }

    private void addShieldItem(Supplier<? extends Item> key, String name) {
        addItem(key, name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".black", "Black " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".blue", "Blue " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".brown", "Brown " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".cyan", "Cyan " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".gray", "Gray " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".green", "Green " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".light_blue", "Light Blue " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".light_gray", "Light Gray " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".lime", "Lime " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".magenta", "Magenta " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".orange", "Orange " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".pink", "Pink " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".purple", "Purple " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".red", "Red " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".white", "White " + name);
        add("item." + Gems.MOD_ID + "." + key.get() + ".yellow", "Yellow " + name);
    }

    private void addSmithingTemplateItem(String identifier, String name, String appliesTo, String ingredients, String baseSlotDescription, String additionsSlotDescription) {
        add("item." + Gems.MOD_ID + ".smithing_template." + identifier + ".applies_to", appliesTo);
        add("item." + Gems.MOD_ID + ".smithing_template." + identifier + ".ingredients", ingredients);
        add("item." + Gems.MOD_ID + ".smithing_template." + identifier + ".template_description", name);
        add("item." + Gems.MOD_ID + ".smithing_template." + identifier + ".base_slot_description", baseSlotDescription);
        add("item." + Gems.MOD_ID + ".smithing_template." + identifier + ".additions_slot_description", additionsSlotDescription);
    }

    private void addTrimMaterial(String identifier, String name) {
        add("trim_material." + Gems.MOD_ID + "." + identifier, name);
    }

    private void addAdvancement(String identifier, String title, String description) {
        add("advancement." + Gems.MOD_ID + "." + identifier + ".title", title);
        add("advancement." + Gems.MOD_ID + "." + identifier + ".description", description);
    }

    private void addAttribute(String identifier, String name) {
        add("attribute." + Gems.MOD_ID + "." + identifier, name);
    }

    private void addTooltip(String identifier, String name) {
        add("tooltip." + Gems.MOD_ID + "." + identifier, name);
    }

    private void addCreativeTab(String identifier, String name) {
        add("creative_tab." + Gems.MOD_ID + "." + identifier, name);
    }

}

package com.foozey.gems.init;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.items.amulets.*;
import com.foozey.gems.items.armor.*;
import com.foozey.gems.items.bows.*;
import com.foozey.gems.items.crossbows.*;
import com.foozey.gems.items.horse.*;
import com.foozey.gems.items.rings.*;
import com.foozey.gems.items.shields.*;
import com.foozey.gems.items.tools.*;
import com.foozey.gems.util.tiers.ModArmorMaterial;
import com.foozey.gems.util.tiers.ModItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Registers
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gems.MOD_ID);
    public static final DeferredRegister<Item> REPLACE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");



    // Items
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ModItemBase::new);

    // Topaz Shards
    public static final RegistryObject<Item> TOPAZ_SHARDS = ITEMS.register("topaz_shards", ModItemBase::new);

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ModItemBase::new);

    // Sapphire Shards
    public static final RegistryObject<Item> SAPPHIRE_SHARDS = ITEMS.register("sapphire_shards", ModItemBase::new);

    // Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ModItemBase::new);

    // Ruby Shards
    public static final RegistryObject<Item> RUBY_SHARDS = ITEMS.register("ruby_shards", ModItemBase::new);

    // Onyx
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", ModItemBase::new);

    // Onyx Shards
    public static final RegistryObject<Item> ONYX_SHARDS = ITEMS.register("onyx_shards", ModItemBase::new);

    // Dragonyx Ingot
    public static final RegistryObject<Item> DRAGONYX_INGOT = ITEMS.register("dragonyx_ingot", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).tab(ModTab.TAB_GEMS)));

    // Ender Bones
    public static final RegistryObject<Item> ENDER_BONES = ITEMS.register("ender_bones", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModTab.TAB_GEMS)));

    // Ender Scales
    public static final RegistryObject<Item> ENDER_SCALES = ITEMS.register("ender_scales", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(ModTab.TAB_GEMS)));

    // Infused Ender Scales
    public static final RegistryObject<Item> INFUSED_ENDER_SCALES = ITEMS.register("infused_ender_scales", () -> new Item(new Item.Properties().rarity(Rarity.RARE).tab(ModTab.TAB_GEMS)));

    // Chainmail
    public static final RegistryObject<Item> CHAINMAIL = ITEMS.register("chainmail", ModItemBase::new);



    // Blocks
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Block
    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = ITEMS.register("topaz_block", () ->
            new ModBlockBase(ModBlocks.TOPAZ_BLOCK.get()));

    // Topaz Ore
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = ITEMS.register("topaz_ore", () ->
            new ModBlockBase(ModBlocks.TOPAZ_ORE.get()));

    // Deepslate Topaz Ore
    public static final RegistryObject<Item> DEEPSLATE_TOPAZ_ORE_ITEM = ITEMS.register("deepslate_topaz_ore", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_TOPAZ_ORE.get()));

    // Sapphire Block
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () ->
            new ModBlockBase(ModBlocks.SAPPHIRE_BLOCK.get()));

    // Sapphire Ore
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () ->
            new ModBlockBase(ModBlocks.SAPPHIRE_ORE.get()));

    // Deepslate Sapphire Ore
    public static final RegistryObject<Item> DEEPSLATE_SAPPHIRE_ORE_ITEM = ITEMS.register("deepslate_sapphire_ore", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()));

    // Ruby Block
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () ->
            new ModBlockBase(ModBlocks.RUBY_BLOCK.get()));

    // Ruby Ore
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () ->
            new ModBlockBase(ModBlocks.RUBY_ORE.get()));

    // Deepslate Ruby Ore
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE_ITEM = ITEMS.register("deepslate_ruby_ore", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_RUBY_ORE.get()));

    // Onyx Block
    public static final RegistryObject<Item> ONYX_BLOCK_ITEM = ITEMS.register("onyx_block", () ->
            new ModBlockBase(ModBlocks.ONYX_BLOCK.get()));

    // Onyx Ore
    public static final RegistryObject<Item> ONYX_ORE_ITEM = ITEMS.register("onyx_ore", () ->
            new ModBlockBase(ModBlocks.ONYX_ORE.get()));

    // Experience Ore
    public static final RegistryObject<Item> EXPERIENCE_ORE_ITEM = ITEMS.register("experience_ore", () ->
            new ModBlockBase(ModBlocks.EXPERIENCE_ORE.get()));

    // Deepslate Experience Ore
    public static final RegistryObject<Item> DEEPSLATE_EXPERIENCE_ORE_ITEM = ITEMS.register("deepslate_experience_ore", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get()));

    // Nether Experience Ore
    public static final RegistryObject<Item> NETHER_EXPERIENCE_ORE_ITEM = ITEMS.register("nether_experience_ore", () ->
            new ModBlockBase(ModBlocks.NETHER_EXPERIENCE_ORE.get()));

    // End Experience Ore
    public static final RegistryObject<Item> END_EXPERIENCE_ORE_ITEM = ITEMS.register("end_experience_ore", () ->
            new ModBlockBase(ModBlocks.END_EXPERIENCE_ORE.get()));

    // Bone Fossil
    public static final RegistryObject<Item> BONE_FOSSIL_ITEM = ITEMS.register("bone_fossil", () ->
            new ModBlockBase(ModBlocks.BONE_FOSSIL.get()));

    // Deepslate Bone Fossil
    public static final RegistryObject<Item> DEEPSLATE_BONE_FOSSIL_ITEM = ITEMS.register("deepslate_bone_fossil", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_BONE_FOSSIL.get()));

    // Nether Bone Fossil
    public static final RegistryObject<Item> NETHER_BONE_FOSSIL_ITEM = ITEMS.register("nether_bone_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_BONE_FOSSIL.get()));

    // End Bone Fossil
    public static final RegistryObject<Item> END_BONE_FOSSIL_ITEM = ITEMS.register("end_bone_fossil", () ->
            new ModBlockBase(ModBlocks.END_BONE_FOSSIL.get()));

    // Rib Fossil
    public static final RegistryObject<Item> RIB_FOSSIL_ITEM = ITEMS.register("rib_fossil", () ->
            new ModBlockBase(ModBlocks.RIB_FOSSIL.get()));

    // Deepslate Rib Fossil
    public static final RegistryObject<Item> DEEPSLATE_RIB_FOSSIL_ITEM = ITEMS.register("deepslate_rib_fossil", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_RIB_FOSSIL.get()));

    // Nether Rib Fossil
    public static final RegistryObject<Item> NETHER_RIB_FOSSIL_ITEM = ITEMS.register("nether_rib_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_RIB_FOSSIL.get()));

    // End Rib Fossil
    public static final RegistryObject<Item> END_RIB_FOSSIL_ITEM = ITEMS.register("end_rib_fossil", () ->
            new ModBlockBase(ModBlocks.END_RIB_FOSSIL.get()));

    // Skull Fossil
    public static final RegistryObject<Item> SKULL_FOSSIL_ITEM = ITEMS.register("skull_fossil", () ->
            new ModBlockBase(ModBlocks.SKULL_FOSSIL.get()));

    // Deepslate Skull Fossil
    public static final RegistryObject<Item> DEEPSLATE_SKULL_FOSSIL_ITEM = ITEMS.register("deepslate_skull_fossil", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_SKULL_FOSSIL.get()));

    // Nether Skull Fossil
    public static final RegistryObject<Item> NETHER_SKULL_FOSSIL_ITEM = ITEMS.register("nether_skull_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_SKULL_FOSSIL.get()));

    // End Skull Fossil
    public static final RegistryObject<Item> END_SKULL_FOSSIL_ITEM = ITEMS.register("end_skull_fossil", () ->
            new ModBlockBase(ModBlocks.END_SKULL_FOSSIL.get()));

    // Fish Fossil
    public static final RegistryObject<Item> FISH_FOSSIL_ITEM = ITEMS.register("fish_fossil", () ->
            new ModBlockBase(ModBlocks.FISH_FOSSIL.get()));

    // Deepslate Fish Fossil
    public static final RegistryObject<Item> DEEPSLATE_FISH_FOSSIL_ITEM = ITEMS.register("deepslate_fish_fossil", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_FISH_FOSSIL.get()));

    // Nether Fish Fossil
    public static final RegistryObject<Item> NETHER_FISH_FOSSIL_ITEM = ITEMS.register("nether_fish_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_FISH_FOSSIL.get()));

    // End Fish Fossil
    public static final RegistryObject<Item> END_FISH_FOSSIL_ITEM = ITEMS.register("end_fish_fossil", () ->
            new ModBlockBase(ModBlocks.END_FISH_FOSSIL.get()));

    // Shell Fossil
    public static final RegistryObject<Item> SHELL_FOSSIL_ITEM = ITEMS.register("shell_fossil", () ->
            new ModBlockBase(ModBlocks.SHELL_FOSSIL.get()));

    // Deepslate Shell Fossil
    public static final RegistryObject<Item> DEEPSLATE_SHELL_FOSSIL_ITEM = ITEMS.register("deepslate_shell_fossil", () ->
            new ModBlockBase(ModBlocks.DEEPSLATE_SHELL_FOSSIL.get()));

    // Nether Shell Fossil
    public static final RegistryObject<Item> NETHER_SHELL_FOSSIL_ITEM = ITEMS.register("nether_shell_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_SHELL_FOSSIL.get()));

    // End Shell Fossil
    public static final RegistryObject<Item> END_SHELL_FOSSIL_ITEM = ITEMS.register("end_shell_fossil", () ->
            new ModBlockBase(ModBlocks.END_SHELL_FOSSIL.get()));



    // Tools
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Sword
    public static final RegistryObject<SwordItem>TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new TopazSword(ModItemTier.TOPAZ, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Pickaxe
    public static final RegistryObject<PickaxeItem>TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () ->
            new TopazPickaxe(ModItemTier.TOPAZ, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Axe
    public static final RegistryObject<AxeItem>TOPAZ_AXE = ITEMS.register("topaz_axe", () ->
            new TopazAxe(ModItemTier.TOPAZ, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Shovel
    public static final RegistryObject<ShovelItem>TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () ->
            new TopazShovel(ModItemTier.TOPAZ, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Hoe
    public static final RegistryObject<HoeItem>TOPAZ_HOE = ITEMS.register("topaz_hoe", () ->
            new TopazHoe(ModItemTier.TOPAZ, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Sword
    public static final RegistryObject<SwordItem>SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SapphireSword(ModItemTier.SAPPHIRE, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Pickaxe
    public static final RegistryObject<PickaxeItem>SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new SapphirePickaxe(ModItemTier.SAPPHIRE, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Axe
    public static final RegistryObject<AxeItem>SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new SapphireAxe(ModItemTier.SAPPHIRE, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Shovel
    public static final RegistryObject<ShovelItem>SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new SapphireShovel(ModItemTier.SAPPHIRE, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Hoe
    public static final RegistryObject<HoeItem>SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new SapphireHoe(ModItemTier.SAPPHIRE, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Sword
    public static final RegistryObject<SwordItem>RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new RubySword(ModItemTier.RUBY, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Pickaxe
    public static final RegistryObject<PickaxeItem>RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new RubyPickaxe(ModItemTier.RUBY, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Axe
    public static final RegistryObject<AxeItem>RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new RubyAxe(ModItemTier.RUBY, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Shovel
    public static final RegistryObject<ShovelItem>RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new RubyShovel(ModItemTier.RUBY, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Hoe
    public static final RegistryObject<HoeItem>RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new RubyHoe(ModItemTier.RUBY, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Sword
    public static final RegistryObject<SwordItem>DRAGONYX_SWORD = ITEMS.register("dragonyx_sword", () ->
            new DragonyxSword(ModItemTier.DRAGONYX, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Pickaxe
    public static final RegistryObject<PickaxeItem>DRAGONYX_PICKAXE = ITEMS.register("dragonyx_pickaxe", () ->
            new DragonyxPickaxe(ModItemTier.DRAGONYX, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Axe
    public static final RegistryObject<AxeItem>DRAGONYX_AXE = ITEMS.register("dragonyx_axe", () ->
            new DragonyxAxe(ModItemTier.DRAGONYX, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Shovel
    public static final RegistryObject<ShovelItem>DRAGONYX_SHOVEL = ITEMS.register("dragonyx_shovel", () ->
            new DragonyxShovel(ModItemTier.DRAGONYX, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Hoe
    public static final RegistryObject<HoeItem>DRAGONYX_HOE = ITEMS.register("dragonyx_hoe", () ->
            new DragonyxHoe(ModItemTier.DRAGONYX, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Sword
    public static final RegistryObject<SwordItem>EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new EmeraldSword(ModItemTier.EMERALD, 5, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Pickaxe
    public static final RegistryObject<PickaxeItem>EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new EmeraldPickaxe(ModItemTier.EMERALD, 3, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Axe
    public static final RegistryObject<AxeItem>EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new EmeraldAxe(ModItemTier.EMERALD, 5, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Shovel
    public static final RegistryObject<ShovelItem>EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new EmeraldShovel(ModItemTier.EMERALD, 3.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Hoe
    public static final RegistryObject<HoeItem>EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new EmeraldHoe(ModItemTier.EMERALD, 0, -1.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));



    // Armour
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Helmet
    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Chestplate
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Leggings
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Boots
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlot.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Helmet
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Chestplate
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Leggings
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Boots
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Helmet
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlot.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Chestplate
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlot.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Leggings
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlot.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Boots
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlot.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Helmet
    public static final RegistryObject<ArmorItem> DRAGONYX_HELMET = ITEMS.register("dragonyx_helmet", () ->
            new DragonyxArmor(ModArmorMaterial.DRAGONYX, EquipmentSlot.HEAD, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Chestplate
    public static final RegistryObject<ArmorItem> DRAGONYX_CHESTPLATE = ITEMS.register("dragonyx_chestplate", () ->
            new DragonyxArmor(ModArmorMaterial.DRAGONYX, EquipmentSlot.CHEST, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Leggings
    public static final RegistryObject<ArmorItem> DRAGONYX_LEGGINGS = ITEMS.register("dragonyx_leggings", () ->
            new DragonyxArmor(ModArmorMaterial.DRAGONYX, EquipmentSlot.LEGS, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Dragonyx Boots
    public static final RegistryObject<ArmorItem> DRAGONYX_BOOTS = ITEMS.register("dragonyx_boots", () ->
            new DragonyxArmor(ModArmorMaterial.DRAGONYX, EquipmentSlot.FEET, new Item.Properties()
                    .fireResistant()
                    .rarity(Rarity.EPIC)
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Helmet
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new EmeraldArmor(ModArmorMaterial.EMERALD, EquipmentSlot.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Chestplate
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new EmeraldArmor(ModArmorMaterial.EMERALD, EquipmentSlot.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Leggings
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new EmeraldArmor(ModArmorMaterial.EMERALD, EquipmentSlot.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Boots
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new EmeraldArmor(ModArmorMaterial.EMERALD, EquipmentSlot.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));



    // Bows
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Bow
    public static final RegistryObject<Item> BOW = REPLACE.register("bow", () ->
            new WoodenBow(new Item.Properties()));

    // Iron Bow
    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow", () ->
            new IronBow(new Item.Properties()));

    // Golden Bow
    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow", () ->
            new GoldenBow(new Item.Properties()));

    // Diamond Bow
    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow", () ->
            new DiamondBow(new Item.Properties()));

    // Netherite Bow
    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () ->
            new NetheriteBow(new Item.Properties()));

    // Topaz Bow
    public static final RegistryObject<Item> TOPAZ_BOW = ITEMS.register("topaz_bow", () ->
            new TopazBow(new Item.Properties()));

    // Sapphire Bow
    public static final RegistryObject<Item> SAPPHIRE_BOW = ITEMS.register("sapphire_bow", () ->
            new SapphireBow(new Item.Properties()));

    // Ruby Bow
    public static final RegistryObject<Item> RUBY_BOW = ITEMS.register("ruby_bow", () ->
            new RubyBow(new Item.Properties()));

    // Dragonyx Bow
    public static final RegistryObject<Item> DRAGONYX_BOW = ITEMS.register("dragonyx_bow", () ->
            new DragonyxBow(new Item.Properties()));

    // Emerald Bow
    public static final RegistryObject<Item> EMERALD_BOW = ITEMS.register("emerald_bow", () ->
            new EmeraldBow(new Item.Properties()));



    // Crossbows
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Crossbow
    public static final RegistryObject<Item> CROSSBOW = REPLACE.register("crossbow", () ->
            new WoodenCrossbow(new Item.Properties()));

    // Iron Crossbow
    public static final RegistryObject<Item> IRON_CROSSBOW = ITEMS.register("iron_crossbow", () ->
            new IronCrossbow(new Item.Properties()));

    // Golden Crossbow
    public static final RegistryObject<Item> GOLDEN_CROSSBOW = ITEMS.register("golden_crossbow", () ->
            new GoldenCrossbow(new Item.Properties()));

    // Diamond Crossbow
    public static final RegistryObject<Item> DIAMOND_CROSSBOW = ITEMS.register("diamond_crossbow", () ->
            new DiamondCrossbow(new Item.Properties()));

    // Netherite Crossbow
    public static final RegistryObject<Item> NETHERITE_CROSSBOW = ITEMS.register("netherite_crossbow", () ->
            new NetheriteCrossbow(new Item.Properties()));

    // Topaz Crossbow
    public static final RegistryObject<Item> TOPAZ_CROSSBOW = ITEMS.register("topaz_crossbow", () ->
            new TopazCrossbow(new Item.Properties()));

    // Sapphire Crossbow
    public static final RegistryObject<Item> SAPPHIRE_CROSSBOW = ITEMS.register("sapphire_crossbow", () ->
            new SapphireCrossbow(new Item.Properties()));

    // Ruby Crossbow
    public static final RegistryObject<Item> RUBY_CROSSBOW = ITEMS.register("ruby_crossbow", () ->
            new RubyCrossbow(new Item.Properties()));

    // Dragonyx Crossbow
    public static final RegistryObject<Item> DRAGONYX_CROSSBOW = ITEMS.register("dragonyx_crossbow", () ->
            new DragonyxCrossbow(new Item.Properties()));

    // Emerald Crossbow
    public static final RegistryObject<Item> EMERALD_CROSSBOW = ITEMS.register("emerald_crossbow", () ->
            new EmeraldCrossbow(new Item.Properties()));



    // Shields
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Shield
    public static final RegistryObject<Item> SHIELD = REPLACE.register("shield", () ->
            new WoodenShield(new Item.Properties()));

    // Iron Shield
    public static final RegistryObject<Item> IRON_SHIELD = ITEMS.register("iron_shield", () ->
            new IronShield(new Item.Properties()));

    // Golden Shield
    public static final RegistryObject<Item> GOLDEN_SHIELD = ITEMS.register("golden_shield", () ->
            new GoldenShield(new Item.Properties()));

    // Diamond Shield
    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield", () ->
            new DiamondShield(new Item.Properties()));

    // Netherite Shield
    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield", () ->
            new NetheriteShield(new Item.Properties()));

    // Topaz Shield
    public static final RegistryObject<Item> TOPAZ_SHIELD = ITEMS.register("topaz_shield", () ->
            new TopazShield(new Item.Properties()));

    // Sapphire Shield
    public static final RegistryObject<Item> SAPPHIRE_SHIELD = ITEMS.register("sapphire_shield", () ->
            new SapphireShield(new Item.Properties()));

    // Ruby Shield
    public static final RegistryObject<Item> RUBY_SHIELD = ITEMS.register("ruby_shield", () ->
            new RubyShield(new Item.Properties()));

    // Dragonyx Shield
    public static final RegistryObject<Item> DRAGONYX_SHIELD = ITEMS.register("dragonyx_shield", () ->
            new DragonyxShield(new Item.Properties()));

    // Emerald Shield
    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield", () ->
            new EmeraldShield(new Item.Properties()));



    // Horse Armor
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Chainmail Horse Armor
    public static final RegistryObject<Item> CHAINMAIL_HORSE_ARMOR = ITEMS.register("chainmail_horse_armor", () ->
            new ChainmailHorseArmor(new Item.Properties()));

    // Netherite Horse Armor
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () ->
            new NetheriteHorseArmor(new Item.Properties()));

    // Topaz Horse Armor
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () ->
            new TopazHorseArmor(new Item.Properties()));

    // Sapphire Horse Armor
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () ->
            new SapphireHorseArmor(new Item.Properties()));

    // Ruby Horse Armor
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () ->
            new RubyHorseArmor(new Item.Properties()));

    // Dragonyx Horse Armor
    public static final RegistryObject<Item> DRAGONYX_HORSE_ARMOR = ITEMS.register("dragonyx_horse_armor", () ->
            new DragonyxHorseArmor(new Item.Properties()));

    // Emerald Horse Armor
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () ->
            new EmeraldHorseArmor(new Item.Properties()));



    // Amulets
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Golden Amulet
    public static final RegistryObject<Item> GOLDEN_AMULET = ITEMS.register("golden_amulet", () ->
            new GoldenAmulet(new Item.Properties()));

    // Topaz Amulet
    public static final RegistryObject<Item> TOPAZ_AMULET = ITEMS.register("topaz_amulet", () ->
            new TopazAmulet(new Item.Properties()));

    // Sapphire Amulet
    public static final RegistryObject<Item> SAPPHIRE_AMULET = ITEMS.register("sapphire_amulet", () ->
            new SapphireAmulet(new Item.Properties()));

    // Ruby Amulet
    public static final RegistryObject<Item> RUBY_AMULET = ITEMS.register("ruby_amulet", () ->
            new RubyAmulet(new Item.Properties()));

    // Gem Amulet
    public static final RegistryObject<Item> GEM_AMULET = ITEMS.register("gem_amulet", () ->
            new GemAmulet(new Item.Properties()));



    // Rings
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Golden Ring
    public static final RegistryObject<Item> GOLDEN_RING = ITEMS.register("golden_ring", () ->
            new GoldenRing(new Item.Properties()));

    // Topaz Ring
    public static final RegistryObject<Item> TOPAZ_RING = ITEMS.register("topaz_ring", () ->
            new TopazRing(new Item.Properties()));

    // Sapphire Ring
    public static final RegistryObject<Item> SAPPHIRE_RING = ITEMS.register("sapphire_ring", () ->
            new SapphireRing(new Item.Properties()));

    // Ruby Ring
    public static final RegistryObject<Item> RUBY_RING = ITEMS.register("ruby_ring", () ->
            new RubyRing(new Item.Properties()));

    // Gem Ring
    public static final RegistryObject<Item> GEM_RING = ITEMS.register("gem_ring", () ->
            new GemRing(new Item.Properties()));

}

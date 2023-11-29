package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModItems;
import com.foozey.gems.tag.ModItemLists;
import com.foozey.gems.tag.ModItemTagLists;
import com.foozey.gems.tag.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Gems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        // minecraft/tags/items/swords.json
        itemTag(ItemTags.SWORDS, ModItems.TOPAZ_SWORD.get());
        itemTag(ItemTags.SWORDS, ModItems.SAPPHIRE_SWORD.get());
        itemTag(ItemTags.SWORDS, ModItems.RUBY_SWORD.get());
        itemTag(ItemTags.SWORDS, ModItems.DRAGONYX_SWORD.get());
        itemTag(ItemTags.SWORDS, ModItems.EMERALD_SWORD.get());

        // minecraft/tags/items/pickaxes.json
        itemTag(ItemTags.PICKAXES, ModItems.TOPAZ_PICKAXE.get());
        itemTag(ItemTags.PICKAXES, ModItems.SAPPHIRE_PICKAXE.get());
        itemTag(ItemTags.PICKAXES, ModItems.RUBY_PICKAXE.get());
        itemTag(ItemTags.PICKAXES, ModItems.DRAGONYX_PICKAXE.get());
        itemTag(ItemTags.PICKAXES, ModItems.EMERALD_PICKAXE.get());

        // minecraft/tags/items/axes.json
        itemTag(ItemTags.AXES, ModItems.TOPAZ_AXE.get());
        itemTag(ItemTags.AXES, ModItems.SAPPHIRE_AXE.get());
        itemTag(ItemTags.AXES, ModItems.RUBY_AXE.get());
        itemTag(ItemTags.AXES, ModItems.DRAGONYX_AXE.get());
        itemTag(ItemTags.AXES, ModItems.EMERALD_AXE.get());

        // minecraft/tags/items/shovels.json
        itemTag(ItemTags.SHOVELS, ModItems.TOPAZ_SHOVEL.get());
        itemTag(ItemTags.SHOVELS, ModItems.SAPPHIRE_SHOVEL.get());
        itemTag(ItemTags.SHOVELS, ModItems.RUBY_SHOVEL.get());
        itemTag(ItemTags.SHOVELS, ModItems.DRAGONYX_SHOVEL.get());
        itemTag(ItemTags.SHOVELS, ModItems.EMERALD_SHOVEL.get());

        // minecraft/tags/items/hoes.json
        itemTag(ItemTags.HOES, ModItems.TOPAZ_HOE.get());
        itemTag(ItemTags.HOES, ModItems.SAPPHIRE_HOE.get());
        itemTag(ItemTags.HOES, ModItems.RUBY_HOE.get());
        itemTag(ItemTags.HOES, ModItems.DRAGONYX_HOE.get());
        itemTag(ItemTags.HOES, ModItems.EMERALD_HOE.get());

        // minecraft/tags/items/trimmable_armor.json
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.TOPAZ_HELMET.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.TOPAZ_CHESTPLATE.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.TOPAZ_LEGGINGS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.TOPAZ_BOOTS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.SAPPHIRE_HELMET.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.SAPPHIRE_CHESTPLATE.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.SAPPHIRE_LEGGINGS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.SAPPHIRE_BOOTS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.RUBY_HELMET.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.RUBY_CHESTPLATE.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.RUBY_LEGGINGS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.RUBY_BOOTS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.DRAGONYX_HELMET.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.DRAGONYX_CHESTPLATE.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.DRAGONYX_LEGGINGS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.DRAGONYX_BOOTS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.EMERALD_HELMET.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.EMERALD_CHESTPLATE.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.EMERALD_LEGGINGS.get());
        itemTag(ItemTags.TRIMMABLE_ARMOR, ModItems.EMERALD_BOOTS.get());

        // minecraft/tags/items/trim_materials.json
        itemTag(ItemTags.TRIM_MATERIALS, ModItems.TOPAZ.get());
        itemTag(ItemTags.TRIM_MATERIALS, ModItems.SAPPHIRE.get());
        itemTag(ItemTags.TRIM_MATERIALS, ModItems.RUBY.get());
        itemTag(ItemTags.TRIM_MATERIALS, ModItems.ONYX.get());

        // forge/tags/items/gems/topaz.json
        itemTag(ModItemTags.GEMS_TOPAZ, ModItems.TOPAZ.get());

        // forge/tags/items/gems/sapphire.json
        itemTag(ModItemTags.GEMS_SAPPHIRE, ModItems.SAPPHIRE.get());

        // forge/tags/items/gems/ruby.json
        itemTag(ModItemTags.GEMS_RUBY, ModItems.RUBY.get());

        // forge/tags/items/gems/onyx.json
        itemTag(ModItemTags.GEMS_ONYX, ModItems.ONYX.get());

        // forge/tags/items/ingots/dragonyx.json
        itemTag(ModItemTags.INGOTS_DRAGONYX, ModItems.DRAGONYX_INGOT.get());

        // forge/tags/items/storage_blocks/topaz.json
        itemTag(ModItemTags.STORAGE_BLOCKS_TOPAZ, ModItems.TOPAZ_BLOCK.get());

        // forge/tags/items/storage_blocks/sapphire.json
        itemTag(ModItemTags.STORAGE_BLOCKS_SAPPHIRE, ModItems.SAPPHIRE_BLOCK.get());

        // forge/tags/items/storage_blocks/ruby.json
        itemTag(ModItemTags.STORAGE_BLOCKS_RUBY, ModItems.RUBY_BLOCK.get());

        // forge/tags/items/storage_blocks/onyx.json
        itemTag(ModItemTags.STORAGE_BLOCKS_ONYX, ModItems.ONYX_BLOCK.get());

        // forge/tags/items/ores/topaz.json
        itemTag(ModItemTags.ORES_TOPAZ, ModItems.TOPAZ_ORE.get());
        itemTag(ModItemTags.ORES_TOPAZ, ModItems.DEEPSLATE_TOPAZ_ORE.get());

        // forge/tags/items/ores/sapphire.json
        itemTag(ModItemTags.ORES_SAPPHIRE, ModItems.SAPPHIRE_ORE.get());
        itemTag(ModItemTags.ORES_SAPPHIRE, ModItems.DEEPSLATE_SAPPHIRE_ORE.get());

        // forge/tags/items/ores/ruby.json
        itemTag(ModItemTags.ORES_RUBY, ModItems.RUBY_ORE.get());
        itemTag(ModItemTags.ORES_RUBY, ModItems.DEEPSLATE_RUBY_ORE.get());

        // forge/tags/items/ores/onyx.json
        itemTag(ModItemTags.ORES_ONYX, ModItems.ONYX_ORE.get());

        // forge/tags/items/ores/experience.json
        itemTag(ModItemTags.ORES_EXPERIENCE, ModItems.EXPERIENCE_ORE.get());
        itemTag(ModItemTags.ORES_EXPERIENCE, ModItems.DEEPSLATE_EXPERIENCE_ORE.get());
        itemTag(ModItemTags.ORES_EXPERIENCE, ModItems.NETHER_EXPERIENCE_ORE.get());
        itemTag(ModItemTags.ORES_EXPERIENCE, ModItems.END_EXPERIENCE_ORE.get());

        // forge/tags/items/ores/fossil.json
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.BONE_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.DEEPSLATE_BONE_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.NETHER_BONE_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.END_BONE_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.RIB_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.DEEPSLATE_RIB_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.NETHER_RIB_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.END_RIB_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.SKULL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.DEEPSLATE_SKULL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.NETHER_SKULL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.END_SKULL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.FISH_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.DEEPSLATE_FISH_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.NETHER_FISH_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.END_FISH_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.SHELL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.DEEPSLATE_SHELL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.NETHER_SHELL_FOSSIL.get());
        itemTag(ModItemTags.ORES_FOSSIL, ModItems.END_SHELL_FOSSIL.get());

        // forge/tags/items/tools/bows.json
        itemTag(Tags.Items.TOOLS_BOWS, Items.BOW);
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.IRON_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.GOLDEN_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.DIAMOND_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.NETHERITE_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.TOPAZ_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.SAPPHIRE_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.RUBY_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.DRAGONYX_BOW.get());
        itemTag(Tags.Items.TOOLS_BOWS, ModItems.EMERALD_BOW.get());

        // forge/tags/items/tools/crossbows.json
        itemTag(Tags.Items.TOOLS_CROSSBOWS, Items.CROSSBOW);
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.IRON_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.GOLDEN_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.DIAMOND_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.NETHERITE_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.TOPAZ_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.SAPPHIRE_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.RUBY_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.DRAGONYX_CROSSBOW.get());
        itemTag(Tags.Items.TOOLS_CROSSBOWS, ModItems.EMERALD_CROSSBOW.get());

        // forge/tags/items/tools/shields.json
        itemTag(Tags.Items.TOOLS_SHIELDS, Items.SHIELD);
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.IRON_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.GOLDEN_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.DIAMOND_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.NETHERITE_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.TOPAZ_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.SAPPHIRE_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.RUBY_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.DRAGONYX_SHIELD.get());
        itemTag(Tags.Items.TOOLS_SHIELDS, ModItems.EMERALD_SHIELD.get());

        // forge/tags/items/armors/helmets.json
        itemTag(Tags.Items.ARMORS_HELMETS, ModItems.TOPAZ_HELMET.get());
        itemTag(Tags.Items.ARMORS_HELMETS, ModItems.SAPPHIRE_HELMET.get());
        itemTag(Tags.Items.ARMORS_HELMETS, ModItems.RUBY_HELMET.get());
        itemTag(Tags.Items.ARMORS_HELMETS, ModItems.DRAGONYX_HELMET.get());
        itemTag(Tags.Items.ARMORS_HELMETS, ModItems.EMERALD_HELMET.get());

        // forge/tags/items/armors/chestplates.json
        itemTag(Tags.Items.ARMORS_CHESTPLATES, ModItems.TOPAZ_CHESTPLATE.get());
        itemTag(Tags.Items.ARMORS_CHESTPLATES, ModItems.SAPPHIRE_CHESTPLATE.get());
        itemTag(Tags.Items.ARMORS_CHESTPLATES, ModItems.RUBY_CHESTPLATE.get());
        itemTag(Tags.Items.ARMORS_CHESTPLATES, ModItems.DRAGONYX_CHESTPLATE.get());
        itemTag(Tags.Items.ARMORS_CHESTPLATES, ModItems.EMERALD_CHESTPLATE.get());

        // forge/tags/items/armors/leggings.json
        itemTag(Tags.Items.ARMORS_LEGGINGS, ModItems.TOPAZ_LEGGINGS.get());
        itemTag(Tags.Items.ARMORS_LEGGINGS, ModItems.SAPPHIRE_LEGGINGS.get());
        itemTag(Tags.Items.ARMORS_LEGGINGS, ModItems.RUBY_LEGGINGS.get());
        itemTag(Tags.Items.ARMORS_LEGGINGS, ModItems.DRAGONYX_LEGGINGS.get());
        itemTag(Tags.Items.ARMORS_LEGGINGS, ModItems.EMERALD_LEGGINGS.get());

        // forge/tags/items/armors/boots.json
        itemTag(Tags.Items.ARMORS_BOOTS, ModItems.TOPAZ_BOOTS.get());
        itemTag(Tags.Items.ARMORS_BOOTS, ModItems.SAPPHIRE_BOOTS.get());
        itemTag(Tags.Items.ARMORS_BOOTS, ModItems.RUBY_BOOTS.get());
        itemTag(Tags.Items.ARMORS_BOOTS, ModItems.DRAGONYX_BOOTS.get());
        itemTag(Tags.Items.ARMORS_BOOTS, ModItems.EMERALD_BOOTS.get());

        // forge/tags/items/ore_bearing_ground/end_stone.json
        itemTag(ModItemTags.ORE_BEARING_GROUND_END_STONE, Items.END_STONE);

        // forge/tags/items/ores_in_ground/stone.json
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.TOPAZ_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.SAPPHIRE_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.RUBY_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.BONE_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.RIB_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.FISH_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_STONE, ModItems.SHELL_FOSSIL.get());

        // forge/tags/items/ores_in_ground/deepslate.json
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_TOPAZ_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_SAPPHIRE_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_RUBY_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_BONE_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_RIB_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_FISH_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_DEEPSLATE, ModItems.DEEPSLATE_SHELL_FOSSIL.get());

        // forge/tags/items/ores_in_ground/netherrack.json
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_BONE_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_RIB_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_FISH_FOSSIL.get());
        itemTag(Tags.Items.ORES_IN_GROUND_NETHERRACK, ModItems.NETHER_SHELL_FOSSIL.get());

        // forge/tags/items/ores_in_ground/end_stone.json
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.ONYX_ORE.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_EXPERIENCE_ORE.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_BONE_FOSSIL.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_RIB_FOSSIL.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_SKULL_FOSSIL.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_FISH_FOSSIL.get());
        itemTag(ModItemTags.ORES_IN_GROUND_END_STONE, ModItems.END_SHELL_FOSSIL.get());

        // forge/tags/items/ore_rates/dense.json
        itemTag(Tags.Items.ORE_RATES_DENSE, ModItems.EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORE_RATES_DENSE, ModItems.DEEPSLATE_EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORE_RATES_DENSE, ModItems.NETHER_EXPERIENCE_ORE.get());
        itemTag(Tags.Items.ORE_RATES_DENSE, ModItems.END_EXPERIENCE_ORE.get());

        // forge/tags/items/ore_rates/singular.json
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.TOPAZ_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_TOPAZ_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.SAPPHIRE_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_SAPPHIRE_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.RUBY_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_RUBY_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.ONYX_ORE.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.BONE_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_BONE_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.NETHER_BONE_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.END_BONE_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.RIB_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_RIB_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.NETHER_RIB_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.END_RIB_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.NETHER_SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.END_SKULL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.FISH_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_FISH_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.NETHER_FISH_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.END_FISH_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.SHELL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.DEEPSLATE_SHELL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.NETHER_SHELL_FOSSIL.get());
        itemTag(Tags.Items.ORE_RATES_SINGULAR, ModItems.END_SHELL_FOSSIL.get());

        // forge/tags/items/gems.json
        itemTagFromTag(Tags.Items.GEMS, ModItemTags.GEMS_TOPAZ);
        itemTagFromTag(Tags.Items.GEMS, ModItemTags.GEMS_SAPPHIRE);
        itemTagFromTag(Tags.Items.GEMS, ModItemTags.GEMS_RUBY);
        itemTagFromTag(Tags.Items.GEMS, ModItemTags.GEMS_ONYX);

        // forge/tags/items/ingots.json
        itemTagFromTag(Tags.Items.INGOTS, ModItemTags.INGOTS_DRAGONYX);

        // forge/tags/items/storage_blocks.json
        itemTagFromTag(Tags.Items.STORAGE_BLOCKS, ModItemTags.STORAGE_BLOCKS_TOPAZ);
        itemTagFromTag(Tags.Items.STORAGE_BLOCKS, ModItemTags.STORAGE_BLOCKS_SAPPHIRE);
        itemTagFromTag(Tags.Items.STORAGE_BLOCKS, ModItemTags.STORAGE_BLOCKS_RUBY);
        itemTagFromTag(Tags.Items.STORAGE_BLOCKS, ModItemTags.STORAGE_BLOCKS_ONYX);

        // forge/tags/items/ores.json
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_TOPAZ);
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_SAPPHIRE);
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_RUBY);
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_ONYX);
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_EXPERIENCE);
        itemTagFromTag(Tags.Items.ORES, ModItemTags.ORES_FOSSIL);

        // forge/tags/items/tools.json
        itemTagFromTag(Tags.Items.TOOLS, ItemTags.SWORDS);
        itemTagFromTag(Tags.Items.TOOLS, ItemTags.PICKAXES);
        itemTagFromTag(Tags.Items.TOOLS, ItemTags.AXES);
        itemTagFromTag(Tags.Items.TOOLS, ItemTags.SHOVELS);
        itemTagFromTag(Tags.Items.TOOLS, ItemTags.HOES);
        itemTagFromTag(Tags.Items.TOOLS, Tags.Items.TOOLS_BOWS);
        itemTagFromTag(Tags.Items.TOOLS, Tags.Items.TOOLS_CROSSBOWS);
        itemTagFromTag(Tags.Items.TOOLS, Tags.Items.TOOLS_SHIELDS);

        // forge/tags/items/armors.json
        itemTagFromTag(Tags.Items.ARMORS, Tags.Items.ARMORS_HELMETS);
        itemTagFromTag(Tags.Items.ARMORS, Tags.Items.ARMORS_CHESTPLATES);
        itemTagFromTag(Tags.Items.ARMORS, Tags.Items.ARMORS_LEGGINGS);
        itemTagFromTag(Tags.Items.ARMORS, Tags.Items.ARMORS_BOOTS);

        // curios/tags/items/necklace.json
        itemTag(ModItemTags.NECKLACE, ModItems.GOLDEN_NECKLACE.get());
        itemTag(ModItemTags.NECKLACE, ModItems.TOPAZ_NECKLACE.get());
        itemTag(ModItemTags.NECKLACE, ModItems.SAPPHIRE_NECKLACE.get());
        itemTag(ModItemTags.NECKLACE, ModItems.RUBY_NECKLACE.get());
        itemTag(ModItemTags.NECKLACE, ModItems.GEM_NECKLACE.get());

        // curios/tags/items/ring.json
        itemTag(ModItemTags.RING, ModItems.GOLDEN_RING.get());
        itemTag(ModItemTags.RING, ModItems.TOPAZ_RING.get());
        itemTag(ModItemTags.RING, ModItems.SAPPHIRE_RING.get());
        itemTag(ModItemTags.RING, ModItems.RUBY_RING.get());
        itemTag(ModItemTags.RING, ModItems.GEM_RING.get());

        // gems/tags/items/materials/gems.json
        ModItemLists.GEMS.forEach(item -> itemTag(ModItemTags.GEMS, item));

        // gems/tags/items/materials/shards.json
        ModItemLists.SHARDS.forEach(item -> itemTag(ModItemTags.SHARDS, item));

        // gems/tags/items/materials/ingots.json
        ModItemLists.INGOTS.forEach(item -> itemTag(ModItemTags.INGOTS, item));

        // gems/tags/items/storage_blocks/gem_blocks.json
        ModItemLists.GEM_BLOCKS.forEach(item -> itemTag(ModItemTags.GEM_BLOCKS, item));

        // gems/tags/items/ores/topaz_ores.json
        ModItemLists.TOPAZ_ORES.forEach(item -> itemTag(ModItemTags.TOPAZ_ORES, item));

        // gems/tags/items/ores/sapphire_ores.json
        ModItemLists.SAPPHIRE_ORES.forEach(item -> itemTag(ModItemTags.SAPPHIRE_ORES, item));

        // gems/tags/items/ores/ruby_ores.json
        ModItemLists.RUBY_ORES.forEach(item -> itemTag(ModItemTags.RUBY_ORES, item));

        // gems/tags/items/ores/onyx_ores.json
        ModItemLists.ONYX_ORES.forEach(item -> itemTag(ModItemTags.ONYX_ORES, item));

        // gems/tags/items/ores/experience_ores.json
        ModItemLists.EXPERIENCE_ORES.forEach(item -> itemTag(ModItemTags.EXPERIENCE_ORES, item));

        // gems/tags/items/ores/fossils.json
        ModItemLists.FOSSILS.forEach(item -> itemTag(ModItemTags.FOSSILS, item));

        // gems/tags/items/emissive/emissive_items.json
        ModItemLists.EMISSIVE_ITEMS.forEach(item -> itemTag(ModItemTags.EMISSIVE_ITEMS, item));

        // gems/tags/items/emissive/emissive_blocks.json
        ModItemLists.EMISSIVE_BLOCKS.forEach(item -> itemTag(ModItemTags.EMISSIVE_BLOCKS, item));

        // gems/tags/items/tools/swords.json
        ModItemLists.SWORDS.forEach(item -> itemTag(ModItemTags.SWORDS, item));

        // gems/tags/items/tools/pickaxes.json
        ModItemLists.PICKAXES.forEach(item -> itemTag(ModItemTags.PICKAXES, item));

        // gems/tags/items/tools/axes.json
        ModItemLists.AXES.forEach(item -> itemTag(ModItemTags.AXES, item));

        // gems/tags/items/tools/shovels.json
        ModItemLists.SHOVELS.forEach(item -> itemTag(ModItemTags.SHOVELS, item));

        // gems/tags/items/tools/hoes.json
        ModItemLists.HOES.forEach(item -> itemTag(ModItemTags.HOES, item));

        // gems/tags/items/armor/helmets.json
        ModItemLists.HELMETS.forEach(item -> itemTag(ModItemTags.HELMETS, item));

        // gems/tags/items/armor/chestplates.json
        ModItemLists.CHESTPLATES.forEach(item -> itemTag(ModItemTags.CHESTPLATES, item));

        // gems/tags/items/armor/leggings.json
        ModItemLists.LEGGINGS.forEach(item -> itemTag(ModItemTags.LEGGINGS, item));

        // gems/tags/items/armor/boots.json
        ModItemLists.BOOTS.forEach(item -> itemTag(ModItemTags.BOOTS, item));

        // gems/tags/items/tools/bows.json
        ModItemLists.BOWS.forEach(item -> itemTag(ModItemTags.BOWS, item));

        // gems/tags/items/tools/crossbows.json
        ModItemLists.CROSSBOWS.forEach(item -> itemTag(ModItemTags.CROSSBOWS, item));

        // gems/tags/items/tools/shields.json
        ModItemLists.SHIELDS.forEach(item -> itemTag(ModItemTags.SHIELDS, item));

        // gems/tags/items/armor/entities/horse_armor.json
        ModItemLists.HORSE_ARMOR.forEach(item -> itemTag(ModItemTags.HORSE_ARMOR, item));

        // gems/tags/items/smithing_templates.json
        ModItemLists.SMITHING_TEMPLATES.forEach(item -> itemTag(ModItemTags.SMITHING_TEMPLATES, item));

        // gems/tags/items/curios/necklaces.json
        ModItemLists.NECKLACES.forEach(item -> itemTag(ModItemTags.NECKLACES, item));

        // gems/tags/items/curios/rings.json
        ModItemLists.RINGS.forEach(item -> itemTag(ModItemTags.RINGS, item));

        // gems/tags/items/materials.json
        ModItemTagLists.MATERIALS.forEach(tagKey -> itemTagFromTag(ModItemTags.MATERIALS, tagKey));

        // gems/tags/items/storage_blocks.json
        ModItemTagLists.STORAGE_BLOCKS.forEach(tagKey -> itemTagFromTag(ModItemTags.STORAGE_BLOCKS, tagKey));

        // gems/tags/items/ores.json
        ModItemTagLists.ORES.forEach(tagKey -> itemTagFromTag(ModItemTags.ORES, tagKey));

        // gems/tags/items/tools.json
        ModItemTagLists.TOOLS.forEach(tagKey -> itemTagFromTag(ModItemTags.TOOLS, tagKey));

        // gems/tags/items/armor.json
        ModItemTagLists.ARMOR.forEach(tagKey -> itemTagFromTag(ModItemTags.ARMOR, tagKey));

        // gems/tags/items/armor_entities.json
        ModItemTagLists.ARMOR_ENTITIES.forEach(tagKey -> itemTagFromTag(ModItemTags.ARMOR_ENTITIES, tagKey));

        // gems/tags/items/curios.json
        ModItemTagLists.CURIOS.forEach(tagKey -> itemTagFromTag(ModItemTags.CURIOS, tagKey));

    }

    private void itemTag(TagKey<Item> tagKey, Item item) {
        tag(tagKey).add(item);
    }

    private void itemTagFromTag(TagKey<Item> tagKey, TagKey<Item> itemTag) {
        tag(tagKey).addTag(itemTag);
    }

}

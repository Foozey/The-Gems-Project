package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModItems;
import com.foozey.gems.registry.ModRecipeSerializers;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {

        // Shaped
        shapedRecipe(ModItems.TOPAZ.get(), 1, RecipeCategory.MISC, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.TOPAZ_SHARDS.get()));
        shapedRecipe(ModItems.TOPAZ_BLOCK.get(), 1, RecipeCategory.BUILDING_BLOCKS, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.TOPAZ.get()));
        shapedRecipe(ModItems.SAPPHIRE.get(), 1, RecipeCategory.MISC, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.SAPPHIRE_SHARDS.get()));
        shapedRecipe(ModItems.SAPPHIRE_BLOCK.get(), 1, RecipeCategory.BUILDING_BLOCKS, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.SAPPHIRE.get()));
        shapedRecipe(ModItems.RUBY.get(), 1, RecipeCategory.MISC, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.RUBY_SHARDS.get()));
        shapedRecipe(ModItems.RUBY_BLOCK.get(), 1, RecipeCategory.BUILDING_BLOCKS, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.RUBY.get()));
        shapedRecipe(ModItems.ONYX.get(), 1, RecipeCategory.MISC, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.ONYX_SHARDS.get()));
        shapedRecipe(ModItems.ONYX_BLOCK.get(), 1, RecipeCategory.BUILDING_BLOCKS, writer, new String[]{"aaa", "aaa", "aaa"}, Map.of('a', ModItems.ONYX.get()));
        shapedRecipe(ModItems.ENDER_MATTER.get(), 1, RecipeCategory.MISC, writer, new String[]{"bab", "aca", "bab"}, Map.of('a', Items.AMETHYST_SHARD, 'b', ModItems.ENDER_BONES.get(), 'c', ModItems.ENDER_SCALES.get()));
        shapedRecipe(ModItems.CHAINMAIL.get(), 1, RecipeCategory.MISC, writer, new String[]{" aa", "a a", "aa "}, Map.of('a', Items.IRON_NUGGET));
        shapedRecipe(ModItems.EMERALD_SWORD.get(), 1, RecipeCategory.COMBAT, writer, new String[]{" b ", " b ", " a "}, Map.of('a', Items.STICK, 'b', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_PICKAXE.get(), 1, RecipeCategory.TOOLS, writer, new String[]{"bbb", " a ", " a "}, Map.of('a', Items.STICK, 'b', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_AXE.get(), 1, RecipeCategory.TOOLS, writer, new String[]{"bb ", "ba ", " a "}, Map.of('a', Items.STICK, 'b', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_SHOVEL.get(), 1, RecipeCategory.TOOLS, writer, new String[]{" b ", " a ", " a "}, Map.of('a', Items.STICK, 'b', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_HOE.get(), 1, RecipeCategory.TOOLS, writer, new String[]{"bb ", " a ", " a "}, Map.of('a', Items.STICK, 'b', Items.EMERALD));
        shapedRecipe(Items.CHAINMAIL_HELMET, 1, RecipeCategory.COMBAT, writer, new String[]{"aaa", "a a"}, Map.of('a', ModItems.CHAINMAIL.get()));
        shapedRecipe(Items.CHAINMAIL_CHESTPLATE, 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "aaa"}, Map.of('a', ModItems.CHAINMAIL.get()));
        shapedRecipe(Items.CHAINMAIL_LEGGINGS, 1, RecipeCategory.COMBAT, writer, new String[]{"aaa", "a a", "a a"}, Map.of('a', ModItems.CHAINMAIL.get()));
        shapedRecipe(Items.CHAINMAIL_BOOTS, 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "a a"}, Map.of('a', ModItems.CHAINMAIL.get()));
        shapedRecipe(ModItems.EMERALD_HELMET.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"aaa", "a a"}, Map.of('a', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_CHESTPLATE.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "aaa"}, Map.of('a', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_LEGGINGS.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"aaa", "a a", "a a"}, Map.of('a', Items.EMERALD));
        shapedRecipe(ModItems.EMERALD_BOOTS.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "a a"}, Map.of('a', Items.EMERALD));
        shapedRecipe(ModItems.IRON_BOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{" ba", "b a", " ba"}, Map.of('a', Items.STRING, 'b', Items.IRON_INGOT));
        shapedRecipe(ModItems.GOLDEN_BOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{" ba", "b a", " ba"}, Map.of('a', Items.STRING, 'b', Items.GOLD_INGOT));
        shapedRecipe(ModItems.DIAMOND_BOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{" ba", "b a", " ba"}, Map.of('a', Items.STRING, 'b', Items.DIAMOND));
        shapedRecipe(ModItems.EMERALD_BOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{" ba", "b a", " ba"}, Map.of('a', Items.STRING, 'b', Items.EMERALD));
        shapedRecipe(ModItems.IRON_CROSSBOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"dbd", "aca", " d "}, Map.of('a', Items.STRING, 'b', Items.IRON_INGOT, 'c', Items.TRIPWIRE_HOOK, 'd', Items.IRON_INGOT));
        shapedRecipe(ModItems.GOLDEN_CROSSBOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"dbd", "aca", " d "}, Map.of('a', Items.STRING, 'b', Items.IRON_INGOT, 'c', Items.TRIPWIRE_HOOK, 'd', Items.GOLD_INGOT));
        shapedRecipe(ModItems.DIAMOND_CROSSBOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"dbd", "aca", " d "}, Map.of('a', Items.STRING, 'b', Items.IRON_INGOT, 'c', Items.TRIPWIRE_HOOK, 'd', Items.DIAMOND));
        shapedRecipe(ModItems.EMERALD_CROSSBOW.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"dbd", "aca", " d "}, Map.of('a', Items.STRING, 'b', Items.IRON_INGOT, 'c', Items.TRIPWIRE_HOOK, 'd', Items.EMERALD));
        shapedRecipe(ModItems.IRON_SHIELD.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"bab", "bbb", " b "}, Map.of('a', Items.IRON_INGOT, 'b', Items.IRON_INGOT));
        shapedRecipe(ModItems.GOLDEN_SHIELD.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"bab", "bbb", " b "}, Map.of('a', Items.IRON_INGOT, 'b', Items.GOLD_INGOT));
        shapedRecipe(ModItems.DIAMOND_SHIELD.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"bab", "bbb", " b "}, Map.of('a', Items.IRON_INGOT, 'b', Items.DIAMOND));
        shapedRecipe(ModItems.EMERALD_SHIELD.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"bab", "bbb", " b "}, Map.of('a', Items.IRON_INGOT, 'b', Items.EMERALD));
        shapedRecipe(ModItems.CHAINMAIL_HORSE_ARMOR.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "a a"}, Map.of('a', ModItems.CHAINMAIL.get()));
        shapedRecipe(Items.IRON_HORSE_ARMOR, 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "a a"}, Map.of('a', Items.IRON_INGOT));
        shapedRecipe(Items.GOLDEN_HORSE_ARMOR, 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "a a"}, Map.of('a', Items.GOLD_INGOT));
        shapedRecipe(Items.DIAMOND_HORSE_ARMOR, 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "a a"}, Map.of('a', Items.DIAMOND));
        shapedRecipe(ModItems.EMERALD_HORSE_ARMOR.get(), 1, RecipeCategory.COMBAT, writer, new String[]{"a a", "aaa", "a a"}, Map.of('a', Items.EMERALD));
        shapedRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), 2, RecipeCategory.MISC, writer, new String[]{"aba", "aca", "aaa"}, Map.of('a', Items.DIAMOND, 'b', ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), 'c', Items.DEEPSLATE));
        shapedRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), 2, RecipeCategory.MISC, writer, new String[]{"aba", "aca", "aaa"}, Map.of('a', Items.DIAMOND, 'b', ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), 'c', Items.DEEPSLATE));
        shapedRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), 2, RecipeCategory.MISC, writer, new String[]{"aba", "aca", "aaa"}, Map.of('a', Items.DIAMOND, 'b', ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), 'c', Items.DEEPSLATE));
        shapedRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), 2, RecipeCategory.MISC, writer, new String[]{"aba", "aca", "aaa"}, Map.of('a', Items.DIAMOND, 'b', ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), 'c', Items.END_STONE));
        shapedRecipe(ModItems.GOLDEN_NECKLACE.get(), 1, RecipeCategory.MISC, writer, new String[]{"aaa", "a a", " a "}, Map.of('a', Items.GOLD_INGOT));
        shapedRecipe(ModItems.GOLDEN_RING.get(), 1, RecipeCategory.MISC, writer, new String[]{" a ", "a a", " a "}, Map.of('a', Items.GOLD_INGOT));

        // Shapeless
        shapelessRecipe(ModItems.TOPAZ.get(), 9, RecipeCategory.MISC, writer, ModItems.TOPAZ_BLOCK.get(), 1);
        shapelessRecipe(ModItems.TOPAZ_SHARDS.get(), 9, RecipeCategory.MISC, writer, ModItems.TOPAZ.get(), 1);
        shapelessRecipe(ModItems.SAPPHIRE.get(), 9, RecipeCategory.MISC, writer, ModItems.SAPPHIRE_BLOCK.get(), 1);
        shapelessRecipe(ModItems.SAPPHIRE_SHARDS.get(), 9, RecipeCategory.MISC, writer, ModItems.SAPPHIRE.get(), 1);
        shapelessRecipe(ModItems.RUBY.get(), 9, RecipeCategory.MISC, writer, ModItems.RUBY_BLOCK.get(), 1);
        shapelessRecipe(ModItems.RUBY_SHARDS.get(), 9, RecipeCategory.MISC, writer, ModItems.RUBY.get(), 1);
        shapelessRecipe(ModItems.ONYX.get(), 9, RecipeCategory.MISC, writer, ModItems.ONYX_BLOCK.get(), 1);
        shapelessRecipe(ModItems.ONYX_SHARDS.get(), 9, RecipeCategory.MISC, writer, ModItems.ONYX.get(), 1);
        shapelessRecipe(ModItems.DRAGONYX_INGOT.get(), 1, RecipeCategory.MISC, writer, ModItems.ONYX.get(), 4, ModItems.ENDER_MATTER.get(), 4);
        shapelessRecipe(Items.BONE, 16, RecipeCategory.MISC, writer, ModItems.ENDER_BONES.get(), 1);
        shapelessRecipe(ModItems.TOPAZ_NECKLACE.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_NECKLACE.get(), 1, ModItems.TOPAZ.get(), 1);
        shapelessRecipe(ModItems.TOPAZ_RING.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_RING.get(), 1, ModItems.TOPAZ.get(), 1);
        shapelessRecipe(ModItems.SAPPHIRE_NECKLACE.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_NECKLACE.get(), 1, ModItems.SAPPHIRE.get(), 1);
        shapelessRecipe(ModItems.SAPPHIRE_RING.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_RING.get(), 1, ModItems.SAPPHIRE.get(), 1);
        shapelessRecipe(ModItems.RUBY_NECKLACE.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_NECKLACE.get(), 1, ModItems.RUBY.get(), 1);
        shapelessRecipe(ModItems.RUBY_RING.get(), 1, RecipeCategory.MISC, writer, ModItems.GOLDEN_RING.get(), 1, ModItems.RUBY.get(), 1);
        shapelessRecipe(ModItems.GEM_NECKLACE.get(), 1, RecipeCategory.MISC, writer, ModItems.TOPAZ_NECKLACE.get(), 1, ModItems.SAPPHIRE_NECKLACE.get(), 1, ModItems.RUBY_NECKLACE.get(), 1);
        shapelessRecipe(ModItems.GEM_RING.get(), 1, RecipeCategory.MISC, writer, ModItems.TOPAZ_RING.get(), 1, ModItems.SAPPHIRE_RING.get(), 1, ModItems.RUBY_RING.get(), 1);

        // Smelting
        smeltingRecipe(ModItems.TOPAZ_SHARDS.get(), ModItems.TOPAZ_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.TOPAZ_SHARDS.get(), ModItems.DEEPSLATE_TOPAZ_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.SAPPHIRE_SHARDS.get(), ModItems.SAPPHIRE_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.SAPPHIRE_SHARDS.get(), ModItems.DEEPSLATE_SAPPHIRE_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.RUBY_SHARDS.get(), ModItems.RUBY_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.RUBY_SHARDS.get(), ModItems.DEEPSLATE_RUBY_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(ModItems.ONYX_SHARDS.get(), ModItems.ONYX_ORE.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.DEEPSLATE_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.NETHER_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.END_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.DEEPSLATE_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.NETHER_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.END_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.DEEPSLATE_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.NETHER_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.END_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.DEEPSLATE_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.NETHER_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.END_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.DEEPSLATE_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.NETHER_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);
        smeltingRecipe(Items.BONE, ModItems.END_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 200, writer);

        // Blasting
        blastingRecipe(ModItems.TOPAZ_SHARDS.get(), ModItems.TOPAZ_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.TOPAZ_SHARDS.get(), ModItems.DEEPSLATE_TOPAZ_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.SAPPHIRE_SHARDS.get(), ModItems.SAPPHIRE_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.SAPPHIRE_SHARDS.get(), ModItems.DEEPSLATE_SAPPHIRE_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.RUBY_SHARDS.get(), ModItems.RUBY_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.RUBY_SHARDS.get(), ModItems.DEEPSLATE_RUBY_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(ModItems.ONYX_SHARDS.get(), ModItems.ONYX_ORE.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.DEEPSLATE_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.NETHER_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.END_BONE_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.DEEPSLATE_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.NETHER_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.END_RIB_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.DEEPSLATE_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.NETHER_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.END_SKULL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.DEEPSLATE_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.NETHER_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.END_FISH_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.DEEPSLATE_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.NETHER_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);
        blastingRecipe(Items.BONE, ModItems.END_SHELL_FOSSIL.get(), RecipeCategory.MISC, 1.0F, 100, writer);

        // Smithing
        smithingRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_BOW.get(), Items.NETHERITE_INGOT, ModItems.NETHERITE_BOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_CROSSBOW.get(), Items.NETHERITE_INGOT, ModItems.NETHERITE_CROSSBOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_SHIELD.get(), Items.NETHERITE_INGOT, ModItems.NETHERITE_SHIELD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, Items.DIAMOND_HORSE_ARMOR, Items.NETHERITE_INGOT, ModItems.NETHERITE_HORSE_ARMOR.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_SWORD, ModItems.TOPAZ.get(), ModItems.TOPAZ_SWORD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_PICKAXE, ModItems.TOPAZ.get(), ModItems.TOPAZ_PICKAXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_AXE, ModItems.TOPAZ.get(), ModItems.TOPAZ_AXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_SHOVEL, ModItems.TOPAZ.get(), ModItems.TOPAZ_SHOVEL.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_HOE, ModItems.TOPAZ.get(), ModItems.TOPAZ_HOE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_HELMET, ModItems.TOPAZ.get(), ModItems.TOPAZ_HELMET.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_CHESTPLATE, ModItems.TOPAZ.get(), ModItems.TOPAZ_CHESTPLATE.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_LEGGINGS, ModItems.TOPAZ.get(), ModItems.TOPAZ_LEGGINGS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Items.NETHERITE_BOOTS, ModItems.TOPAZ.get(), ModItems.TOPAZ_BOOTS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.NETHERITE_BOW.get(), ModItems.TOPAZ.get(), ModItems.TOPAZ_BOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.NETHERITE_CROSSBOW.get(), ModItems.TOPAZ.get(), ModItems.TOPAZ_CROSSBOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.NETHERITE_SHIELD.get(), ModItems.TOPAZ.get(), ModItems.TOPAZ_SHIELD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.NETHERITE_HORSE_ARMOR.get(), ModItems.TOPAZ.get(), ModItems.TOPAZ_HORSE_ARMOR.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_SWORD.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_SWORD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_PICKAXE.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_PICKAXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_AXE.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_AXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_SHOVEL.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_SHOVEL.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_HOE.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_HOE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_HELMET.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_HELMET.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_CHESTPLATE.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_CHESTPLATE.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_LEGGINGS.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_LEGGINGS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_BOOTS.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_BOOTS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_BOW.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_BOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_CROSSBOW.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_CROSSBOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_SHIELD.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_SHIELD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.TOPAZ_HORSE_ARMOR.get(), ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_HORSE_ARMOR.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_SWORD.get(), ModItems.RUBY.get(), ModItems.RUBY_SWORD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_PICKAXE.get(), ModItems.RUBY.get(), ModItems.RUBY_PICKAXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_AXE.get(), ModItems.RUBY.get(), ModItems.RUBY_AXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_SHOVEL.get(), ModItems.RUBY.get(), ModItems.RUBY_SHOVEL.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_HOE.get(), ModItems.RUBY.get(), ModItems.RUBY_HOE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_HELMET.get(), ModItems.RUBY.get(), ModItems.RUBY_HELMET.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_CHESTPLATE.get(), ModItems.RUBY.get(), ModItems.RUBY_CHESTPLATE.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_LEGGINGS.get(), ModItems.RUBY.get(), ModItems.RUBY_LEGGINGS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_BOOTS.get(), ModItems.RUBY.get(), ModItems.RUBY_BOOTS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_BOW.get(), ModItems.RUBY.get(), ModItems.RUBY_BOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_CROSSBOW.get(), ModItems.RUBY.get(), ModItems.RUBY_CROSSBOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_SHIELD.get(), ModItems.RUBY.get(), ModItems.RUBY_SHIELD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.SAPPHIRE_HORSE_ARMOR.get(), ModItems.RUBY.get(), ModItems.RUBY_HORSE_ARMOR.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_SWORD.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_SWORD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_PICKAXE.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_PICKAXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_AXE.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_AXE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_SHOVEL.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_SHOVEL.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_HOE.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_HOE.get(), RecipeCategory.TOOLS, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_HELMET.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_HELMET.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_CHESTPLATE.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_CHESTPLATE.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_LEGGINGS.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_LEGGINGS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_BOOTS.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_BOOTS.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_BOW.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_BOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_CROSSBOW.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_CROSSBOW.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_SHIELD.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_SHIELD.get(), RecipeCategory.COMBAT, writer);
        smithingRecipe(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RUBY_HORSE_ARMOR.get(), ModItems.DRAGONYX_INGOT.get(), ModItems.DRAGONYX_HORSE_ARMOR.get(), RecipeCategory.COMBAT, writer);

        // Special
        specialRecipe(ModRecipeSerializers.BANNER_SHIELD.get(), writer);

    }

    private void shapedRecipe(ItemLike result, int count, RecipeCategory category, Consumer<FinishedRecipe> writer, String[] pattern, Map<Character, ItemLike> ingredients) {
        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(category, result, count);
        Arrays.stream(pattern).forEach(builder::pattern);
        ingredients.forEach(builder::define);
        builder.unlockedBy(getHasName(result), has(result));
        builder.save(writer, Gems.rl("shaped/" + Gems.getPath((Item) result)));
    }

    private void shapelessRecipe(ItemLike result, int count, RecipeCategory category, Consumer<FinishedRecipe> writer, Object... inputs) {
        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(category, result, count);
        for (int i = 0; i < inputs.length; i += 2) {
            ItemLike ingredient = (ItemLike) inputs[i];
            int quantity = (int) inputs[i + 1];
            builder.requires(ingredient, quantity);
            builder.unlockedBy(getHasName(ingredient), has(ingredient));
        }
        builder.save(writer, Gems.rl("shapeless/" + Gems.getPath((Item) result)));
    }

    private void smeltingRecipe(ItemLike result, ItemLike ingredient, RecipeCategory category, float experience, int cookingTime, Consumer<FinishedRecipe> writer) {
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(ingredient), category, result, experience, cookingTime)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(writer, Gems.rl("smelting/" + Gems.getPath((Item) result) + "_from_smelting_" + Gems.getPath((Item) ingredient)));
    }

    private void blastingRecipe(ItemLike result, ItemLike ingredient, RecipeCategory category, float experience, int cookingTime, Consumer<FinishedRecipe> writer) {
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ingredient), category, result, experience, cookingTime)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(writer, Gems.rl("blasting/" + Gems.getPath((Item) result) + "_from_blasting_" + Gems.getPath((Item) ingredient)));
    }

    private void smithingRecipe(ItemLike template, ItemLike base, ItemLike addition, Item result, RecipeCategory category, Consumer<FinishedRecipe> writer) {
        SmithingTransformRecipeBuilder
                .smithing(Ingredient.of(template), Ingredient.of(base), Ingredient.of(addition), category, result)
                .unlocks(getHasName(addition), has(addition))
                .save(writer, Gems.rl("smithing/" + Gems.getPath(result) + "_smithing"));
    }

    private void specialRecipe(RecipeSerializer<? extends CraftingRecipe> serializer, Consumer<FinishedRecipe> writer) {
        SpecialRecipeBuilder.special(serializer).save(writer, "gems:special/" + ForgeRegistries.RECIPE_SERIALIZERS.getKey(serializer).getPath());
    }

}

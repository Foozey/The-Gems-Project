package com.foozey.gems.item;

import com.foozey.gems.Gems;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {

    // Empty Equipment Icons
    public static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    public static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    public static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    public static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    public static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    public static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    public static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    public static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    public static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    public static final ResourceLocation EMPTY_SLOT_BOW = Gems.rl("item/empty_slot_bow");
    public static final ResourceLocation EMPTY_SLOT_CROSSBOW = Gems.rl("item/empty_slot_crossbow");
    public static final ResourceLocation EMPTY_SLOT_SHIELD = new ResourceLocation("item/empty_armor_slot_shield");
    public static final ResourceLocation EMPTY_SLOT_HORSE_ARMOR = Gems.rl("item/empty_slot_horse_armor");

    // Empty Material Icons
    public static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
    public static final ResourceLocation EMPTY_SLOT_REDSTONE_DUST = new ResourceLocation("item/empty_slot_redstone_dust");
    public static final ResourceLocation EMPTY_SLOT_LAPIS_LAZULI = new ResourceLocation("item/empty_slot_lapis_lazuli");
    public static final ResourceLocation EMPTY_SLOT_QUARTZ = new ResourceLocation("item/empty_slot_quartz");
    public static final ResourceLocation EMPTY_SLOT_DIAMOND = new ResourceLocation("item/empty_slot_diamond");
    public static final ResourceLocation EMPTY_SLOT_EMERALD = new ResourceLocation("item/empty_slot_emerald");
    public static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD = new ResourceLocation("item/empty_slot_amethyst_shard");
    public static final ResourceLocation EMPTY_SLOT_TOPAZ = Gems.rl("item/empty_slot_topaz");
    public static final ResourceLocation EMPTY_SLOT_SAPPHIRE = Gems.rl("item/empty_slot_sapphire");
    public static final ResourceLocation EMPTY_SLOT_RUBY = Gems.rl("item/empty_slot_ruby");
    public static final ResourceLocation EMPTY_SLOT_ONYX = Gems.rl("item/empty_slot_onyx");

    // Icon Lists
    public static final List<ResourceLocation> EMPTY_EQUIPMENT_ICONS = List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL, EMPTY_SLOT_BOW, EMPTY_SLOT_CROSSBOW, EMPTY_SLOT_SHIELD, EMPTY_SLOT_HORSE_ARMOR);
    public static final List<ResourceLocation> EMPTY_MATERIAL_ICONS = List.of(EMPTY_SLOT_INGOT, EMPTY_SLOT_REDSTONE_DUST, EMPTY_SLOT_LAPIS_LAZULI, EMPTY_SLOT_QUARTZ, EMPTY_SLOT_DIAMOND, EMPTY_SLOT_EMERALD, EMPTY_SLOT_AMETHYST_SHARD, EMPTY_SLOT_TOPAZ, EMPTY_SLOT_SAPPHIRE, EMPTY_SLOT_RUBY, EMPTY_SLOT_ONYX);

    public ModSmithingTemplateItem(String identifier, List<ResourceLocation> materialIcons) {
        super(appliesTo(identifier), ingredients(identifier), templateDescription(identifier), baseSlotDescription(identifier), additionsSlotDescription(identifier), equipmentIcons(), materialIcons(materialIcons));
    }

    private static Component appliesTo(String identifier) {
        return Component.translatable(Util.makeDescriptionId("item", Gems.rl("smithing_template." + identifier + ".applies_to"))).withStyle(ChatFormatting.BLUE);
    }

    private static Component ingredients(String identifier) {
        return Component.translatable(Util.makeDescriptionId("item", Gems.rl("smithing_template." + identifier + ".ingredients"))).withStyle(ChatFormatting.BLUE);
    }

    private static Component templateDescription(String identifier) {
        return Component.translatable(Util.makeDescriptionId("item", Gems.rl("smithing_template." + identifier + ".template_description"))).withStyle(ChatFormatting.GRAY);
    }

    private static Component baseSlotDescription(String identifier) {
        return Component.translatable(Util.makeDescriptionId("item", Gems.rl("smithing_template." + identifier + ".base_slot_description")));
    }

    private static Component additionsSlotDescription(String identifier) {
        return Component.translatable(Util.makeDescriptionId("item", Gems.rl("smithing_template." + identifier + ".additions_slot_description")));
    }

    private static List<ResourceLocation> equipmentIcons() {
        return EMPTY_EQUIPMENT_ICONS;
    }

    private static List<ResourceLocation> materialIcons(List<ResourceLocation> materialIcons) {
        return materialIcons;
    }

}

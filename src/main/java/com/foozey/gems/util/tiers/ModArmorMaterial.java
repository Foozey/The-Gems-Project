package com.foozey.gems.util.tiers;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    // Topaz
    TOPAZ(Gems.MOD_ID + ":topaz", 39, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () ->
            Ingredient.of(ModItems.TOPAZ.get())),

    // Sapphire
    SAPPHIRE(Gems.MOD_ID + ":sapphire", 41, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () ->
            Ingredient.of(ModItems.SAPPHIRE.get())),

    // Ruby
    RUBY(Gems.MOD_ID + ":ruby", 43, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () ->
            Ingredient.of(ModItems.RUBY.get())),

    // Infused Onyx
    INFUSED_ONYX(Gems.MOD_ID + ":infused_onyx", 50, new int[] { 3, 6, 8, 3 }, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () ->
            Ingredient.of(ModItems.INFUSED_ONYX_INGOT.get())),

    // Emerald
    EMERALD(Gems.MOD_ID + ":emerald", 15, new int[] { 2, 5, 6, 2 }, 30, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, () ->
            Ingredient.of(Items.EMERALD.asItem()));

    private static final int[] durabilityBase = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier; // Equation: durabilityBase * durabilityMultiplier = Durability
    private final int[] armorVal; // Order: Boots, Leggings, Chestplate, Helmet
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[]armorVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durabilityBase[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

}

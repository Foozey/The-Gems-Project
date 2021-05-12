package com.foozey.gems.util.tiers;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    // Topaz
    TOPAZ(Gems.MOD_ID + ":topaz", 39, new int[] { 4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () ->
            Ingredient.of(ModItems.TOPAZ.get())),

    // Sapphire
    SAPPHIRE(Gems.MOD_ID + ":sapphire", 41, new int[] { 5, 8, 10, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () ->
            Ingredient.of(ModItems.SAPPHIRE.get())),

    // Ruby
    RUBY(Gems.MOD_ID + ":ruby", 43, new int[] { 6, 9, 11, 6}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.2F, () ->
            Ingredient.of(ModItems.RUBY.get())),

    // Plated Onyx
    PLATED_ONYX(Gems.MOD_ID + ":plated_onyx", 50, new int[] { 9, 12, 14, 9}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 8.0F, 0.5F, ()
            -> Ingredient.of(ModItems.PLATED_ONYX_INGOT.get()));

    private static final int[] durabilityBase = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int durabilityMultiplier; // Equation: durabilityBase * durabilityMultiplier = Durability
    private final int[] armorVal; // damageReductionAmount int Order: Boots, Leggings, Chestplate, Helmet
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
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return this.durabilityBase[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
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

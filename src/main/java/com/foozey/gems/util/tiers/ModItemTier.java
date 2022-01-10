package com.foozey.gems.util.tiers;

import com.foozey.gems.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    // Topaz
    TOPAZ(4, 2031, 9.0F, 0.0F, 15, () ->
            Ingredient.of(ModItems.TOPAZ.get())),

    // Sapphire
    SAPPHIRE(4, 2031, 9.0F, 0.0F, 15, () ->
            Ingredient.of(ModItems.SAPPHIRE.get())),

    // Ruby
    RUBY(4, 2031, 9.0F, 0.0F, 15, () ->
            Ingredient.of(ModItems.RUBY.get())),

    // Infused Onyx
    INFUSED_ONYX(5, 2031, 9.0F, 0.0F, 15, () ->
            Ingredient.of(ModItems.INFUSED_ONYX_INGOT.get())),

    // Emerald
    EMERALD(2, 250, 6.0F, 0.0F, 30, () ->
            Ingredient.of(Items.EMERALD.asItem()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient>repairIngredient) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient.get();
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}

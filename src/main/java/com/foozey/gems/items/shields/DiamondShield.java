package com.foozey.gems.items.shields;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;

public class DiamondShield extends ShieldItem {

    public DiamondShield(Properties properties) {
        super(properties.stacksTo(1).durability(1561));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.DIAMOND.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean isShield(ItemStack stack, LivingEntity entity) {
        return true;
    }

    @Override
    public int getEnchantmentValue() {
        return 10;
    }

}

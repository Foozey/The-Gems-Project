package com.foozey.gems.items.crossbows;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class WoodenCrossbow extends CrossbowItem {

    public WoodenCrossbow(Properties properties) {
        super(properties.stacksTo(1).durability(59));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.STICK.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

package com.foozey.gems.items.crossbows;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class GoldenCrossbow extends CrossbowItem {

    public GoldenCrossbow(Properties properties) {
        super(properties.stacksTo(1).durability(32));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.GOLD_INGOT.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean useOnRelease(ItemStack stack) {
        return true;
    }

    @Override
    public int getEnchantmentValue() {
        return 22;
    }

}

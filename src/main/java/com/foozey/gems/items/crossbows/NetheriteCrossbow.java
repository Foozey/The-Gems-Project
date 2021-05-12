package com.foozey.gems.items.crossbows;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class NetheriteCrossbow extends CrossbowItem {

    public NetheriteCrossbow(Properties properties) {
        super(properties.stacksTo(1).durability(2031));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.NETHERITE_INGOT.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean useOnRelease(ItemStack stack) {
        return true;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

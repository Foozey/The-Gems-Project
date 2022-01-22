package com.foozey.gems.items.crossbows;

import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class WoodenCrossbow extends CrossbowItem {

    public WoodenCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(59)
                .tab(CreativeModeTab.TAB_COMBAT));
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

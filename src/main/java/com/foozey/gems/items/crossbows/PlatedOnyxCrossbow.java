package com.foozey.gems.items.crossbows;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class PlatedOnyxCrossbow extends CrossbowItem {

    public PlatedOnyxCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(4000)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.PLATED_ONYX_INGOT.get() || super.isValidRepairItem(toRepair, repairWith);
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

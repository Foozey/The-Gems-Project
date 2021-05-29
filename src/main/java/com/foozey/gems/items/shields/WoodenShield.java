package com.foozey.gems.items.shields;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShieldItem;

public class WoodenShield extends ShieldItem {

    public WoodenShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(59)
                .tab(ItemGroup.TAB_COMBAT));
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

package com.foozey.gems.items.shields;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShieldItem;

public class WoodenShield extends ShieldItem {

    public WoodenShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(59)
                .tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

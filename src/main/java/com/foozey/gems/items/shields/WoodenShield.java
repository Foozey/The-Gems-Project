package com.foozey.gems.items.shields;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShieldItem;

public class WoodenShield extends ShieldItem {

    // Properties (stack size, durability, creative tab)
    public WoodenShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(59)
                .tab(CreativeModeTab.TAB_COMBAT));
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

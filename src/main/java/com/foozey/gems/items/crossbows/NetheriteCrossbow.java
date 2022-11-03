package com.foozey.gems.items.crossbows;

import com.foozey.gems.items.ModTab;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class NetheriteCrossbow extends CrossbowItem {

    // Properties (stack size, durability, fire resistance, creative tab)
    public NetheriteCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.NETHERITE_INGOT.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    // Item is crossbow
    @Override
    public boolean useOnRelease(ItemStack stack) {
        return true;
    }

}

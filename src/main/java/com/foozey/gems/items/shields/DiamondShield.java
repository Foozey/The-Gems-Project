package com.foozey.gems.items.shields;

import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ProvideISTER;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShieldItem;

public class DiamondShield extends ShieldItem {

    public DiamondShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(1561)
                .setISTER(ProvideISTER::shield)
                .tab(ModTab.TAB_GEMS));
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

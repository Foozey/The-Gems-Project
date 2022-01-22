package com.foozey.gems.items.bows;

import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class WoodenBow extends BowItem {

    public WoodenBow(Properties properties) {
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
    public AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 0.7F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

package com.foozey.gems.items.bows;

import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class WoodenBow extends BowItem {

    public WoodenBow(Properties properties) {
        super(properties.stacksTo(1).durability(59));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.STICK.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 0.7F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

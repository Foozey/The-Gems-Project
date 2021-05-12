package com.foozey.gems.items.bows;

import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class IronBow extends BowItem {

    public IronBow(Properties properties) {
        super(properties.stacksTo(1).durability(250));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.IRON_INGOT.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 0.9F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 14;
    }

}

package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModItems;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class PlatedOnyxBow extends BowItem {

    public PlatedOnyxBow(Properties properties) {
        super(properties.stacksTo(1).durability(4000));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.PLATED_ONYX_INGOT.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 2.2F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

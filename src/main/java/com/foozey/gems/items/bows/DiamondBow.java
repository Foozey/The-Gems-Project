package com.foozey.gems.items.bows;

import com.foozey.gems.items.ModTab;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class DiamondBow extends BowItem {

    public DiamondBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(1561)
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.DIAMOND.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.2F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 10;
    }

}

package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class SapphireBow extends BowItem {

    public SapphireBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2500)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.SAPPHIRE.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.5F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModItems;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class RubyBow extends BowItem {

    public RubyBow(Properties properties) {
        super(properties.stacksTo(1).durability(2750));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.RUBY.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrowEntity customArrow(AbstractArrowEntity arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.7F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

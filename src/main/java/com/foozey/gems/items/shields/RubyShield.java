package com.foozey.gems.items.shields;

import com.foozey.gems.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

public class RubyShield extends ShieldItem {

    public RubyShield(Properties properties) {
        super(properties.stacksTo(1).durability(2750));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.RUBY.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean isShield(ItemStack stack, LivingEntity entity) {
        return true;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

}

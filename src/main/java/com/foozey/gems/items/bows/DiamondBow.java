package com.foozey.gems.items.bows;

import com.foozey.gems.items.ModTab;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class DiamondBow extends BowItem {

    // Properties (stack size, durability, creative tab)
    public DiamondBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(1561)
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.DIAMOND.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 10;
    }

    // Arrow damage
    @Override
    public AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.2F);
        return arrow;
    }

}

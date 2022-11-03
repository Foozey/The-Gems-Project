package com.foozey.gems.items.shields;

import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ShieldRenderPropertiesProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Consumer;

public class EmeraldShield extends ShieldItem {

    // Properties (stack size, durability, creative tab)
    public EmeraldShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(250)
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.EMERALD.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 30;
    }

    // Render
    @Override
    public void initializeClient(@NonNull Consumer<IClientItemExtensions> consumer) {
        consumer.accept(ShieldRenderPropertiesProvider.shield());
    }

}

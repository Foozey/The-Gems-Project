package com.foozey.gems.items.shields;

import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ShieldRenderPropertiesProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.IItemRenderProperties;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Consumer;

public class EmeraldShield extends ShieldItem {

    public EmeraldShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(250)
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public void initializeClient(@NonNull Consumer<IItemRenderProperties> consumer) {
        consumer.accept(ShieldRenderPropertiesProvider.shield());
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.EMERALD.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue() {
        return 30;
    }

}

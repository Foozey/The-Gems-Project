package com.foozey.gems.items.crossbows;

import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.CustomArmPoseItem;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

public class IronCrossbow extends CrossbowItem implements CustomArmPoseItem {

    // Properties (stack size, durability, creative tab)
    public IronCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(250)
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.IRON_INGOT.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 14;
    }

    // Item is crossbow
    @Override
    public boolean useOnRelease(ItemStack stack) {
        return true;
    }

    // Mixin
    @Nullable
    @Override
    public HumanoidModel.ArmPose getArmPose(ItemStack stack, AbstractClientPlayer player, InteractionHand hand) {
        if (!player.swinging) {
            return HumanoidModel.ArmPose.CROSSBOW_HOLD;
        }
        return null;
    }

}

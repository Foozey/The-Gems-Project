package com.foozey.gems.items.crossbows;

import com.foozey.gems.util.CustomArmPoseItem;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

public class WoodenCrossbow extends CrossbowItem implements CustomArmPoseItem {

    // Properties (stack size, durability, creative tab)
    public WoodenCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(59)
                .tab(CreativeModeTab.TAB_COMBAT));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.STICK.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
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

package com.foozey.gems.items.crossbows;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.CustomArmPoseItem;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class RubyCrossbow extends CrossbowItem implements CustomArmPoseItem {

    // Properties (stack size, durability, fire resistance, creative tab)
    public RubyCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.RUBY.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    // Item is crossbow
    @Override
    public boolean useOnRelease(ItemStack stack) {
        return true;
    }

    // UUIDs
    public static final UUID CROSSBOW_ATTACK_DAMAGE_UUID = UUID.fromString("e7625277-4430-4593-884a-3d020a942fcf");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_CROSSBOW.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(CROSSBOW_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
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

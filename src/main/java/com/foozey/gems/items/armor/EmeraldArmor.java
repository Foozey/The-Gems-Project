package com.foozey.gems.items.armor;

import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class EmeraldArmor extends ArmorItem {

    public EmeraldArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    // UUIDs
    public static final UUID[] ARMOR_MOVEMENT_SPEED_UUIDS = new UUID[] {
            UUID.fromString("7df207ea-1086-41fc-8bab-e2ff4fe42816"),
            UUID.fromString("a6d397f1-798c-4c64-a185-6fca0755b929"),
            UUID.fromString("3aed4c58-2750-4b28-9c61-356ee29e57cc"),
            UUID.fromString("d2350f4e-c437-4dcf-8f4d-78a9b4825123")
    };

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.EMERALD_HELMET.get() && equipmentSlot == EquipmentSlot.HEAD) {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(ARMOR_MOVEMENT_SPEED_UUIDS[equipmentSlot.getIndex()], "Movement Speed", 0.05, AttributeModifier.Operation.MULTIPLY_BASE));
        }
        else if (item == ModItems.EMERALD_CHESTPLATE.get() && equipmentSlot == EquipmentSlot.CHEST) {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(ARMOR_MOVEMENT_SPEED_UUIDS[equipmentSlot.getIndex()], "Movement Speed", 0.05, AttributeModifier.Operation.MULTIPLY_BASE));
        }
        else if (item == ModItems.EMERALD_LEGGINGS.get() && equipmentSlot == EquipmentSlot.LEGS) {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(ARMOR_MOVEMENT_SPEED_UUIDS[equipmentSlot.getIndex()], "Movement Speed", 0.05, AttributeModifier.Operation.MULTIPLY_BASE));
        }
        else if (item == ModItems.EMERALD_BOOTS.get() && equipmentSlot == EquipmentSlot.FEET) {
            builder.put(Attributes.MOVEMENT_SPEED, new AttributeModifier(ARMOR_MOVEMENT_SPEED_UUIDS[equipmentSlot.getIndex()], "Movement Speed", 0.05, AttributeModifier.Operation.MULTIPLY_BASE));
        }
        return builder.build();
    }

    // Tooltip
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("gems.set_bonus.tooltip").withStyle(ChatFormatting.GOLD).append(Component.translatable("gems.emerald_armor.tooltip").withStyle(ChatFormatting.YELLOW)));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

}

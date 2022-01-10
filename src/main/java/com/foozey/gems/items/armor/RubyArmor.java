package com.foozey.gems.items.armor;

import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class RubyArmor extends ArmorItem {

    public RubyArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    public static final UUID[] ARMOR_ATTACK_DAMAGE_UUIDS = new UUID[] {
            UUID.fromString("19157d84-8cf3-41f0-bc9a-8486eef653b8"),
            UUID.fromString("7210c8a6-844b-4ae5-adb7-6a6f4bce07c6"),
            UUID.fromString("8e018acd-a6a6-4cb1-a0d4-a673d7e041b9"),
            UUID.fromString("438ab357-364f-45fb-a06c-4f927b614504")
    };

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_HELMET.get() && equipmentSlot == EquipmentSlotType.HEAD) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ARMOR_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.RUBY_CHESTPLATE.get() && equipmentSlot == EquipmentSlotType.CHEST) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ARMOR_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.RUBY_LEGGINGS.get() && equipmentSlot == EquipmentSlotType.LEGS) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ARMOR_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.RUBY_BOOTS.get() && equipmentSlot == EquipmentSlotType.FEET) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ARMOR_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}


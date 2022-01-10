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

public class TopazArmor extends ArmorItem {

    public TopazArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    public static final UUID[] ARMOR_ATTACK_KNOCKBACK_UUIDS = new UUID[] {
            UUID.fromString("4ec2b7fa-9f24-430d-b178-09a7f49b3f23"),
            UUID.fromString("b82c6339-c039-4b7b-a3a3-c7a07bdd213c"),
            UUID.fromString("d99a7b97-632c-4077-b03e-b0a28d028cc0"),
            UUID.fromString("1901c2fc-c7eb-49bb-9150-519b2d61e73a")
    };

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.TOPAZ_HELMET.get() && equipmentSlot == EquipmentSlotType.HEAD) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_CHESTPLATE.get() && equipmentSlot == EquipmentSlotType.CHEST) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_LEGGINGS.get() && equipmentSlot == EquipmentSlotType.LEGS) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_BOOTS.get() && equipmentSlot == EquipmentSlotType.FEET) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

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

public class SapphireArmor extends ArmorItem {

    public SapphireArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    public static final UUID[] ARMOR_ATTACK_SPEED_UUIDS = new UUID[] {
            UUID.fromString("3f53e3b3-8a99-4956-b88a-bb76d15ed0d7"),
            UUID.fromString("52c0538f-7968-4221-8bee-d1b8540c0c8e"),
            UUID.fromString("07315ec7-8382-440a-8af7-130e32b8b305"),
            UUID.fromString("d263e3b7-1934-4938-8019-cfa281a8b5ee")
    };

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.SAPPHIRE_HELMET.get() && equipmentSlot == EquipmentSlotType.HEAD) {
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ARMOR_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.SAPPHIRE_CHESTPLATE.get() && equipmentSlot == EquipmentSlotType.CHEST) {
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ARMOR_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.SAPPHIRE_LEGGINGS.get() && equipmentSlot == EquipmentSlotType.LEGS) {
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ARMOR_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.SAPPHIRE_BOOTS.get() && equipmentSlot == EquipmentSlotType.FEET) {
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ARMOR_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

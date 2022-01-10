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

public class InfusedOnyxArmor extends ArmorItem {

    public InfusedOnyxArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    public static final UUID[] COMBINED_ATTACK_KNOCKBACK_UUIDS = new UUID[] {
            UUID.fromString("7440a51a-3102-4158-8725-e00b994c8c1d"),
            UUID.fromString("56377924-a271-4ead-b760-8d95e735d388"),
            UUID.fromString("8a8b5e4e-7a5d-4983-9210-35cb44ea5c32"),
            UUID.fromString("9dfaf49d-060f-4ea8-9c1a-41aeaf1616e7")
    };

    public static final UUID[] COMBINED_ATTACK_SPEED_UUIDS = new UUID[] {
            UUID.fromString("709202ee-7ed8-423f-bcfb-865082a2bb3a"),
            UUID.fromString("ea3dcc19-7d49-498d-a39d-a540d84195be"),
            UUID.fromString("467ed4f9-74bf-4297-aada-1ee5b3782517"),
            UUID.fromString("bfdaf6e4-2c9b-4d10-9dd0-2f6e91b71dc8")
    };

    public static final UUID[] COMBINED_ATTACK_DAMAGE_UUIDS = new UUID[] {
            UUID.fromString("8a86713c-76ec-43b9-bc8f-1fc5596ba825"),
            UUID.fromString("51e7e1f4-ef2f-42ab-9577-dc86d277b74f"),
            UUID.fromString("89d2c85e-a026-4ee5-aa5c-acc0b3b2dabc"),
            UUID.fromString("a8f255b2-1d3c-4e91-a9c6-d3e6cc97a6dc")
    };

    public static final UUID[] COMBINED_MAX_HEALTH_UUIDS = new UUID[] {
            UUID.fromString("64b2b541-c478-439f-9f6d-5ae22bea218f"),
            UUID.fromString("9cf6d20b-1a28-4ecf-8949-3d4b2076861a"),
            UUID.fromString("da61aaff-5452-4bb6-b95e-ed57486b7536"),
            UUID.fromString("cc70bfec-6d1d-4932-b501-8292bce466d7")
    };

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_HELMET.get() && equipmentSlot == EquipmentSlotType.HEAD) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.MAX_HEALTH, new AttributeModifier(COMBINED_MAX_HEALTH_UUIDS[equipmentSlot.getIndex()], "Max Health", 2.00, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.INFUSED_ONYX_CHESTPLATE.get() && equipmentSlot == EquipmentSlotType.CHEST) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.MAX_HEALTH, new AttributeModifier(COMBINED_MAX_HEALTH_UUIDS[equipmentSlot.getIndex()], "Max Health", 2.00, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.INFUSED_ONYX_LEGGINGS.get() && equipmentSlot == EquipmentSlotType.LEGS) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.MAX_HEALTH, new AttributeModifier(COMBINED_MAX_HEALTH_UUIDS[equipmentSlot.getIndex()], "Max Health", 2.00, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.INFUSED_ONYX_BOOTS.get() && equipmentSlot == EquipmentSlotType.FEET) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_ATTACK_SPEED_UUIDS[equipmentSlot.getIndex()], "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_ATTACK_DAMAGE_UUIDS[equipmentSlot.getIndex()], "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.MAX_HEALTH, new AttributeModifier(COMBINED_MAX_HEALTH_UUIDS[equipmentSlot.getIndex()], "Max Health", 2.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

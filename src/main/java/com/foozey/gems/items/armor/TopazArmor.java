package com.foozey.gems.items.armor;

import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import java.util.UUID;

public class TopazArmor extends ArmorItem {

    public TopazArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    public static final UUID[] ARMOR_ATTACK_KNOCKBACK_UUIDS = new UUID[] {
            UUID.fromString("4ec2b7fa-9f24-430d-b178-09a7f49b3f23"),
            UUID.fromString("b82c6339-c039-4b7b-a3a3-c7a07bdd213c"),
            UUID.fromString("d99a7b97-632c-4077-b03e-b0a28d028cc0"),
            UUID.fromString("1901c2fc-c7eb-49bb-9150-519b2d61e73a")
    };

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.TOPAZ_HELMET.get() && equipmentSlot == EquipmentSlot.HEAD) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_CHESTPLATE.get() && equipmentSlot == EquipmentSlot.CHEST) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_LEGGINGS.get() && equipmentSlot == EquipmentSlot.LEGS) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        else if (item == ModItems.TOPAZ_BOOTS.get() && equipmentSlot == EquipmentSlot.FEET) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ARMOR_ATTACK_KNOCKBACK_UUIDS[equipmentSlot.getIndex()], "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

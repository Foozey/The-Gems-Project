package com.foozey.gems.items.crossbows;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.UUID;

public class InfusedOnyxCrossbow extends CrossbowItem {

    // Properties (stack size, durability, fire resistance, creative tab)
    public InfusedOnyxCrossbow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.INFUSED_ONYX_INGOT.get() || super.isValidRepairItem(toRepair, repairWith);
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
    public static final UUID COMBINED_CROSSBOW_ATTACK_KNOCKBACK_UUID = UUID.fromString("114759ef-f376-4e25-bc99-aeeb035831a2");
    public static final UUID COMBINED_CROSSBOW_ATTACK_SPEED_UUID = UUID.fromString("d1d883d5-b5df-44a1-a5f7-8565f6afe586");
    public static final UUID COMBINED_CROSSBOW_ATTACK_DAMAGE_UUID = UUID.fromString("004c1969-ecd6-45c2-827d-bd8973870175");
    public static final UUID COMBINED_CROSSBOW_LIFESTEAL_UUID = UUID.fromString("560d1751-6829-494e-81c0-9b42855e788d");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_CROSSBOW.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_CROSSBOW_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_CROSSBOW_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_CROSSBOW_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.LIFESTEAL.get(), new AttributeModifier(COMBINED_CROSSBOW_LIFESTEAL_UUID, "Lifesteal", 2.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

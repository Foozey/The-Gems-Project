package com.foozey.gems.items.shields;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ProvideISTER;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

import java.util.UUID;

public class RubyShield extends ShieldItem {

    public RubyShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .setISTER(ProvideISTER::shield)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.RUBY.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean isShield(ItemStack stack, LivingEntity entity) {
        return true;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    public static final UUID SHIELD_ATTACK_DAMAGE_UUID = UUID.fromString("187f9719-7898-4d18-afd6-76b8eab838aa");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_SHIELD.get() && equipmentSlot == EquipmentSlotType.OFFHAND) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(SHIELD_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

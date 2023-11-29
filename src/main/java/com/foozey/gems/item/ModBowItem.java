package com.foozey.gems.item;

import com.foozey.gems.item.attributes.AttributeBuilder;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.UUID;
import java.util.function.Function;

public class ModBowItem extends BowItem {

    private final Item repairItem;
    private final int enchantability;
    private final Function<UUID, Multimap<Attribute, AttributeModifier>> attributes;

    public ModBowItem(Item repairItem, int enchantability, Function<UUID, Multimap<Attribute, AttributeModifier>> attributes, Properties properties) {
        super(properties);
        this.repairItem = repairItem;
        this.enchantability = enchantability;
        this.attributes = attributes;
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == repairItem || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return enchantability;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> map = super.getAttributeModifiers(slot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        if (slot == EquipmentSlot.MAINHAND) {
            builder.putAll(map);
            if (attributes != null) {
                builder.putAll(attributes.apply(AttributeBuilder.uuid(slot, stack)));
            }
        }
        return builder.build();
    }

}

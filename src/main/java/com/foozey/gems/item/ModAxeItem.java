package com.foozey.gems.item;

import com.foozey.gems.item.attributes.AttributeBuilder;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import java.util.UUID;
import java.util.function.Function;

public class ModAxeItem extends AxeItem {

    private final Function<UUID, Multimap<Attribute, AttributeModifier>> attributes;

    public ModAxeItem(Tier tier, float attackDamageModifier, float attackSpeedModifier, Function<UUID, Multimap<Attribute, AttributeModifier>> attributes, Properties properties) {
        super(tier, attackDamageModifier, attackSpeedModifier, properties);
        this.attributes = attributes;
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

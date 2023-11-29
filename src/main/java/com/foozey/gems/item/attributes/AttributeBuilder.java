package com.foozey.gems.item.attributes;

import com.foozey.gems.Gems;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public record AttributeBuilder(Attribute attribute, String name, double amount, AttributeModifier.Operation operation) {

    public static Function<UUID, Multimap<Attribute, AttributeModifier>> addModifiers(List<AttributeBuilder> attributeBuilders) {
        return (uuid) -> {
            Multimap<Attribute, AttributeModifier> modifiers = LinkedHashMultimap.create();
            for (AttributeBuilder holder : attributeBuilders) {
                modifiers.put(holder.attribute, new AttributeModifier(uuid, holder.name, holder.amount, holder.operation));
            }
            return modifiers;
        };
    }

    public static UUID uuid(EquipmentSlot slot, ItemStack stack) {
        String string = slot.getName() + "_" + Gems.getPath(stack.getItem());
        return UUID.nameUUIDFromBytes(string.getBytes());
    }

}

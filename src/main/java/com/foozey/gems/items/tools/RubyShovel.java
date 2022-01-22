package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import java.util.UUID;

public class RubyShovel extends ShovelItem {

    public RubyShovel(Tier p_i48469_1_, float p_i48469_2_, float p_i48469_3_, Properties p_i48469_4_) {
        super(p_i48469_1_, p_i48469_2_, p_i48469_3_, p_i48469_4_);
    }

    public static final UUID SHOVEL_ATTACK_DAMAGE_UUID = UUID.fromString("ffe2c48a-482f-42e6-bffe-98c645ca1f31");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_SHOVEL.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(SHOVEL_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

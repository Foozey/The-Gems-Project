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
import net.minecraft.world.item.PickaxeItem;
import java.util.UUID;

public class SapphirePickaxe extends PickaxeItem {

    public SapphirePickaxe(Tier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
        super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
    }

    public static final UUID PICKAXE_ATTACK_SPEED_UUID = UUID.fromString("c594ed77-ec7d-46ae-b367-ef0c3c03622e");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.SAPPHIRE_PICKAXE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(PICKAXE_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

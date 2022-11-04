package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class DragonyxAxe extends AxeItem {

    public DragonyxAxe(Tier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    // UUIDs
    public static final UUID COMBINED_AXE_ATTACK_KNOCKBACK_UUID = UUID.fromString("ca6241ce-7891-478b-962c-a6e8dd4a510c");
    public static final UUID COMBINED_AXE_ATTACK_SPEED_UUID = UUID.fromString("1f0a6a5f-71f8-409d-811d-d781bbdd0030");
    public static final UUID COMBINED_AXE_ATTACK_DAMAGE_UUID = UUID.fromString("15f80b0b-9402-46f7-8ba4-631389ccfbfc");
    public static final UUID COMBINED_AXE_HARVEST_AREA_UUID = UUID.fromString("702fe27f-d7ee-4c8b-8b46-fae635de7a54");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.DRAGONYX_AXE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_AXE_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_AXE_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_AXE_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.HARVEST_AREA.get(), new AttributeModifier(COMBINED_AXE_HARVEST_AREA_UUID, "Harvest Area", 1.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

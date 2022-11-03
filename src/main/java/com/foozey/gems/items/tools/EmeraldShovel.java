package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class EmeraldShovel extends ShovelItem {

    public EmeraldShovel(Tier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    // UUIDs
    public static final UUID SHOVEL_BONUS_XP_UUID = UUID.fromString("de6697fc-3953-4f7d-9695-bc475f5ff7ac");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.EMERALD_SHOVEL.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.BONUS_XP.get(), new AttributeModifier(SHOVEL_BONUS_XP_UUID, "Bonus XP", 1.00, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }

}

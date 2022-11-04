package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class DragonyxHoe extends HoeItem {

    public DragonyxHoe(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // UUIDs
    public static final UUID COMBINED_HOE_ATTACK_KNOCKBACK_UUID = UUID.fromString("da971549-42e2-404b-b54d-53685d31dd56");
    public static final UUID COMBINED_HOE_ATTACK_SPEED_UUID = UUID.fromString("a5f27142-a158-492f-be5c-0c229de27ac6");
    public static final UUID COMBINED_HOE_ATTACK_DAMAGE_UUID = UUID.fromString("84dab7ec-b52a-4e36-a7be-4101e338b721");
    public static final UUID COMBINED_HOE_HARVEST_AREA_UUID = UUID.fromString("89081744-326c-49e3-b0cc-496b781b135f");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.DRAGONYX_HOE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_HOE_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_HOE_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_HOE_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.HARVEST_AREA.get(), new AttributeModifier(COMBINED_HOE_HARVEST_AREA_UUID, "Harvest Area", 1.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

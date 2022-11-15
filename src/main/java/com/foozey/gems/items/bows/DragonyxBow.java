package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import java.util.UUID;

public class DragonyxBow extends BowItem {

    // Properties (stack size, durability, fire resistance, rarity, creative tab)
    public DragonyxBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .rarity(Rarity.EPIC)
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.DRAGONYX_INGOT.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    // Arrow damage
    @Override
    public AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.4F);
        return arrow;
    }

    // UUIDs
    public static final UUID COMBINED_BOW_ATTACK_KNOCKBACK_UUID = UUID.fromString("8e4a0f17-e011-4309-a6f4-6c60ad36b64a");
    public static final UUID COMBINED_BOW_ATTACK_SPEED_UUID = UUID.fromString("0d27b1eb-e71c-4ff7-a0cc-740e10c58c91");
    public static final UUID COMBINED_BOW_ATTACK_DAMAGE_UUID = UUID.fromString("5c4a67cb-ee1f-46c6-a9b8-c353d7b7314c");
    public static final UUID COMBINED_BOW_LIFESTEAL_UUID = UUID.fromString("396acc05-3c08-4324-a18b-aabcf3c39d76");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.DRAGONYX_BOW.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_BOW_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_BOW_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_BOW_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.LIFESTEAL.get(), new AttributeModifier(COMBINED_BOW_LIFESTEAL_UUID, "Lifesteal", 2.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class InfusedOnyxSword extends SwordItem {

    public InfusedOnyxSword(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // UUIDs
    public static final UUID COMBINED_SWORD_ATTACK_KNOCKBACK_UUID = UUID.fromString("7a14beab-f13e-4441-bf19-0e9264d147d1");
    public static final UUID COMBINED_SWORD_ATTACK_SPEED_UUID = UUID.fromString("7ab55da3-365c-45b0-bb87-56ae75cc62a9");
    public static final UUID COMBINED_SWORD_ATTACK_DAMAGE_UUID = UUID.fromString("067780f6-d140-4a6c-96bc-670824cb4d84");
    public static final UUID COMBINED_SWORD_LIFESTEAL_UUID = UUID.fromString("355e7db2-269d-4bfe-b0e6-6e99628fdba1");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_SWORD.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_SWORD_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_SWORD_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_SWORD_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.LIFESTEAL.get(), new AttributeModifier(COMBINED_SWORD_LIFESTEAL_UUID, "Lifesteal", 2.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

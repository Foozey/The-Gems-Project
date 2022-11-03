package com.foozey.gems.items.shields;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ShieldRenderPropertiesProvider;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;
import java.util.function.Consumer;

public class InfusedOnyxShield extends ShieldItem {

    // Properties (stack size, durability, fire resistance, creative tab)
    public InfusedOnyxShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    // Repair item
    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.INFUSED_ONYX_INGOT.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    // Enchantability
    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    // Render
    @Override
    public void initializeClient(@NonNull Consumer<IClientItemExtensions> consumer) {
        consumer.accept(ShieldRenderPropertiesProvider.shield());
    }

    // UUIDs
    public static final UUID COMBINED_SHIELD_ATTACK_KNOCKBACK_UUID = UUID.fromString("e440acfc-f05e-48ba-8340-c2111333ebfa");
    public static final UUID COMBINED_SHIELD_ATTACK_SPEED_UUID = UUID.fromString("23d382df-2c42-4444-974a-b1366aed0158");
    public static final UUID COMBINED_SHIELD_ATTACK_DAMAGE_UUID = UUID.fromString("df3d0f7b-1766-4776-a748-f015024b38c6");
    public static final UUID COMBINED_SHIELD_MAX_HEALTH_UUID = UUID.fromString("08f605e2-233d-4d28-a4b9-972cb310f8d0");

    // Attributes
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_SHIELD.get() && equipmentSlot == EquipmentSlot.OFFHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_SHIELD_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_SHIELD_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_SHIELD_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.MAX_HEALTH, new AttributeModifier(COMBINED_SHIELD_MAX_HEALTH_UUID, "Max Health", 2.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

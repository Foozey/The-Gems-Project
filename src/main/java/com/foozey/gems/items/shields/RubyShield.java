package com.foozey.gems.items.shields;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.util.ShieldRenderPropertiesProvider;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.IItemRenderProperties;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;
import java.util.function.Consumer;

public class RubyShield extends ShieldItem {

    public RubyShield(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public void initializeClient(@NonNull Consumer<IItemRenderProperties> consumer) {
        consumer.accept(ShieldRenderPropertiesProvider.shield());
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.RUBY.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    public static final UUID SHIELD_ATTACK_DAMAGE_UUID = UUID.fromString("187f9719-7898-4d18-afd6-76b8eab838aa");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_SHIELD.get() && equipmentSlot == EquipmentSlot.OFFHAND) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(SHIELD_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

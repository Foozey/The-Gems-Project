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

public class TopazShield extends ShieldItem {

    public TopazShield(Properties properties) {
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
        return repairWith.getItem() == ModItems.TOPAZ.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    public static final UUID SHIELD_ATTACK_KNOCKBACK_UUID = UUID.fromString("a7effc43-bc73-4c24-9e8f-1417c121ecba");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.TOPAZ_SHIELD.get() && equipmentSlot == EquipmentSlot.OFFHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(SHIELD_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

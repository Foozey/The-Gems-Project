package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import java.util.UUID;

public class TopazBow extends BowItem {

    public TopazBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(2031)
                .fireResistant()
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.TOPAZ.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.4F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    public static final UUID BOW_ATTACK_KNOCKBACK_UUID = UUID.fromString("3b5ab749-44b3-468b-84de-3be4cb0ea601");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.TOPAZ_BOW.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(BOW_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

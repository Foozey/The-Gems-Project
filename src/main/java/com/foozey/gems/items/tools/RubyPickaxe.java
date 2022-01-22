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

public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(Tier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
        super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
    }

    public static final UUID PICKAXE_ATTACK_DAMAGE_UUID = UUID.fromString("901695ab-9412-4ebb-9425-31c398b49e05");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.RUBY_PICKAXE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(PICKAXE_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

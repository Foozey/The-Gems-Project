package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import java.util.UUID;

public class EmeraldHoe extends HoeItem {

    public EmeraldHoe(Tier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    public static final UUID HOE_BONUS_XP_UUID = UUID.fromString("6a7c2334-55e7-442f-aee0-08a597dcbcdc");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.EMERALD_HOE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.BONUS_XP.get(), new AttributeModifier(HOE_BONUS_XP_UUID, "Bonus XP", 1.00, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }

}

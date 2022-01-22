package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import java.util.UUID;

public class EmeraldAxe extends AxeItem {

    public EmeraldAxe(Tier p_i48530_1_, float p_i48530_2_, float p_i48530_3_, Properties p_i48530_4_) {
        super(p_i48530_1_, p_i48530_2_, p_i48530_3_, p_i48530_4_);
    }

    public static final UUID AXE_BONUS_XP_UUID = UUID.fromString("de8e12ff-360e-4aec-b7b9-e18f21356ba1");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.EMERALD_AXE.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.BONUS_XP.get(), new AttributeModifier(AXE_BONUS_XP_UUID, "Bonus XP", 1.00, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }

}

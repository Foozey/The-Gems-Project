package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;

import java.util.UUID;

public class InfusedOnyxPickaxe extends PickaxeItem {

    public InfusedOnyxPickaxe(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Properties p_i48478_4_) {
        super(p_i48478_1_, p_i48478_2_, p_i48478_3_, p_i48478_4_);
    }

    public static final UUID COMBINED_PICKAXE_ATTACK_KNOCKBACK_UUID = UUID.fromString("04fbfbbc-4720-41bf-ac02-8c5c98ca0232");
    public static final UUID COMBINED_PICKAXE_ATTACK_SPEED_UUID = UUID.fromString("e4651c0c-e350-468c-b950-8a21ff14d4ad");
    public static final UUID COMBINED_PICKAXE_ATTACK_DAMAGE_UUID = UUID.fromString("44a6830a-9893-4aac-9eaa-3556231ccc17");
    public static final UUID COMBINED_PICKAXE_HARVEST_AREA_UUID = UUID.fromString("f3820deb-e390-4c0b-95c3-8dcd281bbd88");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_PICKAXE.get() && equipmentSlot == EquipmentSlotType.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_PICKAXE_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_PICKAXE_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_PICKAXE_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.HARVEST_AREA.get(), new AttributeModifier(COMBINED_PICKAXE_HARVEST_AREA_UUID, "Harvest Area", 1.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

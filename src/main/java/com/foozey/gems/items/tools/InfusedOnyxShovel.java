package com.foozey.gems.items.tools;

import com.foozey.gems.init.ModAttributes;
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
import net.minecraft.world.item.ShovelItem;
import java.util.UUID;

public class InfusedOnyxShovel extends ShovelItem {

    public InfusedOnyxShovel(Tier p_i48469_1_, float p_i48469_2_, float p_i48469_3_, Properties p_i48469_4_) {
        super(p_i48469_1_, p_i48469_2_, p_i48469_3_, p_i48469_4_);
    }

    public static final UUID COMBINED_SHOVEL_ATTACK_KNOCKBACK_UUID = UUID.fromString("7a14beab-f13e-4441-bf19-0e9264d147d1");
    public static final UUID COMBINED_SHOVEL_ATTACK_SPEED_UUID = UUID.fromString("7ab55da3-365c-45b0-bb87-56ae75cc62a9");
    public static final UUID COMBINED_SHOVEL_ATTACK_DAMAGE_UUID = UUID.fromString("067780f6-d140-4a6c-96bc-670824cb4d84");
    public static final UUID COMBINED_SHOVEL_HARVEST_AREA_UUID = UUID.fromString("55ff5be5-55b0-45d6-997d-68d5855060a5");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.INFUSED_ONYX_SHOVEL.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(COMBINED_SHOVEL_ATTACK_KNOCKBACK_UUID, "Attack Knockback", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(COMBINED_SHOVEL_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(COMBINED_SHOVEL_ATTACK_DAMAGE_UUID, "Attack Damage", 0.50, AttributeModifier.Operation.ADDITION));
            builder.put(ModAttributes.HARVEST_AREA.get(), new AttributeModifier(COMBINED_SHOVEL_HARVEST_AREA_UUID, "Harvest Area", 1.00, AttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }

}

package com.foozey.gems.item;

import com.foozey.gems.item.attributes.AttributeBuilder;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public class ModArmorItem extends ArmorItem {

    private final Function<UUID, Multimap<Attribute, AttributeModifier>> attributes;
    private final Component tooltip;

    public ModArmorItem(ArmorMaterial material, ArmorItem.Type type, Function<UUID, Multimap<Attribute, AttributeModifier>> attributes, Component tooltip, Properties properties) {
        super(material, type, properties);
        this.attributes = attributes;
        this.tooltip = tooltip;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> map = super.getAttributeModifiers(slot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        if (slot == getType().getSlot()) {
            builder.putAll(map);
            if (attributes != null) {
                builder.putAll(attributes.apply(AttributeBuilder.uuid(slot, stack)));
            }
        }
        return builder.build();
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        if (tooltip != null) {
            tooltipComponents.add(tooltip);
        }
        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);
    }

}

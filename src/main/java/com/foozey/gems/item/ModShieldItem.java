package com.foozey.gems.item;

import com.foozey.gems.item.attributes.AttributeBuilder;
import com.foozey.gems.item.shield.ShieldTextures;
import com.foozey.gems.util.RenderPropertiesProvider;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

public class ModShieldItem extends ShieldItem {

    private final Item repairItem;
    private final int enchantability;
    private final Function<UUID, Multimap<Attribute, AttributeModifier>> attributes;
    private final ShieldTextures shieldTextures;

    public ModShieldItem(Item repairItem, int enchantability, Function<UUID, Multimap<Attribute, AttributeModifier>> attributes, ShieldTextures shieldTextures, Properties properties) {
        super(properties);
        this.repairItem = repairItem;
        this.enchantability = enchantability;
        this.attributes = attributes;
        this.shieldTextures = shieldTextures;
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == repairItem || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return enchantability;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(RenderPropertiesProvider.shield());
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> map = super.getAttributeModifiers(slot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        if (slot == EquipmentSlot.OFFHAND) {
            builder.putAll(map);
            if (attributes != null) {
                builder.putAll(attributes.apply(AttributeBuilder.uuid(slot, stack)));
            }
        }
        return builder.build();
    }

    public ShieldTextures getShieldTextures() {
        return shieldTextures;
    }

}

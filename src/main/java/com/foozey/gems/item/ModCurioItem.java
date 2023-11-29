package com.foozey.gems.item;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.UUID;
import java.util.function.Function;

public class ModCurioItem extends Item implements ICurioItem {

    private final Item repairItem;
    private final Function<UUID, Multimap<Attribute, AttributeModifier>> attributes;

    public ModCurioItem(Item repairItem, Function<UUID, Multimap<Attribute, AttributeModifier>> attributes, Properties properties) {
        super(properties);
        this.repairItem = repairItem;
        this.attributes = attributes;
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == repairItem || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack) {
        return true;
    }

    @Override
    public ICurio.SoundInfo getEquipSound(SlotContext slotContext, ItemStack stack) {
        return new ICurio.SoundInfo(SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 1.0F);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        if (attributes != null) {
            return attributes.apply(uuid);
        } else {
            return LinkedHashMultimap.create();
        }
    }

}

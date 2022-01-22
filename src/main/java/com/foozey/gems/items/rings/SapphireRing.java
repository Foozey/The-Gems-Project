package com.foozey.gems.items.rings;

import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.type.capability.ICurio;
import java.util.UUID;

public class SapphireRing extends Item {

    public SapphireRing(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(250)
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == ModItems.SAPPHIRE.get() || super.isValidRepairItem(toRepair, repairWith);
    }

    public static final UUID RING_ATTACK_SPEED_UUID = UUID.fromString("d09ee3d0-dbd2-11ea-87d0-0242ac130003");

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, CompoundTag nbt) {
        return new ICapabilityProvider() {
            private final LazyOptional<ICurio> lazyCurio = LazyOptional.of(() -> new ICurio() {

                public ItemStack getStack() {
                    return stack;
                }

                // Right Click Equip
                @Override
                public boolean canRightClickEquip() {
                    return true;
                }

                // Right Click Equip Sound
                @Override
                public void playRightClickEquipSound(LivingEntity livingEntity) {
                    livingEntity.level.playSound(null, new BlockPos(livingEntity.position()), SoundEvents.ARMOR_EQUIP_GOLD, SoundSource.NEUTRAL, 1.0f, 1.0f);
                }

                // Wearing Event
                @Override
                public Multimap<Attribute, AttributeModifier> getAttributeModifiers(String identifier) {
                    Multimap<Attribute, AttributeModifier> modifiers = HashMultimap.create();
                    modifiers.put(Attributes.ATTACK_SPEED, new AttributeModifier(RING_ATTACK_SPEED_UUID, "Attack Speed", 0.50, AttributeModifier.Operation.ADDITION));
                    return modifiers;
                }

            });

            @Override
            public <T> LazyOptional<T> getCapability(Capability<T> capability, Direction side) {
                return CuriosCapability.ITEM.orEmpty(capability, lazyCurio);
            }

        };
    }

}

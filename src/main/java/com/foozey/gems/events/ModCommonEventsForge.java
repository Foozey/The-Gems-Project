package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.util.PlayerSpawnTeleport;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class ModCommonEventsForge {

    // Plated Onyx Armor
    @SubscribeEvent
    public static void onVoidWithOnyx(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(player.level.isClientSide) return;
        World world = event.getEntity().level;
        if(event.getSource() == DamageSource.OUT_OF_WORLD &&
                player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.PLATED_ONYX_HELMET.get() &&
                player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.PLATED_ONYX_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == ModItems.PLATED_ONYX_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.PLATED_ONYX_BOOTS.get()) {
            player.heal(100);
            PlayerSpawnTeleport.teleportPlayerToSpawn(world, player);
        }
    }

    // Emerald Armor
    @SubscribeEvent
    public static void emeraldArmorBonus(LivingEvent.LivingUpdateEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(player.level.isClientSide) return;
        if(player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.EMERALD_HELMET.get() &&
                player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.EMERALD_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == ModItems.EMERALD_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.EMERALD_BOOTS.get()) {
            player.addEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 39, 0, true, false));
        }
    }

/*    // Emerald Tools
    @SubscribeEvent
    public static void emeraldToolBonus(LivingEvent.LivingUpdateEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(player.level.isClientSide) return;
        if(player.getMainHandItem().getItem() == ModItems.EMERALD_SWORD.get()) {
            // TODO: Looting buff
        }
        if(player.getMainHandItem().getItem() == ModItems.EMERALD_PICKAXE.get()) {
            // TODO: Fortune buff
        }
        if(player.getMainHandItem().getItem() == ModItems.EMERALD_AXE.get()) {
            // TODO: Fortune buff
        }
        if(player.getMainHandItem().getItem() == ModItems.EMERALD_SHOVEL.get()) {
            // TODO: Fortune buff
        }
        if(player.getMainHandItem().getItem() == ModItems.EMERALD_HOE.get()) {
            // TODO: Fortune buff
        }
    }*/

}

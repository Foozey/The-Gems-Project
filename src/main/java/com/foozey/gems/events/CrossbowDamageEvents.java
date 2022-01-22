package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)

public class CrossbowDamageEvents {

    // TODO: Clean this up

    // Wooden Crossbow
    @SubscribeEvent
    public static void WoodenCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == Items.CROSSBOW) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.0F);
                }
            }
        }
    }

    // Iron Crossbow
    @SubscribeEvent
    public static void IronCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.IRON_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.5F);
                }
            }
        }
    }

    // Golden Crossbow
    @SubscribeEvent
    public static void GoldenCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.GOLDEN_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.0F);
                }
            }
        }
    }

    // Diamond Crossbow
    @SubscribeEvent
    public static void DiamondCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.DIAMOND_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.8F);
                }
            }
        }
    }

    // Netherite Crossbow
    @SubscribeEvent
    public static void NetheriteCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.NETHERITE_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 2.0F);
                }
            }
        }
    }

    // Topaz Crossbow
    @SubscribeEvent
    public static void TopazCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.TOPAZ_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 2.0F);
                }
            }
        }
    }

    // Sapphire Crossbow
    @SubscribeEvent
    public static void SapphireCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.SAPPHIRE_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 2.0F);
                }
            }
        }
    }

    // Ruby Crossbow
    @SubscribeEvent
    public static void RubyCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.RUBY_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 2.0F);
                }
            }
        }
    }

    // Infused Onyx Crossbow
    @SubscribeEvent
    public static void InfusedOnyxCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow) {
            AbstractArrow arrow = (AbstractArrow) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.INFUSED_ONYX_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 2.0F);
                }
            }
        }
    }

}

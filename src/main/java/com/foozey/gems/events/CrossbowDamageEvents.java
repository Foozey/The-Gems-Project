package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.Items;
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
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
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
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.IRON_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.1F);
                }
            }
        }
    }

    // Golden Crossbow
    @SubscribeEvent
    public static void GoldenCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
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
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.DIAMOND_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.2F);
                }
            }
        }
    }

    // Netherite Crossbow
    @SubscribeEvent
    public static void NetheriteCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.NETHERITE_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.3F);
                }
            }
        }
    }

    // Topaz Crossbow
    @SubscribeEvent
    public static void TopazCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.TOPAZ_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.4F);
                }
            }
        }
    }

    // Sapphire Crossbow
    @SubscribeEvent
    public static void SapphireCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.SAPPHIRE_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.5F);
                }
            }
        }
    }

    // Ruby Crossbow
    @SubscribeEvent
    public static void RubyCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.RUBY_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.6F);
                }
            }
        }
    }

    // Plated Onyx Crossbow
    @SubscribeEvent
    public static void PlatedOnyxCrossbowEntity(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrowEntity) {
            AbstractArrowEntity arrow = (AbstractArrowEntity) entity;
            Entity shooter = arrow.getOwner();
            if (shooter instanceof LivingEntity) {
                LivingEntity livingShooter = (LivingEntity) shooter;
                if (livingShooter.getMainHandItem().getItem() == ModItems.PLATED_ONYX_CROSSBOW.get()) {
                    arrow.setBaseDamage(arrow.getBaseDamage() * 1.9F);
                }
            }
        }
    }

}

package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)

public class CuriosDurabilityEvents {

    // TODO: Clean this up

    // Golden Amulet
    @SubscribeEvent
    public static void onGoldenAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_AMULET.get(), event.getEntity()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_AMULET.get(), event.getEntity()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Topaz Amulet
    @SubscribeEvent
    public static void onTopazAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_AMULET.get(), event.getEntity()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_AMULET.get(), event.getEntity()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Sapphire Amulet
    @SubscribeEvent
    public static void onSapphireAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_AMULET.get(), event.getEntity()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_AMULET.get(), event.getEntity()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Ruby Amulet
    @SubscribeEvent
    public static void onRubyAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_AMULET.get(), event.getEntity()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_AMULET.get(), event.getEntity()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Golden Ring
    @SubscribeEvent
    public static void onGoldenRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_RING.get(), event.getEntity()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_RING.get(), event.getEntity()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Topaz Ring
    @SubscribeEvent
    public static void onTopazRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_RING.get(), event.getEntity()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_RING.get(), event.getEntity()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Sapphire Ring
    @SubscribeEvent
    public static void onSapphireRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_RING.get(), event.getEntity()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_RING.get(), event.getEntity()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Ruby Ring
    @SubscribeEvent
    public static void onRubyRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_RING.get(), event.getEntity()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_RING.get(), event.getEntity()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

}

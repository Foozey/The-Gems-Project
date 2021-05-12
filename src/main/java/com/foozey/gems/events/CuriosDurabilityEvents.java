package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)

public class CuriosDurabilityEvents {

    // Golden Amulet
    @SubscribeEvent
    public static void onGoldenAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Gemspark Amulet
    @SubscribeEvent
    public static void onGemsparkAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GEMSPARK_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GEMSPARK_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Emerald Amulet
    @SubscribeEvent
    public static void onEmeraldAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.EMERALD_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.EMERALD_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Diamond Amulet
    @SubscribeEvent
    public static void onDiamondAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.DIAMOND_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.DIAMOND_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Topaz Amulet
    @SubscribeEvent
    public static void onTopazAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Sapphire Amulet
    @SubscribeEvent
    public static void onSapphireAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Ruby Amulet
    @SubscribeEvent
    public static void onRubyAmuletDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_AMULET.get(), event.getEntityLiving()).isPresent()) {
            ItemStack necklace = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_AMULET.get(), event.getEntityLiving()).get().right;
            necklace.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("necklace", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Golden Ring
    @SubscribeEvent
    public static void onGoldenRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GOLDEN_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Gemspark Ring
    @SubscribeEvent
    public static void onGemsparkRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GEMSPARK_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.GEMSPARK_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Emerald Ring
    @SubscribeEvent
    public static void onEmeraldRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.EMERALD_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.EMERALD_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Diamond Ring
    @SubscribeEvent
    public static void onDiamondRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.DIAMOND_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.DIAMOND_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Topaz Ring
    @SubscribeEvent
    public static void onTopazRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.TOPAZ_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Sapphire Ring
    @SubscribeEvent
    public static void onSapphireRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.SAPPHIRE_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

    // Ruby Ring
    @SubscribeEvent
    public static void onRubyRingDamaged(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_RING.get(), event.getEntityLiving()).isPresent()) {
            ItemStack ring = CuriosApi.getCuriosHelper().findEquippedCurio(ModItems.RUBY_RING.get(), event.getEntityLiving()).get().right;
            ring.hurtAndBreak(1, player, (player2) -> {
                CuriosApi.getCuriosHelper().onBrokenCurio("ring", 0, player2);
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            });
        }
    }

}

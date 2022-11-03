package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.util.PlayerSpawnTeleport;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class CommonEventsForge {

    // Infused Onyx void teleport
    @SubscribeEvent
    public static void infusedOnyxArmorBonus(LivingDamageEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(player.level.isClientSide) return;
        Level world = event.getEntity().level;
        if(event.getSource() == DamageSource.OUT_OF_WORLD &&
                player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.INFUSED_ONYX_HELMET.get() &&
                player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.INFUSED_ONYX_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.INFUSED_ONYX_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.INFUSED_ONYX_BOOTS.get()) {
            player.heal(100);
            PlayerSpawnTeleport.teleportPlayerToSpawn(world, player);
        }
    }

    // Emerald armour villager discount
    @SubscribeEvent
    public static void emeraldArmorBonus(LivingEvent.LivingTickEvent event) {
        if(!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if(player.level.isClientSide) return;
        if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.EMERALD_HELMET.get() &&
                player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.EMERALD_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.EMERALD_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.EMERALD_BOOTS.get()) {
            player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 39, 0, true, false));
        }
    }

    // Bonus XP (mining)
    @SubscribeEvent
    public static void miningBonusXP(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if(player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0) {
            event.setExpToDrop((int) (event.getExpToDrop() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Bonus XP (mobs)
    @SubscribeEvent
    public static void mobBonusXP(LivingExperienceDropEvent event) {
        if (event.getAttackingPlayer() == null) {
            return;
        }
        Player player = event.getAttackingPlayer();
        if(player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0) {
            event.setDroppedExperience((int) (event.getDroppedExperience() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Lifesteal
    @SubscribeEvent
    public static void mobLifestealEvent(LivingDeathEvent event) {
        if(event.getSource().getEntity() instanceof Player) {
            Player player = (Player) event.getSource().getEntity();
            player.heal((float) player.getAttributeValue(ModAttributes.LIFESTEAL.get()));
        }
    }

    // Harvest Area
    @SubscribeEvent
    public static void miningAreaEvent(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if(!(player instanceof ServerPlayer)) {
            return;
        }
        Level world = event.getPlayer().getCommandSenderWorld();
        if(!world.isClientSide) {
            if(player != null) {
                ItemStack getTool = player.getItemInHand(player.getUsedItemHand());
                if(getTool.getItem() instanceof PickaxeItem || getTool.getItem() instanceof AxeItem || getTool.getItem() instanceof ShovelItem || getTool.getItem() instanceof HoeItem) {
                    if(player.getAttributeValue(ModAttributes.HARVEST_AREA.get()) > 1) {
                        BlockPos pos = event.getPos();
                        ItemStack tool = player.getItemInHand(player.getUsedItemHand());
                        if(player.swingingArm == null) {
                            return;
                        }
                        HitResult result = player.pick(5,0,false);
                        if(result != null) {
                            Direction facing = Direction.UP;
                            if(result.getType() == HitResult.Type.BLOCK) {
                                UseOnContext context = new UseOnContext(player,player.getUsedItemHand(),((BlockHitResult) result));
                                BlockHitResult res = new BlockHitResult(context.getClickLocation(), context.getClickedFace(), context.getClickedPos(), false);
                                facing = res.getDirection();
                            }
                            int lvl = (int) player.getAttributeValue(ModAttributes.HARVEST_AREA.get()) - 1;
                            int zMin = 0;
                            int zMax = 0;
                            int xMin = 0;
                            int xMax = 0;
                            int yMin = 0;
                            int yMax = 0;
                            if(player.isSwimming() || !player.isOnGround()) {
                                if(facing.equals(Direction.DOWN) || facing.equals(Direction.UP)) {
                                    zMin=-lvl;
                                    zMax=+lvl;
                                    xMin=-lvl;
                                    xMax=+lvl;
                                    yMin=0;
                                    yMax=0;
                                }
                                else if(facing.equals(Direction.WEST) || facing.equals(Direction.EAST)) {
                                    zMin=-lvl;
                                    zMax=+lvl;
                                    xMin=0;
                                    xMax=0;
                                    yMin=-lvl;
                                    yMax=+lvl;
                                }
                                else if(facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH)) {
                                    zMin=0;
                                    zMax=0;
                                    xMin=-lvl;
                                    xMax=+lvl;
                                    yMin=-lvl;
                                    yMax=+lvl;
                                }
                            } else {
                                if(facing.equals(Direction.DOWN) || facing.equals(Direction.UP)) {
                                    zMin=-lvl;
                                    zMax=+lvl;
                                    xMin=-lvl;
                                    xMax=+lvl;
                                    yMin=0;
                                    yMax=0;
                                }
                                else if(facing.equals(Direction.WEST) || facing.equals(Direction.EAST)) {
                                    zMin=-lvl;
                                    zMax=+lvl;
                                    xMin=0;
                                    xMax=0;
                                    yMin=-1;
                                    yMax=+((2*lvl)-1);
                                }
                                else if(facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH)) {
                                    zMin=0;
                                    zMax=0;
                                    xMin=-lvl;
                                    xMax=+lvl;
                                    yMin=-1;
                                    yMax=+((2*lvl)-1);
                                }
                            }
                            List<BlockPos> workQueue = new ArrayList<>();
                            for(int c = zMin; c <= zMax; c++) {
                                for(int a = xMin; a <= xMax; a++) {
                                    for(int b = yMin; b <= yMax; b++) {
                                        workQueue.add(pos.offset(a,b,c));
                                    }
                                }
                            }
                            if(player.isCrouching()) {}
                            else {
                                for(int i = 0; i < workQueue.size(); i++) {
                                    if(world.getBlockEntity(workQueue.get(i)) instanceof BlockEntity)continue;
                                    BlockState blockToBreak = world.getBlockState(workQueue.get(i));
                                    if(ForgeEventFactory.doPlayerHarvestCheck(player,blockToBreak,true) &&
                                            !blockToBreak.isAir() &&
                                            !(blockToBreak.getBlock() instanceof IFluidBlock || blockToBreak.getBlock() instanceof LiquidBlock) &&
                                            blockToBreak.getDestroySpeed(world, workQueue.get(i)) != -1.0F) {
                                        int maxDur = tool.getMaxDamage();
                                        int damDone = tool.getDamageValue();
                                        if((Math.subtractExact(maxDur,damDone) >= 0)) {
                                            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, playerEntity -> {});
                                            if(blockToBreak.canHarvestBlock(world,pos,player)) {
                                                blockToBreak.getBlock().playerDestroy(world, player, workQueue.get(i), blockToBreak, null, player.getMainHandItem());
                                                blockToBreak.getBlock().playerWillDestroy(world, workQueue.get(i), blockToBreak, player);
                                                int expDrop = blockToBreak.getBlock().getExpDrop(blockToBreak,world, RandomSource.create(),workQueue.get(i),
                                                        (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.BLOCK_FORTUNE))?(EnchantmentHelper.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE,player)):(0),
                                                        (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.SILK_TOUCH))?(EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,player)):(0));
                                                if(expDrop>0)blockToBreak.getBlock().popExperience((ServerLevel)world,player.blockPosition().offset(0,1,0),expDrop);
                                                world.removeBlock(workQueue.get(i), false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}

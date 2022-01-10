package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.util.PlayerSpawnTeleport;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class CommonEventsForge {

    // Infused Onyx Armor Bonus
    @SubscribeEvent
    public static void infusedOnyxArmorBonus(LivingDamageEvent event) {
        if(!(event.getEntityLiving() instanceof PlayerEntity)) return;
        PlayerEntity player = (PlayerEntity) event.getEntityLiving();
        if(player.level.isClientSide) return;
        World world = event.getEntity().level;
        if(event.getSource() == DamageSource.OUT_OF_WORLD &&
                player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.INFUSED_ONYX_HELMET.get() &&
                player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.INFUSED_ONYX_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == ModItems.INFUSED_ONYX_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.INFUSED_ONYX_BOOTS.get()) {
            player.heal(100);
            PlayerSpawnTeleport.teleportPlayerToSpawn(world, player);
        }
    }

    // Emerald Armor Bonus
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

    // Mining Bonus XP
    @SubscribeEvent
    public static void miningBonusXP(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();
        if(player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0) {
            event.setExpToDrop((int) (event.getExpToDrop() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Mob Bonus XP
    @SubscribeEvent
    public static void mobBonusXP(LivingExperienceDropEvent event) {
        if (event.getAttackingPlayer() == null) {
            return;
        }
        PlayerEntity player = event.getAttackingPlayer();
        if(player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0) {
            event.setDroppedExperience((int) (event.getDroppedExperience() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Mob Lifesteal
    @SubscribeEvent
    public static void mobLifestealEvent(LivingDeathEvent event) {
        if(event.getSource().getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getSource().getEntity();
            player.heal((float) player.getAttributeValue(ModAttributes.LIFESTEAL.get()));
        }
    }

    // Harvest Area
    @SubscribeEvent
    public static void miningAreaEvent(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();
        if(!(player instanceof ServerPlayerEntity)) {
            return;
        }
        World world = event.getPlayer().getCommandSenderWorld();
        if(!world.isClientSide) {
            if(player != null) {
                ItemStack getTool = player.getItemInHand(player.getUsedItemHand());
                if(getTool.getItem() instanceof PickaxeItem || getTool.getToolTypes().contains(ToolType.PICKAXE) ||
                        getTool.getItem() instanceof AxeItem || getTool.getToolTypes().contains(ToolType.AXE) ||
                        getTool.getItem() instanceof ShovelItem || getTool.getToolTypes().contains(ToolType.SHOVEL) ||
                        getTool.getItem() instanceof HoeItem || getTool.getToolTypes().contains(ToolType.HOE)) {
                    if(player.getAttributeValue(ModAttributes.HARVEST_AREA.get()) > 1) {
                        BlockPos pos = event.getPos();
                        ItemStack tool = player.getItemInHand(player.getUsedItemHand());
                        if(player.swingingArm == null) {
                            return;
                        }
                        RayTraceResult result = player.pick(5,0,false);
                        if(result != null) {
                            Direction facing = Direction.UP;
                            if(result.getType() == RayTraceResult.Type.BLOCK) {
                                ItemUseContext context = new ItemUseContext(player,player.getUsedItemHand(),((BlockRayTraceResult) result));
                                BlockRayTraceResult res = new BlockRayTraceResult(context.getClickLocation(), context.getClickedFace(), context.getClickedPos(), false);
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
                                    if(world.getBlockEntity(workQueue.get(i)) instanceof TileEntity)continue;
                                    BlockState blockToBreak = world.getBlockState(workQueue.get(i));
                                    if(ForgeEventFactory.doPlayerHarvestCheck(player,blockToBreak,true) &&
                                            !blockToBreak.getBlock().isAir(blockToBreak, world, workQueue.get(i)) &&
                                            !(blockToBreak.getBlock() instanceof IFluidBlock || blockToBreak.getBlock() instanceof FlowingFluidBlock) &&
                                            blockToBreak.getDestroySpeed(world, workQueue.get(i)) != -1.0F) {
                                        int maxDur = tool.getMaxDamage();
                                        int damDone = tool.getDamageValue();
                                        if((Math.subtractExact(maxDur,damDone) >= 0)) {
                                            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, playerEntity -> {});
                                            if(blockToBreak.canHarvestBlock(world,pos,player)) {
                                                blockToBreak.getBlock().playerDestroy(world, player, workQueue.get(i), blockToBreak, null, player.getMainHandItem());
                                                blockToBreak.getBlock().playerWillDestroy(world, workQueue.get(i), blockToBreak, player);
                                                int expDrop = blockToBreak.getBlock().getExpDrop(blockToBreak,world,workQueue.get(i),
                                                        (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.BLOCK_FORTUNE))?(EnchantmentHelper.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE,player)):(0),
                                                        (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.SILK_TOUCH))?(EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH,player)):(0));
                                                if(expDrop>0)blockToBreak.getBlock().popExperience((ServerWorld)world,player.blockPosition().offset(0,1,0),expDrop);
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

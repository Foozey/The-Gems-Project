package com.foozey.gems.event;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModAttributes;
import com.foozey.gems.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)

public class CommonEventsForge {

    // Arrow Damage
    @SubscribeEvent
    public static void arrowDamage(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof AbstractArrow arrow && arrow.getOwner() instanceof LivingEntity shooter) {
            arrow.setBaseDamage(arrow.getBaseDamage() * shooter.getAttributeValue(ModAttributes.ARROW_DAMAGE.get()));
        }
    }

    // Block Strength
    @SubscribeEvent
    public static void blockStrength(ShieldBlockEvent event) {
        Item item = event.getEntity().getUseItem().getItem();
        if (item == Items.SHIELD || (Gems.isModid(item) && item instanceof ShieldItem)) {
            event.setBlockedDamage((float) event.getEntity().getAttributeValue(ModAttributes.BLOCK_STRENGTH.get()) + 3.0F);
        }
    }

    // Bonus XP (mining)
    @SubscribeEvent
    public static void miningBonusXP(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        if (player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0.0D) {
            event.setExpToDrop((int) (event.getExpToDrop() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Bonus XP (mobs)
    @SubscribeEvent
    public static void mobBonusXP(LivingExperienceDropEvent event) {
        Player player = event.getAttackingPlayer();
        if (player != null && player.getAttributeValue(ModAttributes.BONUS_XP.get()) > 0.0D) {
            event.setDroppedExperience((int) (event.getDroppedExperience() * player.getAttributeValue(ModAttributes.BONUS_XP.get())));
        }
    }

    // Lifesteal
    @SubscribeEvent
    public static void lifesteal(LivingDeathEvent event) {
        if (event.getSource().getEntity() instanceof Player player) {
            player.heal((float) player.getAttributeValue(ModAttributes.LIFESTEAL.get()));
        }
    }

    // Harvest Area
    @SubscribeEvent
    public static void harvestArea(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack stack = player.getItemInHand(player.getUsedItemHand());
        if (stack.getItem() instanceof PickaxeItem || stack.getItem() instanceof AxeItem || stack.getItem() instanceof ShovelItem || stack.getItem() instanceof HoeItem) {
            if (player.getAttributeValue(ModAttributes.HARVEST_AREA.get()) > 1.0D) {
                HitResult result = player.pick(5.0D,0.0F,false);
                Direction facing = Direction.UP;
                if (result.getType() == HitResult.Type.BLOCK) {
                    UseOnContext context = new UseOnContext(player, player.getUsedItemHand(), ((BlockHitResult) result));
                    BlockHitResult res = new BlockHitResult(context.getClickLocation(), context.getClickedFace(), context.getClickedPos(), false);
                    facing = res.getDirection();
                }
                int zMin = 0, zMax = 0, xMin = 0, xMax = 0, yMin = 0, yMax = 0;
                int lvl = (int) player.getAttributeValue(ModAttributes.HARVEST_AREA.get()) - 1;
                if (player.isSwimming() || !player.onGround()) {
                    if (facing.equals(Direction.DOWN) || facing.equals(Direction.UP)) {
                        zMin = -lvl;
                        zMax = lvl;
                        xMin = -lvl;
                        xMax = lvl;
                    } else if (facing.equals(Direction.WEST) || facing.equals(Direction.EAST)) {
                        zMin = -lvl;
                        zMax = lvl;
                        yMin = -lvl;
                        yMax = lvl;
                    } else if (facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH)) {
                        xMin = -lvl;
                        xMax = lvl;
                        yMin = -lvl;
                        yMax = lvl;
                    }
                } else {
                    if (facing.equals(Direction.DOWN) || facing.equals(Direction.UP)) {
                        zMin = -lvl;
                        zMax = lvl;
                        xMin = -lvl;
                        xMax = lvl;
                    } else if (facing.equals(Direction.WEST) || facing.equals(Direction.EAST)) {
                        zMin = -lvl;
                        zMax = lvl;
                        yMin = -1;
                        yMax = ((2*lvl)-1);
                    } else if (facing.equals(Direction.NORTH) || facing.equals(Direction.SOUTH)) {
                        xMin = -lvl;
                        xMax = lvl;
                        yMin = -1;
                        yMax = ((2*lvl)-1);
                    }
                }
                BlockPos pos = event.getPos();
                List<BlockPos> workQueue = new ArrayList<>();
                for (int z = zMin; z <= zMax; z++) {
                    for (int x = xMin; x <= xMax; x++) {
                        for (int y = yMin; y <= yMax; y++) {
                            workQueue.add(pos.offset(x, y, z));
                        }
                    }
                }
                if (player.isCrouching()) return;
                for (BlockPos blockPos : workQueue) {
                    Level world = player.getCommandSenderWorld();
                    if (world.getBlockEntity(blockPos) != null) continue;
                    BlockState blockToBreak = world.getBlockState(blockPos);
                    if (ForgeEventFactory.doPlayerHarvestCheck(player, blockToBreak, true) && !blockToBreak.isAir() && !(blockToBreak.getBlock() instanceof IFluidBlock || blockToBreak.getBlock() instanceof LiquidBlock) && blockToBreak.getDestroySpeed(world, blockPos) != -1.0F) {
                        int maxDur = stack.getMaxDamage();
                        int damDone = stack.getDamageValue();
                        if ((Math.subtractExact(maxDur, damDone) >= 0)) {
                            player.getItemInHand(player.getUsedItemHand()).hurtAndBreak(1, player, playerEntity -> {});
                            if (blockToBreak.canHarvestBlock(world, pos, player)) {
                                blockToBreak.getBlock().playerDestroy(world, player, blockPos, blockToBreak, null, player.getMainHandItem());
                                blockToBreak.getBlock().playerWillDestroy(world, blockPos, blockToBreak, player);
                                int expDrop = blockToBreak.getBlock().getExpDrop(blockToBreak, world, RandomSource.create(), blockPos, (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.BLOCK_FORTUNE)) ? (EnchantmentHelper.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE, player)) : (0), (EnchantmentHelper.getEnchantments(player.getMainHandItem()).containsKey(Enchantments.SILK_TOUCH)) ? (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, player)) : (0));
                                if (expDrop > 0) blockToBreak.getBlock().popExperience((ServerLevel) world, player.blockPosition().offset(0, 1, 0), expDrop);
                                world.removeBlock(blockPos, false);
                            }
                        }
                    }
                }
            }
        }
    }

    // Dragonyx Armor Bonus
    @SubscribeEvent
    public static void dragonyxArmorBonus(LivingDamageEvent event) {
        if (event.getEntity() instanceof ServerPlayer player) {
            if (event.getSource().is(DamageTypes.FELL_OUT_OF_WORLD) &&
                    player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.DRAGONYX_HELMET.get() &&
                    player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.DRAGONYX_CHESTPLATE.get() &&
                    player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.DRAGONYX_LEGGINGS.get() &&
                    player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.DRAGONYX_BOOTS.get()) {
                event.setAmount(0.0F);
                player.fallDistance = 0.0F;
                ServerLevel level = player.getServer().getLevel(player.getRespawnDimension());
                BlockPos position = player.getRespawnPosition() != null ? player.getRespawnPosition() : level.getSharedSpawnPos();
                if (level != null && position != null) {
                    player.teleportTo(level, position.getX(), position.getY(), position.getZ(), 1.0F, 1.0F);
                }
                player.level().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
                player.setHealth(player.getMaxHealth());
            }
        }
    }

    // Emerald Armor Bonus
    @SubscribeEvent
    public static void emeraldArmorBonus(LivingEvent.LivingTickEvent event) {
        if (event.getEntity() instanceof Player player) {
            if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.EMERALD_HELMET.get() &&
                    player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.EMERALD_CHESTPLATE.get() &&
                    player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.EMERALD_LEGGINGS.get() &&
                    player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.EMERALD_BOOTS.get()) {
                player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 39, 0, true, false));
            }
        }
    }

    // Curios Durability Loss
    @SubscribeEvent
    public static void curiosDurabilityLoss(LivingDamageEvent event) {
        if (event.getEntity() instanceof Player player) {
            CuriosApi.getCuriosInventory(player).ifPresent(inventory -> inventory.findCurios(stack -> Gems.isModid(stack.getItem())).forEach(result -> result.stack().hurtAndBreak(1, player, (player2) -> {
                CuriosApi.broadcastCurioBreakEvent(result.slotContext());
                player2.playSound(SoundEvents.ITEM_BREAK, 1.0F, 1.0F);
            })));
        }
    }

}

package com.foozey.gems.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerChunkProvider;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.server.TicketType;

import java.util.Optional;

public class PlayerSpawnTeleport {

    public static void teleportPlayerToSpawn(World world, PlayerEntity player) {
        if (world.isClientSide) return;
        RegistryKey<World> spawnDim = ((ServerPlayerEntity) player).getRespawnDimension();
        World world1 = world;
        if (world1.dimension() != spawnDim) {
            world1 = world1.getServer().getLevel(spawnDim);
        }
        if (world1 != null) {
            BlockPos spawnPoint = ((ServerPlayerEntity) player).getRespawnPosition();
            if (spawnPoint != null) {
                boolean force = false;
                Optional<Vector3d> optional = PlayerEntity.findRespawnPositionAndUseSpawnBlock((ServerWorld) world1, spawnPoint, 0.0F, force, true);
                if (optional.isPresent()) {
                    Vector3d pos = optional.get();
                    doTeleport(player, world, world1, pos.x(), pos.y(), pos.z());
                    return;
                }
            }
            spawnPoint = ((ServerWorld) world1).getSharedSpawnPos();
            if (spawnPoint != null) {
                doTeleport(player, world, world1, spawnPoint.getX()+0.5, spawnPoint.getY()+0.5, spawnPoint.getZ()+0.5);
            }
        }
    }

    private static void doTeleport(PlayerEntity player, World origin, World target, double x, double y, double z) {
        target.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
        if (origin != target) {
            ((ServerChunkProvider) target.getChunkSource()).addRegionTicket(TicketType.POST_TELEPORT, new ChunkPos(new BlockPos(x, y, z)), 1, player.getEntity().getId());
            ((ServerPlayerEntity) player).teleportTo((ServerWorld) target, x, y, z, player.yRot, player.xRot);
        } else {
            player.teleportTo(x, y, z);
        }
        if (player.fallDistance>0.0F) {
            player.fallDistance = 0.0F;
        }
        target.playSound(null, x, y, z, SoundEvents.ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
    }

}

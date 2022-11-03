package com.foozey.gems.util;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerChunkCache;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Optional;

public class PlayerSpawnTeleport {

    public static void teleportPlayerToSpawn(Level world, Player player) {
        if (world.isClientSide) return;
        ResourceKey<Level> spawnDim = ((ServerPlayer) player).getRespawnDimension();
        Level world1 = world;
        if (world1.dimension() != spawnDim) {
            world1 = world1.getServer().getLevel(spawnDim);
        }
        if (world1 != null) {
            BlockPos spawnPoint = ((ServerPlayer) player).getRespawnPosition();
            if (spawnPoint != null) {
                boolean force = false;
                Optional<Vec3> optional = Player.findRespawnPositionAndUseSpawnBlock((ServerLevel) world1, spawnPoint, 0.0F, force, true);
                if (optional.isPresent()) {
                    Vec3 pos = optional.get();
                    doTeleport(player, world, world1, pos.x(), pos.y(), pos.z());
                    return;
                }
            }
            spawnPoint = ((ServerLevel) world1).getSharedSpawnPos();
            if (spawnPoint != null) {
                doTeleport(player, world, world1, spawnPoint.getX()+0.5, spawnPoint.getY()+0.5, spawnPoint.getZ()+0.5);
            }
        }
    }

    private static void doTeleport(Player player, Level origin, Level target, double x, double y, double z) {
        target.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
        if (origin != target) {
            ((ServerChunkCache) target.getChunkSource()).addRegionTicket(TicketType.POST_TELEPORT, new ChunkPos(new BlockPos(x, y, z)), 1, player.getId());
            ((ServerPlayer) player).teleportTo((ServerLevel) target, x, y, z, player.getYRot(), player.getXRot());
        } else {
            player.teleportTo(x, y, z);
        }
        if (player.fallDistance>0.0F) {
            player.fallDistance = 0.0F;
        }
        target.playSound(null, x, y, z, SoundEvents.ENDERMAN_TELEPORT, SoundSource.PLAYERS, 1.0F, 1.0F);
    }

}

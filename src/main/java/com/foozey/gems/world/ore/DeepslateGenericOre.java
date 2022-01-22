package com.foozey.gems.world.ore;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import java.util.Random;

public class DeepslateGenericOre extends OreBlock {

    // Block Properties
    public DeepslateGenericOre() {
        super(Properties
                .of(Material.STONE)
                .strength(4.5f, 4.5f)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops());
    }

    // Experience Drop
    @Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? Mth.nextInt(new Random(), 3, 7) : 0;
    }

}
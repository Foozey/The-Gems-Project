package com.foozey.gems.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class ModDropExperienceBlock extends DropExperienceBlock {

    private final int minXP;
    private final int maxXP;

    public ModDropExperienceBlock(int minXP, int maxXP, BlockBehaviour.Properties properties) {
        super(properties);
        this.minXP = minXP;
        this.maxXP = maxXP;
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader reader, RandomSource randomSource, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? Mth.nextInt(RandomSource.create(), minXP, maxXP) : 0;
    }

}

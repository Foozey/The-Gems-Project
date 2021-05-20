package com.foozey.gems.world.ore;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class OnyxOre extends OreBlock {

    // Block Properties
    public OnyxOre() {
        super(Properties
                .of(Material.STONE)
                .strength(3.0f, 3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops());
    }

    // Experience Drop
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? MathHelper.nextInt(new Random(), 5, 15) : 0;
    }

}
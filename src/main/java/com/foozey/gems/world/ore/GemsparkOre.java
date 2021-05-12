package com.foozey.gems.world.ore;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class GemsparkOre extends OreBlock {

    // Block Properties
    public GemsparkOre() {
        super(Properties
                .of(Material.STONE)
                .strength(3.0f, 3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .requiresCorrectToolForDrops());
    }

    // Experience Drop
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        if (silktouch == 1) {
            return 0;
        }
        return (int) (Math.random() * 2);
    }

}
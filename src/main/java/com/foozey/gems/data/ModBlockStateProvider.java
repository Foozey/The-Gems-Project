package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Gems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // Blocks
        blockWithItem(ModBlocks.TOPAZ_BLOCK.get());
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK.get());
        blockWithItem(ModBlocks.RUBY_BLOCK.get());
        blockWithItem(ModBlocks.ONYX_BLOCK.get());
        blockWithItem(ModBlocks.TOPAZ_ORE.get());
        blockWithItem(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        blockWithItem(ModBlocks.SAPPHIRE_ORE.get());
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockWithItem(ModBlocks.RUBY_ORE.get());
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockWithItem(ModBlocks.ONYX_ORE.get());
        blockWithItem(ModBlocks.BONE_FOSSIL.get());
        blockWithItem(ModBlocks.DEEPSLATE_BONE_FOSSIL.get());
        blockWithItem(ModBlocks.NETHER_BONE_FOSSIL.get());
        blockWithItem(ModBlocks.RIB_FOSSIL.get());
        blockWithItem(ModBlocks.DEEPSLATE_RIB_FOSSIL.get());
        blockWithItem(ModBlocks.NETHER_RIB_FOSSIL.get());
        blockWithItem(ModBlocks.SKULL_FOSSIL.get());
        blockWithItem(ModBlocks.DEEPSLATE_SKULL_FOSSIL.get());
        blockWithItem(ModBlocks.NETHER_SKULL_FOSSIL.get());
        blockWithItem(ModBlocks.FISH_FOSSIL.get());
        blockWithItem(ModBlocks.DEEPSLATE_FISH_FOSSIL.get());
        blockWithItem(ModBlocks.NETHER_FISH_FOSSIL.get());
        blockWithItem(ModBlocks.SHELL_FOSSIL.get());
        blockWithItem(ModBlocks.DEEPSLATE_SHELL_FOSSIL.get());
        blockWithItem(ModBlocks.NETHER_SHELL_FOSSIL.get());

        // Blocks (Emissive)
        emissiveBlockWithItem(ModBlocks.EXPERIENCE_ORE.get());
        emissiveBlockWithItem(ModBlocks.DEEPSLATE_EXPERIENCE_ORE.get());
        emissiveBlockWithItem(ModBlocks.NETHER_EXPERIENCE_ORE.get());
        emissiveBlockWithItem(ModBlocks.END_EXPERIENCE_ORE.get());
        emissiveBlockWithItem(ModBlocks.END_BONE_FOSSIL.get());
        emissiveBlockWithItem(ModBlocks.END_RIB_FOSSIL.get());
        emissiveBlockWithItem(ModBlocks.END_SKULL_FOSSIL.get());
        emissiveBlockWithItem(ModBlocks.END_FISH_FOSSIL.get());
        emissiveBlockWithItem(ModBlocks.END_SHELL_FOSSIL.get());

    }

    private void blockWithItem(Block block) {
        simpleBlockWithItem(block, cubeAll(block));
    }

    private void emissiveBlockWithItem(Block block) {
        blockWithItem(block);
        models().withExistingParent(Gems.getPath(block), mcLoc("block/cube_all"))
                .renderType("cutout")
                .texture("all", modLoc("block/" + Gems.getPath(block)))
                .texture("overlay", modLoc("block/" + Gems.getPath(block) + "_overlay"))
                .element()
                .from(0.0F, 0.0F, 0.0F)
                .to(16.0F, 16.0F, 16.0F)
                .face(Direction.DOWN).texture("#all").cullface(Direction.DOWN).end()
                .face(Direction.UP).texture("#all").cullface(Direction.UP).end()
                .face(Direction.WEST).texture("#all").cullface(Direction.WEST).end()
                .face(Direction.EAST).texture("#all").cullface(Direction.EAST).end()
                .face(Direction.NORTH).texture("#all").cullface(Direction.NORTH).end()
                .face(Direction.SOUTH).texture("#all").cullface(Direction.SOUTH).end()
                .end()
                .element()
                .from(0.0F, 0.0F, 0.0F)
                .to(16.0F, 16.0F, 16.0F)
                .face(Direction.DOWN).texture("#overlay").cullface(Direction.DOWN).emissivity(15, 15).end()
                .face(Direction.UP).texture("#overlay").cullface(Direction.UP).emissivity(15, 15).end()
                .face(Direction.WEST).texture("#overlay").cullface(Direction.WEST).emissivity(15, 15).end()
                .face(Direction.EAST).texture("#overlay").cullface(Direction.EAST).emissivity(15, 15).end()
                .face(Direction.NORTH).texture("#overlay").cullface(Direction.NORTH).emissivity(15, 15).end()
                .face(Direction.SOUTH).texture("#overlay").cullface(Direction.SOUTH).emissivity(15, 15).end()
                .end();
    }

}

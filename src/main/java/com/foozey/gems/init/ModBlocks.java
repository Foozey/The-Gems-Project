package com.foozey.gems.init;

import com.foozey.gems.Gems;
import com.foozey.gems.world.ore.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gems.MOD_ID);

    // Topaz Block
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () ->
            new Block(AbstractBlock.Properties
                    .of(Material.METAL, MaterialColor.COLOR_ORANGE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    // Topaz Ore
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", GenericOre::new);

    // Sapphire Block
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () ->
            new Block(AbstractBlock.Properties
                    .of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    // Sapphire Ore
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", GenericOre::new);

    // Ruby Block
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () ->
            new Block(AbstractBlock.Properties
                    .of(Material.METAL, MaterialColor.COLOR_RED)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    // Ruby Ore
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", GenericOre::new);

    // Gemspark Block
    public static final RegistryObject<Block> GEMSPARK_BLOCK = BLOCKS.register("gemspark_block", () ->
            new Block(AbstractBlock.Properties
                    .of(Material.METAL, MaterialColor.COLOR_MAGENTA)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    // Gemspark Ore
    public static final RegistryObject<Block> GEMSPARK_ORE = BLOCKS.register("gemspark_ore", GemsparkOre::new);

    // Onyx Block
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () ->
            new Block(AbstractBlock.Properties
                    .of(Material.METAL, MaterialColor.COLOR_RED)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    // Onyx Ore
    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", OnyxOre::new);

    // Experience Ore
    public static final RegistryObject<Block> EXPERIENCE_ORE = BLOCKS.register("experience_ore", ExperienceOre::new);

    // Nether Experience Ore
    public static final RegistryObject<Block> NETHER_EXPERIENCE_ORE = BLOCKS.register("nether_experience_ore", ExperienceOre::new);

    // End Experience Ore
    public static final RegistryObject<Block> END_EXPERIENCE_ORE = BLOCKS.register("end_experience_ore", ExperienceOre::new);

    // Bone Fossil
    public static final RegistryObject<Block> BONE_FOSSIL = BLOCKS.register("bone_fossil", FossilBlock::new);

    // Nether Bone Fossil
    public static final RegistryObject<Block> NETHER_BONE_FOSSIL = BLOCKS.register("nether_bone_fossil", FossilBlock::new);

    // Rib Fossil
    public static final RegistryObject<Block> RIB_FOSSIL = BLOCKS.register("rib_fossil", FossilBlock::new);

    // Nether Rib Fossil
    public static final RegistryObject<Block> NETHER_RIB_FOSSIL = BLOCKS.register("nether_rib_fossil", FossilBlock::new);

    // Skull Fossil
    public static final RegistryObject<Block> SKULL_FOSSIL = BLOCKS.register("skull_fossil", FossilBlock::new);

    // Nether Skull Fossil
    public static final RegistryObject<Block> NETHER_SKULL_FOSSIL = BLOCKS.register("nether_skull_fossil", FossilBlock::new);

    // Fish Fossil
    public static final RegistryObject<Block> FISH_FOSSIL = BLOCKS.register("fish_fossil", FossilBlock::new);

    // Nether Fish Fossil
    public static final RegistryObject<Block> NETHER_FISH_FOSSIL = BLOCKS.register("nether_fish_fossil", FossilBlock::new);

    // Shell Fossil
    public static final RegistryObject<Block> SHELL_FOSSIL = BLOCKS.register("shell_fossil", FossilBlock::new);

    // Nether Shell Fossil
    public static final RegistryObject<Block> NETHER_SHELL_FOSSIL = BLOCKS.register("nether_shell_fossil", FossilBlock::new);

}

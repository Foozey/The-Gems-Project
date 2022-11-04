package com.foozey.gems.init;

import com.foozey.gems.Gems;
import com.foozey.gems.world.ore.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    // Registers
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gems.MOD_ID);



    // Blocks
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Block
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () ->
            new Block(BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_ORANGE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    // Topaz Ore
    public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", GenericOre::new);

    // Deepslate Topaz Ore
    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = BLOCKS.register("deepslate_topaz_ore", DeepslateGenericOre::new);

    // Sapphire Block
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () ->
            new Block(BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    // Sapphire Ore
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", GenericOre::new);

    // Deepslate Sapphire Ore
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", DeepslateGenericOre::new);

    // Ruby Block
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () ->
            new Block(BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_RED)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    // Ruby Ore
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", GenericOre::new);

    // Deepslate Ruby Ore
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", DeepslateGenericOre::new);

    // Onyx Block
    public static final RegistryObject<Block> ONYX_BLOCK = BLOCKS.register("onyx_block", () ->
            new Block(BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_BLACK)
                    .strength(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

    // Onyx Ore
    public static final RegistryObject<Block> ONYX_ORE = BLOCKS.register("onyx_ore", OnyxOre::new);

    // Experience Ore
    public static final RegistryObject<Block> EXPERIENCE_ORE = BLOCKS.register("experience_ore", ExperienceOre::new);

    // Deepslate Experience Ore
    public static final RegistryObject<Block> DEEPSLATE_EXPERIENCE_ORE = BLOCKS.register("deepslate_experience_ore", DeepslateExperienceOre::new);

    // Nether Experience Ore
    public static final RegistryObject<Block> NETHER_EXPERIENCE_ORE = BLOCKS.register("nether_experience_ore", ExperienceOre::new);

    // End Experience Ore
    public static final RegistryObject<Block> END_EXPERIENCE_ORE = BLOCKS.register("end_experience_ore", ExperienceOre::new);

    // Bone Fossil
    public static final RegistryObject<Block> BONE_FOSSIL = BLOCKS.register("bone_fossil", Fossil::new);

    // Deepslate Bone Fossil
    public static final RegistryObject<Block> DEEPSLATE_BONE_FOSSIL = BLOCKS.register("deepslate_bone_fossil", DeepslateFossil::new);

    // Nether Bone Fossil
    public static final RegistryObject<Block> NETHER_BONE_FOSSIL = BLOCKS.register("nether_bone_fossil", Fossil::new);

    // End Bone Fossil
    public static final RegistryObject<Block> END_BONE_FOSSIL = BLOCKS.register("end_bone_fossil", Fossil::new);

    // Rib Fossil
    public static final RegistryObject<Block> RIB_FOSSIL = BLOCKS.register("rib_fossil", Fossil::new);

    // Deepslate Rib Fossil
    public static final RegistryObject<Block> DEEPSLATE_RIB_FOSSIL = BLOCKS.register("deepslate_rib_fossil", DeepslateFossil::new);

    // Nether Rib Fossil
    public static final RegistryObject<Block> NETHER_RIB_FOSSIL = BLOCKS.register("nether_rib_fossil", Fossil::new);

    // End Rib Fossil
    public static final RegistryObject<Block> END_RIB_FOSSIL = BLOCKS.register("end_rib_fossil", Fossil::new);

    // Skull Fossil
    public static final RegistryObject<Block> SKULL_FOSSIL = BLOCKS.register("skull_fossil", Fossil::new);

    // Deepslate Skull Fossil
    public static final RegistryObject<Block> DEEPSLATE_SKULL_FOSSIL = BLOCKS.register("deepslate_skull_fossil", DeepslateFossil::new);

    // Nether Skull Fossil
    public static final RegistryObject<Block> NETHER_SKULL_FOSSIL = BLOCKS.register("nether_skull_fossil", Fossil::new);

    // End Skull Fossil
    public static final RegistryObject<Block> END_SKULL_FOSSIL = BLOCKS.register("end_skull_fossil", Fossil::new);

    // Fish Fossil
    public static final RegistryObject<Block> FISH_FOSSIL = BLOCKS.register("fish_fossil", Fossil::new);

    // Deepslate Fish Fossil
    public static final RegistryObject<Block> DEEPSLATE_FISH_FOSSIL = BLOCKS.register("deepslate_fish_fossil", DeepslateFossil::new);

    // Nether Fish Fossil
    public static final RegistryObject<Block> NETHER_FISH_FOSSIL = BLOCKS.register("nether_fish_fossil", Fossil::new);

    // End Fish Fossil
    public static final RegistryObject<Block> END_FISH_FOSSIL = BLOCKS.register("end_fish_fossil", Fossil::new);

    // Shell Fossil
    public static final RegistryObject<Block> SHELL_FOSSIL = BLOCKS.register("shell_fossil", Fossil::new);

    // Deepslate Shell Fossil
    public static final RegistryObject<Block> DEEPSLATE_SHELL_FOSSIL = BLOCKS.register("deepslate_shell_fossil", DeepslateFossil::new);

    // Nether Shell Fossil
    public static final RegistryObject<Block> NETHER_SHELL_FOSSIL = BLOCKS.register("nether_shell_fossil", Fossil::new);

    // End Shell Fossil
    public static final RegistryObject<Block> END_SHELL_FOSSIL = BLOCKS.register("end_shell_fossil", Fossil::new);

}

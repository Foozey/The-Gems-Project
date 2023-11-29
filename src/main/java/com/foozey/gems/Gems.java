package com.foozey.gems;

import com.foozey.gems.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("gems")
public class Gems {

    public static final String MOD_ID = "gems";

    public Gems() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registries
        ModItems.ITEMS.register(bus);
        ModItems.REPLACE.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModCreativeTabs.TABS.register(bus);
        ModAttributes.ATTRIBUTES.register(bus);
        ModLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(bus);
        ModRecipeSerializers.RECIPE_SERIALIZERS.register(bus);

        // Events
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Util Methods
    public static ResourceLocation rl(String path) {
        return new ResourceLocation(Gems.MOD_ID, path);
    }

    public static String getNamespace(Item item) {
        return ForgeRegistries.ITEMS.getKey(item).getNamespace();
    }

    public static String getNamespace(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getNamespace();
    }

    public static String getPath(Item item) {
        return ForgeRegistries.ITEMS.getKey(item).getPath();
    }

    public static String getPath(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    public static boolean isModid(Item item) {
        return getNamespace(item).equals(Gems.MOD_ID);
    }

    public static boolean isModid(Block block) {
        return getNamespace(block).equals(Gems.MOD_ID);
    }

}

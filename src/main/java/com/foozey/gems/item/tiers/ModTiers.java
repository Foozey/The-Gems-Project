package com.foozey.gems.item.tiers;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModItems;
import com.foozey.gems.tag.ModBlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {

    public static final Tier TOPAZ = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 4.0F, 15, ModBlockTags.NEEDS_TOPAZ_TOOL, () -> Ingredient.of(ModItems.TOPAZ.get())), Gems.rl("topaz"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 4.0F, 15, ModBlockTags.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())), Gems.rl("sapphire"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier RUBY = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 4.0F, 15, ModBlockTags.NEEDS_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())), Gems.rl("ruby"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier DRAGONYX = TierSortingRegistry.registerTier(new ForgeTier(4, 2031, 9.0F, 4.0F, 15, ModBlockTags.NEEDS_DRAGONYX_TOOL, () -> Ingredient.of(ModItems.DRAGONYX_INGOT.get())), Gems.rl("dragonyx"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier EMERALD = TierSortingRegistry.registerTier(new ForgeTier(2, 250, 6.0F, 2.0F, 30, ModBlockTags.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)), Gems.rl("emerald"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

}

package com.foozey.gems.registry;

import com.foozey.gems.Gems;
import com.foozey.gems.recipe.ShieldBannerRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializers {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Gems.MOD_ID);

    // Shield (Banner)
    public static final RegistryObject<RecipeSerializer<ShieldBannerRecipe>> BANNER_SHIELD = RECIPE_SERIALIZERS.register("banner_shield", () -> new SimpleCraftingRecipeSerializer<>(ShieldBannerRecipe::new));

}

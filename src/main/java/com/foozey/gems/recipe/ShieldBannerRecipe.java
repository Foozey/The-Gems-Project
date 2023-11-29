package com.foozey.gems.recipe;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModRecipeSerializers;
import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;

public class ShieldBannerRecipe extends CustomRecipe {

    public ShieldBannerRecipe(ResourceLocation id, CraftingBookCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(CraftingContainer container, Level level) {
        ItemStack shieldStack = ItemStack.EMPTY;
        ItemStack bannerStack = ItemStack.EMPTY;
        for (ItemStack stack : container.getItems()) {
            if (stack.isEmpty()) continue;
            if (stack.getItem() instanceof BannerItem) {
                if (!bannerStack.isEmpty()) return false;
                bannerStack = stack;
            } else if (stack.getItem() instanceof ShieldItem && Gems.isModid(stack.getItem()) && shieldStack.isEmpty() && stack.getTagElement("BlockEntityTag") == null) {
                shieldStack = stack;
            } else return false;
        }
        return !shieldStack.isEmpty() && !bannerStack.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingContainer container, RegistryAccess registryAccess) {
        ItemStack bannerStack = ItemStack.EMPTY;
        ItemStack shieldStack = ItemStack.EMPTY;
        for (ItemStack stack : container.getItems()) {
            if (stack.isEmpty()) continue;
            if (stack.getItem() instanceof BannerItem) {
                bannerStack = stack;
            } else if (stack.getItem() instanceof ShieldItem && Gems.isModid(stack.getItem())) {
                shieldStack = stack.copy();
            }
        }
        if (shieldStack.isEmpty()) {
            return ItemStack.EMPTY;
        }
        CompoundTag blockEntityTag = bannerStack.getTagElement("BlockEntityTag");
        CompoundTag tag = blockEntityTag == null ? new CompoundTag() : blockEntityTag.copy();
        tag.putInt("Base", ((BannerItem) bannerStack.getItem()).getColor().getId());
        shieldStack.addTagElement("BlockEntityTag", tag);
        return shieldStack;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public boolean isIncomplete() {
        return false;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.BANNER_SHIELD.get();
    }

}

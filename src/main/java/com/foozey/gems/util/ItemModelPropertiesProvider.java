package com.foozey.gems.util;

import com.foozey.gems.tag.ModItemLists;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ItemModelPropertiesProvider {

    // Bow
    public static void bow() {
        for (Item item : ModItemLists.BOWS) {
            ItemProperties.register(item, new ResourceLocation("pull"), (stack, world, wielder, seed) -> wielder != null ? wielder.getUseItem() != stack ? 0.0F : (float) (stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F : 0.0F);
            ItemProperties.register(item, new ResourceLocation("pulling"), (stack, world, wielder, seed) -> wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);
        }
    }

    // Crossbow
    public static void crossbow() {
        for (Item item : ModItemLists.CROSSBOWS) {
            ItemProperties.register(item, new ResourceLocation("pull"), (stack, world, wielder, seed) -> wielder != null ? CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack) : 0.0F);
            ItemProperties.register(item, new ResourceLocation("pulling"), (stack, world, wielder, seed) -> wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
            ItemProperties.register(item, new ResourceLocation("charged"), (stack, world, wielder, seed) -> wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
            ItemProperties.register(item, new ResourceLocation("firework"), (stack, world, wielder, seed) -> wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
        }
    }

    // Shield
    public static void shield() {
        for (Item item : ModItemLists.SHIELDS) {
            ItemProperties.register(item, new ResourceLocation("blocking"), (stack, world, wielder, seed) -> wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);
        }
    }

}

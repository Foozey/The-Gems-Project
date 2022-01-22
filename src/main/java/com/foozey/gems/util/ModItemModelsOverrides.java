package com.foozey.gems.util;

import com.foozey.gems.init.ModItems;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;

public class ModItemModelsOverrides {

    // TODO: Clean this up

    public static void BowItemModelsOverrides() {

        // Iron Bow
        ItemProperties.register(ModItems.IRON_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.IRON_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Golden Bow
        ItemProperties.register(ModItems.GOLDEN_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.GOLDEN_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Diamond Bow
        ItemProperties.register(ModItems.DIAMOND_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.DIAMOND_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Netherite Bow
        ItemProperties.register(ModItems.NETHERITE_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.NETHERITE_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Topaz Bow
        ItemProperties.register(ModItems.TOPAZ_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.TOPAZ_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Sapphire Bow
        ItemProperties.register(ModItems.SAPPHIRE_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.SAPPHIRE_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Ruby Bow
        ItemProperties.register(ModItems.RUBY_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.RUBY_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Infused Onyx Bow
        ItemProperties.register(ModItems.INFUSED_ONYX_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.INFUSED_ONYX_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Emerald Bow
        ItemProperties.register(ModItems.EMERALD_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(ModItems.EMERALD_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

    }

    public static void CrossbowItemModelsOverrides() {

        // Iron Crossbow
        ItemProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Golden Crossbow
        ItemProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Diamond Crossbow
        ItemProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Netherite Crossbow
        ItemProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Topaz Crossbow
        ItemProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Sapphire Crossbow
        ItemProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Ruby Crossbow
        ItemProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Infused Onyx Crossbow
        ItemProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Emerald Crossbow
        ItemProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder, seed) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder, seed) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

    }

    public static void ShieldItemModelsOverrides() {

        // Iron Shield
        ItemProperties.register(ModItems.IRON_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Golden Shield
        ItemProperties.register(ModItems.GOLDEN_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Diamond Shield
        ItemProperties.register(ModItems.DIAMOND_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Netherite Shield
        ItemProperties.register(ModItems.NETHERITE_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Topaz Shield
        ItemProperties.register(ModItems.TOPAZ_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Sapphire Shield
        ItemProperties.register(ModItems.SAPPHIRE_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Ruby Shield
        ItemProperties.register(ModItems.RUBY_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Infused Onyx Shield
        ItemProperties.register(ModItems.INFUSED_ONYX_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Emerald Shield
        ItemProperties.register(ModItems.EMERALD_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder, seed) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

    }

}

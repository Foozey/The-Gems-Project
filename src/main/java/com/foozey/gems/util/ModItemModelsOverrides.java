package com.foozey.gems.util;

import com.foozey.gems.init.ModItems;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class ModItemModelsOverrides {

    // TODO: Clean this up

    public static void BowItemModelsOverrides() {

        // Iron Bow
        ItemModelsProperties.register(ModItems.IRON_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.IRON_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Golden Bow
        ItemModelsProperties.register(ModItems.GOLDEN_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.GOLDEN_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Diamond Bow
        ItemModelsProperties.register(ModItems.DIAMOND_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.DIAMOND_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Netherite Bow
        ItemModelsProperties.register(ModItems.NETHERITE_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.NETHERITE_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Topaz Bow
        ItemModelsProperties.register(ModItems.TOPAZ_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.TOPAZ_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Sapphire Bow
        ItemModelsProperties.register(ModItems.SAPPHIRE_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.SAPPHIRE_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Ruby Bow
        ItemModelsProperties.register(ModItems.RUBY_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.RUBY_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Infused Onyx Bow
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Emerald Bow
        ItemModelsProperties.register(ModItems.EMERALD_BOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return wielder.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemModelsProperties.register(ModItems.EMERALD_BOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

    }

    public static void CrossbowItemModelsOverrides() {

        // Iron Crossbow
        ItemModelsProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.IRON_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Golden Crossbow
        ItemModelsProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.GOLDEN_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Diamond Crossbow
        ItemModelsProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.DIAMOND_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Netherite Crossbow
        ItemModelsProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.NETHERITE_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Topaz Crossbow
        ItemModelsProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.TOPAZ_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Sapphire Crossbow
        ItemModelsProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.SAPPHIRE_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Ruby Crossbow
        ItemModelsProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.RUBY_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Infused Onyx Crossbow
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

        // Emerald Crossbow
        ItemModelsProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("pull"), (stack, world, wielder) -> {
            if (wielder == null) {
                return 0.0F;
            } else {
                return CrossbowItem.isCharged(stack) ? 0.0F : (float)(stack.getUseDuration() - wielder.getUseItemRemainingTicks()) / (float)CrossbowItem.getChargeDuration(stack);
            }
        });
        ItemModelsProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("pulling"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("charged"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) ? 1.0F : 0.0F);
        ItemModelsProperties.register(ModItems.EMERALD_CROSSBOW.get(), new ResourceLocation("firework"), (stack, world, wielder) ->
                wielder != null && CrossbowItem.isCharged(stack) && CrossbowItem.containsChargedProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);

    }

    public static void ShieldItemModelsOverrides() {

        // Iron Shield
        ItemModelsProperties.register(ModItems.IRON_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Golden Shield
        ItemModelsProperties.register(ModItems.GOLDEN_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Diamond Shield
        ItemModelsProperties.register(ModItems.DIAMOND_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Netherite Shield
        ItemModelsProperties.register(ModItems.NETHERITE_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Topaz Shield
        ItemModelsProperties.register(ModItems.TOPAZ_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Sapphire Shield
        ItemModelsProperties.register(ModItems.SAPPHIRE_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Ruby Shield
        ItemModelsProperties.register(ModItems.RUBY_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Infused Onyx Shield
        ItemModelsProperties.register(ModItems.INFUSED_ONYX_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

        // Emerald Shield
        ItemModelsProperties.register(ModItems.EMERALD_SHIELD.get(), new ResourceLocation("blocking"), (stack, world, wielder) ->
                wielder != null && wielder.isUsingItem() && wielder.getUseItem() == stack ? 1.0F : 0.0F);

    }

}

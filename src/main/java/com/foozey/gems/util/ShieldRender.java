package com.foozey.gems.util;

import com.foozey.gems.init.ModItems;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.model.ShieldModel;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class ShieldRender extends ProvideISTER {

    public static final ShieldRender RENDERER = new ShieldRender();

    private ShieldModel shieldModel;

    @Override
    public void onResourceManagerReload(@NonNull ResourceManager resourceManager) {
        shieldModel = new ShieldModel(getEntityModels().bakeLayer(ModelLayers.SHIELD));
    }

    @Override
    public void renderByItem(@NonNull ItemStack stack, ItemTransforms.@NonNull TransformType transformType, @NonNull PoseStack matrix, @NonNull MultiBufferSource renderer, int light, int overlayLight) {
        Item item = stack.getItem();
        ShieldTextures textures;

        if (item == ModItems.IRON_SHIELD.get()) {
            textures = ShieldTextures.IRON;
        } else if (item == ModItems.GOLDEN_SHIELD.get()) {
            textures = ShieldTextures.GOLDEN;
        } else if (item == ModItems.DIAMOND_SHIELD.get()) {
            textures = ShieldTextures.DIAMOND;
        } else if (item == ModItems.NETHERITE_SHIELD.get()) {
            textures = ShieldTextures.NETHERITE;
        } else if (item == ModItems.TOPAZ_SHIELD.get()) {
            textures = ShieldTextures.TOPAZ;
        } else if (item == ModItems.SAPPHIRE_SHIELD.get()) {
            textures = ShieldTextures.SAPPHIRE;
        } else if (item == ModItems.RUBY_SHIELD.get()) {
            textures = ShieldTextures.RUBY;
        } else if (item == ModItems.INFUSED_ONYX_SHIELD.get()) {
            textures = ShieldTextures.INFUSED_ONYX;
        } else if (item == ModItems.EMERALD_SHIELD.get()) {
            textures = ShieldTextures.EMERALD;
        } else {
            return;
        }

        boolean flag = stack.getTagElement("BlockEntityTag") != null;
        Material material = textures.getBase();
        matrix.pushPose();
        matrix.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer buffer = material.sprite().wrap(ItemRenderer.getFoilBufferDirect(renderer, shieldModel.renderType(material.atlasLocation()), true, stack.hasFoil()));
        if (flag) {
            shieldModel.handle().render(matrix, buffer, light, overlayLight, 1, 1, 1, 1);
            List<Pair<BannerPattern,DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(stack), BannerBlockEntity.getItemPatterns(stack));
            BannerRenderer.renderPatterns(matrix, renderer, light, overlayLight, shieldModel.plate(), material, false, list);
        } else {
            shieldModel.renderToBuffer(matrix, buffer, light, overlayLight, 1, 1, 1, 1);
        }
        matrix.popPose();
    }

}
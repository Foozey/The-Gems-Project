package com.foozey.gems.util;

import com.foozey.gems.init.ModItems;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.model.ShieldModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.tileentity.BannerTileEntityRenderer;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.tileentity.BannerTileEntity;

import java.util.List;

public class ShieldRender extends ItemStackTileEntityRenderer {

    private final ShieldModel modelShield = new ShieldModel();

    @Override
    public void renderByItem(ItemStack stack, ItemCameraTransforms.TransformType transform, MatrixStack matrixStack, IRenderTypeBuffer buffer, int combinedLight, int combinedOverlay) {
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
        } else if (item == ModItems.PLATED_ONYX_SHIELD.get()) {
            textures = ShieldTextures.PLATED_ONYX;
        } else if (item == ModItems.EMERALD_SHIELD.get()) {
            textures = ShieldTextures.EMERALD;
        } else {
            return;
        }
        boolean flag = stack.getTagElement("BlockEntityTag") != null;
        matrixStack.pushPose();
        matrixStack.scale(1.0F, -1.0F, -1.0F);
        RenderMaterial material = textures.getBase();
        IVertexBuilder ivertexbuilder = material.sprite().wrap(ItemRenderer.getFoilBufferDirect(buffer, this.modelShield.renderType(material.atlasLocation()), true, stack.hasFoil()));
        this.modelShield.handle().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
        if (flag) {
            List<Pair<BannerPattern, DyeColor>> list = BannerTileEntity.createPatterns(ShieldItem.getColor(stack), BannerTileEntity.getItemPatterns(stack));
            BannerTileEntityRenderer.renderPatterns(matrixStack, buffer, combinedLight, combinedOverlay, this.modelShield.plate(), material, false, list, stack.hasFoil());
        } else {
            this.modelShield.plate().render(matrixStack, ivertexbuilder, combinedLight, combinedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        matrixStack.popPose();
    }

}

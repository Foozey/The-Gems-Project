package com.foozey.gems.item.shield;

import com.foozey.gems.item.ModShieldItem;
import com.foozey.gems.tag.ModItemLists;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ShieldModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Holder;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraft.world.level.block.entity.BannerPattern;

import java.util.List;

public class ShieldRender extends BlockEntityWithoutLevelRenderer {

    private ShieldModel shieldModel;
    private ShieldModel overlayModel;
    public static final ShieldRender RENDERER = new ShieldRender();

    public ShieldRender() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
    }

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
        shieldModel = new ShieldModel(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLayers.SHIELD));
        overlayModel = new ShieldModel(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLayers.SHIELD));
    }

    @Override
    public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack matrix, MultiBufferSource renderer, int light, int overlayLight) {
        Item item = stack.getItem();
        ShieldTextures textures = ((ModShieldItem) item).getShieldTextures();
        boolean flag = stack.getTagElement("BlockEntityTag") != null;
        Material base = textures.getBase();
        Material overlay = textures.getOverlay();
        matrix.pushPose();
        matrix.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer buffer = base.sprite().wrap(ItemRenderer.getFoilBufferDirect(renderer, shieldModel.renderType(base.atlasLocation()), true, stack.hasFoil()));
        VertexConsumer overlayBuffer = overlay.sprite().wrap(ItemRenderer.getFoilBufferDirect(renderer, RenderType.entityTranslucent(overlay.atlasLocation()), true, stack.hasFoil()));
        if (flag) {
            shieldModel.handle().render(matrix, buffer, light, overlayLight, 1.0F, 1.0F, 1.0F, 1.0F);
            List<Pair<Holder<BannerPattern>, DyeColor>> list = BannerBlockEntity.createPatterns(ShieldItem.getColor(stack), BannerBlockEntity.getItemPatterns(stack));
            BannerRenderer.renderPatterns(matrix, renderer, light, overlayLight, shieldModel.plate(), base, false, list);
        } else {
            shieldModel.renderToBuffer(matrix, buffer, light, overlayLight, 1.0F, 1.0F, 1.0F, 1.0F);
            if (ModItemLists.EMISSIVE_ITEMS.contains(item)) {
                overlayModel.renderToBuffer(matrix, overlayBuffer, LightTexture.FULL_BRIGHT, overlayLight, 1, 1, 1, 1);
            }
        }
        matrix.popPose();
    }

}

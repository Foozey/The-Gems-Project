package com.foozey.gems.util;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;

public abstract class ProvideISTER extends BlockEntityWithoutLevelRenderer {

    protected ProvideISTER() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
    }

    protected EntityModelSet getEntityModels() {
        return Minecraft.getInstance().getEntityModels();
    }

    @Override
    public abstract void onResourceManagerReload(@NonNull ResourceManager resourceManager);

    @Override
    public abstract void renderByItem(@NonNull ItemStack stack, ItemTransforms.@NonNull TransformType transformType, @NonNull PoseStack matrix, @NonNull MultiBufferSource renderer, int light, int overlayLight);

}

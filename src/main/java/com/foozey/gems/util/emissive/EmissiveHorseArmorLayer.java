package com.foozey.gems.util.emissive;

import com.foozey.gems.Gems;
import com.foozey.gems.tag.ModItemLists;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.ItemStack;

public class EmissiveHorseArmorLayer extends RenderLayer<Horse, HorseModel<Horse>> {

    private final HorseModel<Horse> overlayModel;

    public EmissiveHorseArmorLayer(RenderLayerParent<Horse, HorseModel<Horse>> renderer, EntityModelSet modelSet) {
        super(renderer);
        overlayModel = new HorseModel<>(modelSet.bakeLayer(ModelLayers.HORSE_ARMOR));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, Horse livingEntity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        ItemStack stack = livingEntity.getArmor();
        ResourceLocation overlay;
        getParentModel().copyPropertiesTo(overlayModel);
        overlayModel.prepareMobModel(livingEntity, limbSwing, limbSwingAmount, partialTicks);
        overlayModel.setupAnim(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        String item = Gems.getPath(stack.getItem());
        String material = item.split("_")[0];
        if (ModItemLists.EMISSIVE_ITEMS.contains(stack.getItem())) {
            overlay = Gems.rl("textures/entity/horse/armor/horse_armor_" + material + "_overlay.png");
            VertexConsumer overlayBuffer = buffer.getBuffer(RenderType.entityTranslucent(overlay));
            overlayModel.renderToBuffer(poseStack, overlayBuffer, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

}

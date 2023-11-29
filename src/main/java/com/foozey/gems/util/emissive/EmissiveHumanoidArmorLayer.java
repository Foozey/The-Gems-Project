package com.foozey.gems.util.emissive;

import com.foozey.gems.Gems;
import com.foozey.gems.tag.ModItemLists;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public class EmissiveHumanoidArmorLayer<T extends LivingEntity, M extends HumanoidModel<T>, A extends HumanoidModel<T>> extends HumanoidArmorLayer<T, M, A> {

    public EmissiveHumanoidArmorLayer(RenderLayerParent<T, M> renderer, A innerModel, A outerModel, ModelManager modelManager) {
        super(renderer, innerModel, outerModel, modelManager);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, T livingEntity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        renderEmissive(poseStack, buffer, livingEntity, EquipmentSlot.HEAD);
        renderEmissive(poseStack, buffer, livingEntity, EquipmentSlot.CHEST);
        renderEmissive(poseStack, buffer, livingEntity, EquipmentSlot.LEGS);
        renderEmissive(poseStack, buffer, livingEntity, EquipmentSlot.FEET);
    }

    @Override
    public ResourceLocation getArmorResource(Entity entity, ItemStack stack, EquipmentSlot slot, @Nullable String type) {
        String item = Gems.getPath(stack.getItem());
        String material = item.split("_")[0];
        if (ModItemLists.EMISSIVE_ITEMS.contains(stack.getItem()) && (slot == EquipmentSlot.HEAD || slot == EquipmentSlot.CHEST || slot == EquipmentSlot.FEET)) {
            return Gems.rl("textures/models/armor/" + material + "_layer_1_overlay.png");
        }
        if (ModItemLists.EMISSIVE_ITEMS.contains(stack.getItem()) && slot == EquipmentSlot.LEGS) {
            return Gems.rl("textures/models/armor/" + material + "_layer_2_overlay.png");
        }
        return new ResourceLocation("");
    }

    private void renderEmissive(PoseStack poseStack, MultiBufferSource buffer, T livingEntity, EquipmentSlot slot) {
        if (ModItemLists.EMISSIVE_ITEMS.contains(livingEntity.getItemBySlot(slot).getItem())) {
            renderArmorPiece(poseStack, buffer, livingEntity, slot, LightTexture.FULL_BRIGHT, getArmorModel(slot));
        }
    }

}

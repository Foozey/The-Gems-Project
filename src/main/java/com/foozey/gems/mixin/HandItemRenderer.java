package com.foozey.gems.mixin;

import com.foozey.gems.init.ModItems;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.renderer.ItemInHandRenderer.class)
public class HandItemRenderer {

    @Mutable
    @Final
    @Shadow
    private final Minecraft minecraft;
    private ItemRenderer itemRenderer;

    public HandItemRenderer(Minecraft minecraft) {
        this.minecraft = minecraft;
        this.itemRenderer = minecraft.getItemRenderer();
    }

    @Inject(method = "renderArmWithItem", at = @At("HEAD"), cancellable = true)
    private void renderArmWithItemMixin(AbstractClientPlayer pPlayer, float pPartialTicks, float pPitch, InteractionHand pHand, float pSwingProgress, ItemStack pStack, float pEquippedProgress, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pCombinedLight, CallbackInfo pCallbackInfo) {
        if (!pPlayer.isScoping()) {
            boolean flag = pHand == InteractionHand.MAIN_HAND;
            HumanoidArm humanoidarm = flag ? pPlayer.getMainArm() : pPlayer.getMainArm().getOpposite();
            if (pStack.is(ModItems.IRON_CROSSBOW.get()) ||
                    pStack.is(ModItems.GOLDEN_CROSSBOW.get()) ||
                    pStack.is(ModItems.DIAMOND_CROSSBOW.get()) ||
                    pStack.is(ModItems.NETHERITE_CROSSBOW.get()) ||
                    pStack.is(ModItems.TOPAZ_CROSSBOW.get()) ||
                    pStack.is(ModItems.SAPPHIRE_CROSSBOW.get()) ||
                    pStack.is(ModItems.RUBY_CROSSBOW.get()) ||
                    pStack.is(ModItems.DRAGONYX_CROSSBOW.get()) ||
                    pStack.is(ModItems.EMERALD_CROSSBOW.get())
            ) {
                boolean flag1 = CrossbowItem.isCharged(pStack);
                boolean flag2 = humanoidarm == HumanoidArm.RIGHT;
                int i = flag2 ? 1 : -1;
                if (pPlayer.isUsingItem() && pPlayer.getUseItemRemainingTicks() > 0 && pPlayer.getUsedItemHand() == pHand) {
                    this.applyItemArmTransform(pMatrixStack, humanoidarm, pEquippedProgress);
                    pMatrixStack.translate((double)((float)i * -0.4785682F), (double)-0.094387F, (double)0.05731531F);
                    pMatrixStack.mulPose(Vector3f.XP.rotationDegrees(-11.935F));
                    pMatrixStack.mulPose(Vector3f.YP.rotationDegrees((float)i * 65.3F));
                    pMatrixStack.mulPose(Vector3f.ZP.rotationDegrees((float)i * -9.785F));
                    float f9 = (float)pStack.getUseDuration() - ((float)this.minecraft.player.getUseItemRemainingTicks() - pPartialTicks + 1.0F);
                    float f13 = f9 / (float) CrossbowItem.getChargeDuration(pStack);
                    if (f13 > 1.0F) {
                        f13 = 1.0F;
                    }
                    if (f13 > 0.1F) {
                        float f16 = Mth.sin((f9 - 0.1F) * 1.3F);
                        float f3 = f13 - 0.1F;
                        float f4 = f16 * f3;
                        pMatrixStack.translate((double)(f4 * 0.0F), (double)(f4 * 0.004F), (double)(f4 * 0.0F));
                    }
                    pMatrixStack.translate((double)(f13 * 0.0F), (double)(f13 * 0.0F), (double)(f13 * 0.04F));
                    pMatrixStack.scale(1.0F, 1.0F, 1.0F + f13 * 0.2F);
                    pMatrixStack.mulPose(Vector3f.YN.rotationDegrees((float)i * 45.0F));
                } else {
                    float f = -0.4F * Mth.sin(Mth.sqrt(pSwingProgress) * (float)Math.PI);
                    float f1 = 0.2F * Mth.sin(Mth.sqrt(pSwingProgress) * ((float)Math.PI * 2F));
                    float f2 = -0.2F * Mth.sin(pSwingProgress * (float)Math.PI);
                    pMatrixStack.translate((double)((float)i * f), (double)f1, (double)f2);
                    this.applyItemArmTransform(pMatrixStack, humanoidarm, pEquippedProgress);
                    this.applyItemArmAttackTransform(pMatrixStack, humanoidarm, pSwingProgress);
                    if (flag1 && pSwingProgress < 0.001F && flag) {
                        pMatrixStack.translate((double)((float)i * -0.641864F), 0.0D, 0.0D);
                        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees((float)i * 10.0F));
                    }
                }
                this.renderItem(pPlayer, pStack, flag2 ? ItemTransforms.TransformType.FIRST_PERSON_RIGHT_HAND : ItemTransforms.TransformType.FIRST_PERSON_LEFT_HAND, !flag2, pMatrixStack, pBuffer, pCombinedLight);
                pCallbackInfo.cancel();
            }
        }
    }

    @Shadow
    private void applyItemArmTransform(PoseStack matrices, HumanoidArm arm, float equippedProgress) {
    }

    @Shadow
    private void applyItemArmAttackTransform(PoseStack matrices, HumanoidArm arm, float swingProgress) {
    }

    public void renderItem(LivingEntity pLivingEntity, ItemStack pItemStack, ItemTransforms.TransformType pTransformType, boolean pLeftHand, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pCombinedLight) {
        if (!pItemStack.isEmpty()) {
            this.itemRenderer.renderStatic(pLivingEntity, pItemStack, pTransformType, pLeftHand, pMatrixStack, pBuffer, pLivingEntity.level, pCombinedLight, OverlayTexture.NO_OVERLAY, pLivingEntity.getId() + pTransformType.ordinal());
        }
    }

}

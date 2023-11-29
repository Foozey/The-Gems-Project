package com.foozey.gems.mixin;

import com.foozey.gems.item.ModSmithingTemplateItem;
import net.minecraft.world.item.SmithingTemplateItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(SmithingTemplateItem.class)
public class SmithingTemplateItemMixin {

    @Inject(method = "createNetheriteUpgradeIconList", at = @At("HEAD"), cancellable = true)
    private static void injectEquipmentIcons(CallbackInfoReturnable<List> callback) {
        callback.setReturnValue(ModSmithingTemplateItem.EMPTY_EQUIPMENT_ICONS);
    }

    @Inject(method = "createTrimmableMaterialIconList", at = @At("HEAD"), cancellable = true)
    private static void injectMaterialIcons(CallbackInfoReturnable<List> callback) {
        callback.setReturnValue(ModSmithingTemplateItem.EMPTY_MATERIAL_ICONS);
    }

}

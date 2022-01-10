package com.foozey.gems.util;

import com.foozey.gems.Gems;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.util.ResourceLocation;

public enum ShieldTextures {

    IRON("iron"),
    GOLDEN("golden"),
    DIAMOND("diamond"),
    NETHERITE("netherite"),
    TOPAZ("topaz"),
    SAPPHIRE("sapphire"),
    RUBY("ruby"),
    INFUSED_ONYX("infused_onyx"),
    EMERALD("emerald");

    private final RenderMaterial base;

    ShieldTextures(String name) {
        base = material("entity/" + name + "_shield");
    }

    public RenderMaterial getBase() {
        return base;
    }

    private static RenderMaterial material(String path) {
        return new RenderMaterial(AtlasTexture.LOCATION_BLOCKS, new ResourceLocation(Gems.MOD_ID, path));
    }

}

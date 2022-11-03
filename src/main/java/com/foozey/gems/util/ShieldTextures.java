package com.foozey.gems.util;

import com.foozey.gems.Gems;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

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

    private final Material base;

    ShieldTextures(String name) {
        base = material("entity/" + name + "_shield");
    }

    public Material getBase() {
        return base;
    }

    private static Material material(String path) {
        return new Material(TextureAtlas.LOCATION_BLOCKS, new ResourceLocation(Gems.MOD_ID, path));
    }

}

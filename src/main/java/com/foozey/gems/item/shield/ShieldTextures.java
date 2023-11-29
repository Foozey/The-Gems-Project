package com.foozey.gems.item.shield;

import com.foozey.gems.Gems;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;

public enum ShieldTextures {

    IRON("iron"),
    GOLDEN("golden"),
    DIAMOND("diamond"),
    NETHERITE("netherite"),
    TOPAZ("topaz"),
    SAPPHIRE("sapphire"),
    RUBY("ruby"),
    DRAGONYX("dragonyx"),
    EMERALD("emerald");

    private final Material base;
    private final Material overlay;

    ShieldTextures(String name) {
        base = new Material(Sheets.SHIELD_SHEET, Gems.rl("entity/" + name + "_shield"));
        overlay = new Material(Sheets.SHIELD_SHEET, Gems.rl("entity/" + name + "_shield_overlay"));
    }

    public Material getBase() {
        return base;
    }

    public Material getOverlay() {
        return overlay;
    }

}

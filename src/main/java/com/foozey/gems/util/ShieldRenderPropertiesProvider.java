package com.foozey.gems.util;

import net.minecraftforge.client.IItemRenderProperties;

public class ShieldRenderPropertiesProvider {

    public static IItemRenderProperties shield() {
        return new RenderPropertiesProvider.ModRenderProperties(ShieldRender.RENDERER);
    }

}

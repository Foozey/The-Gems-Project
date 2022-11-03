package com.foozey.gems.util;

import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class ShieldRenderPropertiesProvider {

    public static IClientItemExtensions shield() {
        return new RenderPropertiesProvider.ModRenderProperties(ShieldRender.RENDERER);
    }

}

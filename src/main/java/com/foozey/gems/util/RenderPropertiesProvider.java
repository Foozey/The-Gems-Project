package com.foozey.gems.util;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class RenderPropertiesProvider {

    public record ModRenderProperties(BlockEntityWithoutLevelRenderer renderer) implements IClientItemExtensions {
        @Override
        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
            return renderer;
        }
    }

}

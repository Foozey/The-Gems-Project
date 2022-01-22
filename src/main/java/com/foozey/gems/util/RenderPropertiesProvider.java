package com.foozey.gems.util;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraftforge.client.IItemRenderProperties;

public class RenderPropertiesProvider {

    public record ModRenderProperties(BlockEntityWithoutLevelRenderer renderer) implements IItemRenderProperties {

        @Override
        public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
            return renderer;
        }

    }

}

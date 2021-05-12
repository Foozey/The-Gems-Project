package com.foozey.gems.util;

import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;

import java.util.concurrent.Callable;

public class ProvideISTER {

    public static Callable<ItemStackTileEntityRenderer> shield() {
        return ShieldRender::new;
    }

}

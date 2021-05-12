package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.util.ShieldTextures;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModClientEventsMod {

    // Shield Textures
    @SubscribeEvent
    public static void shieldStitch(TextureStitchEvent.Pre event) {
        if (event.getMap().location().equals(AtlasTexture.LOCATION_BLOCKS)) {
            for (ShieldTextures textures : ShieldTextures.values()) {
                event.addSprite(textures.getBase().texture());
            }
        }
    }

}

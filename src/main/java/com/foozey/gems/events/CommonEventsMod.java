package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.util.ShieldTextures;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class CommonEventsMod {

    @SubscribeEvent
    public static void modifyAttributes(EntityAttributeModificationEvent event) {
        for (EntityType<? extends LivingEntity> type : event.getTypes()) event.add(type, ModAttributes.BONUS_XP.get());
        for (EntityType<? extends LivingEntity> type : event.getTypes()) event.add(type, ModAttributes.LIFESTEAL.get());
        for (EntityType<? extends LivingEntity> type : event.getTypes()) event.add(type, ModAttributes.HARVEST_AREA.get());
    }

}

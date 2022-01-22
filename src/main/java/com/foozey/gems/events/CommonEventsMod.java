package com.foozey.gems.events;

import com.foozey.gems.Gems;
import com.foozey.gems.init.ModAttributes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
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

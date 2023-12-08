package com.foozey.gems.event;

import com.foozey.gems.Gems;
import com.foozey.gems.item.shield.ShieldRender;
import com.foozey.gems.util.ItemModelPropertiesProvider;
import com.foozey.gems.util.emissive.EmissiveHorseArmorLayer;
import com.foozey.gems.util.emissive.EmissiveHumanoidArmorLayer;
import com.foozey.gems.util.emissive.EmissiveModelLayers;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidArmorModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.HorseRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.List;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ClientEventsMod {

    // Client Setup
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemModelPropertiesProvider.bow();
            ItemModelPropertiesProvider.crossbow();
            ItemModelPropertiesProvider.shield();
            ShieldRender.initializeTextures();
        });
    }

    // Shield Render
    @SubscribeEvent
    public static void registerClientReloadListeners(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener(ShieldRender.RENDERER);
    }

    // Emissive Layer Definitions
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        LayerDefinition outer = LayerDefinition.create(HumanoidArmorModel.createBodyLayer(new CubeDeformation(1.025F)), 64, 32);
        LayerDefinition inner = LayerDefinition.create(HumanoidArmorModel.createBodyLayer(new CubeDeformation(0.525F)), 64, 32);
        event.registerLayerDefinition(EmissiveModelLayers.PLAYER_INNER_ARMOR_EMISSIVE, () -> inner);
        event.registerLayerDefinition(EmissiveModelLayers.PLAYER_OUTER_ARMOR_EMISSIVE, () -> outer);
        event.registerLayerDefinition(EmissiveModelLayers.PLAYER_SLIM_INNER_ARMOR_EMISSIVE, () -> inner);
        event.registerLayerDefinition(EmissiveModelLayers.PLAYER_SLIM_OUTER_ARMOR_EMISSIVE, () -> outer);
        event.registerLayerDefinition(EmissiveModelLayers.ENTITY_INNER_ARMOR_EMISSIVE, () -> inner);
        event.registerLayerDefinition(EmissiveModelLayers.ENTITY_OUTER_ARMOR_EMISSIVE, () -> outer);
    }

    // Emissive Layers
    @SubscribeEvent
    public static void addLayers(EntityRenderersEvent.AddLayers event) {
        EntityModelSet entityModelSet = event.getEntityModels();

        // Emissive Armor (Player)
        String[] types = {"default", "slim"};
        for (String type : types) {
            PlayerRenderer renderer = event.getSkin(type);
            if (renderer == null) return;
            ModelLayerLocation inner = type.equals("slim") ? EmissiveModelLayers.PLAYER_SLIM_INNER_ARMOR_EMISSIVE : EmissiveModelLayers.PLAYER_INNER_ARMOR_EMISSIVE;
            ModelLayerLocation outer = type.equals("slim") ? EmissiveModelLayers.PLAYER_SLIM_OUTER_ARMOR_EMISSIVE : EmissiveModelLayers.PLAYER_OUTER_ARMOR_EMISSIVE;
            renderer.addLayer(new EmissiveHumanoidArmorLayer<>(renderer, new HumanoidArmorModel<>(entityModelSet.bakeLayer(inner)), new HumanoidArmorModel<>(entityModelSet.bakeLayer(outer)), Minecraft.getInstance().getModelManager()));
        }

        // Emissive Armor (Mob)
        List<EntityType<? extends LivingEntity>> entities = List.of(EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, EntityType.HUSK, EntityType.SKELETON, EntityType.STRAY, EntityType.PIGLIN, EntityType.ZOMBIFIED_PIGLIN, EntityType.ARMOR_STAND);
        for (EntityType<? extends LivingEntity> entity : entities) {
            LivingEntityRenderer<LivingEntity, HumanoidArmorModel<LivingEntity>> renderer = event.getRenderer(entity);
            if (renderer == null) return;
            ModelLayerLocation inner = EmissiveModelLayers.ENTITY_INNER_ARMOR_EMISSIVE;
            ModelLayerLocation outer = EmissiveModelLayers.ENTITY_OUTER_ARMOR_EMISSIVE;
            renderer.addLayer(new EmissiveHumanoidArmorLayer<>(renderer, new HumanoidArmorModel<>(entityModelSet.bakeLayer(inner)), new HumanoidArmorModel<>(entityModelSet.bakeLayer(outer)), Minecraft.getInstance().getModelManager()));
        }

        // Emissive Horse Armor
        HorseRenderer renderer = event.getRenderer(EntityType.HORSE);
        if (renderer == null) return;
        renderer.addLayer(new EmissiveHorseArmorLayer(renderer, entityModelSet));

    }

}

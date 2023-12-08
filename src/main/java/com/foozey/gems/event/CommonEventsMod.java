package com.foozey.gems.event;

import com.foozey.gems.Gems;
import com.foozey.gems.data.*;
import com.foozey.gems.registry.ModAttributes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Gems.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class CommonEventsMod {

    // TODO: Add Curios datagen when natively available
    // Datagen
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Client
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModSpriteSourceProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModLanguageProvider(output));

        // Server
        ModBlockTagsProvider modBlockTagsProvider = generator.addProvider(event.includeServer(), new ModBlockTagsProvider(output, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(output, lookupProvider, modBlockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(output));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(output));
        generator.addProvider(event.includeServer(), new ModLootModifierProvider(output));
        generator.addProvider(event.includeServer(), new ModRegistrySetProvider(output, lookupProvider));
        generator.addProvider(event.includeServer(), new ModAdvancementProvider(output, lookupProvider, existingFileHelper));

    }

    // Attributes
    @SubscribeEvent
    public static void modifyAttributes(EntityAttributeModificationEvent event) {
        for (EntityType<? extends LivingEntity> type : event.getTypes()) {
            event.add(type, ModAttributes.ARROW_DAMAGE.get());
            event.add(type, ModAttributes.BLOCK_STRENGTH.get());
            event.add(type, ModAttributes.BONUS_XP.get());
            event.add(type, ModAttributes.LIFESTEAL.get());
            event.add(type, ModAttributes.HARVEST_AREA.get());
        }
    }

}

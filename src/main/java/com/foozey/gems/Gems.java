package com.foozey.gems;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModBlocks;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.util.ModItemModelsOverrides;
import com.foozey.gems.world.feature.ModConfiguredFeatures;
import com.foozey.gems.world.feature.ModPlacedFeatures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;

@Mod("gems")
public class Gems {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "gems";

    public Gems() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Listeners
        bus.addListener(this::doClientStuff);
        bus.addListener(this::enqueueIMC);

        // Registries
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModItems.REPLACE.register(bus);
        ModAttributes.ATTRIBUTES.register(bus);
        ModConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
        ModPlacedFeatures.PLACED_FEATURES.register(bus);

        // Events
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Item models overrides
    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(Gems::addAllItemModelsOverrides);
    }

    private static void addAllItemModelsOverrides() {
        ModItemModelsOverrides.BowItemModelsOverrides();
        ModItemModelsOverrides.CrossbowItemModelsOverrides();
        ModItemModelsOverrides.ShieldItemModelsOverrides();
    }

    // Curios slots (size = slot amount, priority = slot position)
    private void enqueueIMC(final InterModEnqueueEvent event) {

        // Necklace slot
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () ->
                new SlotTypeMessage.Builder("necklace").size(1).priority(1).build());

        // Ring slot
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () ->
                new SlotTypeMessage.Builder("ring").size(1).priority(2).build());
    }

}

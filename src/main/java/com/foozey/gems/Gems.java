package com.foozey.gems;

import com.foozey.gems.init.ModBlocks;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.util.ModItemModelsOverrides;
import com.foozey.gems.world.gen.OreGenHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
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
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        bus.addListener(this::enqueueIMC);
        bus.addListener(this::processIMC);

        // Registries
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModItems.REPLACE.register(bus);

        // Generate Ore
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGenHandler::generateOre);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) {
        DeferredWorkQueue.runLater(Gems::addAllItemModelsOverrides);
    }

    // Curios Slots
    private void enqueueIMC(final InterModEnqueueEvent event) {

        // Necklace Slot
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () ->
                new SlotTypeMessage.Builder("necklace").size(1).priority(1).build());

        // Ring Slot
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () ->
                new SlotTypeMessage.Builder("ring").size(2).priority(2).build());
    }

    private void processIMC(final InterModProcessEvent event) { }

    // Item Models Overrides
    @OnlyIn(Dist.CLIENT)
    private static void addAllItemModelsOverrides() {
        ModItemModelsOverrides.BowItemModelsOverrides();
        ModItemModelsOverrides.CrossbowItemModelsOverrides();
        ModItemModelsOverrides.ShieldItemModelsOverrides();
    }

}

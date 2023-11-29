package com.foozey.gems.registry;

import com.foozey.gems.Gems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gems.MOD_ID);
    public static final List<Supplier<? extends ItemLike>> GEMS_ITEMS = new ArrayList<>();

    // All Items
    public static final RegistryObject<CreativeModeTab> GEMS = TABS.register("gems", () -> CreativeModeTab.builder()
            .title(Component.translatable("creative_tab.gems.gems"))
            .icon(ModItems.TOPAZ.get()::getDefaultInstance)
            .displayItems((parameters, output) -> GEMS_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
            .build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        GEMS_ITEMS.add(itemLike);
        return itemLike;
    }

}

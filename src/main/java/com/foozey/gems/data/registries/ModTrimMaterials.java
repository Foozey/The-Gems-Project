package com.foozey.gems.data.registries;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> TOPAZ = registerKey("topaz");
    public static final ResourceKey<TrimMaterial> SAPPHIRE = registerKey("sapphire");
    public static final ResourceKey<TrimMaterial> RUBY = registerKey("ruby");
    public static final ResourceKey<TrimMaterial> ONYX = registerKey("onyx");

    public static void bootstrap(BootstapContext<TrimMaterial> context) {
        register(context, TOPAZ, ModItems.TOPAZ.get(), Style.EMPTY.withColor(14916665), 0.01F);
        register(context, SAPPHIRE, ModItems.SAPPHIRE.get(), Style.EMPTY.withColor(3757539), 0.02F);
        register(context, RUBY, ModItems.RUBY.get(), Style.EMPTY.withColor(14891349), 0.03F);
        register(context, ONYX, ModItems.ONYX.get(), Style.EMPTY.withColor(7692416), 0.04F);
    }

    private static ResourceKey<TrimMaterial> registerKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, Gems.rl(name));
    }

    private static void register(BootstapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex) {
        register(context, materialKey, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(BootstapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex, Map<ArmorMaterials, String> pOverrideArmorMaterials) {
        TrimMaterial trimMaterial = TrimMaterial.create(materialKey.location().getPath(), ingredient, itemModelIndex, Component.translatable(Util.makeDescriptionId("trim_material", materialKey.location())).withStyle(style), pOverrideArmorMaterials);
        context.register(materialKey, trimMaterial);
    }

}

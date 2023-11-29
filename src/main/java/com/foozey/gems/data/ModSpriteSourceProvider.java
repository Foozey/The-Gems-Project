package com.foozey.gems.data;

import com.foozey.gems.Gems;
import net.minecraft.client.renderer.texture.atlas.sources.PalettedPermutations;
import net.minecraft.client.renderer.texture.atlas.sources.SingleFile;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SpriteSourceProvider;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ModSpriteSourceProvider extends SpriteSourceProvider {

    private final SourceList shieldPatternsAtlas = atlas(SHIELD_PATTERNS_ATLAS);
    private final SourceList blocksAtlas = atlas(BLOCKS_ATLAS);
    private final SourceList armorTrimsAtlas = atlas(new ResourceLocation("armor_trims"));

    public ModSpriteSourceProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, existingFileHelper, Gems.MOD_ID);
    }

    @Override
    protected void addSources() {

        // Shield Patterns
        shieldSource("iron", "golden", "diamond", "netherite", "topaz", "sapphire", "ruby", "dragonyx", "emerald");

        // Trim Items
        trimItemSource("topaz", "sapphire", "ruby", "onyx");

        // Trim Models
        trimModelSource("topaz", "sapphire", "ruby", "onyx");

    }

    private void shieldSource(String... names) {
        for (String name : names) {
            ResourceLocation shieldLocation = Gems.rl("entity/" + name + "_shield");
            Optional<ResourceLocation> overlayLocation = name.equals("dragonyx") ? Optional.of(Gems.rl("entity/dragonyx_shield_overlay")) : Optional.empty();
            shieldPatternsAtlas.addSource(new SingleFile(shieldLocation, Optional.empty()));
            overlayLocation.ifPresent(resourceLocation -> shieldPatternsAtlas.addSource(new SingleFile(resourceLocation, Optional.empty())));
        }
    }

    private void trimItemSource(String... materials) {
        List<ResourceLocation> types = List.of(
                new ResourceLocation("trims/items/leggings_trim"),
                new ResourceLocation("trims/items/chestplate_trim"),
                new ResourceLocation("trims/items/helmet_trim"),
                new ResourceLocation("trims/items/boots_trim"));
        ResourceLocation palette = new ResourceLocation("trims/color_palettes/trim_palette");
        Map<String, ResourceLocation> map = new LinkedHashMap<>();
        for (String material : materials) {
            map.put(material, Gems.rl("trims/color_palettes/" + material));
        }
        blocksAtlas.addSource(new PalettedPermutations(types, palette, map));
    }

    private void trimModelSource(String... materials) {
        List<ResourceLocation> types = List.of(
                new ResourceLocation("trims/models/armor/coast"),
                new ResourceLocation("trims/models/armor/coast_leggings"),
                new ResourceLocation("trims/models/armor/sentry"),
                new ResourceLocation("trims/models/armor/sentry_leggings"),
                new ResourceLocation("trims/models/armor/dune"),
                new ResourceLocation("trims/models/armor/dune_leggings"),
                new ResourceLocation("trims/models/armor/wild"),
                new ResourceLocation("trims/models/armor/wild_leggings"),
                new ResourceLocation("trims/models/armor/ward"),
                new ResourceLocation("trims/models/armor/ward_leggings"),
                new ResourceLocation("trims/models/armor/eye"),
                new ResourceLocation("trims/models/armor/eye_leggings"),
                new ResourceLocation("trims/models/armor/vex"),
                new ResourceLocation("trims/models/armor/vex_leggings"),
                new ResourceLocation("trims/models/armor/tide"),
                new ResourceLocation("trims/models/armor/tide_leggings"),
                new ResourceLocation("trims/models/armor/snout"),
                new ResourceLocation("trims/models/armor/snout_leggings"),
                new ResourceLocation("trims/models/armor/rib"),
                new ResourceLocation("trims/models/armor/rib_leggings"),
                new ResourceLocation("trims/models/armor/spire"),
                new ResourceLocation("trims/models/armor/spire_leggings"),
                new ResourceLocation("trims/models/armor/wayfinder"),
                new ResourceLocation("trims/models/armor/wayfinder_leggings"),
                new ResourceLocation("trims/models/armor/shaper"),
                new ResourceLocation("trims/models/armor/shaper_leggings"),
                new ResourceLocation("trims/models/armor/silence"),
                new ResourceLocation("trims/models/armor/silence_leggings"),
                new ResourceLocation("trims/models/armor/raiser"),
                new ResourceLocation("trims/models/armor/raiser_leggings"),
                new ResourceLocation("trims/models/armor/host"),
                new ResourceLocation("trims/models/armor/host_leggings"));
        ResourceLocation palette = new ResourceLocation("trims/color_palettes/trim_palette");
        Map<String, ResourceLocation> map = new LinkedHashMap<>();
        for (String material : materials) {
            map.put(material, Gems.rl("trims/color_palettes/" + material));
        }
        armorTrimsAtlas.addSource(new PalettedPermutations(types, palette, map));
    }

}

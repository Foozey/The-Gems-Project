package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.data.registries.ModTrimMaterials;
import com.foozey.gems.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.loaders.ItemLayerModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItemModelProvider extends ItemModelProvider {

    private static final Map<ResourceKey<TrimMaterial>, Float> TRIM_MATERIALS = new LinkedHashMap<>();
    static {
        TRIM_MATERIALS.put(ModTrimMaterials.TOPAZ, 0.01F);
        TRIM_MATERIALS.put(ModTrimMaterials.SAPPHIRE, 0.02F);
        TRIM_MATERIALS.put(ModTrimMaterials.RUBY, 0.03F);
        TRIM_MATERIALS.put(ModTrimMaterials.ONYX, 0.04F);
        TRIM_MATERIALS.put(TrimMaterials.QUARTZ, 0.1F);
        TRIM_MATERIALS.put(TrimMaterials.IRON, 0.2F);
        TRIM_MATERIALS.put(TrimMaterials.NETHERITE, 0.3F);
        TRIM_MATERIALS.put(TrimMaterials.REDSTONE, 0.4F);
        TRIM_MATERIALS.put(TrimMaterials.COPPER, 0.5F);
        TRIM_MATERIALS.put(TrimMaterials.GOLD, 0.6F);
        TRIM_MATERIALS.put(TrimMaterials.EMERALD, 0.7F);
        TRIM_MATERIALS.put(TrimMaterials.DIAMOND, 0.8F);
        TRIM_MATERIALS.put(TrimMaterials.LAPIS, 0.9F);
        TRIM_MATERIALS.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Gems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Items
        simpleItem(ModItems.TOPAZ.get());
        simpleItem(ModItems.TOPAZ_SHARDS.get());
        simpleItem(ModItems.SAPPHIRE.get());
        simpleItem(ModItems.SAPPHIRE_SHARDS.get());
        simpleItem(ModItems.RUBY.get());
        simpleItem(ModItems.RUBY_SHARDS.get());
        simpleItem(ModItems.ONYX.get());
        simpleItem(ModItems.ONYX_SHARDS.get());
        simpleItem(ModItems.ENDER_BONES.get());
        simpleItem(ModItems.ENDER_SCALES.get());
        simpleItem(ModItems.CHAINMAIL.get());
        simpleItem(ModItems.CHAINMAIL_HORSE_ARMOR.get());
        simpleItem(ModItems.NETHERITE_HORSE_ARMOR.get());
        simpleItem(ModItems.TOPAZ_HORSE_ARMOR.get());
        simpleItem(ModItems.SAPPHIRE_HORSE_ARMOR.get());
        simpleItem(ModItems.RUBY_HORSE_ARMOR.get());
        simpleItem(ModItems.EMERALD_HORSE_ARMOR.get());
        simpleItem(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get());
        simpleItem(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get());
        simpleItem(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get());
        simpleItem(ModItems.GOLDEN_NECKLACE.get());
        simpleItem(ModItems.TOPAZ_NECKLACE.get());
        simpleItem(ModItems.SAPPHIRE_NECKLACE.get());
        simpleItem(ModItems.RUBY_NECKLACE.get());
        simpleItem(ModItems.GEM_NECKLACE.get());
        simpleItem(ModItems.GOLDEN_RING.get());
        simpleItem(ModItems.TOPAZ_RING.get());
        simpleItem(ModItems.SAPPHIRE_RING.get());
        simpleItem(ModItems.RUBY_RING.get());
        simpleItem(ModItems.GEM_RING.get());

        // Items (Emissive)
        simpleItemEmissive(ModItems.ENDER_MATTER.get());
        simpleItemEmissive(ModItems.DRAGONYX_INGOT.get());
        simpleItemEmissive(ModItems.DRAGONYX_HORSE_ARMOR.get());
        simpleItemEmissive(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get());

        // Tools
        handheldItem(ModItems.TOPAZ_SWORD.get());
        handheldItem(ModItems.TOPAZ_PICKAXE.get());
        handheldItem(ModItems.TOPAZ_AXE.get());
        handheldItem(ModItems.TOPAZ_SHOVEL.get());
        handheldItem(ModItems.TOPAZ_HOE.get());
        handheldItem(ModItems.SAPPHIRE_SWORD.get());
        handheldItem(ModItems.SAPPHIRE_PICKAXE.get());
        handheldItem(ModItems.SAPPHIRE_AXE.get());
        handheldItem(ModItems.SAPPHIRE_SHOVEL.get());
        handheldItem(ModItems.SAPPHIRE_HOE.get());
        handheldItem(ModItems.RUBY_SWORD.get());
        handheldItem(ModItems.RUBY_PICKAXE.get());
        handheldItem(ModItems.RUBY_AXE.get());
        handheldItem(ModItems.RUBY_SHOVEL.get());
        handheldItem(ModItems.RUBY_HOE.get());
        handheldItem(ModItems.EMERALD_SWORD.get());
        handheldItem(ModItems.EMERALD_PICKAXE.get());
        handheldItem(ModItems.EMERALD_AXE.get());
        handheldItem(ModItems.EMERALD_SHOVEL.get());
        handheldItem(ModItems.EMERALD_HOE.get());

        // Tools (Emissive)
        handheldItemEmissive(ModItems.DRAGONYX_SWORD.get());
        handheldItemEmissive(ModItems.DRAGONYX_PICKAXE.get());
        handheldItemEmissive(ModItems.DRAGONYX_AXE.get());
        handheldItemEmissive(ModItems.DRAGONYX_SHOVEL.get());
        handheldItemEmissive(ModItems.DRAGONYX_HOE.get());

        // Armor
        trimmedArmorItem(ModItems.TOPAZ_HELMET.get());
        trimmedArmorItem(ModItems.TOPAZ_CHESTPLATE.get());
        trimmedArmorItem(ModItems.TOPAZ_LEGGINGS.get());
        trimmedArmorItem(ModItems.TOPAZ_BOOTS.get());
        trimmedArmorItem(ModItems.SAPPHIRE_HELMET.get());
        trimmedArmorItem(ModItems.SAPPHIRE_CHESTPLATE.get());
        trimmedArmorItem(ModItems.SAPPHIRE_LEGGINGS.get());
        trimmedArmorItem(ModItems.SAPPHIRE_BOOTS.get());
        trimmedArmorItem(ModItems.RUBY_HELMET.get());
        trimmedArmorItem(ModItems.RUBY_CHESTPLATE.get());
        trimmedArmorItem(ModItems.RUBY_LEGGINGS.get());
        trimmedArmorItem(ModItems.RUBY_BOOTS.get());
        trimmedArmorItem(ModItems.EMERALD_HELMET.get());
        trimmedArmorItem(ModItems.EMERALD_CHESTPLATE.get());
        trimmedArmorItem(ModItems.EMERALD_LEGGINGS.get());
        trimmedArmorItem(ModItems.EMERALD_BOOTS.get());

        // Armor (Emissive)
        trimmedArmorItemEmissive(ModItems.DRAGONYX_HELMET.get());
        trimmedArmorItemEmissive(ModItems.DRAGONYX_CHESTPLATE.get());
        trimmedArmorItemEmissive(ModItems.DRAGONYX_LEGGINGS.get());
        trimmedArmorItemEmissive(ModItems.DRAGONYX_BOOTS.get());

        // Bows
        bowItem(ModItems.IRON_BOW.get());
        bowItem(ModItems.GOLDEN_BOW.get());
        bowItem(ModItems.DIAMOND_BOW.get());
        bowItem(ModItems.NETHERITE_BOW.get());
        bowItem(ModItems.TOPAZ_BOW.get());
        bowItem(ModItems.SAPPHIRE_BOW.get());
        bowItem(ModItems.RUBY_BOW.get());
        bowItem(ModItems.EMERALD_BOW.get());

        // Bows (Emissive)
        bowItemEmissive(ModItems.DRAGONYX_BOW.get());

        // Crossbows
        crossbowItem(ModItems.IRON_CROSSBOW.get());
        crossbowItem(ModItems.GOLDEN_CROSSBOW.get());
        crossbowItem(ModItems.DIAMOND_CROSSBOW.get());
        crossbowItem(ModItems.NETHERITE_CROSSBOW.get());
        crossbowItem(ModItems.TOPAZ_CROSSBOW.get());
        crossbowItem(ModItems.SAPPHIRE_CROSSBOW.get());
        crossbowItem(ModItems.RUBY_CROSSBOW.get());
        crossbowItem(ModItems.EMERALD_CROSSBOW.get());

        // Crossbows (Emissive)
        crossbowItemEmissive(ModItems.DRAGONYX_CROSSBOW.get());

        // Shields
        shieldItem(ModItems.IRON_SHIELD.get(), mcLoc("block/iron_block"));
        shieldItem(ModItems.GOLDEN_SHIELD.get(), mcLoc("block/gold_block"));
        shieldItem(ModItems.DIAMOND_SHIELD.get(), mcLoc("block/diamond_block"));
        shieldItem(ModItems.NETHERITE_SHIELD.get(), mcLoc("block/netherite_block"));
        shieldItem(ModItems.TOPAZ_SHIELD.get(), modLoc("block/topaz_block"));
        shieldItem(ModItems.SAPPHIRE_SHIELD.get(), modLoc("block/sapphire_block"));
        shieldItem(ModItems.RUBY_SHIELD.get(), modLoc("block/ruby_block"));
        shieldItem(ModItems.EMERALD_SHIELD.get(), mcLoc("block/emerald_block"));

        // Shields (Emissive)
        shieldItemEmissive(ModItems.DRAGONYX_SHIELD.get(), modLoc("block/onyx_block"));

    }

    private void emissiveItem(Item item, String connector, String parent, String path) {
        withExistingParent(Gems.getPath(item) + connector, mcLoc(parent))
                .texture("layer0", modLoc(path))
                .texture("layer1", modLoc(path + "_overlay"))
                .customLoader(ItemLayerModelBuilder::begin)
                .emissive(15, 15, 1)
                .end();
    }

    private void simpleItem(Item item) {
        withExistingParent(Gems.getPath(item), mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item)));
    }

    private void simpleItemEmissive(Item item) {
        emissiveItem(item, "","item/generated", "item/" + Gems.getPath(item));
    }

    private void handheldItem(Item item) {
        withExistingParent(Gems.getPath(item), mcLoc("item/handheld"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item)));
    }

    private void handheldItemEmissive(Item item) {
        emissiveItem(item, "", "item/handheld", "item/" + Gems.getPath(item));
    }

    // TODO: Investigate Trimmed API for compatible trim materials
    private void trimmedArmorItem(Item item) {
        if (item instanceof ArmorItem armorItem) {
            TRIM_MATERIALS.forEach((trimMaterial, value) -> {
                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };
                existingFileHelper.trackGenerated(mcLoc("trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath()), PackType.CLIENT_RESOURCES, ".png", "textures");
                getBuilder("item/" + armorItem + "_" + trimMaterial.location().getPath() + "_trim")
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", modLoc("item/" + armorItem))
                        .texture("layer1", mcLoc("trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath()));
                withExistingParent(item.toString(), mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(modLoc("item/" + armorItem + "_" + trimMaterial.location().getPath() + "_trim")))
                        .predicate(mcLoc("trim_type"), value)
                        .end()
                        .texture("layer0", modLoc("item/" + item));
            });
        }
    }

    private void trimmedArmorItemEmissive(Item item) {
        trimmedArmorItem(item);
        withExistingParent(item.toString(), mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + item))
                .texture("layer1", modLoc("item/" + item + "_overlay"))
                .customLoader(ItemLayerModelBuilder::begin)
                .emissive(15, 15, 1)
                .end();
    }

    private void bowItem(Item item) {
        withExistingParent(Gems.getPath(item) + "_pulling_0", mcLoc("item/bow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_0"));
        withExistingParent(Gems.getPath(item) + "_pulling_1", mcLoc("item/bow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_1"));
        withExistingParent(Gems.getPath(item) + "_pulling_2", mcLoc("item/bow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_2"));
        withExistingParent(Gems.getPath(item), mcLoc("item/bow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item)))
                .override()
                .predicate(mcLoc("pulling"), 1)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_0")))
                .end()
                .override()
                .predicate(mcLoc("pulling"), 1)
                .predicate(mcLoc("pull"), 0.65F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_1")))
                .end()
                .override()
                .predicate(mcLoc("pulling"), 1)
                .predicate(mcLoc("pull"), 0.9F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_2")))
                .end();
    }

    private void bowItemEmissive(Item item) {
        bowItem(item);
        emissiveItem(item, "","item/bow", "item/" + Gems.getPath(item));
        emissiveItem(item, "_pulling_0","item/bow", "item/" + Gems.getPath(item) + "_pulling_0");
        emissiveItem(item, "_pulling_1","item/bow", "item/" + Gems.getPath(item) + "_pulling_1");
        emissiveItem(item, "_pulling_2","item/bow", "item/" + Gems.getPath(item) + "_pulling_2");
    }

    private void crossbowItem(Item item) {
        withExistingParent(Gems.getPath(item) + "_pulling_0", mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_0"));
        withExistingParent(Gems.getPath(item) + "_pulling_1", mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_1"));
        withExistingParent(Gems.getPath(item) + "_pulling_2", mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_pulling_2"));
        withExistingParent(Gems.getPath(item) + "_arrow", mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_arrow"));
        withExistingParent(Gems.getPath(item) + "_firework", mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_firework"));
        withExistingParent(Gems.getPath(item), mcLoc("item/crossbow"))
                .texture("layer0", modLoc("item/" + Gems.getPath(item) + "_standby"))
                .override()
                .predicate(mcLoc("pulling"), 1.0F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_0")))
                .end()
                .override()
                .predicate(mcLoc("pulling"), 1.0F)
                .predicate(mcLoc("pull"), 0.58F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_1")))
                .end()
                .override()
                .predicate(mcLoc("pulling"), 1.0F)
                .predicate(mcLoc("pull"), 1.0F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_pulling_2")))
                .end()
                .override()
                .predicate(mcLoc("charged"), 1.0F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_arrow")))
                .end()
                .override()
                .predicate(mcLoc("charged"), 1.0F)
                .predicate(mcLoc("firework"), 1.0F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_firework")))
                .end();
    }

    private void crossbowItemEmissive(Item item) {
        crossbowItem(item);
        emissiveItem(item, "","item/crossbow", "item/" + Gems.getPath(item) + "_standby");
        emissiveItem(item, "_pulling_0","item/crossbow", "item/" + Gems.getPath(item) + "_pulling_0");
        emissiveItem(item, "_pulling_1","item/crossbow", "item/" + Gems.getPath(item) + "_pulling_1");
        emissiveItem(item, "_pulling_2","item/crossbow", "item/" + Gems.getPath(item) + "_pulling_2");
        emissiveItem(item, "_arrow","item/crossbow", "item/" + Gems.getPath(item) + "_arrow");
        emissiveItem(item, "_firework","item/crossbow", "item/" + Gems.getPath(item) + "_firework");
    }

    private void shieldItem(Item item, ResourceLocation particle) {
        withExistingParent(Gems.getPath(item) + "_blocking", mcLoc("item/shield_blocking"))
                .texture("particle", particle);
        withExistingParent(Gems.getPath(item), mcLoc("item/shield"))
                .texture("particle", particle)
                .override()
                .predicate(mcLoc("blocking"), 1.0F)
                .model(getExistingFile(modLoc("item/" + Gems.getPath(item) + "_blocking")))
                .end();
    }

    private void shieldItemEmissive(Item item, ResourceLocation particle) {
        shieldItem(item, particle);
    }

}

package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.loot.AddItemLootModifier;
import com.foozey.gems.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModLootModifierProvider extends GlobalLootModifierProvider {

    public ModLootModifierProvider(PackOutput output) {
        super(output, Gems.MOD_ID);
    }

    @Override
    protected void start() {

        // Chests
        itemToChest(ModItems.TOPAZ_SHARDS.get(), "abandoned_mineshaft", 1, 3, 0.1F);
        itemToChest(ModItems.SAPPHIRE_SHARDS.get(), "abandoned_mineshaft", 1, 3, 0.1F);
        itemToChest(ModItems.RUBY_SHARDS.get(), "abandoned_mineshaft", 1, 3, 0.1F);
        itemToChest(ModItems.EMERALD_PICKAXE.get(), "abandoned_mineshaft", 1, 1, 0.1F);
        itemToChest(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), "ancient_city", 1, 1, 0.1F);
        itemToChest(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE.get(), "ancient_city", 1, 1, 0.1F);
        itemToChest(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE.get(), "ancient_city", 1, 1, 0.1F);
        itemToChest(ModItems.NETHERITE_CROSSBOW.get(), "bastion_bridge", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_SHIELD.get(), "bastion_bridge", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_HORSE_ARMOR.get(), "bastion_bridge", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_CROSSBOW.get(), "bastion_hoglin_stable", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_SHIELD.get(), "bastion_hoglin_stable", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_HORSE_ARMOR.get(), "bastion_hoglin_stable", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_CROSSBOW.get(), "bastion_other", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_SHIELD.get(), "bastion_other", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_HORSE_ARMOR.get(), "bastion_other", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_CROSSBOW.get(), "bastion_treasure", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_SHIELD.get(), "bastion_treasure", 1, 1, 0.05F);
        itemToChest(ModItems.NETHERITE_HORSE_ARMOR.get(), "bastion_treasure", 1, 1, 0.05F);
        itemToChest(ModItems.ONYX_SHARDS.get(), "end_city_treasure", 1, 3, 0.25F);
        itemToChest(ModItems.DRAGONYX_UPGRADE_SMITHING_TEMPLATE.get(), "end_city_treasure", 1, 1, 0.1F);
        itemToChest(ModItems.DIAMOND_CROSSBOW.get(), "pillager_outpost", 1, 1, 0.1F);
        itemToChest(ModItems.GOLDEN_NECKLACE.get(), "shipwreck_treasure", 1, 1, 0.25F);
        itemToChest(ModItems.GOLDEN_RING.get(), "shipwreck_treasure", 1, 1, 0.25F);
        itemToChest(ModItems.EMERALD_SWORD.get(), "simple_dungeon", 1, 1, 0.1F);
        itemToChest(ModItems.EMERALD_BOW.get(), "simple_dungeon", 1, 1, 0.1F);
        itemToChest(ModItems.GOLDEN_NECKLACE.get(), "simple_dungeon", 1, 1, 0.25F);
        itemToChest(ModItems.GOLDEN_RING.get(), "simple_dungeon", 1, 1, 0.25F);
        itemToChest(ModItems.DIAMOND_BOW.get(), "stronghold_corridor", 1, 1, 0.1F);
        itemToChest(ModItems.DIAMOND_SHIELD.get(), "stronghold_corridor", 1, 1, 0.1F);

        // Chests (Village)
        itemToVillageChest(ModItems.CHAINMAIL.get(), "village_armorer", 1, 5, 0.5F);
        itemToVillageChest(ModItems.EMERALD_HELMET.get(), "village_armorer", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_CHESTPLATE.get(), "village_armorer", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_LEGGINGS.get(), "village_armorer", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_BOOTS.get(), "village_armorer", 1, 1, 0.1F);
        itemToVillageChest(ModItems.CHAINMAIL.get(), "village_toolsmith", 1, 5, 0.5F);
        itemToVillageChest(ModItems.EMERALD_PICKAXE.get(), "village_toolsmith", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_AXE.get(), "village_toolsmith", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_SHOVEL.get(), "village_toolsmith", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_HOE.get(), "village_toolsmith", 1, 1, 0.1F);
        itemToVillageChest(ModItems.CHAINMAIL.get(), "village_weaponsmith", 1, 5, 0.5F);
        itemToVillageChest(ModItems.EMERALD_SWORD.get(), "village_weaponsmith", 1, 1, 0.1F);
        itemToVillageChest(ModItems.EMERALD_HORSE_ARMOR.get(), "village_weaponsmith", 1, 1, 0.1F);

        // Entities
        itemToEntity(ModItems.ENDER_BONES.get(), "ender_dragon", 16, 32, 1.0F);
        itemToEntity(ModItems.ENDER_SCALES.get(), "ender_dragon", 4, 8, 1.0F);

    }

    private void itemToChest(Item item, String location, int minItems, int maxItems, float probability) {
        add(Gems.getPath(item) + "_" + location, new AddItemLootModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/" + location)).build()
        }, item, minItems, maxItems, probability));
    }

    private void itemToVillageChest(Item item, String location, int minItems, int maxItems, float probability) {
        add(Gems.getPath(item) + "_" + location, new AddItemLootModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/" + location)).build()
        }, item, minItems, maxItems, probability));
    }

    private void itemToEntity(Item item, String location, int minItems, int maxItems, float probability) {
        add(Gems.getPath(item) + "_" + location, new AddItemLootModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/" + location)).build()
        }, item, minItems, maxItems, probability));
    }

}

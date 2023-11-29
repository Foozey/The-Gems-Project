package com.foozey.gems.data;

import com.foozey.gems.Gems;
import com.foozey.gems.registry.ModItems;
import com.foozey.gems.tag.ModItemTags;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.PlayerTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends ForgeAdvancementProvider {

    public ModAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, existingFileHelper, List.of(new ModAdvancements()));
    }

    public static class ModAdvancements implements AdvancementGenerator {

        @SuppressWarnings("unused")
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {

            Advancement root = Advancement.Builder.advancement()
                    .display(ModItems.TOPAZ.get(), Component.translatable("advancement." + Gems.MOD_ID + ".root.title"), Component.translatable("advancement." + Gems.MOD_ID + ".root.description"), new ResourceLocation("textures/block/deepslate.png"), FrameType.TASK, false, false, false)
                    .addCriterion("tick", new PlayerTrigger.TriggerInstance(CriteriaTriggers.TICK.getId(), ContextAwarePredicate.ANY))
                    .save(saver, Gems.rl("gems/root"), existingFileHelper);

            Advancement gems = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.TOPAZ_SHARDS.get(), Component.translatable("advancement." + Gems.MOD_ID + ".gems.title"), Component.translatable("advancement." + Gems.MOD_ID + ".gems.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_gems", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.SHARDS).build()))
                    .save(saver, Gems.rl("gems/gems"), existingFileHelper);

            Advancement dragonyx = Advancement.Builder.advancement()
                    .parent(gems)
                    .display(ModItems.DRAGONYX_INGOT.get(), Component.translatable("advancement." + Gems.MOD_ID + ".dragonyx.title"), Component.translatable("advancement." + Gems.MOD_ID + ".dragonyx.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_dragonyx", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DRAGONYX_INGOT.get()))
                    .save(saver, Gems.rl("gems/dragonyx"), existingFileHelper);

            Advancement fossils = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.FISH_FOSSIL.get(), Component.translatable("advancement." + Gems.MOD_ID + ".fossils.title"), Component.translatable("advancement." + Gems.MOD_ID + ".fossils.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_fossil", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.FOSSILS).build()))
                    .save(saver, Gems.rl("gems/fossil"), existingFileHelper);

            Advancement dragonyxArmor = Advancement.Builder.advancement()
                    .parent(dragonyx)
                    .display(ModItems.DRAGONYX_CHESTPLATE.get(), Component.translatable("advancement." + Gems.MOD_ID + ".dragonyx_armor.title"), Component.translatable("advancement." + Gems.MOD_ID + ".dragonyx_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(100))
                    .addCriterion("get_dragonyx_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DRAGONYX_HELMET.get(), ModItems.DRAGONYX_CHESTPLATE.get(), ModItems.DRAGONYX_LEGGINGS.get(), ModItems.DRAGONYX_BOOTS.get()))
                    .save(saver, Gems.rl("gems/dragonyx_armor"), existingFileHelper);

            Advancement emeraldArmor = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.EMERALD_CHESTPLATE.get(), Component.translatable("advancement." + Gems.MOD_ID + ".emerald_armor.title"), Component.translatable("advancement." + Gems.MOD_ID + ".emerald_armor.description"), null, FrameType.CHALLENGE, true, true, false)
                    .rewards(AdvancementRewards.Builder.experience(100))
                    .addCriterion("get_emerald_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get()))
                    .save(saver, Gems.rl("gems/emerald_armor"), existingFileHelper);

            Advancement bows = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.DIAMOND_BOW.get(), Component.translatable("advancement." + Gems.MOD_ID + ".bows.title"), Component.translatable("advancement." + Gems.MOD_ID + ".bows.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_bow", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.BOWS).build()))
                    .save(saver, Gems.rl("gems/bows"), existingFileHelper);

            Advancement crossbows = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.DIAMOND_CROSSBOW.get(), Component.translatable("advancement." + Gems.MOD_ID + ".crossbows.title"), Component.translatable("advancement." + Gems.MOD_ID + ".crossbows.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_crossbow", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.CROSSBOWS).build()))
                    .save(saver, Gems.rl("gems/crossbows"), existingFileHelper);

            Advancement shields = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.DIAMOND_SHIELD.get(), Component.translatable("advancement." + Gems.MOD_ID + ".shields.title"), Component.translatable("advancement." + Gems.MOD_ID + ".shields.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_shield", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.SHIELDS).build()))
                    .save(saver, Gems.rl("gems/shields"), existingFileHelper);

            Advancement horseArmor = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.NETHERITE_HORSE_ARMOR.get(), Component.translatable("advancement." + Gems.MOD_ID + ".horse_armor.title"), Component.translatable("advancement." + Gems.MOD_ID + ".horse_armor.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_horse_armor", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.HORSE_ARMOR).build()))
                    .save(saver, Gems.rl("gems/horse_armor"), existingFileHelper);

            Advancement smithingTemplates = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.TOPAZ_UPGRADE_SMITHING_TEMPLATE.get(), Component.translatable("advancement." + Gems.MOD_ID + ".smithing_templates.title"), Component.translatable("advancement." + Gems.MOD_ID + ".smithing_templates.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_smithing_template", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.SMITHING_TEMPLATES).build()))
                    .save(saver, Gems.rl("gems/smithing_templates"), existingFileHelper);

            Advancement jewelry = Advancement.Builder.advancement()
                    .parent(root)
                    .display(ModItems.TOPAZ_NECKLACE.get(), Component.translatable("advancement." + Gems.MOD_ID + ".jewelry.title"), Component.translatable("advancement." + Gems.MOD_ID + ".jewelry.description"), null, FrameType.TASK, true, true, false)
                    .addCriterion("get_jewelry", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(ModItemTags.CURIOS).build()))
                    .save(saver, Gems.rl("gems/jewelry"), existingFileHelper);

        }

    }

}

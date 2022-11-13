package com.foozey.gems.loot.village;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.function.Supplier;

public class ChainmailVillageArmorerModifier extends LootModifier {

    public static final Supplier<Codec<ChainmailVillageArmorerModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item)).apply(inst, ChainmailVillageArmorerModifier::new)));

    private final Item item;

    protected ChainmailVillageArmorerModifier(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        // Minimum amount of items that can be added to the generated loot
        int minItems = 1;
        // Maximum amount of items that can be added to the generated loot
        int maxItems = 3;
        // Random calculation
        Random random = new Random();
        int randomCount = random.nextInt((maxItems - minItems) + 1) + minItems;
        // Percentage chance the custom loot is added to the generated loot
        // 0.01 = 99% chance
        // 0.99 = 1% chance
        if(context.getRandom().nextFloat() >= 0.5f) {
            generatedLoot.add(new ItemStack(item, randomCount));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }

}

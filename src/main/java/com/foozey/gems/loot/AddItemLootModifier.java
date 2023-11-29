package com.foozey.gems.loot;

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

import java.util.function.Supplier;

public class AddItemLootModifier extends LootModifier {

    private final Item item;
    private final int minItems;
    private final int maxItems;
    private final float probability;

    public static final Supplier<Codec<AddItemLootModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> codecStart(inst).and(inst.group(
                    ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item),
                    Codec.INT.fieldOf("minItems").forGetter(m -> m.minItems),
                    Codec.INT.fieldOf("maxItems").forGetter(m -> m.maxItems),
                    Codec.FLOAT.fieldOf("probability").forGetter(m -> m.probability)
            )).apply(inst, AddItemLootModifier::new)));

    public AddItemLootModifier(LootItemCondition[] conditionsIn, Item item, int minItems, int maxItems, float probability) {
        super(conditionsIn);
        this.item = item;
        this.minItems = minItems;
        this.maxItems = maxItems;
        this.probability = probability;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        int randomCount = context.getRandom().nextInt((maxItems - minItems) + 1) + minItems;
        if (context.getRandom().nextFloat() <= probability) {
            generatedLoot.add(new ItemStack(item, randomCount));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }

}

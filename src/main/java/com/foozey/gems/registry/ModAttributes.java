package com.foozey.gems.registry;

import com.foozey.gems.Gems;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, Gems.MOD_ID);

    // Attributes
    public static final RegistryObject<Attribute> ARROW_DAMAGE = ATTRIBUTES.register("arrow_damage", () -> new RangedAttribute("attribute." + Gems.MOD_ID + ".arrow_damage", 1.0D, 1.0D, 10.0D).setSyncable(true));
    public static final RegistryObject<Attribute> BLOCK_STRENGTH = ATTRIBUTES.register("block_strength", () -> new RangedAttribute("attribute." + Gems.MOD_ID + ".block_strength", 1.0D, 1.0D, 10.0D).setSyncable(true));
    public static final RegistryObject<Attribute> LIFESTEAL = ATTRIBUTES.register("lifesteal", () -> new RangedAttribute("attribute." + Gems.MOD_ID + ".lifesteal", 0.0D, 0.0D, 10.0D).setSyncable(true));
    public static final RegistryObject<Attribute> HARVEST_AREA = ATTRIBUTES.register("harvest_area", () -> new RangedAttribute("attribute." + Gems.MOD_ID + ".harvest_area", 1.0D, 1.0D, 10.0D).setSyncable(true));
    public static final RegistryObject<Attribute> BONUS_XP = ATTRIBUTES.register("bonus_xp", () -> new RangedAttribute("attribute." + Gems.MOD_ID + ".bonus_xp", 1.0D, 1.0D, 10.0D).setSyncable(true));

}

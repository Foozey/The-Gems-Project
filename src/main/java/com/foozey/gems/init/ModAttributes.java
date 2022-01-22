package com.foozey.gems.init;

import com.foozey.gems.Gems;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(Attribute.class, Gems.MOD_ID);

    // Bonus XP
    public static final RegistryObject<Attribute> BONUS_XP = ATTRIBUTES.register("bonus_xp", () ->
            new RangedAttribute("attribute.name.generic.bonus_xp", 1.00, 1.00, 10.00).setSyncable(true));

    // Lifesteal
    public static final RegistryObject<Attribute> LIFESTEAL = ATTRIBUTES.register("lifesteal", () ->
            new RangedAttribute("attribute.name.generic.lifesteal", 0.00, 0.00, 10.00).setSyncable(true));

    // Harvest Area
    public static final RegistryObject<Attribute> HARVEST_AREA = ATTRIBUTES.register("harvest_area", () ->
            new RangedAttribute("attribute.name.generic.harvest_area", 1.00, 1.00, 10.00).setSyncable(true));

}

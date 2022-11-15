package com.foozey.gems.loot;

import com.foozey.gems.Gems;
import com.foozey.gems.loot.ancient_city.RubyAncientCityModifier;
import com.foozey.gems.loot.ancient_city.SapphireAncientCityModifier;
import com.foozey.gems.loot.ancient_city.TopazAncientCityModifier;
import com.foozey.gems.loot.mineshaft.RubyShardsMineshaftModifier;
import com.foozey.gems.loot.mineshaft.SapphireShardsMineshaftModifier;
import com.foozey.gems.loot.mineshaft.TopazShardsMineshaftModifier;
import com.foozey.gems.loot.village.ChainmailVillageArmorerModifier;
import com.foozey.gems.loot.village.ChainmailVillageToolsmithModifier;
import com.foozey.gems.loot.village.ChainmailVillageWeaponsmithModifier;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {

    // Registers
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Gems.MOD_ID);



    // Loot modifiers
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Mineshaft
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> TOPAZ_SHARDS_MINESHAFT = LOOT_MODIFIER_SERIALIZERS.register("topaz_shards_mineshaft", TopazShardsMineshaftModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SAPPHIRE_SHARDS_MINESHAFT = LOOT_MODIFIER_SERIALIZERS.register("sapphire_shards_mineshaft", SapphireShardsMineshaftModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> RUBY_SHARDS_MINESHAFT = LOOT_MODIFIER_SERIALIZERS.register("ruby_shards_mineshaft", RubyShardsMineshaftModifier.CODEC);

    // Ancient City
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> TOPAZ_ANCIENT_CITY = LOOT_MODIFIER_SERIALIZERS.register("topaz_ancient_city", TopazAncientCityModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> SAPPHIRE_ANCIENT_CITY = LOOT_MODIFIER_SERIALIZERS.register("sapphire_ancient_city", SapphireAncientCityModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> RUBY_ANCIENT_CITY = LOOT_MODIFIER_SERIALIZERS.register("ruby_ancient_city", RubyAncientCityModifier.CODEC);

    // Village
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CHAINMAIL_VILLAGE_ARMORER = LOOT_MODIFIER_SERIALIZERS.register("chainmail_village_armorer", ChainmailVillageArmorerModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CHAINMAIL_VILLAGE_TOOLSMITH = LOOT_MODIFIER_SERIALIZERS.register("chainmail_village_toolsmith", ChainmailVillageToolsmithModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> CHAINMAIL_VILLAGE_WEAPONSMITH = LOOT_MODIFIER_SERIALIZERS.register("chainmail_village_weaponsmith", ChainmailVillageWeaponsmithModifier.CODEC);



    // Event bus
    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }

}

package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class SapphireHorseArmor extends HorseArmorItem {

    public SapphireHorseArmor(Properties properties) {
        super(15, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_sapphire.png"), (properties
                .stacksTo(1)
                .fireResistant()
                .tab(ModTab.TAB_GEMS)));
    }

    @Override
    public int getProtection() {
        return 15;
    }

}

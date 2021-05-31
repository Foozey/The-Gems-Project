package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class EmeraldHorseArmor extends HorseArmorItem {

    public EmeraldHorseArmor(Properties properties) {
        super(5, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_emerald.png"),
                (properties
                        .stacksTo(1)
                        .tab(ModTab.TAB_GEMS)));
    }

    @Override
    public int getProtection() {
        return 5;
    }

}

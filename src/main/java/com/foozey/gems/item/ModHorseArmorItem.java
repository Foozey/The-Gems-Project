package com.foozey.gems.item;

import com.foozey.gems.Gems;
import net.minecraft.world.item.HorseArmorItem;

public class ModHorseArmorItem extends HorseArmorItem {

    public ModHorseArmorItem(int protection, String identifier, Properties properties) {
        super(protection, Gems.rl("textures/entity/horse/armor/horse_armor_" + identifier + ".png"), properties);
    }

}

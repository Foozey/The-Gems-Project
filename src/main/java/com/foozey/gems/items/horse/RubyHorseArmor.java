package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.ResourceLocation;

public class RubyHorseArmor extends HorseArmorItem {

    public RubyHorseArmor(Properties properties) {
        super(16, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_ruby.png"), (properties
                .stacksTo(1)
                .fireResistant()
                .tab(ModTab.TAB_GEMS)));
    }

    @Override
    public int getProtection() {
        return 16;
    }

}

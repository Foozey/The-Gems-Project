package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HorseArmorItem;

public class DragonyxHorseArmor extends HorseArmorItem {

    // Properties (stack size, fire resistance, creative tab)
    public DragonyxHorseArmor(Properties properties) {
        super(20, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_dragonyx.png"), (properties
                .stacksTo(1)
                .fireResistant()
                .tab(ModTab.TAB_GEMS)));
    }

    // Protection
    @Override
    public int getProtection() {
        return 20;
    }

}

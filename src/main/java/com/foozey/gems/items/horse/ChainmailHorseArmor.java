package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HorseArmorItem;

public class ChainmailHorseArmor extends HorseArmorItem {

    // Properties (stack size, creative tab)
    public ChainmailHorseArmor(Properties properties) {
        super(4, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_chainmail.png"), (properties
                        .stacksTo(1)
                        .tab(ModTab.TAB_GEMS)));
    }

    // Protection
    @Override
    public int getProtection() {
        return 4;
    }

}

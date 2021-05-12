package com.foozey.gems.init;

import com.foozey.gems.items.ModTab;
import net.minecraft.item.Item;

public class ModItemBase extends Item {

    public ModItemBase() {
        super(new Item.Properties().tab(ModTab.TAB_GEMS));
    }

}

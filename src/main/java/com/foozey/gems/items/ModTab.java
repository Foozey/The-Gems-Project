package com.foozey.gems.items;

import com.foozey.gems.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab extends CreativeModeTab {

    public static final ModTab TAB_GEMS = new ModTab(CreativeModeTab.TABS.length, "gems");

    public ModTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.TOPAZ.get());
    }

}

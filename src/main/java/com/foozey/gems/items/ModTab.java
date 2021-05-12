package com.foozey.gems.items;

import com.foozey.gems.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModTab extends ItemGroup {

    public static final ModTab TAB_GEMS = new ModTab(ItemGroup.TABS.length, "gems");

    public ModTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.TOPAZ.get());
    }

}

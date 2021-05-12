package com.foozey.gems.init;

import com.foozey.gems.items.ModTab;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModBlockBase extends BlockItem {

    public ModBlockBase(Block block) {
        super(block, new Item.Properties().tab(ModTab.TAB_GEMS));
    }

}

package com.foozey.gems.init;

import com.foozey.gems.items.ModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlockBase extends BlockItem {

    // Add to creative tab
    public ModBlockBase(Block block) {
        super(block, new Item.Properties().tab(ModTab.TAB_GEMS));
    }

}

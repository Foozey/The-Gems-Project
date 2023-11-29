package com.foozey.gems.item;

import com.foozey.gems.Gems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public class ModTooltips {

    public static final Component DRAGONYX_SET_BONUS = Component.translatable("tooltip." + Gems.MOD_ID + ".set_bonus").withStyle(ChatFormatting.GOLD).append(Component.translatable("tooltip." + Gems.MOD_ID + ".dragonyx_armor").withStyle(ChatFormatting.YELLOW));
    public static final Component EMERALD_SET_BONUS = Component.translatable("tooltip." + Gems.MOD_ID + ".set_bonus").withStyle(ChatFormatting.GOLD).append(Component.translatable("tooltip." + Gems.MOD_ID + ".emerald_armor").withStyle(ChatFormatting.YELLOW));

}

package com.jomlua.util;

import com.jomlua.testmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class CoreModTab extends CreativeTabs {

    public CoreModTab() {
        super("SpaceRemixCore");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(testmod.remix_core);
    }
}

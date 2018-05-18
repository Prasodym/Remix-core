package com.jomlua.util;

import com.jomlua.testmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CoreModTab extends CreativeTabs {

    public CoreModTab() {
        super("SpaceRemixCore");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(testmod.fluegel);
    }
}

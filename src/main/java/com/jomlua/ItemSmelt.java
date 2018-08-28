package com.jomlua;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSmelt {
    public  ItemSmelt(){

    }
    public void register() {
        GameRegistry.addSmelting(testmod.germanium_ore, new ItemStack(testmod.xpscherben, 6), 1.0f);

    }
}

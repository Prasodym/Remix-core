package com.jomlua.items;


import com.jomlua.testmod;
import net.minecraft.item.Item;


public class itemsBase extends Item {

    public itemsBase(String name){
        setCreativeTab(testmod.Spaceremixcore);
        setUnlocalizedName(name);
        setRegistryName(name);


    }
}

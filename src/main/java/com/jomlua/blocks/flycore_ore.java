package com.jomlua.blocks;

import com.jomlua.testmod;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class flycore_ore extends BlockBase{
    public flycore_ore(Material materialIn, String name) {
        super(materialIn, name);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return testmod.remix_core;
    }
}

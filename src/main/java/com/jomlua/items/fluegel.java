package com.jomlua.items;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class fluegel extends itemsBase {


    public fluegel(String itemName) {
        super(itemName);
        this.setMaxStackSize(1);

    }

    // TODO This Item AllowFlying Serverside and Cliandside


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
package com.jomlua.items;



import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class fluegel extends itemsBase {


    public fluegel(String itemName) {
        super(itemName);
        this.setMaxStackSize(1);
        this.setMaxDamage(512);

    }




    @Override
    public EnumActionResult onItemUse( EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        player.capabilities.isFlying = true;
        player.capabilities.allowFlying = true;
        player.sendPlayerAbilities();
        player.sendMessage(new TextComponentString(TextFormatting.DARK_AQUA + "[Remix Core]" + TextFormatting
                .AQUA+ " You can go Fly!") {
        });

        return null;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.DARK_AQUA + "[Click right] flying");
        tooltip.add(TextFormatting.GRAY + "Behalte die flügel in dein ");
        tooltip.add(TextFormatting.GRAY + "Inventar um Fliegen zu können.");
    }


}

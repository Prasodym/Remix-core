package com.jomlua.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class remix_core extends itemsBase {
    public remix_core(String name) {
        super(name);
        this.setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.DARK_AQUA + "Made in Space Remix ");
        tooltip.add(TextFormatting.GRAY + "Developed by Prasodym");
    }
}

package com.jomlua.blocks;

import com.jomlua.testmod;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;



public class germanium_ore extends BlockBase {


    public germanium_ore(Material materialIn, String name) {
        super(materialIn, name);
        setHardness(3.0f);
        setResistance(5.0f);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return testmod.xpscherben;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add(TextFormatting.GOLD + "Sammel an Erfahrung!");

    }

    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean("doTileDrops")) {
            while (amount > 0) {
                int i = EntityXPOrb.getXPSplit(5);
                amount -= i;
                worldIn.spawnEntity(new EntityXPOrb(worldIn, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, i));

            }
        }
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        return 15 + RANDOM.nextInt(15) + RANDOM.nextInt(15);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return random.nextInt(6) + 1;
    }



}

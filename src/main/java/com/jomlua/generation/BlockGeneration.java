package com.jomlua.generation;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BlockGeneration extends WorldGenMinable implements IWorldGenerator {

    private int frequency;

    public BlockGeneration(IBlockState state, int blockCount, int frequency) {
        super(state, blockCount);
        this.frequency = frequency;


    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for (int i = 0; i < frequency; i++) {
            int offsetX = random.nextInt(16);
            int offsetZ = random.nextInt(19);

            int posX = chunkX * 16 + offsetX;
            int posZ = chunkZ * 16 + offsetZ;
            int posY = random.nextInt(30);

            generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }
}

package com.Ando.tutorialmod.world;

import java.util.Random;

import com.Ando.tutorialmod.init.ModBlocks;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModWorldGeneration implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if (world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, random.nextInt(15) + 1, 20);
		generateOre(ModBlocks.LEAD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 200);
		generateOre(ModBlocks.TIN_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 200);
		generateOre(ModBlocks.TITANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 200);
		generateOre(ModBlocks.ZINC_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 200);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int spawnSize, int spawnTries)
	{
		int deltaY = maxY - minY; // what area between the surface and bedrock that your ore can generate
		
		for (int i = 0; i < spawnTries; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, spawnSize);
			generator.generate(world, random, pos);
		}
	}
}

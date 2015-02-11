package com.unwisedeadkilla.dimensional_items.worldgen;

import java.util.Random;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class DIWorldGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	
		switch(world.provider.dimensionId){
		
		case 0:  //Overworld
		generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case 1:  //The End
			//generateEnd(world, random, chunkX*16, chunkZ*16);
		
		case -1:  //Nether
			//generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 6: //Mining World
			generateMining(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateMining(World world, Random random, int x, int z) {
		
		//this.addOreSpawn(DIBlocks.blockOres, 0, world, random, x, z, 16, 16, 2 + random.nextInt(3), 10, 5, 20);
		this.addOreSpawn(DIBlocks.oreObsidianOre, 0, world, random, x, z, 16, 16, 2 + random.nextInt(3), 5, 5, 20);
		this.addOreSpawn(DIBlocks.oreEnderOre, 0, world, random, x, z, 16, 16, 1 + random.nextInt(4), 4, 5, 15);
		this.addOreSpawn(DIBlocks.oreBlazingOre, 0, world, random, x, z, 16, 16, 1 + random.nextInt(2), 4, 5, 25);
		this.addOreSpawn(DIBlocks.oreQuartzOre, 0, world, random, x, z, 16, 16, 5 + random.nextInt(20), 4, 5, 30);
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		//this.addOreSpawn(DIBlocks.blockOres, 0, world, random, x, z, 16, 16, 2 + random.nextInt(3), 5, 5, 20);
		this.addOreSpawn(DIBlocks.oreObsidianOre, 0, world, random, x, z, 16, 16, 2 + random.nextInt(3), 4, 5, 20);
		this.addOreSpawn(DIBlocks.oreEnderOre, 0, world, random, x, z, 16, 16, 1 + random.nextInt(4), 3, 5, 15);
		this.addOreSpawn(DIBlocks.oreBlazingOre, 0, world, random, x, z, 16, 16, 1 + random.nextInt(3), 3, 5, 25);
		this.addOreSpawn(DIBlocks.oreQuartzOre, 0, world, random, x, z, 16, 16, 5 + random.nextInt(10), 1, 5, 30);
		
	}

	private void addOreSpawn(Block block, int meta, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		
		for(int i = 0; i < chanceToSpawn; i++){
			
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, meta, maxVeinSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
		}
	}

}

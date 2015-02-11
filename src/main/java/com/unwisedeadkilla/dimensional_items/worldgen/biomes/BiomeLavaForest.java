package com.unwisedeadkilla.dimensional_items.worldgen.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeLavaForest extends BiomeGenBase{
	
	private static final Height biomeHeight = new Height(0.02F, 0.02F);

	public BiomeLavaForest(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(16731392);
		this.waterColorMultiplier = 16711697;
		this.enableSnow = false;
		this.enableRain = false;
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.reedsPerChunk = 3;
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z){
		return 16722432; //65535
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 16711680; //65535
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 16738816; //65535
	}

}

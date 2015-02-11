package com.unwisedeadkilla.dimensional_items.worldgen.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeQuartzForest extends BiomeGenBase{
	
	private static final Height biomeHeight = new Height(0.0F, 0.0F);

	public BiomeQuartzForest(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(16777215);
		this.waterColorMultiplier = 199936; //65535
		this.enableRain = false;
		this.enableSnow = false;
		this.theBiomeDecorator.treesPerChunk = 10;
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z){
		return 16777215;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 16777215;
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 16777215;
	}

}

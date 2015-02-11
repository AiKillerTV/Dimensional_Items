package com.unwisedeadkilla.dimensional_items.worldgen.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.Height;

public class BiomeIcyPlains extends BiomeGenBase {
	
	private static final Height biomeHeight = new Height(0.20F, 0.20F);

	public BiomeIcyPlains(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(65518);
		this.waterColorMultiplier = 65518;
		this.enableSnow = true;
		this.enableRain = false;
		this.theBiomeDecorator.treesPerChunk = 0;
		this.topBlock = Blocks.packed_ice;
		this.fillerBlock = Blocks.packed_ice;
		this.setTemperatureRainfall(0F, 0F);
		
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z){
		return 65518;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 65518; 
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 65518; 

	}

}

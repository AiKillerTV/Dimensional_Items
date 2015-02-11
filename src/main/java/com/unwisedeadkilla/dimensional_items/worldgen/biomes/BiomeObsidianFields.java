package com.unwisedeadkilla.dimensional_items.worldgen.biomes;

import java.util.ArrayList;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeObsidianFields extends BiomeGenBase{

	private static final Height biomeHeight = new Height(0.0F, 0.0F);
	
	public BiomeObsidianFields(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(6045020);
		//this.setTemperatureRainfall(100.0F, 100.0F);
		this.waterColorMultiplier = 0;
		//Water Color For New Biome = 53626
		this.topBlock = DIBlocks.blockGrass;
		this.fillerBlock = DIBlocks.blockDirt;
		this.enableSnow = false;
		this.enableRain = false;
		//this.spawnableMonsterList = new ArrayList();
		
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z){
		return 6045020;
	}
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 4063610;
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 0;
	}

}

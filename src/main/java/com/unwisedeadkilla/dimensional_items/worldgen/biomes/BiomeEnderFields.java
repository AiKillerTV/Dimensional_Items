package com.unwisedeadkilla.dimensional_items.worldgen.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeEnderFields extends BiomeGenBase{
	
	private static final Height biomeHeight = new Height(0.7F, 0.7F);

	public BiomeEnderFields(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(0);
		this.waterColorMultiplier = 45907;
		this.enableSnow = false;
		this.enableRain = false;
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z){
		return 1801067;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 65522;
	}
	
	/*@Override
	public int getSkyColorByTemp(float par1){
		return 65522;
	}*/

}

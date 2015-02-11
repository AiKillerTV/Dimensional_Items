package com.unwisedeadkilla.dimensional_items.blocks.ores;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlazingOre extends Block{

	public BlazingOre() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "BlazingOre");
		this.setHardness(3F);
		this.setResistance(100F);
		this.setCreativeTab(Dimensional_Items.BlazingBiome);
		this.setLightLevel(0.5F);
		this.setHarvestLevel("pickaxe", 2);
	}

}

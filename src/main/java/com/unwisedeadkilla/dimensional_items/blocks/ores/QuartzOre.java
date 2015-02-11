package com.unwisedeadkilla.dimensional_items.blocks.ores;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class QuartzOre extends Block{

	public QuartzOre() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":QuartzOre");
		this.setResistance(100F);
		this.setHardness(3F);
		this.setCreativeTab(Dimensional_Items.QuartzBiome);
		this.setHarvestLevel("pickaxe", 2);
	}

}

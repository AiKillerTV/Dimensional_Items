package com.unwisedeadkilla.dimensional_items.blocks.ores;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianOre extends Block{

	public ObsidianOre() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":ObsidianOre");
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 2);
	}

}

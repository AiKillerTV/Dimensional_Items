package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianBrick extends Block{

	public ObsidianBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":ObsidianBrick");
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 0);
	}

}

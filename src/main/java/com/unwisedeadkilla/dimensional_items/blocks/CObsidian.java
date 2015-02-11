package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CObsidian extends Block{

	protected CObsidian() {
		super(Material.rock);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setBlockTextureName("obsidian");
		this.setResistance(1000F);
		this.setHardness(35F);
		this.setHarvestLevel("pickaxe", 3);
	}

}

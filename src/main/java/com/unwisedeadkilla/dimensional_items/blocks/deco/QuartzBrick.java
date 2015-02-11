package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class QuartzBrick extends Block{

	public QuartzBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":QuartzBrick");
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(Dimensional_Items.QuartzBiome);
	}

}

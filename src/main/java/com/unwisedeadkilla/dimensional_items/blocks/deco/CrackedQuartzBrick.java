package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrackedQuartzBrick extends Block{

	public CrackedQuartzBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":Cracked_QuartzBrick");
		this.setCreativeTab(Dimensional_Items.QuartzBiome);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 0);
	}

}

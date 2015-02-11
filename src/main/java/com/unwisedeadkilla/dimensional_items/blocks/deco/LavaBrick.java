package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LavaBrick extends Block{

	public LavaBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":LavaBrick");
		this.setCreativeTab(Dimensional_Items.BlazingBiome);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 0);
	}

}

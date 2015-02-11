package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class QuartzStone extends Block{

	protected QuartzStone() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":QuartzStone");
		this.setCreativeTab(Dimensional_Items.QuartzBiome);
		this.setResistance(100F);
		this.setHardness(3F);
	}

}

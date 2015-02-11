package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnderStone extends Block{

	protected EnderStone() {
		super(Material.rock);
		
		this.setCreativeTab(Dimensional_Items.EnderBiome);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "EnderStone");
	}

}

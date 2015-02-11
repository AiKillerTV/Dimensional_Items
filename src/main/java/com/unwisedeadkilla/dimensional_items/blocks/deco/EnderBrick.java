package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnderBrick extends Block{

	public EnderBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":EnderBrick");
		this.setCreativeTab(Dimensional_Items.EnderBiome);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 0);
	}

}

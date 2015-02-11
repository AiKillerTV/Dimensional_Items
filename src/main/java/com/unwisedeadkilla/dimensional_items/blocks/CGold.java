package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CGold extends Block{

	protected CGold() {
		super(Material.iron);
		
		this.setBlockTextureName("gold_block");
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
	}

}

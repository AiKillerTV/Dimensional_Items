package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOfEnder extends Block{

	protected BlockOfEnder() {
		super(Material.iron);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setBlockTextureName(Dimensional_Items.modID + ":BlockOfEnder");
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3F);
		this.setResistance(100F);
	}

}

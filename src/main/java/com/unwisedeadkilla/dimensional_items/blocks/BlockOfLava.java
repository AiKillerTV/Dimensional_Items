package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOfLava extends Block{

	protected BlockOfLava() {
		super(Material.iron);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":BlockOfLava");
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeMetal);
	}

}

package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOfObsidian extends Block{

	protected BlockOfObsidian() {
		super(Material.iron);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setResistance(100F);
		this.setHardness(2F);
		this.setStepSound(soundTypeMetal);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "ObsidianBlock");
	}

}

package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cobblestone extends Block{

	protected Cobblestone() {
		super(Material.rock);
		
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "Cobblestone");
		this.setStepSound(soundTypeStone);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 1);
	}

}

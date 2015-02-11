package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Dirt extends Block{

	protected Dirt() {
		super(Material.ground);
		
		this.setStepSound(soundTypeGravel);
		this.setHardness(7F);
		this.setResistance(100F);
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "Dirt");
		this.setHarvestLevel("shovel", 1);
	}

}

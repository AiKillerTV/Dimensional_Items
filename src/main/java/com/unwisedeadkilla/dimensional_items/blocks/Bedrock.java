package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Bedrock extends Block{

	protected Bedrock() {
		super(Material.rock);
		
		this.setBlockUnbreakable();
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "Bedrock");
		this.setStepSound(soundTypeStone);
		this.setResistance(1000F);
	}

}

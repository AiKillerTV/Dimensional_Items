package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LavaLamp extends Block{

	protected LavaLamp() {
		super(Material.redstoneLight);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setBlockTextureName(Dimensional_Items.modID + ":LavaLamp");
		this.setHardness(3F);
		this.setResistance(100F);
		this.setStepSound(soundTypeGlass);
		this.setHarvestLevel("pickaxe", 0);
	}

}

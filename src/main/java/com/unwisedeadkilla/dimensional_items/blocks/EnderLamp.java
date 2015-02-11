package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class EnderLamp extends Block{

	protected EnderLamp() {
		super(Material.redstoneLight);
		
		this.setLightLevel(1.0F);
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setStepSound(soundTypeGlass);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(Dimensional_Items.modID + ":EnderLampOff");
	}

}

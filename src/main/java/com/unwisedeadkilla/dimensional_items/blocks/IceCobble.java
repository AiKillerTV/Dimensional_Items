package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IceCobble extends Block{

	protected IceCobble() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":IceCobble");
		this.setCreativeTab(Dimensional_Items.tabIceBiome);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
	}

}

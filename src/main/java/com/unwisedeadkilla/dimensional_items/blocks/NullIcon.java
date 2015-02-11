package com.unwisedeadkilla.dimensional_items.blocks;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NullIcon extends Block{

	protected NullIcon() {
		super(Material.air);
		
		this.setBlockTextureName(Dimensional_Items.modID + "NullIcon");
	}

}

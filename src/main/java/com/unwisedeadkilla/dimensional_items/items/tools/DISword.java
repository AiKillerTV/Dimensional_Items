package com.unwisedeadkilla.dimensional_items.items.tools;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemSword;

public class DISword extends ItemSword{

	public DISword(ToolMaterial Material) {
		super(Material);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}

}

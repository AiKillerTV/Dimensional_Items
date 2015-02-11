package com.unwisedeadkilla.dimensional_items.items.tools;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemHoe;

public class DIHoe extends ItemHoe{

	public DIHoe(ToolMaterial Material) {
		super(Material);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}

}

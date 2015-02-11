package com.unwisedeadkilla.dimensional_items.items.tools;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemSpade;

public class DIShovel extends ItemSpade{

	public DIShovel(ToolMaterial Material) {
		super(Material);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}

}

package com.unwisedeadkilla.dimensional_items.items.food;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemFood;

public class BlazingApple extends ItemFood{

	public BlazingApple(int heal, float saturation,  boolean dogFood) {
		super(heal, saturation, dogFood);
		
		this.setTextureName(Dimensional_Items.modID + ":BlazingApple");
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}

}

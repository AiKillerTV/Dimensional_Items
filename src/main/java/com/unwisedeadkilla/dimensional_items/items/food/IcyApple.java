package com.unwisedeadkilla.dimensional_items.items.food;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemFood;

public class IcyApple extends ItemFood{

	public IcyApple(int heal, float saturation, boolean dogFood) {
		super(heal, saturation, dogFood);
		
		this.setTextureName(Dimensional_Items.modID + ":IcyApple");
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}

}

package com.unwisedeadkilla.dimensional_items.items.food;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemFood;

public class OApple extends ItemFood{

	public OApple(int heal, float saturation, boolean dogFood) {
		super(heal, saturation, dogFood);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setTextureName(Dimensional_Items.modID + ":" + "OApple");
		this.setPotionEffect(2, 10, 1, 1F);
	}

}

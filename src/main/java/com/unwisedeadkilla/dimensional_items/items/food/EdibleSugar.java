package com.unwisedeadkilla.dimensional_items.items.food;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.ItemFood;

public class EdibleSugar extends ItemFood{

	public EdibleSugar(int heal, float saturation, boolean dogFood) {
		super(heal, saturation, dogFood);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setTextureName("sugar");
		this.setPotionEffect(1, 5, 1, 1F);
	}

}

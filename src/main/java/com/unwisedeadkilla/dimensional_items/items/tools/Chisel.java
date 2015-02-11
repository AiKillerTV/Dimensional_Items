package com.unwisedeadkilla.dimensional_items.items.tools;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.item.Item;

public class Chisel extends Item{
	
	public Chisel(){
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setNoRepair();
		this.setTextureName(Dimensional_Items.modID + ":Chisel");
		
	}

}

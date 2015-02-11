package com.unwisedeadkilla.dimensional_items.items;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class SimpleDIItems extends Item{
	
	public SimpleDIItems(){
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		this.itemIcon = iconRegister.registerIcon(Dimensional_Items.modID + ":" + this.getUnlocalizedName().substring(5));
	}

}

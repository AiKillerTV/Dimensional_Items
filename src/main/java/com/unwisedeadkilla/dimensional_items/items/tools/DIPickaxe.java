package com.unwisedeadkilla.dimensional_items.items.tools;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class DIPickaxe extends ItemPickaxe{

	public DIPickaxe(ToolMaterial Material) {
		super(Material);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
	}
}

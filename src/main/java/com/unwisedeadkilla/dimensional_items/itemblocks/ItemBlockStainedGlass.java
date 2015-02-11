package com.unwisedeadkilla.dimensional_items.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockStainedGlass extends ItemBlock{
	
	final static String[] subBlocks = new String[]{"Black", "Blue", "Brown", "Cyan", "Gray", "Green", "LightBlue", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "LightGray", "White", "Yellow"};

	public ItemBlockStainedGlass(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= subBlocks.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + subBlocks[i] + "Glass";
	}
	
	public int getMetadata(int meta){
		return meta;
	}

}

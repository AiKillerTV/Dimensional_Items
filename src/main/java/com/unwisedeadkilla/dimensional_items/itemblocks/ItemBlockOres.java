package com.unwisedeadkilla.dimensional_items.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockOres extends ItemBlock{
	
	final static String[] subBlocks = new String[]{"Obsidian", "Coal", "Diamond", "Emerald", "Iron", "Gold", "Redstone", "Lapis"};
	
	public ItemBlockOres(Block block){
		super(block);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= subBlocks.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + subBlocks[i] + "Ore";
	}
	
	public int getMetadata(int meta){
		return meta;
	}

}

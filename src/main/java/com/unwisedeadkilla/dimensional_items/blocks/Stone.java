package com.unwisedeadkilla.dimensional_items.blocks;

import java.util.Random;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Stone extends Block{

	public Stone() {
		super(Material.rock);
		
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "Stone");
		this.setResistance(100F);
		this.setHardness(3F);
		this.setStepSound(soundTypeStone);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3){
		return Item.getItemFromBlock(DIBlocks.blockCobblestone);
	}

}

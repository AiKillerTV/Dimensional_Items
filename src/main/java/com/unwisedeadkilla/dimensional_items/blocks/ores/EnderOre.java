package com.unwisedeadkilla.dimensional_items.blocks.ores;

import java.util.Random;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EnderOre extends Block{

	public EnderOre() {
		super(Material.rock);
		
		this.setHardness(3F);
		this.setResistance(100F);
		this.setBlockTextureName(Dimensional_Items.modID + ":" + "EnderOre");
		this.setCreativeTab(Dimensional_Items.EnderBiome);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	public Item getItemDropped(int meta, Random random, int Fortune){
		
		return DIItems.dustEnderDust;
	}
	
	public int quantityDropped(Random random){
		
		return 2 + random.nextInt(4);
	}

}

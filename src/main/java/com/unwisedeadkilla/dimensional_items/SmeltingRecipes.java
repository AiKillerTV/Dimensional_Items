package com.unwisedeadkilla.dimensional_items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public static void init(){
		Smelting();
	}
	
	public static void Smelting(){
		
		//Ores And Dust
		GameRegistry.addSmelting(DIBlocks.oreObsidianOre, new ItemStack(DIItems.ingotObsidianIngot), 1F);
		GameRegistry.addSmelting(new ItemStack(DIBlocks.oreQuartzOre), new ItemStack(Items.quartz), 1F);
		GameRegistry.addSmelting(DIBlocks.oreBlazingOre, new ItemStack(Items.blaze_rod), 1.0F);
		
		//Cobblestone -> Stone
		GameRegistry.addSmelting(DIBlocks.blockCobblestone, new ItemStack(DIBlocks.blockStone), 0.5F);
		GameRegistry.addSmelting(DIBlocks.blockIceCobble, new ItemStack(DIBlocks.blockIceStone), 0.5F);
		
		//Other
		GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(DIItems.ingotObsidianIngot), 0.5F);
		
		//Temp
		GameRegistry.addSmelting(Blocks.glass, new ItemStack(DIBlocks.blockGlass), 0F);
		
		//Blocks
		GameRegistry.addSmelting(DIBlocks.blockObsidianBrick, new ItemStack(DIBlocks.blockCrackedObsidianBrick), 0.5F);
		GameRegistry.addSmelting(DIBlocks.blockQuartzBrick, new ItemStack(DIBlocks.blockCrackedQuartzBrick), 0.5F);
	}

}

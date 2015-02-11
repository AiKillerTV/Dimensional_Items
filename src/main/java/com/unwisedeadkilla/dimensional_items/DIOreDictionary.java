package com.unwisedeadkilla.dimensional_items;

import static com.unwisedeadkilla.dimensional_items.blocks.DIBlocks.*;
import static com.unwisedeadkilla.dimensional_items.items.DIItems.*;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class DIOreDictionary {
	
	public static void init(){
		OreDiction();
	}
	
	public static void OreDiction(){
		
		//Ores
		//OreDictionary.registerOre("oreObsidian", new ItemStack(blockOres, 1, 0));
		//OreDictionary.registerOre("oreCoal", new ItemStack(blockOres, 1, 1));
		//OreDictionary.registerOre("oreDiamond", new ItemStack(blockOres, 1, 2));
		//OreDictionary.registerOre("oreEmerald", new ItemStack(blockOres, 1, 3));
		//OreDictionary.registerOre("oreIron", new ItemStack(blockOres, 1, 4));
		//OreDictionary.registerOre("oreGold", new ItemStack(blockOres, 1, 5));
		//OreDictionary.registerOre("oreRedstone", new ItemStack(blockOres, 1, 6));
		//OreDictionary.registerOre("oreLapis", new ItemStack(blockOres, 1, 7));
		OreDictionary.registerOre("oreObsidian", new ItemStack(DIBlocks.oreObsidianOre));
		OreDictionary.registerOre("oreEnder", new ItemStack(oreEnderOre));
		OreDictionary.registerOre("oreBlazing", new ItemStack(oreBlazingOre));
		OreDictionary.registerOre("oreQuartz", new ItemStack(oreQuartzOre));
		
		//Dust
		OreDictionary.registerOre("dustObsidian", new ItemStack(dustObsidianDust));
		OreDictionary.registerOre("dustIron", new ItemStack(dustIronDust));
		OreDictionary.registerOre("dustGold", new ItemStack(dustGoldDust));
		OreDictionary.registerOre("dustEnder", new ItemStack(dustEnderDust));
		
		//Ingots
		OreDictionary.registerOre("ingotObsidian", new ItemStack(ingotObsidianIngot));
		
		//Other
		OreDictionary.registerOre("stone", new ItemStack(blockStone));
		OreDictionary.registerOre("cobblestone", new ItemStack(blockCobblestone));
		OreDictionary.registerOre("blockGlassColorless", new ItemStack(blockGlass));
		OreDictionary.registerOre("stone", new ItemStack(blockEnderStone));
		OreDictionary.registerOre("stone", new ItemStack(blockLavaStone));
	}

}

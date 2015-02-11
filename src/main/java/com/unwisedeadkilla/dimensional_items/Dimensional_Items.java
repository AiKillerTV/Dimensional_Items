package com.unwisedeadkilla.dimensional_items;

import static com.unwisedeadkilla.dimensional_items.blocks.DIBlocks.*;
import static com.unwisedeadkilla.dimensional_items.items.DIItems.*;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;
import com.unwisedeadkilla.dimensional_items.blocks.BlockRegistry;
import com.unwisedeadkilla.dimensional_items.blocks.Stone;
import com.unwisedeadkilla.dimensional_items.blocks.crops.DICrops;
import com.unwisedeadkilla.dimensional_items.items.DIItems;
import com.unwisedeadkilla.dimensional_items.items.ItemRegistry;
import com.unwisedeadkilla.dimensional_items.worldgen.DIWorldGen;
import com.unwisedeadkilla.dimensional_items.worldgen.biomes.DIBiomes;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Dimensional_Items.modID, version = Dimensional_Items.version, name = Dimensional_Items.modName)

public class Dimensional_Items {

	public static final String modID = "DimensionalItems";
	public static final String version = "Alpha 1.0";
	public static final String modName = "Dimensional Items";
	
	public static CreativeTabs tabDimensionalItems = new CreativeTabs("Dimensional_Items"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return DIItems.toolObsidianPickaxe;
		}
	};
	
	public static CreativeTabs ObsidianBiome = new CreativeTabs("ObsidianBiome"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(DIBlocks.oreObsidianOre);
		}
		
	};
	
	public static CreativeTabs EnderBiome = new CreativeTabs("EnderBiome"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(DIBlocks.oreEnderOre);
		}
	};
	
	public static CreativeTabs BlazingBiome = new CreativeTabs("BlazingBiome"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(DIBlocks.oreBlazingOre);
		}
	};
	
	public static CreativeTabs QuartzBiome = new CreativeTabs("QuartzBiome"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(DIBlocks.oreQuartzOre);
		}
	};
	
	public static CreativeTabs tabIceBiome = new CreativeTabs("tabIceBiome"){
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
			return Item.getItemFromBlock(DIBlocks.oreIceOre);
		}
	};
	
	
	DIWorldGen eventWorldGen = new DIWorldGen();
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent){
		
		BlockRegistry.init();
		DIBiomes.init();
		ItemRegistry.init();
		
		/*              WORK IN PROGRESS (CRASHES GAME)
		blockCropOApple = new DICrops().setBlockName("OAppleCrop");
		
		itemOAppleSeeds = new ItemSeeds(DIBlocks.blockCropOApple, Blocks.farmland).setUnlocalizedName("OAppleSeeds").setTextureName(Dimensional_Items.modID + ":" + "Seeds_OApple").setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		GameRegistry.registerBlock(blockCropOApple, "OAppleCrop");
		GameRegistry.registerItem(itemOAppleSeeds, "OAppleSeeds");
		GameRegistry.registerItem(itemOApple, "OApple");
		*/
		
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		DIOreDictionary.init();
		CraftingRecipes.init();
		SmeltingRecipes.init();
		
	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent){
		
	}
}

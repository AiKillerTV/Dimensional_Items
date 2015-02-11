package com.unwisedeadkilla.dimensional_items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.blocks.crops.DICrops;
import com.unwisedeadkilla.dimensional_items.blocks.deco.ChiseledObsidianBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.ChiseledQuartzBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.CrackedObsidianBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.CrackedQuartzBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.EnderBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.IceBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.LavaBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.ObsidianBrick;
import com.unwisedeadkilla.dimensional_items.blocks.deco.QuartzBrick;
import com.unwisedeadkilla.dimensional_items.blocks.ores.BlazingOre;
import com.unwisedeadkilla.dimensional_items.blocks.ores.IceOre;
import com.unwisedeadkilla.dimensional_items.blocks.ores.ObsidianOre;
import com.unwisedeadkilla.dimensional_items.blocks.ores.ObsidianOres;
import com.unwisedeadkilla.dimensional_items.blocks.ores.EnderOre;
import com.unwisedeadkilla.dimensional_items.blocks.ores.QuartzOre;
import com.unwisedeadkilla.dimensional_items.itemblocks.ItemBlockOres;
import com.unwisedeadkilla.dimensional_items.itemblocks.ItemBlockStainedGlass;

import cpw.mods.fml.common.registry.GameRegistry;
import static com.unwisedeadkilla.dimensional_items.blocks.DIBlocks.*;

public class BlockRegistry {
	
	public static void init(){
		registerBlocks();
	}
	
	public static void registerBlocks(){
		
		//ObsidianBiome
		blockStone = registerBlock(new Stone().setBlockName("Stone"));
		blockGrass = registerBlock(new Grass().setBlockName("Grass"));
		blockDirt = registerBlock(new Dirt().setBlockName("Dirt"));
		blockBedrock = registerBlock(new Bedrock().setBlockName("Bedrock"));
		blockCobblestone = registerBlock(new Cobblestone().setBlockName("Cobblestone"));
		blockOfObsidian = registerBlock(new BlockOfObsidian().setBlockName("BlockOfObsidian"));
		blockObsidianBrick = registerBlock(new ObsidianBrick().setBlockName("ObsidianBrick"));
		blockChiseledObsidianBrick = registerBlock(new ChiseledObsidianBrick().setBlockName("ChiseledObsidianBrick"));
		blockCrackedObsidianBrick = registerBlock(new CrackedObsidianBrick().setBlockName("CrackedObsidianBrick"));
		
		//EnderBiome
		blockEnderStone = registerBlock(new EnderStone().setBlockName("EnderStone"));
		blockEnderBrick = registerBlock(new EnderBrick().setBlockName("EnderBrick"));
		
		//LavaBiome
		
		//QuartzBiome
		blockQuartzStone = registerBlock(new QuartzStone().setBlockName("QuartzStone"));
		blockQuartzBrick = registerBlock(new QuartzBrick().setBlockName("QuartzBrick"));
		blockChiseledQuartzBrick = registerBlock(new ChiseledQuartzBrick().setBlockName("ChiseledQuartzBrick"));
		blockCrackedQuartzBrick = registerBlock(new CrackedQuartzBrick().setBlockName("CrackedQuartzBrick"));
		
		//LavaBiome
		blockLavaStone = registerBlock(new LavaStone().setBlockName("LavaStone"));
		blockLavaBrick = registerBlock(new LavaBrick().setBlockName("LavaBrick"));
		
		//IceBiome
		blockIceStone = registerBlock(new IceStone(Material.rock, false).setBlockName("IceStone")); //Might Use Ice Instead
		blockIceBrick = registerBlock(new IceBrick(Material.rock, false).setBlockName("IceBrick"));
		blockIceCobble = registerBlock(new IceCobble().setBlockName("IceCobble"));
		
		//Blocks Of Crystals/Ingots
		blockOfLava = registerBlock(new BlockOfLava().setBlockName("BlockOfLava"));
		blockOfEnder = registerBlock(new BlockOfEnder().setBlockName("BlockOfEnder"));
		
		//other
		blockGlass = registerBlock(new Glass(Material.glass, false).setBlockName("Glass"));
		blockStainedGlass = new StainedGlass(Material.glass, false).setBlockName("Stained");
		GameRegistry.registerBlock(blockStainedGlass, ItemBlockStainedGlass.class, "Stained");
		blockSpeedBlock = registerBlock(new SpeedBlock().setBlockName("SpeedBlock"));
		blockObsidianLampOff = registerBlock(new ObsidianLamp(false).setBlockName("ObsidianLampOff").setCreativeTab(Dimensional_Items.tabDimensionalItems));
		blockObsidianLampOn = registerBlock(new ObsidianLamp(true).setBlockName("ObsidianLampOn"));
		blockIOLampOff = registerBlock(new IObsidianLamp(false).setBlockName("IObsidianLampOff"));
		blockIOLampOn = registerBlock(new IObsidianLamp(true).setBlockName("IObsidianLampOn").setCreativeTab(Dimensional_Items.tabDimensionalItems));
		blockEnderLamp = registerBlock(new EnderLamp().setBlockName("EnderLamp"));
		
		//Compressed
		blockCompressedObsidian = registerBlock(new CObsidian().setBlockName("CObsidian"));
		blockDCompressedObsidian = registerBlock(new CObsidian().setBlockName("DObsidian"));
		blockTCompressedObsidian = registerBlock(new CObsidian().setBlockName("TObsidian"));
		blockCompressedGold = registerBlock(new CGold().setBlockName("CGold"));
		
		//Crops
		//blockCropOApple = new DICrops().setBlockName("OAppleCrop");
		//blockCropOApple = registerBlock(new DICrops().setBlockName("OAppleCrop"));
		
		//Ore
		oreQuartzOre = registerBlock(new QuartzOre().setBlockName("QuartzOre"));
		oreIceOre = registerBlock(new IceOre(Material.ice, false).setBlockName("IceOre"));
		oreBlazingOre = registerBlock(new BlazingOre().setBlockName("BlazingOre"));
		oreEnderOre = registerBlock(new EnderOre().setBlockName("EnderOre"));
		oreObsidianOre = registerBlock(new ObsidianOre().setBlockName("ObsidianOre"));
		
	}
	
	public static Block registerBlock(Block block){
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
		
		return block;
	}

}

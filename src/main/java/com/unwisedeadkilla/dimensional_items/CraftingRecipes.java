package com.unwisedeadkilla.dimensional_items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	
	public static void init(){
		Crafting();
	}
	
	public static void Crafting(){
		
		//Random Items/BLocks
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIItems.itemObsidianStick, 2), true, new Object[]{"X", "X", Character.valueOf('X'), "ingotObsidian"}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockOfObsidian), true, new Object[]{"XXX", "XXX", "XXX", Character.valueOf('X'), "ingotObsidian"}));
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemFlintAndObsidian), Items.flint, new ItemStack(DIItems.ingotObsidianIngot, OreDictionary.getOreID("ingotObsidian")));
		 GameRegistry.addRecipe(new ItemStack(Items.ender_pearl), new Object[]{" X ", "XXX", " X ", 'X', DIItems.dustEnderDust});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockOfLava), new Object[]{"XYX", "YZY", "XYX", 'X', Items.lava_bucket, 'Y', Items.blaze_rod, 'Z', Blocks.emerald_block});
		 GameRegistry.addRecipe(new ItemStack(DIItems.crystalLavaIngot), new Object[]{"XYX", "YZY", "XYX", 'X', Items.lava_bucket, 'Y', Items.blaze_powder, 'Z', Items.emerald});
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.crystalLavaIngot, 9), DIBlocks.blockOfLava);
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockOfLava), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.crystalLavaIngot});
		 GameRegistry.addRecipe(new ItemStack(Blocks.ice), new Object[]{"XX", "XX", 'X', DIItems.itemIceChunk});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockOfEnder), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.crystalEnderIngot});
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.crystalEnderIngot, 9), DIBlocks.blockOfEnder);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.crystalEnderIngot), " X ", "XYX", " X ", 'X', DIItems.itemCompressedEnderPearl, 'Y', Items.diamond);
		 GameRegistry.addShapedRecipe(new ItemStack(DIBlocks.blockOfEnder), " X ", "XYX", " X ", 'X', DIItems.itemDCompressedEnderPearl, 'Y', Blocks.diamond_block);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.itemChiselHead), " X ", "X X", 'X', Items.iron_ingot);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemSpeedUpgrade), "XYX", "YZY", "XYX", 'X', Items.redstone, 'Y', Items.gold_ingot, 'Z', Items.sugar); //Might Not Keep
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemSpeedUpgrade), "XYX", "YZY", "XYX", 'X',  new ItemStack (Items.potionitem, 1, 8194), 'Y', Items.gold_ingot, 'Z', Items.redstone); //If I Want Them Harder To Get
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockSpeedBlock), "XYX", "YZY", "XYX", 'X', Items.redstone, 'Y', DIItems.itemSpeedUpgrade, 'Z', Blocks.gold_block);
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockSpeedBlock, 9), "XYX", "YZY", "XYX", 'X', Blocks.redstone_block, 'Y', DIItems.itemCompressedSpeedUpgrade, 'Z', DIBlocks.blockCompressedGold);
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockEnderLamp, 4), true, new Object[]{"XYX", "YZY", "XYX", Character.valueOf('X'), DIItems.itemCompressedEnderPearl, Character.valueOf('Y'), DIBlocks.blockGlass, Character.valueOf('Z'), "glowstone"}));
		 
		 //Compressed Items/Blocks
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemCompressedEnderPearl), new Object[]{"XXX", "XXX", "XXX", 'X', Items.ender_pearl});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemDCompressedEnderPearl), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemCompressedEnderPearl});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemTCompressedEnderPearl), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemDCompressedEnderPearl});
		 GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), DIItems.itemCompressedEnderPearl);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemCompressedEnderPearl, 9), DIItems.itemDCompressedEnderPearl);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemDCompressedEnderPearl, 9), DIItems.itemTCompressedEnderPearl);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemCompressedBlazeRod), new Object[]{"XXX", "XXX", "XXX", 'X', Items.blaze_rod});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemDCompressedBlazeRod), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemCompressedBlazeRod});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemTCompressedBlazeRod), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemDCompressedBlazeRod});
		 GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 9), DIItems.itemCompressedBlazeRod);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemCompressedBlazeRod, 9), DIItems.itemDCompressedBlazeRod);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemDCompressedBlazeRod, 9), DIItems.itemTCompressedBlazeRod);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemCompressedQuartz), new Object[]{"XXX", "XXX", "XXX", 'X', Items.quartz});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemDCompressedQuartz), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemCompressedQuartz});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemTCompressedQuartz), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemDCompressedQuartz});
		 GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 9), DIItems.itemCompressedQuartz);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemCompressedQuartz, 9), DIItems.itemDCompressedQuartz);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemDCompressedQuartz, 9), DIItems.itemTCompressedQuartz);
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockCompressedObsidian), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.obsidian});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockDCompressedObsidian), new Object[]{"XXX", "XXX", "XXX", 'X', DIBlocks.blockCompressedObsidian});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockTCompressedObsidian), new Object[]{"XXX", "XXX", "XXX", 'X', DIBlocks.blockDCompressedObsidian});
		 GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 9), DIBlocks.blockCompressedObsidian);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIBlocks.blockCompressedObsidian, 9), DIBlocks.blockDCompressedObsidian);
		 GameRegistry.addShapelessRecipe(new ItemStack(DIBlocks.blockDCompressedObsidian, 9), DIBlocks.blockTCompressedObsidian);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemCompressedSpeedPotion), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(Items.potionitem, 1, 8194)});
		 GameRegistry.addShapelessRecipe(new ItemStack(Items.potionitem, 9, 8194), DIItems.itemCompressedSpeedPotion);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemCompressedSpeedUpgrade), new Object[]{"XXX", "XXX", "XXX", 'X', DIItems.itemSpeedUpgrade});
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemSpeedUpgrade, 9), DIItems.itemCompressedSpeedUpgrade);
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockCompressedGold), new Object[]{"XXX", "XXX", "XXX", 'X', Blocks.gold_block});
		 GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block, 9), DIBlocks.blockCompressedGold);
		 
		 //Tools
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianPickaxe), "XXX", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianPickaxe1), "XXX", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianShovel), " X ", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianShovel1), " X ", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianAxe), "XX ", "XY ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianAxe1), "XX ", "XY ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianSword), " X ", " X ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianSword1), " X ", " X ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianHoe), "XX ", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolObsidianHoe1), "XX ", " Y ", " Y ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolQuartzPickaxe), "XXX", " Y ", " Y ", 'X', Items.quartz, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolQuartzShovel), " X ", " Y ", " Y ", 'X', Items.quartz, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolQuartzAxe), "XX ", "XY ", " Y ", 'X', Items.quartz, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolQuartzSword), " X ", " X ", " Y ", 'X', Items.quartz, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolQuartzHoe), "XX ", " Y ", " Y ", 'X', Items.quartz, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolEnderPickaxe), "XXX", " Y ", " Y ", 'X', DIItems.crystalEnderIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolEnderShovel), " X ", " Y ", " Y ", 'X', DIItems.crystalEnderIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolEnderAxe), "XX ", "XY ", " Y ", 'X', DIItems.crystalEnderIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolEnderSword), " X ", " X ", " Y ", 'X', DIItems.crystalEnderIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolEnderHoe), "XX ", " Y ", " Y ", 'X', DIItems.crystalEnderIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolLavaPickaxe), "XXX", " Y ", " Y ", 'X', DIItems.crystalLavaIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolLavaShovel), " X ", " Y ", " Y ", 'X', DIItems.crystalLavaIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolLavaAxe), "XX ", "XY ", " Y ", 'X', DIItems.crystalLavaIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolLavaSword), " X ", " X ", " Y ", 'X', DIItems.crystalLavaIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolLavaHoe), "XX ", " Y ", " Y ", 'X', DIItems.crystalLavaIngot, 'Y', Items.stick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolIronPickaxe1), "XXX", " Y ", " Y ", 'X', Items.iron_ingot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolIronShovel1), " X ", " Y ", " Y ", 'X', Items.iron_ingot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolIronAxe1), "XX ", "XY ", " Y ", 'X', Items.iron_ingot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolIronSword1), " X ", " X ", " Y ", 'X', Items.iron_ingot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolIronHoe1), "XX ", " Y ", " Y ", 'X', Items.iron_ingot, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolDiamondPickaxe1), "XXX", " Y ", " Y ", 'X', Items.diamond, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolDiamondShovel1), " X ", " Y ", " Y ", 'X', Items.diamond, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolDiamondAxe1), "XX ", "XY ", " Y ", 'X', Items.diamond, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolDiamondSword1), " X ", " X ", " Y ", 'X', Items.diamond, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.toolDiamondHoe1), "XX ", " Y ", " Y ", 'X', Items.diamond, 'Y', DIItems.itemObsidianStick);
		 GameRegistry.addRecipe(new ItemStack(DIItems.toolChisel), new Object[]{"X", "Y", 'X', DIItems.itemChiselHead, 'Y', Items.stick});
		 
		 //Armor
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorEnderHelmet), "XXX", "X X", 'X', DIItems.crystalEnderIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorEnderChestplate), "X X", "XXX", "XXX", 'X', DIItems.crystalEnderIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorEnderLeggings), "XXX", "X X", "X X", 'X', DIItems.crystalEnderIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorEnderBoots), "X X", "X X", 'X', DIItems.crystalEnderIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorLavaHelmet), "XXX", "X X", 'X', DIItems.crystalLavaIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorLavaChestplate), "X X", "XXX", "XXX", 'X', DIItems.crystalLavaIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorLavaLeggings), "XXX", "X X", "X X", 'X', DIItems.crystalLavaIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorLavaBoots), "X X", "X X", 'X', DIItems.crystalLavaIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorObsidianHelmet), "XXX", "X X", 'X', DIItems.ingotObsidianIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorObsidianChestplate), "X X", "XXX", "XXX", 'X', DIItems.ingotObsidianIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorObsidianLeggings), "XXX", "X X", "X X", 'X', DIItems.ingotObsidianIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorObsidianBoots), "X X", "X X", 'X', DIItems.ingotObsidianIngot);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorQuartzHelmet), "XXX", "X X", 'X', Items.quartz);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorQuartzChestplate), "X X", "XXX", "XXX", 'X', Items.quartz);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorQuartzLeggings), "XXX", "X X", "X X", 'X', Items.quartz);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorQuartzBoots), "X X", "X X", 'X', Items.quartz);
		 GameRegistry.addShapedRecipe(new ItemStack(DIItems.armorSpeedBoots), "XYX", "YZY", "XYX", 'X', Items.redstone, 'Y', DIItems.itemSpeedUpgrade, 'Z', Items.leather_boots);
		 
		 //Food
		 GameRegistry.addShapelessRecipe(new ItemStack(DIItems.itemEdibleSugar), Items.sugar);
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemOApple), new Object[]{" X ", "XYX", " X ", 'X', DIItems.ingotObsidianIngot, 'Y', Items.apple});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemBlazingApple), new Object[]{" X ", "XYX", " X ", 'X', Items.blaze_rod, 'Y', Items.apple});
		 GameRegistry.addRecipe(new ItemStack(DIItems.itemIcyApple), new Object[]{" X ", "XYX", " X ", 'X', Blocks.ice, 'Y', Items.apple});
		 
		 
		 //Stained Glass
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 0), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 0)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 1), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 4)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 2), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 3)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 3), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 6)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 4), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 8)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 5), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 2)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 6), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 12)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 7), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 10)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 8), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 13)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 9), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 14)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 10), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 9)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 11), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 5)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 12), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 1)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 13), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 7)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 14), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 15)}));
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockStainedGlass, 8, 15), true, new Object[]{"XXX", "XYX", "XXX", Character.valueOf('X'), DIBlocks.blockGlass, Character.valueOf('Y'), new ItemStack(Items.dye, 1, 11)}));
		 
		 //Other Blocks
		 GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(new ItemStack(DIBlocks.blockObsidianLampOff, 4), true, new Object[]{"XYX", "YZY", "XYX", Character.valueOf('X'), "ingotObsidian", Character.valueOf('Y'), DIBlocks.blockGlass, Character.valueOf('Z'), "glowstone"}));
		 GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{"XX", "XX", 'X', DIItems.ingotObsidianIngot});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockQuartzStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', Items.quartz, 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockQuartzStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', new ItemStack(Items.dye, 1, 15), 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockQuartzBrick, 4), new Object[]{"XX", "XX", 'X', DIBlocks.blockQuartzStone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', Blocks.obsidian, 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', new ItemStack(Items.dye, 1, 0), 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockObsidianBrick, 4), new Object[]{"XX", "XX", 'X', DIBlocks.blockStone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockEnderStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', new ItemStack(Items.dye, 1, 2), 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockEnderBrick, 4), new Object[]{"XX", "XX", 'X', DIBlocks.blockEnderStone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockLavaStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', new ItemStack(Items.dye, 1, 1), 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockLavaBrick, 4), new Object[]{"XX", "XX", 'X', DIBlocks.blockLavaStone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockIceStone, 4), new Object[]{"XYX", "YXY", "XYX", 'X', new ItemStack(Items.dye, 1, 4), 'Y', Blocks.stone});
		 GameRegistry.addRecipe(new ItemStack(DIBlocks.blockIceBrick, 4), new Object[]{"XX", "XX", 'X', DIBlocks.blockIceStone});
		 
		 //Chisel Crafting
		 GameRegistry.addShapelessRecipe(new ItemStack(DIBlocks.blockChiseledObsidianBrick), DIBlocks.blockObsidianBrick, new ItemStack(DIItems.toolChisel, 1, OreDictionary.WILDCARD_VALUE));
		 GameRegistry.addShapelessRecipe(new ItemStack(DIBlocks.blockChiseledQuartzBrick), DIBlocks.blockQuartzBrick, new ItemStack(DIItems.toolChisel, 1, OreDictionary.WILDCARD_VALUE));
		 GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 3), Blocks.stonebrick, new ItemStack(DIItems.toolChisel, 1, OreDictionary.WILDCARD_VALUE));
		 
		 //Temp
		 
	}

}

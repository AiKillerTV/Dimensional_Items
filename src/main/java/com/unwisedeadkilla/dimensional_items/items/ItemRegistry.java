package com.unwisedeadkilla.dimensional_items.items;

import static com.unwisedeadkilla.dimensional_items.blocks.DIBlocks.blockCropOApple;
import static com.unwisedeadkilla.dimensional_items.items.DIItems.*;

import com.unwisedeadkilla.dimensional_items.DIArmorMaterial;
import com.unwisedeadkilla.dimensional_items.DIToolMaterials;
import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.blocks.DIBlocks;
import com.unwisedeadkilla.dimensional_items.blocks.crops.DICrops;
import com.unwisedeadkilla.dimensional_items.items.armor.EnderArmor;
import com.unwisedeadkilla.dimensional_items.items.armor.LSpeed2Armor;
import com.unwisedeadkilla.dimensional_items.items.armor.LavaArmor;
import com.unwisedeadkilla.dimensional_items.items.armor.ObsidianArmor;
import com.unwisedeadkilla.dimensional_items.items.armor.QuartzArmor;
import com.unwisedeadkilla.dimensional_items.items.armor.SpeedArmor;
import com.unwisedeadkilla.dimensional_items.items.food.BlazingApple;
import com.unwisedeadkilla.dimensional_items.items.food.EdibleSugar;
import com.unwisedeadkilla.dimensional_items.items.food.IcyApple;
import com.unwisedeadkilla.dimensional_items.items.food.OApple;
import com.unwisedeadkilla.dimensional_items.items.tools.Chisel;
import com.unwisedeadkilla.dimensional_items.items.tools.DIAxe;
import com.unwisedeadkilla.dimensional_items.items.tools.DIHoe;
import com.unwisedeadkilla.dimensional_items.items.tools.DIPickaxe;
import com.unwisedeadkilla.dimensional_items.items.tools.DIShovel;
import com.unwisedeadkilla.dimensional_items.items.tools.DISword;
import com.unwisedeadkilla.dimensional_items.DIToolMaterials;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
public class ItemRegistry {
	
	public static void init(){
		registerItems();
	}
	
	public static void registerItems(){
		
		ingotObsidianIngot = registerItem(new SimpleDIItems().setUnlocalizedName("ObsidianIngot"));
		dustObsidianDust = registerItem(new SimpleDIItems().setUnlocalizedName("ObsidianDust"));
		dustIronDust = registerItem(new SimpleDIItems().setUnlocalizedName("IronDust"));
		dustGoldDust = registerItem(new SimpleDIItems().setUnlocalizedName("GoldDust"));
		dustEnderDust = registerItem(new SimpleDIItems().setUnlocalizedName("EnderDust"));
		itemObsidianStick = registerItem(new SimpleDIItems().setUnlocalizedName("ObsidianStick"));
		itemFlintAndObsidian = registerItem(new FlintAndObsidian().setUnlocalizedName("FlintAndObsidian"));
		
		//Random
		itemIceChunk = registerItem(new SimpleDIItems().setUnlocalizedName("IceChunk"));
		itemChiselHead = registerItem(new SimpleDIItems().setUnlocalizedName("ChiselHead"));
		itemSpeedUpgrade = registerItem(new SimpleDIItems().setUnlocalizedName("SpeedUpgrade"));
		
		//Compressed
		itemCompressedEnderPearl = registerItem(new CEnderPearl().setUnlocalizedName("CEnderPearl"));
		itemDCompressedEnderPearl = registerItem(new CEnderPearl().setUnlocalizedName("DEnderPearl"));
		itemTCompressedEnderPearl = registerItem(new CEnderPearl().setUnlocalizedName("TEnderPearl"));
		itemCompressedBlazeRod = registerItem(new CBlazeRod().setUnlocalizedName("CBlazeRod"));
		itemDCompressedBlazeRod = registerItem(new CBlazeRod().setUnlocalizedName("DBlazeRod"));
		itemTCompressedBlazeRod = registerItem(new CBlazeRod().setUnlocalizedName("TBlazeRod"));
		itemCompressedQuartz = registerItem(new CQuartz().setUnlocalizedName("CQuartz"));
		itemDCompressedQuartz = registerItem(new CQuartz().setUnlocalizedName("DQuartz"));
		itemTCompressedQuartz = registerItem(new CQuartz().setUnlocalizedName("TQuartz"));
		itemCompressedSpeedUpgrade = registerItem(new CSpeedUpgrade().setUnlocalizedName("CSpeedUpgrade"));
		
		//Food
		itemOApple = registerItem(new OApple(3, 0.5F, false).setUnlocalizedName("OApple"));
		itemEdibleSugar = registerItem(new EdibleSugar(1, 1.5F, false).setUnlocalizedName("EdibleSugar"));
		itemBlazingApple = registerItem(new BlazingApple(3, 0.5F, false).setUnlocalizedName("BlazingApple"));
		itemIcyApple = registerItem(new IcyApple(3, 0.5F, false).setUnlocalizedName("IcyApple"));
		
		//Durable Items
		toolChisel = registerItem(new Chisel().setUnlocalizedName("Chisel"));
		
		//ingots
		crystalEnderIngot = registerItem(new SimpleDIItems().setUnlocalizedName("EnderCrystal"));
		crystalLavaIngot = registerItem(new SimpleDIItems().setUnlocalizedName("LavaCrystal"));
		
		//tools
		toolObsidianPickaxe = registerItem(new DIPickaxe(DIToolMaterials.ObsidianMaterial).setUnlocalizedName("ObsidianPickaxe").setTextureName(Dimensional_Items.modID + ":ObsidianPickaxe"));
		toolObsidianPickaxe1 = registerItem(new DIPickaxe(DIToolMaterials.ObsidianMaterial1).setUnlocalizedName("ObsidianPickaxe1").setTextureName(Dimensional_Items.modID + ":ObsidianPickaxe1"));
		toolObsidianShovel = registerItem(new DIShovel(DIToolMaterials.ObsidianMaterial).setUnlocalizedName("ObsidianShovel").setTextureName(Dimensional_Items.modID + ":ObsidianShovel"));
		toolObsidianShovel1 = registerItem(new DIShovel(DIToolMaterials.ObsidianMaterial1).setUnlocalizedName("ObsidianShovel1").setTextureName(Dimensional_Items.modID + ":ObsidianShovel1"));
		toolObsidianAxe = registerItem(new DIAxe(DIToolMaterials.ObsidianMaterial).setUnlocalizedName("ObsidianAxe").setTextureName(Dimensional_Items.modID + ":ObsidianAxe"));
		toolObsidianAxe1 = registerItem(new DIAxe(DIToolMaterials.ObsidianMaterial1).setUnlocalizedName("ObsidianAxe1").setTextureName(Dimensional_Items.modID + ":ObsidianAxe1"));
		toolObsidianSword = registerItem(new DISword(DIToolMaterials.ObsidianMaterial).setUnlocalizedName("ObsidianSword").setTextureName(Dimensional_Items.modID + ":ObsidianSword"));
		toolObsidianSword1 = registerItem(new DISword(DIToolMaterials.ObsidianMaterial1).setUnlocalizedName("ObsidianSword1").setTextureName(Dimensional_Items.modID + ":ObsidianSword1"));
		toolObsidianHoe = registerItem(new DIHoe(DIToolMaterials.ObsidianMaterial).setUnlocalizedName("ObsidianHoe").setTextureName(Dimensional_Items.modID + ":ObsidianHoe"));
		toolObsidianHoe1 = registerItem(new DIHoe(DIToolMaterials.ObsidianMaterial1).setUnlocalizedName("ObsidianHoe1").setTextureName(Dimensional_Items.modID + ":ObsidianHoe1"));
		toolQuartzPickaxe = registerItem(new DIPickaxe(DIToolMaterials.QuartzMaterial).setUnlocalizedName("QuartzPickaxe").setTextureName(Dimensional_Items.modID + ":QuartzPickaxe"));
		toolQuartzShovel = registerItem(new DIShovel(DIToolMaterials.QuartzMaterial).setUnlocalizedName("QuartzShovel").setTextureName(Dimensional_Items.modID + ":QuartzShovel"));
		toolQuartzAxe = registerItem(new DIAxe(DIToolMaterials.QuartzMaterial).setUnlocalizedName("QuartzAxe").setTextureName(Dimensional_Items.modID + ":QuartzAxe"));
		toolQuartzSword = registerItem(new DISword(DIToolMaterials.QuartzMaterial).setUnlocalizedName("QuartzSword").setTextureName(Dimensional_Items.modID + ":QuartzSword"));
		toolQuartzHoe = registerItem(new DIHoe(DIToolMaterials.QuartzMaterial).setUnlocalizedName("QuartzHoe").setTextureName(Dimensional_Items.modID + ":QuartzHoe"));
		toolEnderPickaxe = registerItem(new DIPickaxe(DIToolMaterials.EnderMaterial).setUnlocalizedName("EnderPickaxe").setTextureName(Dimensional_Items.modID + ":EnderPickaxe"));
		toolEnderShovel = registerItem(new DIShovel(DIToolMaterials.EnderMaterial).setUnlocalizedName("EnderShovel").setTextureName(Dimensional_Items.modID + ":EnderShovel"));
		toolEnderAxe = registerItem(new DIAxe(DIToolMaterials.EnderMaterial).setUnlocalizedName("EnderAxe").setTextureName(Dimensional_Items.modID + ":EnderAxe"));
		toolEnderSword = registerItem(new DISword(DIToolMaterials.EnderMaterial).setUnlocalizedName("EnderSword").setTextureName(Dimensional_Items.modID + ":EnderSword"));
		toolEnderHoe = registerItem(new DIHoe(DIToolMaterials.EnderMaterial).setUnlocalizedName("EnderHoe").setTextureName(Dimensional_Items.modID + ":EnderHoe"));
		toolLavaPickaxe = registerItem(new DIPickaxe(DIToolMaterials.LavaMaterial).setUnlocalizedName("LavaPickaxe").setTextureName(Dimensional_Items.modID + ":LavaPickaxe"));
		toolLavaShovel = registerItem(new DIShovel(DIToolMaterials.LavaMaterial).setUnlocalizedName("LavaShovel").setTextureName(Dimensional_Items.modID + ":LavaShovel"));
		toolLavaAxe = registerItem(new DIAxe(DIToolMaterials.LavaMaterial).setUnlocalizedName("LavaAxe").setTextureName(Dimensional_Items.modID + ":LavaAxe"));
		toolLavaSword = registerItem(new DISword(DIToolMaterials.LavaMaterial).setUnlocalizedName("LavaSword").setTextureName(Dimensional_Items.modID + ":LavaSword"));
		toolLavaHoe = registerItem(new DIHoe(DIToolMaterials.LavaMaterial).setUnlocalizedName("LavaHoe").setTextureName(Dimensional_Items.modID + ":LavaHoe"));
		
		//Better Vanilla Tools
		toolIronPickaxe1 = registerItem(new DIPickaxe(DIToolMaterials.IronMaterial1).setUnlocalizedName("IronPickaxe1").setTextureName(Dimensional_Items.modID + ":IronPickaxe1"));
		toolIronShovel1 = registerItem(new DIShovel(DIToolMaterials.IronMaterial1).setUnlocalizedName("IronShovel1").setTextureName(Dimensional_Items.modID + ":IronShovel1"));
		toolIronAxe1 = registerItem(new DIAxe(DIToolMaterials.IronMaterial1).setUnlocalizedName("IronAxe1").setTextureName(Dimensional_Items.modID + ":IronAxe1"));
		toolIronSword1 = registerItem(new DISword(DIToolMaterials.IronMaterial1).setUnlocalizedName("IronSword1").setTextureName(Dimensional_Items.modID + ":IronSword1"));
		toolIronHoe1 = registerItem(new DIHoe(DIToolMaterials.IronMaterial1).setUnlocalizedName("IronHoe1").setTextureName(Dimensional_Items.modID + ":IronHoe1"));
		toolDiamondPickaxe1 = registerItem(new DIPickaxe(DIToolMaterials.DiamondMaterial1).setUnlocalizedName("DiamondPickaxe1").setTextureName(Dimensional_Items.modID + ":DiamondPickaxe1"));
		toolDiamondShovel1 = registerItem(new DIShovel(DIToolMaterials.DiamondMaterial1).setUnlocalizedName("DiamondShovel1").setTextureName(Dimensional_Items.modID + ":DiamondShovel1"));
		toolDiamondAxe1 = registerItem(new DIAxe(DIToolMaterials.DiamondMaterial1).setUnlocalizedName("DiamondAxe1").setTextureName(Dimensional_Items.modID + ":DiamondAxe1"));
		toolDiamondSword1 = registerItem(new DISword(DIToolMaterials.DiamondMaterial1).setUnlocalizedName("DiamondSword1").setTextureName(Dimensional_Items.modID + ":DiamondSword1"));
		toolDiamondHoe1 = registerItem(new DIHoe(DIToolMaterials.DiamondMaterial1).setUnlocalizedName("DiamondHoe1").setTextureName(Dimensional_Items.modID + ":DiamondHoe1"));
		
		//armor
		armorLavaHelmet = registerItem(new LavaArmor(DIArmorMaterial.LavaArmorMaterial, armorLavaHelmetID, 0).setUnlocalizedName("LavaHelmet"));
		armorLavaChestplate = registerItem(new LavaArmor(DIArmorMaterial.LavaArmorMaterial, armorLavaChestplateID, 1).setUnlocalizedName("LavaChestplate"));
		armorLavaLeggings = registerItem(new LavaArmor(DIArmorMaterial.LavaArmorMaterial, armorLavaLeggingsID, 2).setUnlocalizedName("LavaLeggings"));
		armorLavaBoots = registerItem(new LavaArmor(DIArmorMaterial.LavaArmorMaterial, armorLavaBootsID, 3).setUnlocalizedName("LavaBoots"));
		armorEnderHelmet = registerItem(new EnderArmor(DIArmorMaterial.EnderArmorMaterial, armorEnderHelmetID, 0).setUnlocalizedName("EnderHelmet"));
		armorEnderChestplate = registerItem(new EnderArmor(DIArmorMaterial.EnderArmorMaterial, armorEnderChestplateID, 1).setUnlocalizedName("EnderChestplate"));
		armorEnderLeggings = registerItem(new EnderArmor(DIArmorMaterial.EnderArmorMaterial, armorEnderLeggingsID, 2).setUnlocalizedName("EnderLeggings"));
		armorEnderBoots = registerItem(new EnderArmor(DIArmorMaterial.EnderArmorMaterial, armorEnderBootsID, 3).setUnlocalizedName("EnderBoots"));
		armorQuartzHelmet = registerItem(new QuartzArmor(DIArmorMaterial.QuartzArmorMaterial, armorQuartzHelmetID, 0).setUnlocalizedName("QuartzHelmet"));
		armorQuartzChestplate = registerItem(new QuartzArmor(DIArmorMaterial.QuartzArmorMaterial, armorQuartzChestplateID, 1).setUnlocalizedName("QuartzChestplate"));
		armorQuartzLeggings = registerItem(new QuartzArmor(DIArmorMaterial.QuartzArmorMaterial, armorQuartzLeggingsID, 2).setUnlocalizedName("QuartzLeggings"));
		armorQuartzBoots = registerItem(new QuartzArmor(DIArmorMaterial.QuartzArmorMaterial, armorQuartzBootsID, 3).setUnlocalizedName("QuartzBoots"));
		armorObsidianHelmet = registerItem(new ObsidianArmor(DIArmorMaterial.ObsidianArmorMaterial, armorObsidianHelmetID, 0).setUnlocalizedName("ObsidianHelmet"));
		armorObsidianChestplate = registerItem(new ObsidianArmor(DIArmorMaterial.ObsidianArmorMaterial, armorObsidianChestplateID, 1).setUnlocalizedName("ObsidianChestplate"));
		armorObsidianLeggings = registerItem(new ObsidianArmor(DIArmorMaterial.ObsidianArmorMaterial, armorObsidianLeggingsID, 2).setUnlocalizedName("ObsidianLeggings"));
		armorObsidianBoots = registerItem(new ObsidianArmor(DIArmorMaterial.ObsidianArmorMaterial, armorObsidianBootsID, 3).setUnlocalizedName("ObsidianBoots"));
		armorLeatherSpeedBoots = registerItem(new SpeedArmor(DIArmorMaterial.SpeedArmorLeatherMaterial, armorSpeedBootsID, 3).setUnlocalizedName("SpeedBoots"));
		armorLeatherSpeed2Boots = registerItem(new LSpeed2Armor(DIArmorMaterial.SpeedArmorLeatherMaterial, armorSpeed2BootsID, 3).setUnlocalizedName("Speed2Boots"));
		
		//Test
		itemCompressedSpeedPotion = registerItem(new CSpeedPotion().setUnlocalizedName("CSpeedPotion"));
	}
	
	public static Item registerItem(Item item){
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		
		return item;
	}

}

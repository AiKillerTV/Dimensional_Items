package com.unwisedeadkilla.dimensional_items.blocks.ores;

import java.util.List;
import java.util.Random;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ObsidianOres extends Block{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subBlocks = new String[]{"Obsidian", "Iron", "Gold"};

	public ObsidianOres() {
		super(Material.rock);
		
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++){
			texture[i] = iconRegister.registerIcon(Dimensional_Items.modID + ":" + subBlocks[i] + "Ore");
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
		for(int i = 0; i < subBlocks.length; i++){
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return texture[meta];
	}
	
	public int damageDropped(int meta){
		return meta;
	}

}

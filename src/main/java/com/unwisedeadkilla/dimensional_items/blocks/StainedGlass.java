package com.unwisedeadkilla.dimensional_items.blocks;

import java.util.List;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class StainedGlass extends BlockBreakable{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] subBlocks = new String[]{"Black", "Blue", "Brown", "Cyan", "Gray", "Green", "LightBlue", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "LightGray", "White", "Yellow"};

	protected StainedGlass(Material material, boolean notsure) {
		super("glass", material, notsure);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setHardness(2F);
		this.setResistance(100F);
		this.setStepSound(soundTypeGlass);
		this.useNeighborBrightness = true;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		texture = new IIcon[subBlocks.length];
		
		for(int i = 0; i < subBlocks.length; i++){
			texture[i] = iconRegister.registerIcon(Dimensional_Items.modID + ":" + subBlocks[i] + "Glass");
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
	
	 @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }
	 
	  public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	  
	  public boolean isOpaqueCube(){
		  return false;
	  }

}

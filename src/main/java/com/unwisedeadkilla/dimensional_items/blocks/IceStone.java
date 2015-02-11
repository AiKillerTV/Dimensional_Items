package com.unwisedeadkilla.dimensional_items.blocks;

import java.util.Random;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceStone extends BlockBreakable{

	protected IceStone(Material material, boolean notsure) {
		super(Dimensional_Items.modID + ":IceStone", material, notsure);
		
		this.setCreativeTab(Dimensional_Items.tabIceBiome);
		//this.setBlockTextureName(Dimensional_Items.modID + ":IceStone");
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 1);
		this.slipperiness = 0.98F; // 0.40
		}
	
    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public Item getItemDropped(int meta, Random random, int Fortune){
    	return Item.getItemFromBlock(DIBlocks.blockIceCobble);
    }

}

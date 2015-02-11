package com.unwisedeadkilla.dimensional_items.blocks.ores;

import java.util.Random;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class IceOre extends BlockBreakable{

	public IceOre(Material material, boolean p_i45408_2_) {
		super(Dimensional_Items.modID + ":IceOre", material, p_i45408_2_);
		
		this.setCreativeTab(Dimensional_Items.tabIceBiome);
		//this.setBlockTextureName(Dimensional_Items.modID + ":IceOre");
		this.setHardness(0.5F);
		this.setResistance(100F);
		this.setStepSound(soundTypeGlass);
		this.slipperiness = 0.98F;
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
    	
    	return DIItems.itemIceChunk;
    }
	    

}

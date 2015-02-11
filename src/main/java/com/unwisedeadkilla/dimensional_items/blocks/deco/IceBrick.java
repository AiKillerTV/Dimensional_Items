package com.unwisedeadkilla.dimensional_items.blocks.deco;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceBrick extends BlockBreakable{

	public IceBrick(Material material, boolean notsure) {
		super(Dimensional_Items.modID + ":IceBrick", material, notsure);
		
		this.setCreativeTab(Dimensional_Items.tabIceBiome);
		//this.setBlockTextureName(Dimensional_Items.modID + ":IceBrick");
		this.setHardness(3F);
		this.setResistance(100F);
		this.setHarvestLevel("pickaxe", 0);
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


}

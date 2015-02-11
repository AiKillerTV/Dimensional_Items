package com.unwisedeadkilla.dimensional_items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Glass extends BlockBreakable{
	
	@SideOnly(Side.CLIENT)
	public IIcon icons[][][][];
		
	protected Glass(Material material, boolean p_i45408_2_){
		super("BlockGlass", material, p_i45408_2_);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		this.setResistance(100F);
		this.setHardness(0.5F);
		this.setStepSound(soundTypeGlass);
		this.useNeighborBrightness = true;
		
	}
	
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
    	
    	
    	icons = new IIcon[2][2][2][2];
    	
    	for(int a = 0; a <= 1; a++) for(int b = 0; b <= 1; b++) for(int c = 0; c<= 1; c++) for(int d = 0; d <= 1; d++)
    		icons[a][b][c][d] = iconRegister.registerIcon(Dimensional_Items.modID + ":" + "glass/inv/g_" + a + "_" + b + "_" + c + "_" + d);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int s, int m){
    	return icons[0][0][0][0];
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess iba, int x, int y, int z, int s){
    	
    	ForgeDirection fd = ForgeDirection.VALID_DIRECTIONS[s];
    	if(isAt(iba, x + fd.offsetX, y + fd.offsetY, z + fd.offsetZ, iba.getBlockMetadata(x, y, z)) == 1)
    		return DIBlocks.blockNullIcon;
    	
    	int m = 0;
    	
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	int d = 0;
    	
    	if(s == 0 || s == 1){
    		a = isAt(iba, x, y, z - 1, m); 
    		b = isAt(iba, x + 1, y, z, m);
    		c = isAt(iba, x, y, z + 1, m);
    		d = isAt(iba, x - 1, y, z, m);
    	}
    	else{
    		
    		a = isAt(iba, x, y + 1, z, m);
    		c = isAt(iba, x, y - 1, z, m);
			
			if(s == 3) //South
			{
				b = isAt(iba, x + 1, y, z, m);
				d = isAt(iba, x - 1, y, z, m);
			}
			else if(s == 2) //North
			{
				b = isAt(iba, x - 1, y, z, m);
				d = isAt(iba, x + 1, y, z, m);
			}
			else if(s == 5) //East
			{
				b = isAt(iba, x, y, z - 1, m);
				d = isAt(iba, x, y, z + 1, m);
			}
			else
			{
				b = isAt(iba, x, y, z + 1, m);
				d = isAt(iba, x, y, z - 1, m);
			}
		}
    	
    	return icons[a][b][c][d];
    }
    
    private int isAt(IBlockAccess iba, int x, int y, int z, int m){
    	return (iba.getBlock(x, y, z) == this) ? 1 : 0;
    	
    }
    
	
	
}

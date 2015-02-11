package com.unwisedeadkilla.dimensional_items.items.armor;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class QuartzArmor extends ItemArmor{

	public QuartzArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":QuartzHelmet");
			
		}else if(slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":QuartzChestplate");
			
		}else if(slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":QuartzLeggings");
			
		}else if(slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":QuartzBoots");
		}
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String Type){
		
		if(itemstack.getItem() == DIItems.armorQuartzHelmet || itemstack.getItem() == DIItems.armorQuartzChestplate || itemstack.getItem() == DIItems.armorQuartzBoots){
			
			return Dimensional_Items.modID + ":textures/models/armor/quartz_layer_1.png";
		}
		
		else if(itemstack.getItem() == DIItems.armorQuartzLeggings){
			
			return Dimensional_Items.modID + ":textures/models/armor/quartz_layer_2.png";
		}
		
		else{
			return null;
		}
	}

}

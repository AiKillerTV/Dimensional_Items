package com.unwisedeadkilla.dimensional_items.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

public class EnderArmor extends ItemArmor{

	public EnderArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":EnderHelmet");
			
		}else if(slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":EnderChestplate");
			
		}else if(slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":EnderLeggings");
			
		}else if(slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":EnderBoots");
		}
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String Type){
		
		if(itemstack.getItem() == DIItems.armorEnderHelmet || itemstack.getItem() == DIItems.armorEnderChestplate || itemstack.getItem() == DIItems.armorEnderBoots){
			return Dimensional_Items.modID + ":textures/models/armor/ender_layer_1.png";
		}
		
		else if(itemstack.getItem() == DIItems.armorEnderLeggings){
			return Dimensional_Items.modID + ":textures/models/armor/ender_layer_2.png";
		}
		
		else{
			return null;
		}
	}

}

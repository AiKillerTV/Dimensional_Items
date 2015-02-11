package com.unwisedeadkilla.dimensional_items.items.armor;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor{

	public ObsidianArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":ObsidianHelmet");
			
		}else if(slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":ObsidianChestplate");
			
		}else if(slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":ObsidianLeggings");
			
		}else if(slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":ObsidianBoots");
		}
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String Type){
		
		if(itemstack.getItem() == DIItems.armorObsidianHelmet || itemstack.getItem() == DIItems.armorObsidianChestplate || itemstack.getItem() == DIItems.armorObsidianBoots){
			
			return Dimensional_Items.modID + ":textures/models/armor/obsidian_layer_1.png";
		}
		
		else if(itemstack.getItem() == DIItems.armorObsidianLeggings){
			
			return Dimensional_Items.modID + ":textures/models/armor/obsidian_layer_2.png";
		}
		
		else{
			return null;
		}
	}

}

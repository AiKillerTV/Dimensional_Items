package com.unwisedeadkilla.dimensional_items.items.armor;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LavaArmor extends ItemArmor{

	public LavaArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":LavaHelmet");
		}else if (slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":LavaChestplate");
			
		}else if (slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":LavaLeggings");
			
		}else if (slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":LavaBoots");
	}
		
	}
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String Type){
		if (itemstack.getItem() == DIItems.armorLavaHelmet || itemstack.getItem() == DIItems.armorLavaChestplate || itemstack.getItem() == DIItems.armorLavaBoots){
			return Dimensional_Items.modID + ":textures/models/armor/lava_layer_1.png";
		}
		else if (itemstack.getItem() == DIItems.armorLavaLeggings){
			return Dimensional_Items.modID + ":textures/models/armor/lava_layer_2.png";
		}
		else{
			return null;
		}
	}

}

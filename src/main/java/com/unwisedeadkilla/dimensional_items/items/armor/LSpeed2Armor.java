package com.unwisedeadkilla.dimensional_items.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

public class LSpeed2Armor extends ItemArmor{

	public LSpeed2Armor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":SpeedHelmet");
		}else if(slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":SpeedChestplate");
		}else if(slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":SpeedLeggings");
		}else if(slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":SpeedBoots");
		}
	}
	
	public String getArmorTexture(ItemStack is, Entity entity, int slot, String Type){
		if(is.getItem() == DIItems.armorSpeed2Helmet || is.getItem() == DIItems.armorSpeed2Chestplate || is.getItem() == DIItems.armorLeatherSpeed2Boots){
			return Dimensional_Items.modID + ":textures/models/armor/speed_layer_1.png";
		}
		
		else if(is.getItem() == DIItems.armorSpeed2Leggings){
			return Dimensional_Items.modID + ":textures/models/armor/speed_layer_2.png";
		}else{
			return null;
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer ep, ItemStack is){
		
		if(is.getItem() == DIItems.armorSpeed2Helmet){
			return;
		}
		
		else if(is.getItem() == DIItems.armorSpeed2Chestplate){
			return;
		}
		
		else if(is.getItem() == DIItems.armorSpeed2Leggings){
			return;
		}
		
		else if(is.getItem() == DIItems.armorLeatherSpeed2Boots){
			ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 0, 1));
		}
	}

}

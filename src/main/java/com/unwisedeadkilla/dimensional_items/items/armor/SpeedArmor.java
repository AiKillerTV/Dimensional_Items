package com.unwisedeadkilla.dimensional_items.items.armor;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;
import com.unwisedeadkilla.dimensional_items.items.DIItems;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SpeedArmor extends ItemArmor{

	public SpeedArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		
		this.setCreativeTab(Dimensional_Items.tabDimensionalItems);
		
		if(slot == 0){
			this.setTextureName(Dimensional_Items.modID + ":SpeedHelmet");
		}else if(slot == 1){
			this.setTextureName(Dimensional_Items.modID + ":SpeedChestplate");
		}else if(slot == 2){
			this.setTextureName(Dimensional_Items.modID + ":SpeedLegggings");
		}else if(slot == 3){
			this.setTextureName(Dimensional_Items.modID + ":SpeedBoots");
		}
	}
	
	public String getArmorTexture(ItemStack is, Entity entity, int slot, String Type){
		if(is.getItem() == DIItems.armorSpeedHelmet || is.getItem() == DIItems.armorSpeedChestplate || is.getItem() == DIItems.armorLeatherSpeedBoots){
			return Dimensional_Items.modID + ":textures/models/armor/speed_layer_1.png";
		}
		
		else if(is.getItem() == DIItems.armorSpeedLeggings){
			return Dimensional_Items.modID + ":textures/models/armor/speed_layer_2.png";
		}else{
			return null;
		}
	}
	
	public void onCreated(ItemStack is, World world, EntityPlayer ep){
		
		if(is.getItem() == DIItems.armorSpeedHelmet){
			return;
		}else if(is.getItem() == DIItems.armorSpeedChestplate){
			return;
		}else if(is.getItem() == DIItems.armorSpeedLeggings){
			return;
		}else if(is.getItem() == DIItems.armorLeatherSpeedBoots){
			is.addEnchantment(Enchantment.unbreaking, 10);
			is.addEnchantment(Enchantment.featherFalling, 10);
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer ep, ItemStack is){
		
		if(is.getItem() == DIItems.armorSpeedHelmet){
			return;
		}
		
		else if(is.getItem() == DIItems.armorSpeedChestplate){
			return;
		}
		
		else if(is.getItem() == DIItems.armorSpeedLeggings){
			return;
		}
		
		else if(is.getItem() == DIItems.armorLeatherSpeedBoots){
			ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 0, 0));
		}
	}

}

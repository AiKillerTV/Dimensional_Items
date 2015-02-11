package com.unwisedeadkilla.dimensional_items;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import com.unwisedeadkilla.dimensional_items.items.DIItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingHandler {
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event){
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++){
			if(event.craftMatrix.getStackInSlot(i) != null){
				
				ItemStack item0 = event.craftMatrix.getStackInSlot(i);
				if(item0 != null && item0.getItem() == DIItems.toolChisel){
					ItemStack k = new ItemStack(DIItems.toolChisel, 2, (item0.getItemDamage() + 1));
					
					if (k.getItemDamage() >= k.getMaxDamage()){
						k.stackSize--;
					}
					
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}

}

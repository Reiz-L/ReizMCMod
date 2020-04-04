package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class IceChestplate extends ArmorBase{

	public IceChestplate() {
		super("ice_chestplate", ItemInit.ICE_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, CreativeTabInit.REIZMOD);
	}

}

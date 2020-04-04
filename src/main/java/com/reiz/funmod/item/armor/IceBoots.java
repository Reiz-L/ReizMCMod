package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class IceBoots extends ArmorBase{

	public IceBoots() {
		super("ice_boots", ItemInit.ICE_ARMOR_MATERIAL, 4, EntityEquipmentSlot.FEET, CreativeTabInit.REIZMOD);
	}

}

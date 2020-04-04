package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class IceLeggings extends ArmorBase{

	public IceLeggings() {
		super("ice_leggings", ItemInit.ICE_ARMOR_MATERIAL, 3, EntityEquipmentSlot.LEGS, CreativeTabInit.REIZMOD);
	}

}

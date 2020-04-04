package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class IceHelmet extends ArmorBase{

	public IceHelmet() {
		super("ice_helmet", ItemInit.ICE_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD, CreativeTabInit.REIZMOD);
	}

}

package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ObsidianChestplate extends ArmorBase{

	public ObsidianChestplate() {
		super("obsidian_chestplate", ItemInit.OBSIDIAN_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, CreativeTabInit.REIZMOD);
	}

}

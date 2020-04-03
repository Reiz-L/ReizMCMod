package com.reiz.funmod.item.armor;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ObsidianHelmet extends ArmorBase{

	public ObsidianHelmet() {
		super("obsidian_helmet", ItemInit.OBSIDIAN_ARMOR_MATERIAL, 1, EntityEquipmentSlot.HEAD, CreativeTabInit.REIZMOD);
	}

}

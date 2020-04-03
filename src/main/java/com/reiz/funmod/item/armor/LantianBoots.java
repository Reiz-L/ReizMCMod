package com.reiz.funmod.item.armor;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LantianBoots extends ArmorBase{

	public LantianBoots() {
		super("lantian_boots",ItemInit.LANTIAN_ARMOR_MATERIAL, 4, EntityEquipmentSlot.FEET, CreativeTabInit.REIZMOD);
		
	}
}

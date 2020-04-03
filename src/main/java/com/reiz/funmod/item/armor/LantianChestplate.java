package com.reiz.funmod.item.armor;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LantianChestplate extends ArmorBase{

	public LantianChestplate() {
		super("lantian_chestplate", ItemInit.LANTIAN_ARMOR_MATERIAL, 2, EntityEquipmentSlot.CHEST, CreativeTabInit.REIZMOD);
		
	}
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("穿上你就和蓝天紧紧的拥抱在了一起!呕!!");
	}
}
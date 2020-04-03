package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class machineCore extends ItemBase{

	public machineCore() {
		super("machine_core", CreativeTabInit.REIZMOD);
	}
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("§e这个是i7不知道什么型号的CPU,你不能吃它！");
	}
}

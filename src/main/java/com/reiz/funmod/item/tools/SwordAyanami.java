package com.reiz.funmod.item.tools;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SwordAyanami extends ToolSword{

	public SwordAyanami() {
		super("ayanami_sword", ItemInit.MATERIAL_XINZHIMOFANG, CreativeTabInit.REIZMOD);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("§eThis weapon is Azur Lane's Character ayanami's Sword!");
	}
}

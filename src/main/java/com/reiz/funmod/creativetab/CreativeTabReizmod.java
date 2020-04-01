package com.reiz.funmod.creativetab;

import com.reiz.funmod.blocksInit.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabReizmod extends CreativeTabs{

	public CreativeTabReizmod() {
		super("ReizMod");
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO 自动生成的方法存根
		return new ItemStack(BlockInit.SUPERHARD);
	}

}

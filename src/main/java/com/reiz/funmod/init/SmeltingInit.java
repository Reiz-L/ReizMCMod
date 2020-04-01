package com.reiz.funmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.reiz.funmod.item.ModItems;

import net.minecraft.init.Items;

public class SmeltingInit {
	public static void init() {
		register(new ItemStack(Items.APPLE), new ItemStack(Items.BOOK), 20);
		register(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER), 20);
		register(new ItemStack(ModItems.LANTIAN_ASS), new ItemStack(ModItems.LANTIAN_INGOT), 25);
		register(new ItemStack(Items.LEATHER), new ItemStack(Items.BEEF), 25);
		register(new ItemStack(ModItems.MEIQIZHAO), new ItemStack(ModItems.RTX2080TI), 30);
	}
	
	private static void register(ItemStack front,ItemStack after,float xp) {
		GameRegistry.addSmelting(front, after, xp);
	}
}

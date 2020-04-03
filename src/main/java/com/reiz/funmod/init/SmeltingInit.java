package com.reiz.funmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.reiz.funmod.blocksInit.BlockInit;
import com.reiz.funmod.item.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class SmeltingInit {
	public static void init() {
		register(new ItemStack(Items.APPLE), new ItemStack(Items.BOOK), 20);
		register(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER), 20);
		register(new ItemStack(ItemInit.LANTIAN_ASS), new ItemStack(ItemInit.LANTIAN_INGOT), 25);
		register(new ItemStack(Items.LEATHER), new ItemStack(Items.BEEF), 25);
		register(new ItemStack(BlockInit.MEIQIZHAO_BLOCK), new ItemStack(ItemInit.RTX2080TI), 30);
		register(new ItemStack(Items.IRON_DOOR), new ItemStack(ItemInit.LANTIAN_ASS), 25);
		register(new ItemStack(Blocks.OBSIDIAN), new ItemStack(ItemInit.OBSIDIAN_INGOT), 30);
	}
	
	private static void register(ItemStack front,ItemStack after,float xp) {
		GameRegistry.addSmelting(front, after, xp);
	}
}

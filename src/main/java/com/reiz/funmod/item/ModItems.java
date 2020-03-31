package com.reiz.funmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final Item LANTIAN_INGOT;
	public static final Item LANTIAN_ASS;
	static
	{
		LANTIAN_INGOT = ItemLoader.getByName("item.lantian_ingot");
		LANTIAN_ASS = ItemLoader.getByName("item.lantian_ass");
	}
	
	
}

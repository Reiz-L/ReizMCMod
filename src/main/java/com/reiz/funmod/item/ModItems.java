package com.reiz.funmod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final Item LANTIAN_INGOT;
	public static final Item LANTIAN_ASS;
	public static final Item RTX2080TI;
	public static final Item IGNITED_2080TI;
	public static final Item IRON_SHELL;
	public static final Item MEIQIZHAO;
	public static final Item MACHINE_CORE;
	static
	{
		LANTIAN_INGOT = ItemLoader.getByName("item.lantian_ingot");
		LANTIAN_ASS = ItemLoader.getByName("item.lantian_ass");
		RTX2080TI = ItemLoader.getByName("item.rtx2080ti");
		IGNITED_2080TI = ItemLoader.getByName("item.ignited_2080ti");
		IRON_SHELL = ItemLoader.getByName("iron_shell");
		MEIQIZHAO = ItemLoader.getByName("meiqizhao");
		MACHINE_CORE = ItemLoader.getByName("machine_core");
	}
	
	
}

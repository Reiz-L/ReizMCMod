package com.reiz.funmod.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemInitModel {
	public static void init() {
		register(ItemInit.IGNITED_2080TI);
		register(ItemInit.IRON_SHELL);
		register(ItemInit.LANTIAN_ASS);
		register(ItemInit.LANTIAN_INGOT);
		register(ItemInit.MACHINE_CORE);
		register(ItemInit.RTX2080TI);
	}
	public static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
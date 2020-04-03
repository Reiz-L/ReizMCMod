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
		register(ItemInit.RECORDER);
		register(ItemInit.BLACK_BREAD);
		register(ItemInit.LANTIAN_FLESH);
		register(ItemInit.EXPERIENCE_CARDB);
		register(ItemInit.EXPERIENCE_CARDN);
		register(ItemInit.EXPERIENCE_CARDA);
		register(ItemInit.EXPERIENCE_CARDU);
		register(ItemInit.EXPERIENCE_CARDS);
		register(ItemInit.LANTIAN_SWORD);
		register(ItemInit.LANTIAN_PICKAXE);
		register(ItemInit.LANTIAN_AXE);
		register(ItemInit.LANTIAN_HELMET);
		register(ItemInit.LANTIAN_CHESTPLATE);
		register(ItemInit.LANTIAN_LEGGINGS);
		register(ItemInit.LANTIAN_BOOTS);
		register(ItemInit.OBSIDIAN_HELMET);
		register(ItemInit.OBSIDIAN_CHESTPLATE);
		register(ItemInit.OBSIDIAN_LEGGINGS);
		register(ItemInit.OBSIDIAN_BOOTS);
		register(ItemInit.OBSIDIAN_SWORD);
		register(ItemInit.OBSIDIAN_AXE);
		register(ItemInit.OBSIDIAN_PICKAXE);
		register(ItemInit.OBSIDIAN_INGOT);
		register(ItemInit.OBSIDIAN_SPADE);
		register(ItemInit.OBSIDIAN_PICKKAXE);
		register(ItemInit.AYANAMI_SWORD);
		register(ItemInit.XINZHIMOFANG);
	}
	public static void register(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}

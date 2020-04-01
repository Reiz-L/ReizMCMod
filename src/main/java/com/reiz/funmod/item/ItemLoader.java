package com.reiz.funmod.item;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.creativetab.CreativeTabReizmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "reizmod")
public class ItemLoader {
	private static Item[] items = {
		new Item().setUnlocalizedName("lantian_ingot").setRegistryName("lantian_ingot").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("lantian_ass").setRegistryName("lantian_ass").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("rtx2080ti").setRegistryName("rtx2080ti").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("ignited_2080ti").setRegistryName("ignited_2080ti").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("iron_shell").setRegistryName("iron_shell").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("meiqizhao").setRegistryName("meiqizhao").setCreativeTab(CreativeTabInit.REIZMOD),
		new Item().setUnlocalizedName("machine_core").setRegistryName("machine_core").setCreativeTab(CreativeTabInit.REIZMOD)
	};
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for(Item item : items){
			//event.getRegistry().register(item);
			ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(), "inventory"));
			event.getRegistry().register(item);
		}
	}
	public static Item getByName(String name){
		for(Item item:items)
		if(item.getUnlocalizedName().equals(name))
		return item;
		return Items.AIR;
	}
	
	
}
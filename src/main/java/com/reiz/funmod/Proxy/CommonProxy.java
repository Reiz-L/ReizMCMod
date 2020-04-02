package com.reiz.funmod.Proxy;

import com.reiz.funmod.blocksInit.BlockInit;
import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.event.OnPlaced;
import com.reiz.funmod.init.FuelInit;
import com.reiz.funmod.init.SmeltingInit;
import com.reiz.funmod.item.ItemInit;
import com.reiz.funmod.item.ItemInitModel;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event){
		new ItemInit();
		ItemInitModel.init();
		new	BlockInit();
		new CreativeTabInit();
	}
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new OnPlaced());
	}
	public void postInit(FMLPostInitializationEvent event){
		SmeltingInit.init();
		FuelInit.init();
	}
}

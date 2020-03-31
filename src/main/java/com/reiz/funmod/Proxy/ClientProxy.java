package com.reiz.funmod.Proxy;

import net.minecraftforge.client.model.ModelLoader;

import com.reiz.funmod.blocksInit.BlockInitModel;

import net.minecraft.item.Item;
import net.minecraft.util.datafix.fixes.ItemIntIDToString;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		BlockInitModel.init();
		
	}
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
	}
	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
	
}

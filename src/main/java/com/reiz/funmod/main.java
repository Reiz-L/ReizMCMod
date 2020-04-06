package com.reiz.funmod;

import com.reiz.funmod.util.Reference;
import com.reiz.funmod.util.Util;
import com.reiz.funmod.Proxy.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.NAME,modid = Reference.MODID , version = Reference.VERSION)
public class main {
	public static final String MODID = "reizmod";
    public static final String NAME = "Reiz's Mod";
    public static final String VERSION = "1.0.7";
	@Instance
	public static main instance = new main();
	
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS,clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		Util.logger = event.getModLog();
		Util.logger.warn("It's PreInit!");
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Util.logger.warn("It's Init!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		Util.logger.warn("It's PostInit!");
	}
}

package com.reiz.funmod.init;

import com.reiz.funmod.item.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FuelInit {
	public static void init() {
		register(new ItemStack(ItemInit.LANTIAN_ASS), 1000);
	}
	public static void register(ItemStack fuelStack,int time) {
		GameRegistry.registerFuelHandler(new IFuelHandler() {
			
			@Override
			public int getBurnTime(ItemStack fuel) {
				// TODO 自动生成的方法存根
				return fuelStack != fuel ? 0: time;
			}
		});
	}
}

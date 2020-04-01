package com.reiz.funmod.init;

import com.reiz.funmod.item.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FuelInit {
	public static void init() {
		register(new ItemStack(ModItems.LANTIAN_ASS), 1000);
	}
	public static void register(ItemStack fuelStack,int time) {
		GameRegistry.registerFuelHandler(new IFuelHandler() {
			
			@Override
			public int getBurnTime(ItemStack fuel) {
				// TODO �Զ����ɵķ������
				return fuelStack != fuel ? 0: time;
			}
		});
	}
}

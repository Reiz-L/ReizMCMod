package com.reiz.funmod.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolPickaxe extends ItemPickaxe{

	protected ToolPickaxe(String name,ToolMaterial material,CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}
	
}

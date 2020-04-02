package com.reiz.funmod.item.tools;

import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolSword extends ItemSword {
	public ToolSword(String name,ToolMaterial material,CreativeTabs tab) {
		//super(material);
		//setUnlocalizedName(name);
		//setCreativeTab(CreativeTabInit.REIZMOD);
		//setRegistryName(name);
		super(material);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}
}

package com.reiz.funmod.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolHoe extends ItemHoe{

	public ToolHoe(String name,CreativeTabs tab,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}

}

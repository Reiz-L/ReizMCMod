package com.reiz.funmod.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolSpade extends ItemSpade{

	public ToolSpade(String name,CreativeTabs tab,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}

}

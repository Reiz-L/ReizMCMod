package com.reiz.funmod.item.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolAxe extends ItemAxe{

	protected ToolAxe(String name,ToolMaterial material, float damage, float speed,CreativeTabs tab) {
		super(material, damage, speed);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}

}

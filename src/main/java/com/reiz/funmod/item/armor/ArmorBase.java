package com.reiz.funmod.item.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmorBase extends ItemArmor{

	public ArmorBase(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,CreativeTabs tab) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(name).setCreativeTab(tab);
		ForgeRegistries.ITEMS.register(this.setRegistryName(name));
	}

}

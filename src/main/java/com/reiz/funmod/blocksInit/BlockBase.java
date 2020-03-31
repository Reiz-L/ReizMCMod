package com.reiz.funmod.blocksInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockBase extends Block{
	public BlockBase(Material material,SoundType type,String name,CreativeTabs tab,float hardness)
	{
		super(material);
		this.setSoundType(type);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		
		if (hardness < 0) {
			this.setBlockUnbreakable();
		}else {
			this.setHardness(hardness);
		}
		ForgeRegistries.BLOCKS.register(this.setRegistryName(name));
		ForgeRegistries.ITEMS.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}

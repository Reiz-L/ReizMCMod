package com.reiz.funmod.blocks;

import com.reiz.funmod.blocksInit.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SuperHardBlock extends BlockBase{
	public SuperHardBlock(){
		super(Material.GLASS, SoundType.GLASS, "superhard_block", CreativeTabs.BUILDING_BLOCKS, 1900);
		this.setHarvestLevel("pickaxe", 3);
	}
}

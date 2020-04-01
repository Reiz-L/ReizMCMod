package com.reiz.funmod.blocks;

import com.reiz.funmod.blocksInit.BlockBase;
import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.creativetab.CreativeTabReizmod;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SuperHardBlock extends BlockBase{
	public SuperHardBlock(){
		super(Material.GLASS, SoundType.GLASS, "superhard_block", CreativeTabInit.REIZMOD, 3000);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(600.0f);
		this.setLightOpacity(0);
		this.setLightLevel(3);
	}
}

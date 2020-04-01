package com.reiz.funmod.blocks;

import com.reiz.funmod.blocksInit.BlockBase;
import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MeiqizhaoBlock extends BlockBase{
	public MeiqizhaoBlock(){
		super(Material.IRON, SoundType.ANVIL, "meiqizhao_block", CreativeTabInit.REIZMOD, 10);
		this.setHarvestLevel("pickaxe", 1);
	}
}

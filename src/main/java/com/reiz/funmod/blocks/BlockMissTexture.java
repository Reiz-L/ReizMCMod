package com.reiz.funmod.blocks;

import com.reiz.funmod.blocksInit.BlockBase;
import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMissTexture extends BlockBase{
	public BlockMissTexture() {
		super(Material.GLASS, SoundType.GLASS, "miss_block", CreativeTabInit.REIZMOD, 5);
		this.setHarvestLevel("pickaxe", 2);
	}
}

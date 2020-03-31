package com.reiz.funmod.blocks;

import com.reiz.funmod.blocksInit.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLantian extends BlockBase{
	public BlockLantian() {
		super(Material.ROCK, SoundType.STONE, "lantian_block", CreativeTabs.BUILDING_BLOCKS, 5);
		this.setHarvestLevel("pickaxe", 1);
	}
}

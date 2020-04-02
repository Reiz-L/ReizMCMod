package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class Recorder extends ItemBase{
	public static boolean isStarted = false;
	public Recorder() {
		super("recorder", CreativeTabInit.REIZMOD);
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("On Rigth Clicked Can Start Record!");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (!worldIn.isRemote) {
			if (!isStarted) {
				isStarted = true;
				playerIn.sendMessage(new TextComponentString("¡ìaStart Record!"));
			}else {
				isStarted = false;
				playerIn.sendMessage(new TextComponentString("¡ìcClosed Record!"));
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
}

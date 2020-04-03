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
		list.add("§6拿着右键能开始记录!");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (!worldIn.isRemote) {
			if (!isStarted) {
				isStarted = true;
				playerIn.sendMessage(new TextComponentString("§a开始记录!"));
			}else {
				isStarted = false;
				playerIn.sendMessage(new TextComponentString("§c已关闭了记录!"));
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		if (isStarted == true) {
			isStarted = false;
			player.sendMessage(new TextComponentString("§c你丢掉了记录器，因此关闭记录!"));
			
		}
		return super.onDroppedByPlayer(item, player);
	}
	
	
}

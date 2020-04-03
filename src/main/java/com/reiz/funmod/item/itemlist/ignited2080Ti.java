package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class ignited2080Ti extends ItemBase{

	public ignited2080Ti() {
		super("ignited_2080ti", CreativeTabInit.REIZMOD);
	}
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("这是个点燃的极其危险的煤气灶");
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ActionResult<ItemStack> ar = super.onItemRightClick(worldIn, playerIn, handIn);
		ItemStack itemstack = ar.getResult();
		ItemStack itemstack1 = playerIn.getHeldItem(handIn);
		int x = (int) playerIn.posX;
		int y = (int) playerIn.posY;
		int z = (int) playerIn.posZ;
		if (!worldIn.isRemote) {
			worldIn.createExplosion(null, (int) x, (int) y, (int) z, (float) 50, true);
			playerIn.sendMessage(new TextComponentString("你妈炸了！！！"));
			
			for (int i = 0; i < playerIn.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack2 = playerIn.inventory.getStackInSlot(i);

                if (this.isThis(itemstack2))
                {
                	playerIn.inventory.removeStackFromSlot(i);
                }
            }
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	protected boolean isThis(ItemStack stack)
    {
        return stack.getItem() instanceof ignited2080Ti;
    }
	
}

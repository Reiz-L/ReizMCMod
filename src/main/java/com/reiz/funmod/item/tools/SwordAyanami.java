package com.reiz.funmod.item.tools;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class SwordAyanami extends ToolSword{

	public SwordAyanami() {
		super("ayanami_sword", ItemInit.MATERIAL_XINZHIMOFANG, CreativeTabInit.REIZMOD);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("§eThis weapon is Azur Lane's Character ayanami's Sword!");
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (!worldIn.isRemote) {
			playerIn.sendMessage(new TextComponentString("§aYou get some buffs"));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION));
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	
}

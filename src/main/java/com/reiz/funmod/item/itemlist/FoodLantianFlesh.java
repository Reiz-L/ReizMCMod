package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class FoodLantianFlesh extends ItemFood{

	public FoodLantianFlesh() {
		super(2,0.4F,true);
		this.setUnlocalizedName("lantian_flesh");
		ForgeRegistries.ITEMS.register(this.setRegistryName("lantian_flesh"));
		this.setCreativeTab(CreativeTabInit.REIZMOD);
		this.setAlwaysEdible();
		
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("��6This Food is lantian's flesh,That's his ass flesh!");
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.HUNGER));
			player.addExperience(10);
			player.sendMessage(new TextComponentString("§aYou ate lantian's flesh,it's like eating shit!"));
			player.sendMessage(new TextComponentString("§6but,you got 10exp"));
		}
		super.onFoodEaten(stack, worldIn, player);
	}
	
	

}

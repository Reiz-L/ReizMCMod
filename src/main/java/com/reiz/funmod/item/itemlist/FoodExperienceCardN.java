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

public class FoodExperienceCardN extends ItemFood{

	public FoodExperienceCardN() {
		super(4, 0.2F,true);
		this.setUnlocalizedName("experience_cardn");
		ForgeRegistries.ITEMS.register(this.setRegistryName("experience_cardn"));
		this.setCreativeTab(CreativeTabInit.REIZMOD);
		this.setAlwaysEdible();
	}
	
	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("This is Arknight's Normal Experience Card!");
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE));
			player.addExperience(20);
			player.sendMessage(new TextComponentString("You ate the Normal Experience Card,Got 20 Exp!"));
		}
		super.onFoodEaten(stack, worldIn, player);
	}
	
}

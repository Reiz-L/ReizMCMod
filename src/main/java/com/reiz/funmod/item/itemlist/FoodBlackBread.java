package com.reiz.funmod.item.itemlist;

import java.util.List;

import com.reiz.funmod.creativetab.CreativeTabInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class FoodBlackBread extends ItemFood{

	public FoodBlackBread() {
		super(4, 0.8F,true);
		this.setCreativeTab(CreativeTabInit.REIZMOD);
		this.setAlwaysEdible();
		this.setUnlocalizedName("black_bread");
		ForgeRegistries.ITEMS.register(this.setRegistryName("black_bread"));
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if (!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.LUCK));
		}
		super.onFoodEaten(stack, worldIn, player);
	}

	@Override
	public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
		super.addInformation(itemstack, world, list, flag);
		list.add("¡ìeThis Food is lantianDog's food");
	}
}

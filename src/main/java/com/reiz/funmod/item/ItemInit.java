package com.reiz.funmod.item;

import com.reiz.funmod.item.itemlist.FoodBlackBread;
import com.reiz.funmod.item.itemlist.FoodExperienceCardA;
import com.reiz.funmod.item.itemlist.FoodExperienceCardN;
import com.reiz.funmod.item.itemlist.FoodExperienceCardU;
import com.reiz.funmod.item.itemlist.FoodLantianFlesh;
import com.reiz.funmod.item.itemlist.Recorder;
import com.reiz.funmod.item.itemlist.ignited2080Ti;
import com.reiz.funmod.item.itemlist.ironShell;
import com.reiz.funmod.item.itemlist.lantianAss;
import com.reiz.funmod.item.itemlist.lantianIngot;
import com.reiz.funmod.item.itemlist.machineCore;
import com.reiz.funmod.item.itemlist.rtx2080Ti;
import com.reiz.funmod.item.tools.SwordLantian;
import com.reiz.funmod.item.tools.ToolSword;
import com.reiz.funmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;



public class ItemInit {
	public static final Item LANTIAN_INGOT = new lantianIngot();
	public static final Item LANTIAN_ASS = new lantianAss();
	public static final Item RTX2080TI = new rtx2080Ti();
	public static final Item IGNITED_2080TI = new ignited2080Ti();
	public static final Item IRON_SHELL = new ironShell();
	public static final Item MACHINE_CORE = new machineCore();
	public static final Item RECORDER = new Recorder();
	public static final Item BLACK_BREAD = new FoodBlackBread();
	public static final Item LANTIAN_FLESH = new FoodLantianFlesh();
	public static final Item EXPERIENCE_CARDN = new FoodExperienceCardN();
	public static final Item EXPERIENCE_CARDA = new FoodExperienceCardA();
	public static final Item EXPERIENCE_CARDU = new FoodExperienceCardU();
	//tools Material
	public static final ToolMaterial MATERIAL_LANTIAN = EnumHelper.addToolMaterial("lantian_tool_material", 2, 350, 7.0F, 2.5F, 14);
	
	//tools
	public static final ItemSword LANTIAN_SWORD = new SwordLantian();
	
}

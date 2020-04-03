package com.reiz.funmod.item;

import com.reiz.funmod.creativetab.CreativeTabInit;
import com.reiz.funmod.item.armor.ArmorBase;
import com.reiz.funmod.item.armor.LantianBoots;
import com.reiz.funmod.item.armor.LantianChestplate;
import com.reiz.funmod.item.armor.LantianHelmet;
import com.reiz.funmod.item.armor.LantianLeggings;
import com.reiz.funmod.item.armor.ObsidianBoots;
import com.reiz.funmod.item.armor.ObsidianChestplate;
import com.reiz.funmod.item.armor.ObsidianHelmet;
import com.reiz.funmod.item.armor.ObsidianLeggings;
import com.reiz.funmod.item.itemlist.FoodBlackBread;
import com.reiz.funmod.item.itemlist.FoodExperienceCardA;
import com.reiz.funmod.item.itemlist.FoodExperienceCardB;
import com.reiz.funmod.item.itemlist.FoodExperienceCardN;
import com.reiz.funmod.item.itemlist.FoodExperienceCardS;
import com.reiz.funmod.item.itemlist.FoodExperienceCardU;
import com.reiz.funmod.item.itemlist.FoodLantianFlesh;
import com.reiz.funmod.item.itemlist.Recorder;
import com.reiz.funmod.item.itemlist.ignited2080Ti;
import com.reiz.funmod.item.itemlist.ironShell;
import com.reiz.funmod.item.itemlist.lantianAss;
import com.reiz.funmod.item.itemlist.lantianIngot;
import com.reiz.funmod.item.itemlist.machineCore;
import com.reiz.funmod.item.itemlist.obsidianIngot;
import com.reiz.funmod.item.itemlist.rtx2080Ti;
import com.reiz.funmod.item.itemlist.xinzhimofang;
import com.reiz.funmod.item.tools.AxeLantian;
import com.reiz.funmod.item.tools.AxeObsidian;
import com.reiz.funmod.item.tools.PickaxeLantian;
import com.reiz.funmod.item.tools.PickaxeObsidian;
import com.reiz.funmod.item.tools.PickkaxeObsidian;
import com.reiz.funmod.item.tools.SpadeObsidian;
import com.reiz.funmod.item.tools.SwordAyanami;
import com.reiz.funmod.item.tools.SwordLantian;
import com.reiz.funmod.item.tools.SwordObsidian;
import com.reiz.funmod.item.tools.ToolSword;
import com.reiz.funmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
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
	public static final Item EXPERIENCE_CARDB = new FoodExperienceCardB();
	public static final Item EXPERIENCE_CARDN = new FoodExperienceCardN();
	public static final Item EXPERIENCE_CARDA = new FoodExperienceCardA();
	public static final Item EXPERIENCE_CARDU = new FoodExperienceCardU();
	public static final Item EXPERIENCE_CARDS = new FoodExperienceCardS();
	public static final Item OBSIDIAN_INGOT = new obsidianIngot();
	public static final Item XINZHIMOFANG = new xinzhimofang();
	//tools Material
	public static final ToolMaterial MATERIAL_LANTIAN = EnumHelper.addToolMaterial("lantian_tool_material", 2, 350, 7.0F, 2.5F, 14);
	public static final ArmorMaterial LANTIAN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("lantian_armor_material", Reference.MODID + ":lantian", 16, new int[] {3,6,6,3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("obsidian_tool_material", 4, 2500, 9.0F, 5.0F, 30);
	public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("obsidian_armor_material", Reference.MODID + ":obsidian", 20, new int[] {8,4,8,8}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial MATERIAL_XINZHIMOFANG = EnumHelper.addToolMaterial("xinzhimofang_tool_material", 3, 1080, 6.0F, 10.0F, 30);
	//tools
	public static final ItemSword LANTIAN_SWORD = new SwordLantian();
	public static final ItemPickaxe LANTIAN_PICKAXE = new PickaxeLantian();
	public static final ItemAxe LANTIAN_AXE = new AxeLantian();
	public static final ItemSword OBSIDIAN_SWORD = new SwordObsidian();
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new PickaxeObsidian();
	public static final ItemAxe OBSIDIAN_AXE = new AxeObsidian();
	public static final ItemSpade OBSIDIAN_SPADE = new SpadeObsidian();
	public static final ItemTool OBSIDIAN_PICKKAXE = new PickkaxeObsidian();
	public static final ItemSword AYANAMI_SWORD = new SwordAyanami();
	//Armor
	public static final Item LANTIAN_HELMET = new LantianHelmet();
	public static final Item LANTIAN_CHESTPLATE = new LantianChestplate();
	public static final Item LANTIAN_LEGGINGS = new LantianLeggings();
	public static final Item LANTIAN_BOOTS = new LantianBoots();
	public static final Item OBSIDIAN_HELMET = new ObsidianHelmet();
	public static final Item OBSIDIAN_CHESTPLATE = new ObsidianChestplate();
	public static final Item OBSIDIAN_LEGGINGS = new ObsidianLeggings();
	public static final Item OBSIDIAN_BOOTS = new ObsidianBoots();
}

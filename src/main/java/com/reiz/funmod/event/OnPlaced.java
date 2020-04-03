package com.reiz.funmod.event;

import com.reiz.funmod.item.itemlist.Recorder;
import com.reiz.funmod.util.Util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnPlaced {
	@SubscribeEvent
	public void OnBlockPlaced(PlaceEvent event) {
		if (!Recorder.isStarted) {
			Util.logger.warn("Not Found Recorder! - PlaceBlock");
		}else {
			
			event.getPlayer().sendMessage(new TextComponentString("你放下了一个方块: " + event.getPlacedBlock().getBlock().getLocalizedName()));
		}
		
	}
}

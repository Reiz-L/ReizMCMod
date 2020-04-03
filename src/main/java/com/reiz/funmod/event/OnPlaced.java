package com.reiz.funmod.event;

import com.reiz.funmod.item.itemlist.Recorder;
import com.reiz.funmod.item.itemlist.ignited2080Ti;
import com.reiz.funmod.util.Util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnPlaced {
	@SubscribeEvent
	public void OnBlockPlaced(PlaceEvent event) {
		if (!Recorder.isStarted) {
			Util.logger.warn("Not Started Recorder! - PlaceBlock");
		}else {
			
			event.getPlayer().sendMessage(new TextComponentString("You Placed a Block: " + event.getPlacedBlock().getBlock().getLocalizedName()));
		}
		
		
	}
	
}

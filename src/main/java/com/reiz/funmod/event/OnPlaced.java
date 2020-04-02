package com.reiz.funmod.event;

import com.reiz.funmod.item.itemlist.Recorder;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnPlaced {
	@SubscribeEvent
	public void OnBlockPlaced(PlaceEvent event) {
		if (!Recorder.isStarted) {
			System.out.println("not found recorder\n");
		}else {
			event.getPlayer().sendMessage(new TextComponentString("You placed a block : " + event.getPlacedBlock().getBlock().getLocalizedName()));
		}
	}
}

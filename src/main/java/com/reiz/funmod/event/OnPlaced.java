package com.reiz.funmod.event;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OnPlaced {
	@SubscribeEvent
	public void OnBlockPlaced(PlaceEvent event) {
		event.getPlayer().sendMessage(new TextComponentString("You placed a block : " + event.getPlacedBlock().getBlock().getLocalizedName()));
		
	}
}

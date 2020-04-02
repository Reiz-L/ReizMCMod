package com.reiz.funmod.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;

public class pickupItem {
	@SubscribeEvent
    public void OnpickupItem(EntityItemPickupEvent event) {
        System.out.println("Item picked up!");
        
    }
}

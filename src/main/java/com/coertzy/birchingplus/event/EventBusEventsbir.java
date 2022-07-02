package com.coertzy.birchingplus.event;


import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.entity.EntityTypesBP;
import com.coertzy.birchingplus.entity.custom.SpottedDeer;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BirchingPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEventsbir {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypesBP.SPOTTED_DEER.get(), SpottedDeer.setAttributes());
        event.put(EntityTypesBP.BIR_SQUIRREL.get(), SpottedDeer.setAttributes());
    }
}

package com.coertzy.birchingplus.world;

import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.world.gen.birTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BirchingPlus.MOD_ID)
public class birWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        birTreeGeneration.generateTrees(event);
    }
}

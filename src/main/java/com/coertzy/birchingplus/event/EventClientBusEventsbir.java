package com.coertzy.birchingplus.event;

import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.block.BirBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BirchingPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventClientBusEventsbir {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BirBlocks.YELLOW_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BirBlocks.DEAD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BirBlocks.ORANGE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BirBlocks.BIR_LEAVES.get(), RenderType.cutout());
    }
}

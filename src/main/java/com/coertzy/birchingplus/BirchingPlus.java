package com.coertzy.birchingplus;

import com.coertzy.birchingplus.block.BirBlocks;
import com.coertzy.birchingplus.entity.EntityTypesBP;
import com.coertzy.birchingplus.entity.client.BirSquirrelRenderer;
import com.coertzy.birchingplus.entity.client.SpottedDeerRenderer;
import com.coertzy.birchingplus.item.BirItems;
import com.coertzy.birchingplus.world.feature.PlacedFeaturesbir;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BirchingPlus.MOD_ID)
public class BirchingPlus
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "birchingplus";

    public BirchingPlus()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BirBlocks.register(eventBus);
        BirItems.register(eventBus);

        EntityTypesBP.register(eventBus);
        PlacedFeaturesbir.register(eventBus);

        GeckoLib.initialize();

        eventBus.addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(BirBlocks.DEER_HEAD.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BirBlocks.CARPENTRY_TABLE.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            EntityRenderers.register(EntityTypesBP.BIR_SQUIRREL.get(), BirSquirrelRenderer::new);
            EntityRenderers.register(EntityTypesBP.SPOTTED_DEER.get(), SpottedDeerRenderer::new);


        });
    }
}

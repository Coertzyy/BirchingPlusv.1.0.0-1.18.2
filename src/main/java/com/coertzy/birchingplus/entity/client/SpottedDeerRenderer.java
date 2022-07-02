package com.coertzy.birchingplus.entity.client;


import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.entity.EntityTypesBP;
import com.coertzy.birchingplus.entity.custom.SpottedDeer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SpottedDeerRenderer extends GeoEntityRenderer<SpottedDeer> {
    public SpottedDeerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SpottedDeerModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(SpottedDeer instance) {
        return new ResourceLocation(BirchingPlus.MOD_ID, "textures/entity/deer/spotted_deer.png");
    }

    @Override
    public RenderType getRenderType(SpottedDeer animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.8F, 0.8F, 0.8F);
        } else {
            stack.scale(1.0f, 1.0f, 1.0f);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypesBP.SPOTTED_DEER.get(), SpottedDeer.setAttributes());
    }
}

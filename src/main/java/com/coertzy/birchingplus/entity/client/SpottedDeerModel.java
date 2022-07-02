package com.coertzy.birchingplus.entity.client;


import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.entity.custom.SpottedDeer;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SpottedDeerModel extends AnimatedGeoModel<SpottedDeer> {


	@Override
	public ResourceLocation getModelLocation(SpottedDeer object) {
		return new ResourceLocation(BirchingPlus.MOD_ID, "geo/spotted_deer.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(SpottedDeer object) {
		return new ResourceLocation(BirchingPlus.MOD_ID, "textures/entity/deer/spotted_deer.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(SpottedDeer animatable) {
		return new ResourceLocation(BirchingPlus.MOD_ID, "animations/deer/spotted_deer_anim.json");
	}
}
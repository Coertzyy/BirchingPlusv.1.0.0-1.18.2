package com.coertzy.birchingplus.entity.client;

import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.entity.custom.BirSquirrel;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BirSquirrelModel extends AnimatedGeoModel<BirSquirrel> {


    @Override
    public ResourceLocation getModelLocation(BirSquirrel object) {
        return new ResourceLocation(BirchingPlus.MOD_ID, "geo/squirrel.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BirSquirrel object) {
        return new ResourceLocation(BirchingPlus.MOD_ID, "textures/entity/squirrel/birsquirrel.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BirSquirrel animatable) {
        return new ResourceLocation(BirchingPlus.MOD_ID, "animations/squirrel/squirrel_anim.json");
    }
}
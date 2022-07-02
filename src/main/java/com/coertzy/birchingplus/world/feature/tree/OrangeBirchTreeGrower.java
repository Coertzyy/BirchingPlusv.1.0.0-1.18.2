package com.coertzy.birchingplus.world.feature.tree;

import com.coertzy.birchingplus.world.feature.ConfiguredFeaturesbir;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class OrangeBirchTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_20435_, boolean p_24302_) {
        return p_24302_ ? TreeFeatures.BIRCH_BEES_005 : ConfiguredFeaturesbir.ORANGE_BIRCH_TREE;
    }
}

package com.coertzy.birchingplus.world.feature.tree;

import com.coertzy.birchingplus.world.feature.ConfiguredFeaturesbir;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.BirchTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class BirchConfigured extends BirchTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204316_, boolean p_204317_) {
        return ConfiguredFeaturesbir.BIRCH_TREE_CONFIG;
    }
}

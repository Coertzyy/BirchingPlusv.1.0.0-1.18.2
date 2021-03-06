package com.coertzy.birchingplus.world.feature.tree;

import com.coertzy.birchingplus.world.feature.ConfiguredFeaturesbir;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class YellowBirchTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return ConfiguredFeaturesbir.YELLOW_BIRCH_TREE;
    }
}

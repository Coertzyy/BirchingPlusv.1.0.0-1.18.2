package com.coertzy.birchingplus.world.feature.tree;

import com.coertzy.birchingplus.world.feature.ConfiguredFeaturesbir;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class DeadBirchTreeGrower extends AbstractTreeGrower {

    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_203243_, boolean p_201212_) {
        return ConfiguredFeaturesbir.DEAD_BIRCH_TREE;
    }
}

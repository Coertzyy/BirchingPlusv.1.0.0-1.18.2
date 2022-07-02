package com.coertzy.birchingplus.world.feature;

import com.coertzy.birchingplus.block.BirBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ConfiguredFeaturesbir {
    //Yellow Birch Tree//
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YELLOW_BIRCH_TREE =
            FeatureUtils.register("yellow_birch", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(5, 8, 3),
                    BlockStateProvider.simple(BirBlocks.YELLOW_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirt(BlockStateProvider.simple(Blocks.GRASS_BLOCK)).build());
    public static final Holder<PlacedFeature> YELLOW_BIRCH_CHECKED = PlacementUtils.register("yellow_birch_checked", YELLOW_BIRCH_TREE,
            PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> YELLOW_BIRCH_SPAWN =
            FeatureUtils.register("yellow_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(YELLOW_BIRCH_CHECKED,
                            0.1F)), YELLOW_BIRCH_CHECKED));
    //Orange Birch Tree//
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ORANGE_BIRCH_TREE =
            FeatureUtils.register("orange_birch", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(5, 8, 3),
                    BlockStateProvider.simple(BirBlocks.ORANGE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1))
                    .dirt(BlockStateProvider.simple(Blocks.GRASS_BLOCK)).build());
    public static final Holder<PlacedFeature> ORANGE_BIRCH_CHECKED = PlacementUtils.register("orange_birch_checked", ORANGE_BIRCH_TREE,
            PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ORANGE_BIRCH_SPAWN =
            FeatureUtils.register("orange_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ORANGE_BIRCH_CHECKED,
                            0.2F)), ORANGE_BIRCH_CHECKED));

    //Dead Birch//

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DEAD_BIRCH_TREE =
            FeatureUtils.register("dead_birch", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(6, 7, 2),
                    BlockStateProvider.simple(BirBlocks.DEAD_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(2, 2, 5))
                    .dirt(BlockStateProvider.simple(Blocks.GRASS_BLOCK)).build());
    public static final Holder<PlacedFeature> DEAD_BIRCH_CHECKED = PlacementUtils.register("dead_birch_checked", DEAD_BIRCH_TREE,
            PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DEAD_BIRCH_SPAWN =
            FeatureUtils.register("dead_birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(DEAD_BIRCH_CHECKED,
                            0.4F)), DEAD_BIRCH_CHECKED));

    //Birch Tree//

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> BIRCH_TREE_CONFIG =
            FeatureUtils.register("birch", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(5, 7, 2),
                    BlockStateProvider.simple(BirBlocks.BIR_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2))
                    .dirt(BlockStateProvider.simple(Blocks.GRASS_BLOCK)).build());
    public static final Holder<PlacedFeature> BIRCH_CHECKED = PlacementUtils.register("birch_checked", BIRCH_TREE_CONFIG,
            PlacementUtils.filteredByBlockSurvival(Blocks.BIRCH_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> BIRCH_SPAWN =
            FeatureUtils.register("birch_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(BIRCH_CHECKED,
                            0.3F)), BIRCH_CHECKED));
}

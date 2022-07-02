package com.coertzy.birchingplus.world.feature;

import com.coertzy.birchingplus.BirchingPlus;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PlacedFeaturesbir {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, BirchingPlus.MOD_ID);

    public static final RegistryObject<PlacedFeature> YELLOW_BIRCH_PLACED = PLACED_FEATURES.register("yellow_birch_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?, ?>>) (Holder<? extends ConfiguredFeature<?, ?>>)
                    ConfiguredFeaturesbir.YELLOW_BIRCH_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));

    public static final RegistryObject<PlacedFeature> ORANGE_BIRCH_PLACED = PLACED_FEATURES.register("orange_birch_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?, ?>>) (Holder<? extends ConfiguredFeature<?, ?>>)
                    ConfiguredFeaturesbir.ORANGE_BIRCH_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(2, 0.1f, 1))));

    public static final RegistryObject<PlacedFeature> DEAD_BIRCH_PLACED = PLACED_FEATURES.register("dead_birch_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?, ?>>) (Holder<? extends ConfiguredFeature<?, ?>>)
                    ConfiguredFeaturesbir.DEAD_BIRCH_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.1f, 1))));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}

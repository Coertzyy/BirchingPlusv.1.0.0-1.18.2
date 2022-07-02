package com.coertzy.birchingplus.entity;

import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.entity.custom.BirSquirrel;
import com.coertzy.birchingplus.entity.custom.SpottedDeer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypesBP {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, BirchingPlus.MOD_ID);
    public static final RegistryObject<EntityType<SpottedDeer>> SPOTTED_DEER =
            ENTITY_TYPES.register("spotted_deer",
                    () -> EntityType.Builder.of(SpottedDeer::new,
                                    MobCategory.CREATURE)
                            .sized(0.8f, 0.8f)
                            .build(new ResourceLocation(BirchingPlus.MOD_ID, "spotted_deer").toString()));

    public static final RegistryObject<EntityType<BirSquirrel>> BIR_SQUIRREL =
            ENTITY_TYPES.register("bir_squirrel",
                    () -> EntityType.Builder.of(BirSquirrel::new,
                                    MobCategory.CREATURE)
                            .sized(0.8f, 0.8f)
                            .build(new ResourceLocation(BirchingPlus.MOD_ID, "bir_squirrel").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

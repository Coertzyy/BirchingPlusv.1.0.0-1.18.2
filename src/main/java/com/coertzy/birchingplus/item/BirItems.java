package com.coertzy.birchingplus.item;

import com.coertzy.birchingplus.BirchFoods;
import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.CreativeModeTabBP;
import com.coertzy.birchingplus.entity.EntityTypesBP;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BirItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BirchingPlus.MOD_ID);

    public static final RegistryObject<Item> BIR_HAZELNUT = ITEMS.register("bir_hazelnut",
            () -> new Item(new Item.Properties().tab(CreativeModeTabBP.BIRCHINGPLUS).food(BirchFoods.BIR_HAZELNUT)));

    public static final RegistryObject<Item> BIR_SPOT_HIDE = ITEMS.register("bir_spot_hide",
            () -> new Item(new Item.Properties().tab(CreativeModeTabBP.BIRCHINGPLUS)));

    public static final RegistryObject<Item> SPOTDEER_SPAWN_EGG = ITEMS.register("spotdeer_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypesBP.SPOTTED_DEER,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(CreativeModeTabBP.BIRCHINGPLUS)));

    public static final RegistryObject<Item> SQUI_SPAWN_EGG = ITEMS.register("squi_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypesBP.BIR_SQUIRREL,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(CreativeModeTabBP.BIRCHINGPLUS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

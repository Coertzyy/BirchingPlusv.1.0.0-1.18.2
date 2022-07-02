package com.coertzy.birchingplus.block;

import com.coertzy.birchingplus.BirchingPlus;
import com.coertzy.birchingplus.block.custom.DeerHead;
import com.coertzy.birchingplus.block.custom.CarpentryTable;
import com.coertzy.birchingplus.CreativeModeTabBP;
import com.coertzy.birchingplus.item.BirItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BirBlocks {
    //Leaves//
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BirchingPlus.MOD_ID);

    public static final RegistryObject<Block> YELLOW_LEAVES = registerBlock("yellow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));

    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));

    public static final RegistryObject<Block> DEAD_LEAVES = registerBlock("dead_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));

    public static final RegistryObject<Block> BIR_LEAVES = registerBlock("bir_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));
    //Misc.//
    public static final RegistryObject<Block> DEER_HEAD = registerBlock("deer_head",
            () -> new DeerHead(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).noOcclusion(), CreativeModeTabBP.BIRCHINGPLUS));
    public static final RegistryObject<Block> CARPENTRY_TABLE = registerBlock("carpentry_table",
            () -> new CarpentryTable(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).noOcclusion(), CreativeModeTabBP.BIRCHINGPLUS));


//Block Registry//
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BirItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTabBP.BIRCHINGPLUS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    }

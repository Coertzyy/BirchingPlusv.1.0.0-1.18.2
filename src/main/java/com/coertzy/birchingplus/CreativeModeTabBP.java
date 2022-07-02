package com.coertzy.birchingplus;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class CreativeModeTabBP {
    public static final CreativeModeTab BIRCHINGPLUS = new CreativeModeTab("birchingplustab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.BIRCH_LEAVES);
        }
    };
}

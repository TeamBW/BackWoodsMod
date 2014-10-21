package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockAdvancedCraftingTable extends BlockTBW {

    public BlockAdvancedCraftingTable() {

        super(Material.wood);
        this.setBlockName("advancedCraftingTable");
        this.setStepSound(soundTypeWood);
    }
}
package com.chaka.thebackwoods.block.ore;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockSilverOre extends BlockTBW {

    public BlockSilverOre() {

        super(Material.rock);
        this.setBlockName("silverOre");
        this.setHarvestLevel("pickaxe", 1);
    }
}

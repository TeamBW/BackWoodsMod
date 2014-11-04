package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockRefinedObsidian extends BlockTBW {

    public BlockRefinedObsidian() {

        super(Material.rock);
        this.setBlockName("refinedObsidian");
        this.setStepSound(soundTypeStone);
        this.setHardness(20.0F);
    }
}
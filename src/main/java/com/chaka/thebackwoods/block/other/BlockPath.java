package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockPath extends BlockTBW {

    public BlockPath() {

        super(Material.rock);
        this.setBlockName("path");
        this.setStepSound(soundTypeStone);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockPath extends BlockTBW {

    public BlockPath() {

        super(Material.rock);
        this.setBlockName("path");
        this.setStepSound(soundTypeStone);
        this.getHarvestLevel(1);
    }
}
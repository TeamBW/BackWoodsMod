package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMossyPath extends BlockTBW {

    public BlockMossyPath() {

        super(Material.rock);
        this.setBlockName("mossyPath");
        this.setStepSound(soundTypeStone);
        this.getHarvestLevel(1);
    }
}
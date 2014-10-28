package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockSlab extends BlockTBW {

    public BlockSlab() {

        super(Material.rock);
        this.setBlockName("slab");
        this.setStepSound(soundTypeStone);
        this.setHardness(1.5F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
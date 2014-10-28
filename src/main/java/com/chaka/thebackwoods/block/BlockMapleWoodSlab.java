package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMapleWoodSlab extends BlockTBW {

    public BlockMapleWoodSlab() {

        super(Material.wood);
        this.setBlockName("mapleWoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
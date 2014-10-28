package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMossyDirt extends BlockTBW {

    public BlockMossyDirt() {

        super(Material.grass);
        this.setBlockName("mossyDirt");
        this.setStepSound(soundTypeGravel);
        this.setHardness(1.5F);
    }
}
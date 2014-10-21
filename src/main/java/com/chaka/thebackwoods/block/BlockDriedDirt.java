package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockDriedDirt extends BlockTBW {

    public BlockDriedDirt() {

        super(Material.ground);
        this.setBlockName("driedDirt");
        this.setStepSound(soundTypeGravel);
    }
}

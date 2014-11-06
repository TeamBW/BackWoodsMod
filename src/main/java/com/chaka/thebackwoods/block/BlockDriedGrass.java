package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockDriedGrass extends BlockTBW {

    public BlockDriedGrass() {

        super(Material.ground);
        this.setBlockName("driedGrass");
        this.setStepSound(soundTypeGravel);
        this.setHardness(1.5F);
    }
}

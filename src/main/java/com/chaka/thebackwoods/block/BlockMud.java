package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMud extends BlockTBW {

    public BlockMud() {

        super(Material.ground);
        this.setBlockName("mud");
        this.setStepSound(soundTypeGravel);
    }
}

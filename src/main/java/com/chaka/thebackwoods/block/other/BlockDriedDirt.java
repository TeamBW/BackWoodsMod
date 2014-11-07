package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockDriedDirt extends BlockTBW {

    public BlockDriedDirt() {

        super(Material.ground);
        this.setBlockName("driedDirt");
        this.setStepSound(soundTypeGravel);
        this.setHardness(1.5F);
    }
}

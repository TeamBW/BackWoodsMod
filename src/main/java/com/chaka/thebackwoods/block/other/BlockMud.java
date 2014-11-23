package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMud extends BlockTBW {

    public BlockMud() {

        super(Material.ground);
        this.setBlockName("mud");
        this.setStepSound(soundTypeGravel);
        this.setHardness(0.5F);
        this.setHarvestLevel("shovel", 2);
    }
}

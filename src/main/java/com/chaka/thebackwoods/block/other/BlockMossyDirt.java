package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMossyDirt extends BlockTBW {

    public BlockMossyDirt() {

        super(Material.grass);
        this.setBlockName("mossyDirt");
        this.setStepSound(soundTypeGravel);
        this.setHardness(1.5F);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMossyGranite extends BlockTBW {

    public BlockMossyGranite() {

        super(Material.rock);
        this.setBlockName("mossyGranite");
        this.setStepSound(soundTypeStone);
        this.getHarvestLevel(1);
    }
}
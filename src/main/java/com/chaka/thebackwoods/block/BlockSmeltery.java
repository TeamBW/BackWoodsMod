package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockSmeltery extends BlockTBW {

    public BlockSmeltery() {

        super(Material.rock);
        this.setBlockName("smeltery");
        this.setStepSound(soundTypeStone);
    }
}
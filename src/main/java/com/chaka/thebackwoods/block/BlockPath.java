package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import com.chaka.thebackwoods.api.BlockConstructors;

public class BlockPath extends BlockTBW {

    public BlockPath() {

        super(Material.rock);
        this.setBlockName("path");
        this.setStepSound(soundTypeStone);
        this.getHarvestLevel(1);
        this.setHardness(1.5F);
    }
}
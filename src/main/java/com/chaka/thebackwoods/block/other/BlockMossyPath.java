package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMossyPath extends BlockTBW {

    public BlockMossyPath() {

        super(Material.rock);
        this.setBlockName("mossyPath");
        this.setStepSound(soundTypeStone);
        this.getHarvestLevel(1);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
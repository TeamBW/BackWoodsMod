package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockGranite extends BlockTBW {

    public BlockGranite() {

        super(Material.rock);
        this.setBlockName("granite");
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
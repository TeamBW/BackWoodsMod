package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMapleWoodPlanks extends BlockTBW {

    public BlockMapleWoodPlanks() {

        super(Material.wood);
        this.setBlockName("mapleWoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
    }
}

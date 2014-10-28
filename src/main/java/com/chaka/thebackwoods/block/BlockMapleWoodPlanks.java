package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMapleWoodPlanks extends BlockTBW {

    public BlockMapleWoodPlanks() {

        super(Material.wood);
        this.setBlockName("mapleWoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }
}

package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockRedwoodPlanks extends BlockTBW {

    public BlockRedwoodPlanks() {

        super(Material.wood);
        this.setBlockName("redwoodPlanks");
        this.setStepSound(soundTypeWood);
    }
}
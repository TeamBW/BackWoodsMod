package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockRedwoodPlanks extends BlockTBW {

    public BlockRedwoodPlanks() {

        super(Material.wood);
        this.setBlockName("redwoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }
}
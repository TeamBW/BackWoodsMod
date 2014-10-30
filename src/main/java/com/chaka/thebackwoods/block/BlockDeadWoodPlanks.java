package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockDeadWoodPlanks extends BlockTBW {

    public BlockDeadWoodPlanks() {

        super(Material.wood);
        this.setBlockName("deadWoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.0F);
    }
}
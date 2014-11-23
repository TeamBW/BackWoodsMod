package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockDeadWoodPlanks extends BlockTBW {

    public BlockDeadWoodPlanks() {

        super(Material.wood);
        this.setBlockName("deadWoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.0F);
        this.setHarvestLevel("axe", 0);
    }
}
package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockGreatOakPlanks extends BlockTBW {

    public BlockGreatOakPlanks() {

        super(Material.wood);
        this.setBlockName("greatOakPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
    }
}

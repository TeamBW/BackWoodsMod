package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockGreatOakPlanks extends BlockTBW {

    public BlockGreatOakPlanks() {

        super(Material.wood);
        this.setBlockName("greatOakPlanks");
        this.setStepSound(soundTypeWood);
    }
}

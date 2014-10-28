package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockGreatOakWoodSlab extends BlockTBW {

    public BlockGreatOakWoodSlab() {

        super(Material.wood);
        this.setBlockName("greatOakWoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
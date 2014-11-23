package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockRedwoodSlab extends BlockTBW {

    public BlockRedwoodSlab() {

        super(Material.wood);
        this.setBlockName("redwoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        this.setHarvestLevel("axe", 0);
    }
}
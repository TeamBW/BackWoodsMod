package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockDeadWoodSlab extends BlockTBW {

    public BlockDeadWoodSlab() {

        super(Material.wood);
        this.setBlockName("deadWoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.0F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}
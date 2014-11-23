package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockQuickSand extends BlockTBW {

    public BlockQuickSand() {

        super(Material.web);
        this.setBlockName("quickSand");
        this.setStepSound(soundTypeSand);
        this.setHardness(0.5F);
        this.setHarvestLevel("shovel", 3);
    }
}

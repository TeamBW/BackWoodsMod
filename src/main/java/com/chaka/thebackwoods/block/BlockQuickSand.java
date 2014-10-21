package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockQuickSand extends BlockTBW {

    public BlockQuickSand() {

        super(Material.web);
        this.setBlockName("quickSand");
        this.setStepSound(soundTypeSand);
        this.setHardness(0.5F);
    }
}

package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockSmelteryAdvanced extends BlockTBW {

    public BlockSmelteryAdvanced() {

        super(Material.iron);
        this.setBlockName("smelteryAdvanced");
        this.setStepSound(soundTypeMetal);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassBlue extends BlockTBW {

    public BlockClearGlassBlue() {

        super(Material.glass);
        this.setBlockName("clearGlassBlue");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassBlack extends BlockTBW {

    public BlockClearGlassBlack() {

        super(Material.glass);
        this.setBlockName("clearGlassBlack");
        this.setStepSound(soundTypeGlass);
        this.setHardness(2.5F);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
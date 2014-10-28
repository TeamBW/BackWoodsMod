package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassWhite extends BlockTBW {

    public BlockClearGlassWhite() {

        super(Material.glass);
        this.setBlockName("clearGlassWhite");
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
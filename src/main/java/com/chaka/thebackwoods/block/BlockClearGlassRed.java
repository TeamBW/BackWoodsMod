package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassRed extends BlockTBW {

    public BlockClearGlassRed() {

        super(Material.glass);
        this.setBlockName("clearGlassRed");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
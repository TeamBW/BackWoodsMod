package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlass extends BlockTBW {

    public BlockClearGlass() {

        super(Material.glass);
        this.setBlockName("clearGlass");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
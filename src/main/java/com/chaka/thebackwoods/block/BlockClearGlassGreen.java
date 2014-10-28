package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassGreen extends BlockTBW {

    public BlockClearGlassGreen() {

        super(Material.glass);
        this.setBlockName("clearGlassGreen");
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
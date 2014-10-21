package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassGreen extends BlockTBW {

    public BlockClearGlassGreen() {

        super(Material.glass);
        this.setBlockName("clearGlassGreen");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
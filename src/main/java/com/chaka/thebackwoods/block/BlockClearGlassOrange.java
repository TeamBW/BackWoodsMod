package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassOrange extends BlockTBW {

    public BlockClearGlassOrange() {

        super(Material.glass);
        this.setBlockName("clearGlassOrange");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
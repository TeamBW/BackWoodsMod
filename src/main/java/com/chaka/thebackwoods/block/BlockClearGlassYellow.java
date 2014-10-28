package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassYellow extends BlockTBW {

    public BlockClearGlassYellow() {

        super(Material.glass);
        this.setBlockName("clearGlassYellow");
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
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassPurple extends BlockTBW {

    public BlockClearGlassPurple() {

        super(Material.glass);
        this.setBlockName("clearGlassPurple");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
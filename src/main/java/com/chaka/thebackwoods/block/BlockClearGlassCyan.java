package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassCyan extends BlockTBW {

    public BlockClearGlassCyan() {

        super(Material.glass);
        this.setBlockName("clearGlassCyan");
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
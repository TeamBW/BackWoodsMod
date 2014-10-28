package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassPink extends BlockTBW {

    public BlockClearGlassPink() {

        super(Material.glass);
        this.setBlockName("clearGlassPink");
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
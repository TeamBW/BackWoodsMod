package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassGray extends BlockTBW {

    public BlockClearGlassGray() {

        super(Material.glass);
        this.setBlockName("clearGlassGray");
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
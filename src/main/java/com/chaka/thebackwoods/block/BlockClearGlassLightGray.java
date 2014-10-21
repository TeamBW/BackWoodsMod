package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassLightGray extends BlockTBW {

    public BlockClearGlassLightGray() {

        super(Material.glass);
        this.setBlockName("clearGlassLightGray");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
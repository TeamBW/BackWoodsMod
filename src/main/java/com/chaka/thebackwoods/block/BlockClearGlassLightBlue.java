package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassLightBlue extends BlockTBW {

    public BlockClearGlassLightBlue() {

        super(Material.glass);
        this.setBlockName("clearGlassLightBlue");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
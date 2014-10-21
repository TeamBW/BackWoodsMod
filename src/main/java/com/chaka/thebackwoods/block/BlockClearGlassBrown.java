package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassBrown extends BlockTBW {

    public BlockClearGlassBrown() {

        super(Material.glass);
        this.setBlockName("clearGlassBrown");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
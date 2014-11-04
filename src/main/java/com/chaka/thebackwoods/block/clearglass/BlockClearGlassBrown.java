package com.chaka.thebackwoods.block.clearglass;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockClearGlassBrown extends BlockTBW {

    public BlockClearGlassBrown() {

        super(Material.glass);
        this.setBlockName("clearGlassBrown");
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
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassMagenta extends BlockTBW {

    public BlockClearGlassMagenta() {

        super(Material.glass);
        this.setBlockName("clearGlassMagenta");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
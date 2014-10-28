package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassMagenta extends BlockTBW {

    public BlockClearGlassMagenta() {

        super(Material.glass);
        this.setBlockName("clearGlassMagenta");
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
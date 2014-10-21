package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassLime extends BlockTBW {

    public BlockClearGlassLime() {

        super(Material.glass);
        this.setBlockName("clearGlassLime");
        this.setStepSound(soundTypeGlass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
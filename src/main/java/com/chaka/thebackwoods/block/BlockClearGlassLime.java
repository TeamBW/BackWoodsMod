package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockClearGlassLime extends BlockTBW {

    public BlockClearGlassLime() {

        super(Material.glass);
        this.setBlockName("clearGlassLime");
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
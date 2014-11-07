package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMoss extends BlockTBW {

    public BlockMoss() {

        super(Material.sponge);
        this.setBlockName("moss");
        this.setStepSound(soundTypeGrass);
        this.setHardness(0.5F);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}

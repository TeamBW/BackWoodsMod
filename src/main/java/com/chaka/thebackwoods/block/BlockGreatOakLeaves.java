package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockGreatOakLeaves extends BlockTBW {

    public BlockGreatOakLeaves() {

        super(Material.leaves);
        this.setBlockName("greatOakLeaves");
        this.setStepSound(soundTypeGrass);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }

    public boolean isFoliage(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}
package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMapleLeaves extends BlockTBW {

    public BlockMapleLeaves() {

        super(Material.leaves);
        this.setBlockName("mapleLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
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

    public void beginLeavesDecay(World world, int x, int y, int z){}

}

package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRedwoodLeaves extends BlockTBW {

    public BlockRedwoodLeaves() {

        super(Material.leaves);
        this.setBlockName("redwoodLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(1.5F);
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
package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockMapleWood extends BlockTBW {

    public BlockMapleWood() {

        super(Material.wood);
        this.setBlockName("mapleWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return true;
    }
}
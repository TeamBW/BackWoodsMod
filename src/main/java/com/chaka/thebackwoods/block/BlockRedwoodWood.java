package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockRedwoodWood extends BlockTBW {

    public BlockRedwoodWood() {

        super(Material.wood);
        this.setBlockName("redwoodWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return true;
    }
}
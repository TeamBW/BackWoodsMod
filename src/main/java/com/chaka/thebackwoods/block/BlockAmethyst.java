package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockAmethyst extends BlockTBW {

    public BlockAmethyst() {

        super(Material.iron);
        this.setBlockName("amethyst");
        this.setStepSound(soundTypeMetal);
    }

    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {

        return this == Blocks.emerald_block || this == Blocks.gold_block || this == Blocks.diamond_block || this == Blocks.iron_block;
    }
}
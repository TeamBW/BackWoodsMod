package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockCopperBlock extends BlockTBW {

    public BlockCopperBlock() {

        super(Material.iron);
        this.setBlockName("copperBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
    }
}
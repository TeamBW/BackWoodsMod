package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockTinBlock extends BlockTBW {

    public BlockTinBlock() {

        super(Material.iron);
        this.setBlockName("tinBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
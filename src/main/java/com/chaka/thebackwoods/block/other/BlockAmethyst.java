package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockAmethyst extends BlockTBW {

    public BlockAmethyst() {

        super(Material.iron);
        this.setBlockName("amethyst");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
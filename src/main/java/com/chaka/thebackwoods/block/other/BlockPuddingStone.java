package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockPuddingStone extends BlockTBW {

    public BlockPuddingStone() {

        super(Material.rock);
        this.setBlockName("puddingStone");
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 2);
    }
}

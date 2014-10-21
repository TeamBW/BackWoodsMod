package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockRubyOre extends BlockTBW {

    public BlockRubyOre() {

        super(Material.rock);
        this.setBlockName("rubyOre");
        this.setStepSound(soundTypeStone);
    }
}

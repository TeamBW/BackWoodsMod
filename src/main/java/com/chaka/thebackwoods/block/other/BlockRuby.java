package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockRuby extends BlockTBW {

    public BlockRuby() {

        super(Material.iron);
        this.setBlockName("ruby");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.getHarvestLevel(2);
        this.setHarvestLevel("pickaxe", 2);
    }
}

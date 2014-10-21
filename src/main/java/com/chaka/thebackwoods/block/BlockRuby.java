package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockRuby extends BlockTBW {

    public BlockRuby() {

        super(Material.iron);
        this.setBlockName("ruby");
        this.setStepSound(soundTypeMetal);
    }
}

package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockReinforcedObsidian extends BlockTBW {

    public BlockReinforcedObsidian() {
        
        super(Material.rock);
        
        this.getExplosionResistance(50000.00F);
        this.setBlockName("reinforcedObsidian");
    }

    private void getExplosionResistance(float v) {

    }
}

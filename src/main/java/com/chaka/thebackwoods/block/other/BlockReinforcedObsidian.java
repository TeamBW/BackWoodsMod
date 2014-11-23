package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockReinforcedObsidian extends BlockTBW {

    public BlockReinforcedObsidian() {
        
        super(Material.rock);
        
        this.getExplosionResistance(50000.00F);
        this.setBlockName("reinforcedObsidian");
        this.setHarvestLevel("pickaxe", 3);
    }

    private void getExplosionResistance(float v) {

    }
}

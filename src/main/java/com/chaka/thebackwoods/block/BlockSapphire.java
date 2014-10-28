package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockTBW {

    public BlockSapphire() {

        super(Material.iron);
        this.setBlockName("sapphire");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
    }
}

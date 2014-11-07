package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockSapphire extends BlockTBW {

    public BlockSapphire() {

        super(Material.iron);
        this.setBlockName("sapphire");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
    }
}

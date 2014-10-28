package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockFirWoodSlab extends BlockTBW {

    public BlockFirWoodSlab() {

        super(Material.wood);
        this.setBlockName("firWoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
}

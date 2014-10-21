package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMossyGreatOakWood extends BlockTBW {

    public BlockMossyGreatOakWood() {

        super(Material.wood);
        this.setBlockName("mossyGreatOakWood");
        this.setHardness(0.5F);
        this.setStepSound(soundTypeWood);
    }
}
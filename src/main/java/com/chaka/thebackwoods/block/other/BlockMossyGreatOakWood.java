package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockMossyGreatOakWood extends BlockTBW {

    public BlockMossyGreatOakWood() {

        super(Material.wood);
        this.setBlockName("mossyGreatOakWood");
        this.setHardness(1.5F);
        this.setStepSound(soundTypeWood);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockGreatOakWood extends BlockTBW {

    public BlockGreatOakWood() {

        super(Material.wood);
        this.setBlockName("greatOakWood");
        this.setStepSound(soundTypeWood);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockRedwoodWood extends BlockTBW {

    public BlockRedwoodWood() {

        super(Material.wood);
        this.setBlockName("redwoodWood");
        this.setStepSound(soundTypeWood);
    }
}
package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockMapleWood extends BlockTBW {

    public BlockMapleWood() {

        super(Material.wood);
        this.setBlockName("mapleWood");
        this.setStepSound(soundTypeWood);
    }
}
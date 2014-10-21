package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockAmethyst extends BlockTBW {

    public BlockAmethyst() {

        super(Material.iron);
        this.setBlockName("amethyst");
        this.setStepSound(soundTypeMetal);
    }
}
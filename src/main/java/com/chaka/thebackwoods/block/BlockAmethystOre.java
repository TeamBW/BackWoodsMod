package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;

public class BlockAmethystOre extends BlockTBW {

    public BlockAmethystOre() {

        super(Material.rock);
        this.setBlockName("amethystOre");
        this.setStepSound(soundTypeStone);
    }
}
package com.chaka.thebackwoods.block.ore;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockLeadOre extends BlockTBW {

    public BlockLeadOre() {

        super(Material.rock);
        this.setBlockName("leadOre");
        this.setHarvestLevel("pickaxe", 1);
    }
}
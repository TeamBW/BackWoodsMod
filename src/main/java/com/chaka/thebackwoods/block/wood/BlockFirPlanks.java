package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockFirPlanks extends BlockTBW {

    public BlockFirPlanks() {

        super(Material.wood);
        this.setBlockName("firPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }
}
package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockLeadBlock extends BlockTBW {

    public BlockLeadBlock() {

        super(Material.iron);
        this.setBlockName("leadBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
    }
}
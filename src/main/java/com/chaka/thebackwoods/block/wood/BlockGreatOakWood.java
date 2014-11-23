package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockGreatOakWood extends BlockTBW {

    public BlockGreatOakWood() {

        super(Material.wood);
        this.setBlockName("greatOakWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return true;
    }
}
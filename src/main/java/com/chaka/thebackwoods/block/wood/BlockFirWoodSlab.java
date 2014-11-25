package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBWSlab;
import net.minecraft.block.material.Material;

public class BlockFirWoodSlab extends BlockTBWSlab {

    public BlockFirWoodSlab(boolean bool, Material material) {

        super();
        this.setBlockName("firWoodSlab");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);

        if (bool)
        {
            this.opaque = true;
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }

        this.setLightOpacity(255);
    }

    @Override
    public String func_150002_b(int p_150002_1_) {
        return null;
    }
}

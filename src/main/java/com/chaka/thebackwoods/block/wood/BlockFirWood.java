package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockFirWood extends BlockTBW {

    public BlockFirWood() {

        super(Material.wood);
        this.setBlockName("firWood");
        this.setBlockTextureName("firWoodTop");
        this.getBlockTextureFromSide(1);
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return true;
    }
}
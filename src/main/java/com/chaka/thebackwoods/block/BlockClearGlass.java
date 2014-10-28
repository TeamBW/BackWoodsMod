package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockClearGlass extends BlockTBW {

    public BlockClearGlass() {

        super(Material.glass);
        this.setBlockName("clearGlass");
        this.setStepSound(soundTypeGlass);
        this.setHardness(2.5F);
    }

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
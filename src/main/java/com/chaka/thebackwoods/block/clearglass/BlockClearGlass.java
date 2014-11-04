package com.chaka.thebackwoods.block.clearglass;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.Block;
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

    public static final Block.SoundType soundTypeGlass = new Block.SoundType("stone", 1.0F, 1.0F) {

        private static final String __OBFID = "CL_00000200";

        public String getBreakSound()
        {
            return "dig.glass";
        }
        public String func_150496_b()
        {
            return "step.stone";
        }
    };

    public boolean isOpaqueCube(){

        return false;
    }

    public boolean getCanBlockGrass() {

        return false;
    }
}
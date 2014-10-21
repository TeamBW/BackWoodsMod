package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class BlockFertileLand extends BlockTBW {

    public BlockFertileLand() {

        super(Material.grass);
        this.setBlockName("fertileLand");
        this.setStepSound(soundTypeGravel);
    }

    public boolean isFertile(World world, int x, int y, int z)
    {
        if (this == Blocks.farmland)
        {
            return world.getBlockMetadata(x, y, z) > 0;
        }

        return false;
    }

    public boolean canHarvestBlock(EntityPlayer player, int meta) {

        return true;
    }
}
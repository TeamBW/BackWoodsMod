package com.chaka.thebackwoods.block.other;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockFertileLand extends BlockTBW {

    public BlockFertileLand() {

        super(Material.grass);
        this.setBlockName("fertileLand");
        this.setStepSound(soundTypeGravel);
        this.setHardness(1.5F);
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
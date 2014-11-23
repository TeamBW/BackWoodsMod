package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockFirWood extends BlockTBW {

    public IIcon TB;
    public IIcon Sides;

    public BlockFirWood() {

        super(Material.wood);
        this.setBlockName("firWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
    }

    public void registerBlockIcons(IIconRegister icon) {

         TB = icon.registerIcon(Reference.MOD_ID + ":fir_log/TB");
         Sides = icon.registerIcon(Reference.MOD_ID + ":fir_log/Sides");
    }

    public IIcon getIcon(int side, int meta) {

        if(side == 0) {

            return TB;

        } else if(side == 1) {

            return TB;

        }

        return Sides;
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return true;
    }
}
package com.chaka.thebackwoods.block;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWBlocks;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTBW extends Block {

    public BlockTBW(Material material) {

        super(material);
        this.setCreativeTab(CreativeTabTBWBlocks.TBW_TAB_BLOCKS);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
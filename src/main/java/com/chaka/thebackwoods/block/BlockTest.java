package com.chaka.thebackwoods.block;

import com.chaka.thebackwoods.creativetab.CreativeTabTBW;
import com.chaka.thebackwoods.creativetab.CreativeTabTBWItems;
import com.chaka.thebackwoods.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTest extends Block {

    public BlockTest() {

        super(Material.sand);
        this.setCreativeTab(CreativeTabTBWItems.TBW_TAB_ITEMS);
        this.setBlockName("Test");
        this.setStepSound(soundTypeSand);

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
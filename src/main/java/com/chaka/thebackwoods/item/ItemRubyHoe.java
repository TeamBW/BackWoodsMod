package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.creativetab.CreativeTabTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubyHoe extends ItemTBW {

    public ItemRubyHoe() {

        super();
        this.setUnlocalizedName("rubyHoe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
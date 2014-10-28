package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.creativetab.CreativeTabTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubySpade extends ItemTBW {

    public ItemRubySpade() {

        super();
        this.setUnlocalizedName("rubySpade");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
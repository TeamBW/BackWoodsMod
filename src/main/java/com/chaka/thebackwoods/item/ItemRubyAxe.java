package com.chaka.thebackwoods.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubyAxe extends ItemTBW {

    public ItemRubyAxe() {

        super();
        this.setUnlocalizedName("rubyAxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
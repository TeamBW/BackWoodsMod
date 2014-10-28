package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.creativetab.CreativeTabTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubySword extends ItemTBW {

    public ItemRubySword() {

        super();
        this.setUnlocalizedName("rubySword");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
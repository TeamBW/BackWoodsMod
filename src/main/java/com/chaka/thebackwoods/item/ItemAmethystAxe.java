package com.chaka.thebackwoods.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystAxe extends ItemTBW {

    public ItemAmethystAxe() {

        super();
        this.setUnlocalizedName("amethystAxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
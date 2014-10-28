package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.creativetab.CreativeTabTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystHoe extends ItemTBW {

    public ItemAmethystHoe() {

        super();
        this.setUnlocalizedName("amethystHoe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
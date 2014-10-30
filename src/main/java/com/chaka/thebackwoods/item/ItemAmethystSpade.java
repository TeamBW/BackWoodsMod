package com.chaka.thebackwoods.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystSpade extends ItemTBW {

    public ItemAmethystSpade() {

        super();
        this.setUnlocalizedName("amethystSpade");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
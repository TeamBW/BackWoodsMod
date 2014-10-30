package com.chaka.thebackwoods.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystPickaxe extends ItemTBW {

    public ItemAmethystPickaxe() {

        super();
        this.setUnlocalizedName("amethystPick");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
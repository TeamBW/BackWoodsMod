package com.chaka.thebackwoods.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubyPickaxe extends ItemTBW {

    public ItemRubyPickaxe() {

        super();
        this.setUnlocalizedName("rubyPick");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
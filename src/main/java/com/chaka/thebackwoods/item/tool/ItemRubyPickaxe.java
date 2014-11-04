package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.item.ItemTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRubyPickaxe extends ItemTBWPickaxe {

    public ItemRubyPickaxe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("rubyPickaxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
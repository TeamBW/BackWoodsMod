package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.item.ItemTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystShovel extends ItemTBWShovel {

    public ItemAmethystShovel(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("amethystShovel");
        this.maxStackSize = 1;
        this.getItemStackDisplayName("");
    }

    private void getItemStackDisplayName(String s) {

    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
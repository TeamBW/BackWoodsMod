package com.chaka.thebackwoods.item.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSapphireAxe extends ItemTBWAxe {

    public ItemSapphireAxe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("sapphireAxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
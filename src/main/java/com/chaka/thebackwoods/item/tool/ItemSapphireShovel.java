package com.chaka.thebackwoods.item.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSapphireShovel extends ItemTBWShovel {

    public ItemSapphireShovel(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("sapphireShovel");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
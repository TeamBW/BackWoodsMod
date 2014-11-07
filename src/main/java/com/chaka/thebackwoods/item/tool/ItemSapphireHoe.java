package com.chaka.thebackwoods.item.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSapphireHoe extends ItemTBWHoe {

    public ItemSapphireHoe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("sapphireHoe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
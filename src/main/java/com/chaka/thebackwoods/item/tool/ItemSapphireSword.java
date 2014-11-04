package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.item.ItemSapphire;
import com.chaka.thebackwoods.item.ItemTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSapphireSword extends ItemTBWSword {

    public ItemSapphireSword(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("sapphireSword");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
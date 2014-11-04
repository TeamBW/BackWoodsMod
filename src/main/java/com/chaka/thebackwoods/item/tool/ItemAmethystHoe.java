package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.item.ItemTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystHoe extends ItemTBWHoe {

    public ItemAmethystHoe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("amethystHoe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
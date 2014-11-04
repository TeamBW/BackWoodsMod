package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.item.tool.ItemTBWPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAmethystPickaxe extends ItemTBWPickaxe {

    public ItemAmethystPickaxe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("amethystPickaxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
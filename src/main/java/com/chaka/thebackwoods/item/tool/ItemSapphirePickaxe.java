package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.creativetab.CreativeTabTBWTools;
import com.chaka.thebackwoods.item.ItemTBW;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSapphirePickaxe extends ItemTBWPickaxe {

    public ItemSapphirePickaxe(ToolMaterial material) {

        super(material);
        this.setUnlocalizedName("sapphirePickaxe");
        this.maxStackSize = 1;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
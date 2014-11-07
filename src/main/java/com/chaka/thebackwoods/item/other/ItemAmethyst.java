package com.chaka.thebackwoods.item.other;

import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.item.ItemTBW;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemAmethyst extends ItemTBW {

    public ItemAmethyst() {

        super();
        this.setUnlocalizedName("amethystItem");
    }

    public boolean isBeaconPayment(ItemStack stack)
    {
        return this == Items.emerald || this == Items.diamond || this == Items.gold_ingot || this == Items.iron_ingot;
    }
}

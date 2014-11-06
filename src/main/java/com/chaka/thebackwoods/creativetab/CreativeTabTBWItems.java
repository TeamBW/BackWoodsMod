package com.chaka.thebackwoods.creativetab;

import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTBWItems {

    public static final CreativeTabs TBW_TAB_ITEMS = new CreativeTabs("TheBackWoodsItems".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.amethystItem;
        }
    };
}
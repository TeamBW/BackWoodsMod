package com.chaka.thebackwoods.creativetab;

import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTBWBlocks {

    public static final CreativeTabs TBW_TAB_BLOCKS = new CreativeTabs("TheBackWoodsBlocks".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.redwoodLeaves);
        }
    };
}

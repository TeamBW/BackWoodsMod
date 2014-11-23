package com.chaka.thebackwoods.creativetab;

import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import com.chaka.thebackwoods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTBWTech {

    public static final CreativeTabs TBW_TAB_TECH = new CreativeTabs("TheBackWoodsTech".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.copperOre);
        }
    };
}
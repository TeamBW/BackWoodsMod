package com.chaka.thebackwoods.block.crop;

import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockTBWCrop extends BlockCrops {

    public BlockTBWCrop() {

        super();
        this.setBlockName("BlockTBWCrop");
    }

    //Seeds
    @Override
    protected Item func_149866_i()
    {
        return ModItems.TBWSeed;
    }

    //Crop
    @Override
    protected Item func_149865_P()
    {
        return ModItems.TBWCrop;
    }
}

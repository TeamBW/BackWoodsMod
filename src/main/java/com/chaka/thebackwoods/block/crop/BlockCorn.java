package com.chaka.thebackwoods.block.crop;

import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCorn extends BlockCrops {

    public BlockCorn() {

        super();
        this.setBlockName("cornBlock");
    }

    //Seeds
    @Override
    protected Item func_149866_i()
    {
        return ModItems.itemCornSeed;
    }

    //Crop
    @Override
    protected Item func_149865_P()
    {
        return ModItems.itemCornCrop;
    }
}
